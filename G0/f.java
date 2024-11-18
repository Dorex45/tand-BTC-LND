/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.security.MessageDigest
 *  java.util.Arrays
 */
package G0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

public abstract class f {
    public static byte[] a(byte[] ... byArray) {
        byte[] byArray2;
        int n2;
        int n3 = byArray.length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            byArray2 = byArray[n2];
            if (n4 <= Integer.MAX_VALUE - byArray2.length) {
                n4 += byArray2.length;
                continue;
            }
            throw new GeneralSecurityException("exceeded size limit");
        }
        byArray2 = new byte[n4];
        n3 = byArray.length;
        n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            byte[] byArray3 = byArray[n2];
            System.arraycopy((Object)byArray3, (int)0, (Object)byArray2, (int)n4, (int)byArray3.length);
            n4 += byArray3.length;
        }
        return byArray2;
    }

    public static final boolean b(byte[] byArray, byte[] byArray2) {
        return MessageDigest.isEqual((byte[])byArray, (byte[])byArray2);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int n2) {
        if (n2 >= 0 && byteBuffer2.remaining() >= n2 && byteBuffer3.remaining() >= n2 && byteBuffer.remaining() >= n2) {
            for (int i2 = 0; i2 < n2; ++i2) {
                byteBuffer.put((byte)(byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] d(byte[] byArray, int n2, byte[] byArray2, int n3, int n4) {
        if (n4 >= 0 && byArray.length - n4 >= n2 && byArray2.length - n4 >= n3) {
            byte[] byArray3 = new byte[n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                byArray3[i2] = (byte)(byArray[i2 + n2] ^ byArray2[i2 + n3]);
            }
            return byArray3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] e(byte[] byArray, byte[] byArray2) {
        if (byArray.length == byArray2.length) {
            return f.d(byArray, 0, byArray2, 0, byArray.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] byArray, byte[] byArray2) {
        if (byArray.length >= byArray2.length) {
            int n2 = byArray.length;
            int n3 = byArray2.length;
            byArray = Arrays.copyOf((byte[])byArray, (int)byArray.length);
            for (int i2 = 0; i2 < byArray2.length; ++i2) {
                int n4 = n2 - n3 + i2;
                byArray[n4] = (byte)(byArray[n4] ^ byArray2[i2]);
            }
            return byArray;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}

