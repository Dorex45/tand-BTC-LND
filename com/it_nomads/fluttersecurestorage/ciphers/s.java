/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.it_nomads.fluttersecurestorage.ciphers.a;
import com.it_nomads.fluttersecurestorage.ciphers.d;
import com.it_nomads.fluttersecurestorage.ciphers.o;
import com.it_nomads.fluttersecurestorage.ciphers.r;
import java.util.Map;

public class s {
    private static final d e = com.it_nomads.fluttersecurestorage.ciphers.d.RSA_ECB_PKCS1Padding;
    private static final r f = r.AES_CBC_PKCS7Padding;
    private final d a;
    private final r b;
    private final d c;
    private final r d;

    public s(SharedPreferences object, Map object2) {
        d d2 = e;
        this.a = com.it_nomads.fluttersecurestorage.ciphers.d.valueOf(object.getString("FlutterSecureSAlgorithmKey", d2.name()));
        r r2 = f;
        this.b = r.valueOf(object.getString("FlutterSecureSAlgorithmStorage", r2.name()));
        d d3 = com.it_nomads.fluttersecurestorage.ciphers.d.valueOf(this.b((Map)object2, "keyCipherAlgorithm", d2.name()));
        int n2 = d3.minVersionCode;
        int n3 = Build.VERSION.SDK_INT;
        object = d2;
        if (n2 <= n3) {
            object = d3;
        }
        this.c = object;
        object2 = r.valueOf(this.b((Map)object2, "storageCipherAlgorithm", r2.name()));
        object = r2;
        if (object2.minVersionCode <= n3) {
            object = object2;
        }
        this.d = object;
    }

    private String b(Map object, String string, String string2) {
        if ((object = object.get((Object)string)) != null) {
            string2 = object.toString();
        }
        return string2;
    }

    public o a(Context context) {
        a a2 = this.c.keyCipher.a(context);
        return this.d.storageCipher.a(context, a2);
    }

    public o c(Context context) {
        a a2 = this.a.keyCipher.a(context);
        return this.b.storageCipher.a(context, a2);
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        boolean bl = this.a != this.c || this.b != this.d;
        return bl;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.d.name());
    }
}

