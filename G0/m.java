/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.Key
 *  java.util.Arrays
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.SecretKeySpec
 */
package G0;

import C0.a;
import G0.f;
import G0.i;
import G0.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import x0.b;

public final class m
implements E0.a {
    public static final b.b d = b.b.ALGORITHM_NOT_FIPS;
    private final SecretKey a;
    private byte[] b;
    private byte[] c;

    public m(byte[] byArray) {
        r.a(byArray.length);
        this.a = new SecretKeySpec(byArray, "AES");
        this.b();
    }

    private void b() {
        Object object = m.c();
        object.init(1, (Key)this.a);
        object = C0.a.b(object.doFinal(new byte[16]));
        this.b = (byte[])object;
        this.c = C0.a.b((byte[])object);
    }

    private static Cipher c() {
        if (d.a()) {
            return (Cipher)i.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override
    public byte[] a(byte[] byArray, int n2) {
        if (n2 <= 16) {
            Cipher cipher = m.c();
            cipher.init(1, (Key)this.a);
            int n3 = Math.max((int)1, (int)((int)Math.ceil((double)((double)byArray.length / 16.0))));
            byte[] byArray2 = n3 * 16 == byArray.length ? f.d(byArray, (n3 - 1) * 16, this.b, 0, 16) : f.e(C0.a.a(Arrays.copyOfRange((byte[])byArray, (int)((n3 - 1) * 16), (int)byArray.length)), this.c);
            byte[] byArray3 = new byte[16];
            for (int i2 = 0; i2 < n3 - 1; ++i2) {
                byArray3 = cipher.doFinal(f.d(byArray3, 0, byArray, i2 * 16, 16));
            }
            return Arrays.copyOf((byte[])cipher.doFinal(f.e(byArray2, byArray3)), (int)n2);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}

