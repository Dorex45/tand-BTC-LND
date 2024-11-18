/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.security.KeyPairGeneratorSpec$Builder
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  androidx.security.crypto.f
 *  androidx.security.crypto.i
 *  androidx.security.crypto.j
 *  androidx.security.crypto.l
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.Key
 *  java.security.KeyPairGenerator
 *  java.security.KeyStore
 *  java.security.PrivateKey
 *  java.security.PublicKey
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Calendar
 *  java.util.Locale
 *  javax.crypto.Cipher
 *  javax.security.auth.x500.X500Principal
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.it_nomads.fluttersecurestorage.ciphers.a;
import com.it_nomads.fluttersecurestorage.ciphers.f;
import com.it_nomads.fluttersecurestorage.ciphers.g;
import com.it_nomads.fluttersecurestorage.ciphers.h;
import com.it_nomads.fluttersecurestorage.ciphers.i;
import com.it_nomads.fluttersecurestorage.ciphers.j;
import com.it_nomads.fluttersecurestorage.ciphers.k;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

class l
implements a {
    protected final String a;
    protected final Context b;

    public l(Context context) {
        this.b = context;
        this.a = this.c();
        this.e(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(Context context) {
        Throwable throwable2;
        Locale locale;
        block2: {
            KeyPairGenerator keyPairGenerator;
            locale = Locale.getDefault();
            try {
                this.l(Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 25);
                keyPairGenerator = KeyPairGenerator.getInstance((String)"RSA", (String)"AndroidKeyStore");
                context = Build.VERSION.SDK_INT < 23 ? this.k(context, calendar, calendar2) : this.j(context, calendar, calendar2);
            }
            catch (Throwable throwable2) {
                break block2;
            }
            keyPairGenerator.initialize((AlgorithmParameterSpec)context);
            keyPairGenerator.generateKeyPair();
            this.l(locale);
            return;
        }
        this.l(locale);
        throw throwable2;
    }

    private void e(Context context) {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.a, null) == null) {
            this.d(context);
        }
    }

    private PrivateKey g() {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        keyStore = keyStore.getKey(this.a, null);
        if (keyStore != null) {
            if (keyStore instanceof PrivateKey) {
                return (PrivateKey)keyStore;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        keyStore = new StringBuilder();
        keyStore.append("No key found under alias: ");
        keyStore.append(this.a);
        throw new Exception(keyStore.toString());
    }

    private PublicKey h() {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        keyStore = keyStore.getCertificate(this.a);
        if (keyStore != null) {
            if ((keyStore = keyStore.getPublicKey()) != null) {
                return keyStore;
            }
            keyStore = new StringBuilder();
            keyStore.append("No key found under alias: ");
            keyStore.append(this.a);
            throw new Exception(keyStore.toString());
        }
        keyStore = new StringBuilder();
        keyStore.append("No certificate found under alias: ");
        keyStore.append(this.a);
        throw new Exception(keyStore.toString());
    }

    private AlgorithmParameterSpec k(Context context, Calendar calendar, Calendar calendar2) {
        KeyPairGeneratorSpec.Builder builder = new KeyPairGeneratorSpec.Builder(context).setAlias(this.a);
        context = new StringBuilder();
        context.append("CN=");
        context.append(this.a);
        return builder.setSubject(new X500Principal(context.toString())).setSerialNumber(BigInteger.valueOf((long)1L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
    }

    private void l(Locale locale) {
        Locale.setDefault((Locale)locale);
        Configuration configuration = this.b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.b.createConfigurationContext(configuration);
    }

    @Override
    public byte[] a(Key key) {
        PublicKey publicKey = this.h();
        Cipher cipher = this.i();
        cipher.init(3, (Key)publicKey, this.f());
        return cipher.wrap(key);
    }

    @Override
    public Key b(byte[] byArray, String string) {
        PrivateKey privateKey = this.g();
        Cipher cipher = this.i();
        cipher.init(4, (Key)privateKey, this.f());
        return cipher.unwrap(byArray, string, 3);
    }

    protected String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.getPackageName());
        stringBuilder.append(".FlutterSecureStoragePluginKey");
        return stringBuilder.toString();
    }

    protected AlgorithmParameterSpec f() {
        return null;
    }

    protected Cipher i() {
        if (Build.VERSION.SDK_INT < 23) {
            return Cipher.getInstance((String)"RSA/ECB/PKCS1Padding", (String)"AndroidOpenSSL");
        }
        return Cipher.getInstance((String)"RSA/ECB/PKCS1Padding", (String)"AndroidKeyStoreBCWorkaround");
    }

    protected AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        f.a();
        KeyGenParameterSpec.Builder builder = androidx.security.crypto.f.a((String)this.a, (int)3);
        context = new StringBuilder();
        context.append("CN=");
        context.append(this.a);
        return androidx.security.crypto.l.a((KeyGenParameterSpec.Builder)k.a(j.a(i.a(androidx.security.crypto.j.a((KeyGenParameterSpec.Builder)androidx.security.crypto.i.a((KeyGenParameterSpec.Builder)h.a(g.a(builder, new X500Principal(context.toString())), new String[]{"SHA-256"}), (String[])new String[]{"ECB"}), (String[])new String[]{"PKCS1Padding"}), BigInteger.valueOf((long)1L)), calendar.getTime()), calendar2.getTime()));
    }
}

