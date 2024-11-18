/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 */
package G0;

import E0.a;
import G0.f;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import s0.t;

public class o
implements t {
    private final a a;
    private final int b;

    public o(a a2, int n2) {
        this.a = a2;
        this.b = n2;
        if (n2 >= 10) {
            a2.a(new byte[0], n2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override
    public void a(byte[] byArray, byte[] byArray2) {
        if (f.b(this.b(byArray2), byArray)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override
    public byte[] b(byte[] byArray) {
        return this.a.a(byArray, this.b);
    }
}

