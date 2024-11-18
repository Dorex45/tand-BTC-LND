/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 *  u0.e
 */
package G0;

import G0.p;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import s0.a;
import u0.e;

public final class g
implements a {
    private final e a;

    public g(byte[] byArray) {
        this.a = new e(byArray);
    }

    @Override
    public byte[] a(byte[] byArray, byte[] byArray2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(byArray.length + 28));
        byte[] byArray3 = p.c(12);
        byteBuffer.put(byArray3);
        this.a.b(byteBuffer, byArray3, byArray, byArray2);
        return byteBuffer.array();
    }

    @Override
    public byte[] b(byte[] object, byte[] byArray) {
        if (((byte[])object).length >= 28) {
            byte[] byArray2 = Arrays.copyOf((byte[])object, (int)12);
            object = ByteBuffer.wrap((byte[])object, (int)12, (int)(((byte[])object).length - 12));
            return this.a.a((ByteBuffer)object, byArray2, byArray);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

