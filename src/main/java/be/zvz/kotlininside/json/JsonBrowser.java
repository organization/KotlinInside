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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Allows to easily navigate in decoded JSON data
 */
public class JsonBrowser {
    public static final JsonBrowser NULL_BROWSER = new JsonBrowser(null);

    private static ObjectMapper mapper = setupMapper();

    @NotNull
    public static ObjectMapper getMapper() {
        return mapper;
    }

    public static void setMapper(@NotNull ObjectMapper objectMapper) {
        mapper = objectMapper;
    }

    private final JsonNode node;

    private JsonBrowser(JsonNode node) {
        this.node = node;
    }

    /**
     * Parse from string.
     *
     * @param json The JSON object as a string
     * @return JsonBrowser instance for navigating in the result
     * @throws IOException When parsing the JSON failed
     */
    @NotNull
    public static JsonBrowser parse(String json) throws IOException {
        if (json.charAt(0) == '(')
            json = json.substring(1);
        return create(mapper.readTree(json));
    }

    /**
     * Parse from string.
     *
     * @param stream The JSON object as a stream
     * @return JsonBrowser instance for navigating in the result
     * @throws IOException When parsing the JSON failed
     */
    @NotNull
    public static JsonBrowser parse(InputStream stream) throws IOException {
        return create(mapper.readTree(stream));
    }

    private static ObjectMapper setupMapper() {
        JsonFactory jsonFactory = new JsonFactory();
        jsonFactory.enable(JsonParser.Feature.ALLOW_COMMENTS);
        jsonFactory.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        return new ObjectMapper(jsonFactory);
    }

    @NotNull
    public static JsonBrowser create(JsonNode node) {
        return node != null ? new JsonBrowser(node) : NULL_BROWSER;
    }

    @Nullable
    public String stringify() {
        try {
            return mapper.writeValueAsString(node);
        } catch (JsonProcessingException ignored) {
            return null;
        }
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
    @NotNull
    public JsonBrowser index(int index) {
        if (isList()) {
            return create(node.get(index));
        } else {
            return NULL_BROWSER;
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
     * Get an element by key from a map value
     *
     * @param key Map key
     * @return JsonBrowser instance which wraps the value with the specified key
     */
    @NotNull
    public JsonBrowser get(String key) {
        if (isMap()) {
            return create(node.get(key));
        } else {
            return NULL_BROWSER;
        }
    }

    /**
     * Returns a list of all the values in this element
     *
     * @return The list of values as JsonBrowser elements
     */
    @NotNull
    public List<JsonBrowser> values() {
        List<JsonBrowser> values = new ArrayList<>();

        if (node == null) {
            return values;
        }

        //node.elements().forEachRemaining(child -> values.add(new JsonBrowser(child))); //Android API 21!
        for (Iterator<JsonNode> it = node.elements(); it.hasNext(); ) {
            JsonNode child = it.next();
            values.add(new JsonBrowser(child));
        }

        return values;
    }

    /**
     * Attempt to retrieve the value in the specified format
     *
     * @param klass The class to retrieve the value as
     * @return The value as an instance of the specified class
     * @throws IllegalArgumentException If conversion is impossible
     */
    @NotNull
    public <T> T as(Class<T> klass) {
        try {
            return mapper.treeToValue(node, klass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public boolean asBoolean(boolean defaultValue) {
        if (node != null) {
            if (node.isBoolean()) {
                return node.booleanValue();
            } else if (node.isTextual()) {
                switch (node.textValue()) {
                    case "TRUE":
                    case "true":
                        return true;
                    case "FALSE":
                    case "false":
                        return false;
                }
            }
        }

        return defaultValue;
    }

    @Nullable
    public Boolean asNullableBoolean() {
        if (node == null || node.isNull()) {
            return null;
        } else {
            return asBoolean();
        }
    }

    public long asLong() {
        return asLong(0);
    }

    public long asLong(long defaultValue) {
        if (node != null) {
            if (node.isNumber()) {
                return node.numberValue().longValue();
            } else if (node.isTextual()) {
                try {
                    return Long.parseLong(node.textValue());
                } catch (NumberFormatException ignored) {
                    // Fall through to default value.
                }
            }
        }

        return defaultValue;
    }

    @Nullable
    public Long asNullableLong() {
        if (node == null || node.isNull()) {
            return null;
        } else {
            return asLong();
        }
    }

    public int asInteger() {
        return asInteger(0);
    }

    public int asInteger(int defaultValue) {
        if (node != null) {
            if (node.isNumber()) {
                return node.numberValue().intValue();
            } else if (node.isTextual()) {
                try {
                    return Integer.parseInt(node.textValue());
                } catch (NumberFormatException ignored) {
                    // Fall through to default value.
                }
            }
        }

        return defaultValue;
    }

    @Nullable
    public Integer asNullableInteger() {
        if (node == null || node.isNull()) {
            return null;
        } else {
            return asInteger();
        }
    }

    @NotNull
    public <K, V> Map<K, V> toMap() {
        try {
            return mapper.convertValue(node, new TypeReference<Map<K, V>>() {
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return The value of the element as text
     */
    @Nullable
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

    @NotNull
    public String safeText() {
        String text = text();
        return text != null ? text : "";
    }

    /**
     * @return The value of the element as text
     */
    public boolean isNull() {
        return node == null || node.isNull();
    }

    @Override
    public String toString() {
        return node.toString();
    }

    @Nullable
    public String format() {
        try {
            return node != null ? mapper.writeValueAsString(node) : null;
        } catch (Exception e) {
            return null;
        }
    }
}
