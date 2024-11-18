/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package G0;

import G0.i;
import G0.l;
import G0.p;
import G0.r;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import x0.b;

public final class a
implements l {
    public static final b.b d = b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final ThreadLocal e = new ThreadLocal(){

        protected Cipher a() {
            try {
                Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
                return cipher;
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException((Throwable)generalSecurityException);
            }
        }
    };
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    public a(byte[] byArray, int n2) {
        if (d.a()) {
            int n3;
            r.a(byArray.length);
            this.a = new SecretKeySpec(byArray, "AES");
            this.c = n3 = ((Cipher)e.get()).getBlockSize();
            if (n2 >= 12 && n2 <= n3) {
                this.b = n2;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private void c(byte[] byArray, int n2, int n3, byte[] byArray2, int n4, byte[] object, boolean bl) {
        Cipher cipher = (Cipher)e.get();
        byte[] byArray3 = new byte[this.c];
        System.arraycopy((Object)object, (int)0, (Object)byArray3, (int)0, (int)this.b);
        object = new IvParameterSpec(byArray3);
        if (bl) {
            cipher.init(1, (Key)this.a, (AlgorithmParameterSpec)object);
        } else {
            cipher.init(2, (Key)this.a, (AlgorithmParameterSpec)object);
        }
        if (cipher.doFinal(byArray, n2, n3, byArray2, n4) == n3) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    @Override
    public byte[] a(byte[] object) {
        int n2 = ((byte[])object).length;
        int n3 = this.b;
        if (n2 <= Integer.MAX_VALUE - n3) {
            byte[] byArray = new byte[((byte[])object).length + n3];
            byte[] byArray2 = p.c(n3);
            System.arraycopy((Object)byArray2, (int)0, (Object)byArray, (int)0, (int)this.b);
            this.c((byte[])object, 0, ((byte[])object).length, byArray, this.b, byArray2, true);
            return byArray;
        }
        object = new StringBuilder();
        object.append("plaintext length can not exceed ");
        object.append(Integer.MAX_VALUE - this.b);
        throw new GeneralSecurityException(object.toString());
    }

    @Override
    public byte[] b(byte[] byArray) {
        int n2 = byArray.length;
        int n3 = this.b;
        if (n2 >= n3) {
            byte[] byArray2 = new byte[n3];
            System.arraycopy((Object)byArray, (int)0, (Object)byArray2, (int)0, (int)n3);
            n3 = byArray.length;
            n2 = this.b;
            byte[] byArray3 = new byte[n3 - n2];
            this.c(byArray, n2, byArray.length - n2, byArray3, 0, byArray2, false);
            return byArray3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

