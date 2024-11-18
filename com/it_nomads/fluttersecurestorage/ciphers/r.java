/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.it_nomads.fluttersecurestorage.ciphers.p
 *  com.it_nomads.fluttersecurestorage.ciphers.q
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import com.it_nomads.fluttersecurestorage.ciphers.p;
import com.it_nomads.fluttersecurestorage.ciphers.q;
import com.it_nomads.fluttersecurestorage.ciphers.t;

final class r
extends Enum {
    private static final r[] $VALUES;
    public static final /* enum */ r AES_CBC_PKCS7Padding;
    public static final /* enum */ r AES_GCM_NoPadding;
    final int minVersionCode;
    final t storageCipher;

    static {
        AES_CBC_PKCS7Padding = new r("AES_CBC_PKCS7Padding", 0, (t)new p(), 1);
        AES_GCM_NoPadding = new r("AES_GCM_NoPadding", 1, (t)new q(), 23);
        $VALUES = r.a();
    }

    /*
     * WARNING - void declaration
     */
    private r() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.storageCipher = var3_1;
        this.minVersionCode = var4_2;
    }

    private static /* synthetic */ r[] a() {
        return new r[]{AES_CBC_PKCS7Padding, AES_GCM_NoPadding};
    }

    public static r valueOf(String string) {
        return (r)Enum.valueOf(r.class, (String)string);
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }
}

