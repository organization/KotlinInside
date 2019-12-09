// Created on 2007-07-04
package be.zvz.kotlininside.migbase64;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static be.zvz.kotlininside.migbase64.Dictionary.CA;

/**
 * Base64 for InputStream<br/> Licence = BSD
 *
 * @author shamilbi shamilbi@users.sourceforge.net
 * @see Base64
 */
public class Base64IO {

    private static final int _8_BIT = 0xff;

    private static final int _6_BIT = 0x3f;

    private static final byte EQUAL = '=';

    /**
     * Encodes a raw InputStream into a BASE64 OutputStream representation in
     * accordance with RFC 2045. This implementation was inspired by MIG Base64
     * {@link Base64#encodeToByte(byte[], boolean)}
     *
     * @param in
     * @param out
     * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
     *                No line separator will be in breach of RFC 2045 which
     *                specifies max 76 per line but will be a little faster.
     * @throws IOException
     */
    public final static void encode(InputStream in, OutputStream out,
                                    boolean lineSep) throws IOException {
        // must be inBuf.length % 3 == 0
        final byte[] inBuf = new byte[1024 * 32 * 3];
        final byte[] outBuf = new byte[4 * 19 + 2];

        int eLen = inBuf.length; // Length of even 24-bits.
        int left = 0;
        int inOff = 0;
        boolean needsRn = false;
        int cc = 0;

        while (true) {
            // read full buffer
            final int read = in.read(inBuf, inOff, inBuf.length - inOff);

            if (read == -1) {
                // last bytes
                left = inOff % 3; // 0 - 2.
                eLen = inOff - left; // Length of even 24-bits.
            } else {
                inOff += read;
                if (inOff != inBuf.length) {
                    continue;
                }
            }

            int outOff = 0;

            // encode buffer
            // Encode even 24-bits

            for (int s = 0/* , d = 0, cc = 0 */; s < eLen; ) {
                if (needsRn) {
                    outBuf[outOff++] = '\r';
                    outBuf[outOff++] = '\n';
                    needsRn = false;
                }

                // Copy next three bytes into lower 24 bits of int, paying
                // attension to sign.
                int i = (inBuf[s++] & _8_BIT) << 16
                        | (inBuf[s++] & _8_BIT) << 8 | (inBuf[s++] & _8_BIT);

                // Encode the int into four chars
                int outOff2 = outOff += 4;
                outBuf[--outOff2] = CA[i & _6_BIT];
                outBuf[--outOff2] = CA[(i >>>= 6) & _6_BIT];
                outBuf[--outOff2] = CA[(i >>>= 6) & _6_BIT];
                outBuf[--outOff2] = CA[(i >>>= 6) & _6_BIT];

                if (++cc == 19 /* && d < dLen - 2 */) {
                    cc = 0;
                    out.write(outBuf, 0, outOff);
                    outOff = 0;

                    // Add optional line separator
                    if (lineSep) {
                        needsRn = true;
                    }
                }
            }
            out.write(outBuf, 0, outOff);

            // Pad and encode last bits if source isn't an even 24 bits.
            if (left > 0) {
                // Prepare the int
                int i = ((inBuf[eLen] & _8_BIT) << 10)
                        | (left == 2 ? ((inBuf[inOff - 1] & _8_BIT) << 2) : 0);

                // Set last four chars
                outBuf[3] = EQUAL;
                outBuf[2] = left == 2 ? CA[i & _6_BIT] : EQUAL;
                outBuf[1] = CA[(i >>>= 6) & _6_BIT];
                outBuf[0] = CA[i >> 6];
                out.write(outBuf, 0, 4);
            }

            if (read == -1) {
                break;
            }

            // new block
            inOff = 0;
        }
    }

}