/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 */
package G0;

import G0.f;
import G0.l;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import s0.a;
import s0.t;

public final class h
implements a {
    private final l a;
    private final t b;
    private final int c;

    public h(l l2, t t2, int n2) {
        this.a = l2;
        this.b = t2;
        this.c = n2;
    }

    @Override
    public byte[] a(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = this.a.a(byArray);
        byArray = byArray2;
        if (byArray2 == null) {
            byArray = new byte[]{};
        }
        byArray2 = Arrays.copyOf((byte[])ByteBuffer.allocate((int)8).putLong((long)byArray.length * 8L).array(), (int)8);
        return f.a(byArray3, this.b.b(f.a(byArray, byArray3, byArray2)));
    }

    @Override
    public byte[] b(byte[] byArray, byte[] byArray2) {
        int n2 = byArray.length;
        int n3 = this.c;
        if (n2 >= n3) {
            byte[] byArray3 = Arrays.copyOfRange((byte[])byArray, (int)0, (int)(byArray.length - n3));
            byte[] byArray4 = Arrays.copyOfRange((byte[])byArray, (int)(byArray.length - this.c), (int)byArray.length);
            byArray = byArray2;
            if (byArray2 == null) {
                byArray = new byte[]{};
            }
            byArray2 = Arrays.copyOf((byte[])ByteBuffer.allocate((int)8).putLong((long)byArray.length * 8L).array(), (int)8);
            this.b.a(byArray4, f.a(byArray, byArray3, byArray2));
            return this.a.b(byArray3);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

