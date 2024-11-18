/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Arrays
 *  java.util.Collection
 *  javax.crypto.AEADBadTagException
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package G0;

import C0.a;
import G0.f;
import G0.i;
import G0.m;
import G0.q;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s0.e;
import x0.b;

public final class d
implements e {
    public static final b.b c = b.b.ALGORITHM_NOT_FIPS;
    private static final Collection d = Arrays.asList((Object[])new Integer[]{64});
    private static final byte[] e = new byte[16];
    private static final byte[] f = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final m a;
    private final byte[] b;

    public d(byte[] byArray) {
        if (c.a()) {
            if (d.contains((Object)byArray.length)) {
                byte[] byArray2 = Arrays.copyOfRange((byte[])byArray, (int)0, (int)(byArray.length / 2));
                this.b = Arrays.copyOfRange((byte[])byArray, (int)(byArray.length / 2), (int)byArray.length);
                this.a = new m(byArray2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid key size: ");
            stringBuilder.append(byArray.length);
            stringBuilder.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(stringBuilder.toString());
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    private byte[] c(byte[] ... object) {
        if (((byte[][])object).length == 0) {
            return this.a.a(f, 16);
        }
        byte[] byArray = this.a.a(e, 16);
        for (int i2 = 0; i2 < ((byte[][])object).length - 1; ++i2) {
            byte[] byArray2;
            byte[] byArray3 = byArray2 = object[i2];
            if (byArray2 == null) {
                byArray3 = new byte[]{};
            }
            byArray = G0.f.e(C0.a.b(byArray), this.a.a(byArray3, 16));
        }
        object = ((byte[][])(object = (Object)object[((byte[][])object).length - 1])).length >= 16 ? (Object)G0.f.f((byte[])object, byArray) : (Object)G0.f.e(C0.a.a((byte[])object), C0.a.b(byArray));
        return this.a.a((byte[])object, 16);
    }

    @Override
    public byte[] a(byte[] byArray, byte[] byArray2) {
        if (byArray.length <= 0x7FFFFFEF) {
            Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
            byte[] byArray3 = this.c(byArray2, byArray);
            byArray2 = (byte[])byArray3.clone();
            byArray2[8] = (byte)(byArray2[8] & 0x7F);
            byArray2[12] = (byte)(byArray2[12] & 0x7F);
            cipher.init(1, (Key)new SecretKeySpec(this.b, "AES"), (AlgorithmParameterSpec)new IvParameterSpec(byArray2));
            return G0.f.a(byArray3, cipher.doFinal(byArray));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override
    public byte[] b(byte[] object, byte[] byArray) {
        if (((byte[])object).length >= 16) {
            Object object2 = (Cipher)i.b.a("AES/CTR/NoPadding");
            byte[] byArray2 = Arrays.copyOfRange((byte[])object, (int)0, (int)16);
            byte[] byArray3 = (byte[])byArray2.clone();
            byArray3[8] = (byte)(byArray3[8] & 0x7F);
            byArray3[12] = (byte)(byArray3[12] & 0x7F);
            object2.init(2, (Key)new SecretKeySpec(this.b, "AES"), (AlgorithmParameterSpec)new IvParameterSpec(byArray3));
            byArray3 = Arrays.copyOfRange((byte[])object, (int)16, (int)((byte[])object).length);
            object2 = object2.doFinal(byArray3);
            object = object2;
            if (byArray3.length == 0) {
                object = object2;
                if (object2 == null) {
                    object = object2;
                    if (q.b()) {
                        object = new byte[]{};
                    }
                }
            }
            if (G0.f.b(byArray2, this.c(new byte[][]{byArray, object}))) {
                return object;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}

