/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.Object
 *  java.util.Date
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.security.keystore.KeyGenParameterSpec;
import java.util.Date;

public abstract class j {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, Date date) {
        return builder.setCertificateNotBefore(date);
    }
}

