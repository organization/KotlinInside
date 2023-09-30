// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package be.zvz.kotlininside.security

import be.zvz.kotlininside.migbase64.Base64
import java.nio.ByteBuffer
import java.util.UUID

/** @hide
 */
object RandomFidGenerator {
    /**
     * Creates a random FID of valid format without checking if the FID is already in use by any
     * Firebase Installation.
     *
     *
     * Note: Even though this method does not check with the FIS database if the returned FID is
     * already in use, the probability of collision is extremely and negligibly small!
     *
     * @return random FID value
     */
    fun createRandomFid(): String {
        // A valid FID has exactly 22 base64 characters, which is 132 bits, or 16.5 bytes.
        val uuidBytes = getBytesFromUUID(UUID.randomUUID(), ByteArray(17))
        uuidBytes[16] = uuidBytes[0]
        uuidBytes[0] = (REMOVE_PREFIX_MASK.toInt() and uuidBytes[0].toInt() or FID_4BIT_PREFIX.toInt()).toByte()
        return encodeFidBase64UrlSafe(uuidBytes)
    }

    /**
     * 1 Byte with the first 4 header-bits set to the identifying FID prefix 0111 (0x7). Use this
     * constant to create FIDs or check the first byte of FIDs. This prefix is also used in legacy
     * Instance-IDs
     */
    private val FID_4BIT_PREFIX = "01110000".toByte(2)

    /**
     * Byte mask to remove the 4 header-bits of a given Byte. Use this constant with Java's Binary AND
     * Operator in order to remove the first 4 bits of a Byte and replacing it with the FID prefix.
     */
    private val REMOVE_PREFIX_MASK = "00001111".toByte(2)

    /** Length of new-format FIDs as introduced in 2019.  */
    private const val FID_LENGTH = 22

    /**
     * Converts a given byte-array (assumed to be an FID value) to base64-url-safe encoded
     * String-representation.
     *
     *
     * Note: The returned String has at most 22 characters, the length of FIDs. Thus, it is
     * recommended to deliver a byte-array containing at least 16.5 bytes.
     *
     * @param rawValue FID value to be encoded
     * @return (22-character or shorter) String containing the base64-encoded value
     */
    private fun encodeFidBase64UrlSafe(rawValue: ByteArray): String {
        return Base64.encodeToString(
            rawValue,
            false
        ).substring(0, FID_LENGTH)
    }

    private fun getBytesFromUUID(uuid: UUID, output: ByteArray): ByteArray {
        val bb = ByteBuffer.wrap(output)
        bb.putLong(uuid.mostSignificantBits)
        bb.putLong(uuid.leastSignificantBits)
        return bb.array()
    }
}