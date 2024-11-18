/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.security.Key
 *  java.security.SecureRandom
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.it_nomads.fluttersecurestorage.ciphers.a;
import com.it_nomads.fluttersecurestorage.ciphers.o;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class n
implements o {
    private final Cipher a;
    private final SecureRandom b = new SecureRandom();
    private Key c;

    public n(Context context, a a2) {
        String string = this.c();
        Object object = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        context = object.edit();
        object = object.getString(string, null);
        this.a = this.d();
        if (object != null) {
            try {
                this.c = a2.b(Base64.decode((String)object, (int)0), "AES");
                return;
            }
            catch (Exception exception) {
                Log.e((String)"StorageCipher18Impl", (String)"unwrap key failed", (Throwable)exception);
            }
        }
        object = new byte[16];
        this.b.nextBytes((byte[])object);
        object = new SecretKeySpec((byte[])object, "AES");
        this.c = object;
        context.putString(string, Base64.encodeToString((byte[])a2.a((Key)object), (int)0));
        context.apply();
    }

    @Override
    public byte[] a(byte[] byArray) {
        int n3 = this.e();
        byte[] byArray2 = new byte[n3];
        this.b.nextBytes(byArray2);
        Object object = this.f(byArray2);
        this.a.init(1, this.c, object);
        object = this.a.doFinal(byArray);
        byArray = new byte[((AlgorithmParameterSpec)object).length + n3];
        System.arraycopy((Object)byArray2, (int)0, (Object)byArray, (int)0, (int)n3);
        System.arraycopy((Object)object, (int)0, (Object)byArray, (int)n3, (int)((AlgorithmParameterSpec)object).length);
        return byArray;
    }

    @Override
    public byte[] b(byte[] byArray) {
        int n3 = this.e();
        Object object = new byte[n3];
        System.arraycopy((Object)byArray, (int)0, (Object)object, (int)0, (int)n3);
        object = this.f((byte[])object);
        int n4 = byArray.length - this.e();
        byte[] byArray2 = new byte[n4];
        System.arraycopy((Object)byArray, (int)n3, (Object)byArray2, (int)0, (int)n4);
        this.a.init(2, this.c, (AlgorithmParameterSpec)object);
        return this.a.doFinal(byArray2);
    }

    protected String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    protected Cipher d() {
        return Cipher.getInstance((String)"AES/CBC/PKCS7Padding");
    }

    protected int e() {
        return 16;
    }

    protected AlgorithmParameterSpec f(byte[] byArray) {
        return new IvParameterSpec(byArray);
    }
}

