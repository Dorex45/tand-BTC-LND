/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 *  u0.h
 */
package G0;

import G0.p;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import s0.a;
import u0.h;

public final class s
implements a {
    private final h a;

    public s(byte[] byArray) {
        this.a = new h(byArray);
    }

    @Override
    public byte[] a(byte[] byArray, byte[] byArray2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(byArray.length + 40));
        byte[] byArray3 = p.c(24);
        byteBuffer.put(byArray3);
        this.a.b(byteBuffer, byArray3, byArray, byArray2);
        return byteBuffer.array();
    }

    @Override
    public byte[] b(byte[] object, byte[] byArray) {
        if (((byte[])object).length >= 40) {
            byte[] byArray2 = Arrays.copyOf((byte[])object, (int)24);
            object = ByteBuffer.wrap((byte[])object, (int)24, (int)(((byte[])object).length - 24));
            return this.a.a((ByteBuffer)object, byArray2, byArray);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

