/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.GCMParameterSpec
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import com.it_nomads.fluttersecurestorage.ciphers.a;
import com.it_nomads.fluttersecurestorage.ciphers.n;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

public class u
extends n {
    public u(Context context, a a2) {
        super(context, a2);
    }

    @Override
    protected String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override
    protected Cipher d() {
        return Cipher.getInstance((String)"AES/GCM/NoPadding");
    }

    @Override
    protected int e() {
        return 12;
    }

    @Override
    protected AlgorithmParameterSpec f(byte[] byArray) {
        return new GCMParameterSpec(128, byArray);
    }
}

