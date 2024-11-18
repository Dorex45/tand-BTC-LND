/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.Object
 *  javax.security.auth.x500.X500Principal
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.security.keystore.KeyGenParameterSpec;
import javax.security.auth.x500.X500Principal;

public abstract class g {
    public static /* bridge */ /* synthetic */ KeyGenParameterSpec.Builder a(KeyGenParameterSpec.Builder builder, X500Principal x500Principal) {
        return builder.setCertificateSubject(x500Principal);
    }
}

