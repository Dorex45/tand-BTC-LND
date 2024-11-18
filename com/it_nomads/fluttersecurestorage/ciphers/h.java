/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.Object
 *  java.lang.String
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.security.keystore.KeyGenParameterSpec;

public abstract class h {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, String[] stringArray) {
        return builder.setDigests(stringArray);
    }
}

