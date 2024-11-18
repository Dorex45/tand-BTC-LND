/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.Object
 *  java.math.BigInteger
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;

public abstract class i {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, BigInteger bigInteger) {
        return builder.setCertificateSerialNumber(bigInteger);
    }
}

