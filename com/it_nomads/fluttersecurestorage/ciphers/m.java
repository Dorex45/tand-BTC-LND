/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  androidx.security.crypto.f
 *  androidx.security.crypto.i
 *  androidx.security.crypto.j
 *  androidx.security.crypto.l
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.security.spec.AlgorithmParameterSpec
 *  java.security.spec.MGF1ParameterSpec
 *  java.util.Calendar
 *  javax.crypto.Cipher
 *  javax.crypto.spec.OAEPParameterSpec
 *  javax.crypto.spec.PSource
 *  javax.crypto.spec.PSource$PSpecified
 *  javax.security.auth.x500.X500Principal
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.it_nomads.fluttersecurestorage.ciphers.f;
import com.it_nomads.fluttersecurestorage.ciphers.g;
import com.it_nomads.fluttersecurestorage.ciphers.h;
import com.it_nomads.fluttersecurestorage.ciphers.i;
import com.it_nomads.fluttersecurestorage.ciphers.j;
import com.it_nomads.fluttersecurestorage.ciphers.k;
import com.it_nomads.fluttersecurestorage.ciphers.l;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;

public class m
extends l {
    public m(Context context) {
        super(context);
    }

    @Override
    protected String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.getPackageName());
        stringBuilder.append(".FlutterSecureStoragePluginKeyOAEP");
        return stringBuilder.toString();
    }

    @Override
    protected AlgorithmParameterSpec f() {
        return new OAEPParameterSpec("SHA-256", "MGF1", (AlgorithmParameterSpec)MGF1ParameterSpec.SHA1, (PSource)PSource.PSpecified.DEFAULT);
    }

    @Override
    protected Cipher i() {
        return Cipher.getInstance((String)"RSA/ECB/OAEPPadding", (String)"AndroidKeyStoreBCWorkaround");
    }

    @Override
    protected AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        f.a();
        KeyGenParameterSpec.Builder builder = androidx.security.crypto.f.a((String)this.a, (int)3);
        context = new StringBuilder();
        context.append("CN=");
        context.append(this.a);
        return androidx.security.crypto.l.a((KeyGenParameterSpec.Builder)k.a(j.a(i.a(androidx.security.crypto.j.a((KeyGenParameterSpec.Builder)androidx.security.crypto.i.a((KeyGenParameterSpec.Builder)h.a(g.a(builder, new X500Principal(context.toString())), new String[]{"SHA-256"}), (String[])new String[]{"ECB"}), (String[])new String[]{"OAEPPadding"}), BigInteger.valueOf((long)1L)), calendar.getTime()), calendar2.getTime()));
    }
}

