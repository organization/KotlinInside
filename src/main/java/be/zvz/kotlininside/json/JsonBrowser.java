package be.zvz.kotlininside.json;

/*
 * Copyright 2019 sedmelluq. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Lavaplayer 에서 가져온 코드입니다 (https://github.com/sedmelluq/lavaplayer/blob/master/main/src/main/java/com/sedmelluq/discord/lavaplayer/tools/JsonBrowser.java)

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows to easily navigate in decoded JSON data
 */
public class JsonBrowser {
    private static final ObjectMapper mapper = setupMapper();

    private final JsonNode node;

    private JsonBrowser(JsonNode node) {
        this.node = node;
    }

    /**
     * @return True if the value represents a list.
     */
    public boolean isList() {
        return node instanceof ArrayNode;
    }

    /**
     * @return True if the value represents a map.
     */
    public boolean isMap() {
        return node instanceof ObjectNode;
    }

    /**
     * Get an element at an index for a list value
     *
     * @param index ArticleList index
     * @return JsonBrowser instance which wraps the value at the specified index
     */
    public JsonBrowser index(int index) {
        if (isList()) {
            return new JsonBrowser(node.get(index));
        } else {
            throw new IllegalStateException("Index only works on a list");
        }
    }

    /**
     * Get an element by key from a map value
     *
     * @param key Map key
     * @return JsonBrowser instance which wraps the value with the specified key
     */
    public JsonBrowser get(String key) {
        if (isMap()) {
            return new JsonBrowser(node.get(key));
        } else {
            throw new IllegalStateException("Get only works on a map");
        }
    }

    /**
     * Get an element by key from a map value
     *
     * @param key Map key
     * @return JsonBrowser instance which wraps the value with the specified key
     */
    public JsonBrowser safeGet(String key) {
        if (isMap()) {
            return new JsonBrowser(node.get(key));
        } else {
            return new JsonBrowser(null);
        }
    }

    /**
     * Put a value into the map if this instance contains a map.
     *
     * @param key  The map entry key
     * @param item The map entry value
     */
    public void put(String key, Object item) {
        if (node instanceof ObjectNode) {
            ((ObjectNode) node).set(key, mapper.valueToTree(item));
        } else {
            throw new IllegalStateException("Put only works on a map");
        }
    }

    /**
     * Returns a list of all the values in this element
     *
     * @return The list of values as JsonBrowser elements
     */
    public List<JsonBrowser> values() {
        List<JsonBrowser> values = new ArrayList<>();

        node.elements().forEachRemaining(child -> values.add(new JsonBrowser(child)));

        return values;
    }

    /**
     * Attempt to retrieve the value in the specified format
     *
     * @param klass The class to retrieve the value as
     * @return The value as an instance of the specified class
     * @throws IllegalArgumentException If conversion is impossible
     */
    public <T> T as(Class<T> klass) {
        try {
            return mapper.treeToValue(node, klass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return The value of the element as text
     */
    public String text() {
        if (node != null) {
            if (node.isNull()) {
                return null;
            } else if (node.isTextual()) {
                return node.textValue();
            } else if (node.isIntegralNumber()) {
                return String.valueOf(node.longValue());
            } else if (node.isNumber()) {
                return node.numberValue().toString();
            } else if (node.isBoolean()) {
                return String.valueOf(node.booleanValue());
            } else {
                return node.toString();
            }
        }

        return null;
    }

    public String format() {
        try {
            return node != null ? mapper.writeValueAsString(node) : null;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @return The value of the element as text
     */
    public boolean isNull() {
        return node == null || node.isNull();
    }

    /**
     * Parse from string.
     *
     * @param json The JSON object as a string
     * @return JsonBrowser instance for navigating in the result
     * @throws IOException When parsing the JSON failed
     */
    public static JsonBrowser parse(String json) throws IOException {
        return new JsonBrowser(mapper.readTree(json));
    }

    /**
     * Parse from string.
     *
     * @param stream The JSON object as a stream
     * @return JsonBrowser instance for navigating in the result
     * @throws IOException When parsing the JSON failed
     */
    public static JsonBrowser parse(InputStream stream) throws IOException {
        return new JsonBrowser(mapper.readTree(stream));
    }

    private static ObjectMapper setupMapper() {
        JsonFactory jsonFactory = new JsonFactory();
        jsonFactory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        jsonFactory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        return new ObjectMapper(jsonFactory);
    }
}