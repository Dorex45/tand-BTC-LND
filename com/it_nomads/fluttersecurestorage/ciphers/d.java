/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.it_nomads.fluttersecurestorage.ciphers.b
 *  com.it_nomads.fluttersecurestorage.ciphers.c
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import com.it_nomads.fluttersecurestorage.ciphers.b;
import com.it_nomads.fluttersecurestorage.ciphers.c;
import com.it_nomads.fluttersecurestorage.ciphers.e;

final class d
extends Enum {
    private static final d[] $VALUES;
    public static final /* enum */ d RSA_ECB_OAEPwithSHA_256andMGF1Padding;
    public static final /* enum */ d RSA_ECB_PKCS1Padding;
    final e keyCipher;
    final int minVersionCode;

    static {
        RSA_ECB_PKCS1Padding = new d("RSA_ECB_PKCS1Padding", 0, (e)new b(), 1);
        RSA_ECB_OAEPwithSHA_256andMGF1Padding = new d("RSA_ECB_OAEPwithSHA_256andMGF1Padding", 1, (e)new c(), 23);
        $VALUES = d.a();
    }

    /*
     * WARNING - void declaration
     */
    private d() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.keyCipher = var3_1;
        this.minVersionCode = var4_2;
    }

    private static /* synthetic */ d[] a() {
        return new d[]{RSA_ECB_PKCS1Padding, RSA_ECB_OAEPwithSHA_256andMGF1Padding};
    }

    public static d valueOf(String string) {
        return (d)Enum.valueOf(d.class, (String)string);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }
}

