/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build$VERSION
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.util.Base64
 *  android.util.Log
 *  androidx.security.crypto.a
 *  androidx.security.crypto.a$d
 *  androidx.security.crypto.a$e
 *  androidx.security.crypto.d
 *  androidx.security.crypto.d$a
 *  androidx.security.crypto.f
 *  androidx.security.crypto.i
 *  androidx.security.crypto.j
 *  androidx.security.crypto.k
 *  androidx.security.crypto.l
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package b1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.security.crypto.a;
import androidx.security.crypto.d;
import androidx.security.crypto.f;
import androidx.security.crypto.i;
import androidx.security.crypto.j;
import androidx.security.crypto.k;
import androidx.security.crypto.l;
import com.it_nomads.fluttersecurestorage.ciphers.o;
import com.it_nomads.fluttersecurestorage.ciphers.s;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a {
    private final String a;
    private final Charset b;
    private final Context c;
    protected String d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
    protected Map e;
    private String f = "FlutterSecureStorage";
    private SharedPreferences g;
    private o h;
    private s i;
    private Boolean j = Boolean.FALSE;

    public a(Context context, Map map) {
        this.a = "SecureStorageAndroid";
        this.e = map;
        this.c = context.getApplicationContext();
        this.b = StandardCharsets.UTF_8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            Iterator iterator = sharedPreferences.getAll().entrySet().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    sharedPreferences = sharedPreferences.edit();
                    this.i.d((SharedPreferences.Editor)sharedPreferences);
                    sharedPreferences.apply();
                    return;
                }
                Object object = (Map.Entry)iterator.next();
                Object object2 = object.getValue();
                object = (String)object.getKey();
                if (!(object2 instanceof String) || !object.contains((CharSequence)this.d)) continue;
                object2 = this.d((String)object2);
                sharedPreferences2.edit().putString((String)object, (String)object2).apply();
                sharedPreferences.edit().remove((String)object).apply();
            }
        }
        catch (Exception exception) {}
        Log.e((String)"SecureStorageAndroid", (String)"Data migration failed", (Throwable)exception);
    }

    private String d(String object) {
        if (object == null) {
            return null;
        }
        object = Base64.decode((String)object, (int)0);
        return new String(this.h.b((byte[])object), this.b);
    }

    private void g() {
        this.h();
        SharedPreferences sharedPreferences = this.c.getSharedPreferences(this.f, 0);
        if (this.h == null) {
            try {
                this.k(sharedPreferences);
            }
            catch (Exception exception) {
                Log.e((String)"SecureStorageAndroid", (String)"StorageCipher initialization failed", (Throwable)exception);
            }
        }
        if (this.j() && Build.VERSION.SDK_INT >= 23) {
            try {
                SharedPreferences sharedPreferences2;
                this.g = sharedPreferences2 = this.l(this.c);
                this.b(sharedPreferences, sharedPreferences2);
            }
            catch (Exception exception) {
                Log.e((String)"SecureStorageAndroid", (String)"EncryptedSharedPreferences initialization failed", (Throwable)exception);
                this.g = sharedPreferences;
                this.j = Boolean.TRUE;
            }
        } else {
            this.g = sharedPreferences;
        }
    }

    private boolean j() {
        boolean bl = this.j;
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        bl = bl2;
        if (this.e.containsKey((Object)"encryptedSharedPreferences")) {
            bl = bl2;
            if (this.e.get((Object)"encryptedSharedPreferences").equals((Object)"true")) {
                bl = bl2;
                if (Build.VERSION.SDK_INT >= 23) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    private void k(SharedPreferences sharedPreferences) {
        this.i = new s(sharedPreferences, this.e);
        if (this.j()) {
            this.h = this.i.c(this.c);
        } else if (this.i.e()) {
            this.m(this.i, sharedPreferences);
        } else {
            this.h = this.i.a(this.c);
        }
    }

    private SharedPreferences l(Context context) {
        d d2 = new d.a(context).b(l.a((KeyGenParameterSpec.Builder)k.a((KeyGenParameterSpec.Builder)androidx.security.crypto.i.a((KeyGenParameterSpec.Builder)androidx.security.crypto.j.a((KeyGenParameterSpec.Builder)androidx.security.crypto.f.a((String)"_androidx_security_master_key_", (int)3), (String[])new String[]{"NoPadding"}), (String[])new String[]{"GCM"}), (int)256))).a();
        return androidx.security.crypto.a.a((Context)context, (String)this.f, (d)d2, (a.d)a.d.AES256_SIV, (a.e)a.e.AES256_GCM);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(s s2, SharedPreferences sharedPreferences) {
        Exception exception2;
        block5: {
            Object object;
            Object object2;
            try {
                this.h = s2.c(this.c);
                object2 = new HashMap();
                for (Object object3 : sharedPreferences.getAll().entrySet()) {
                    object = object3.getValue();
                    object3 = (String)object3.getKey();
                    if (!(object instanceof String) || !object3.contains((CharSequence)this.d)) continue;
                    object2.put(object3, (Object)this.d((String)object));
                }
            }
            catch (Exception exception2) {
                break block5;
            }
            this.h = s2.a(this.c);
            sharedPreferences = sharedPreferences.edit();
            Iterator iterator = object2.entrySet().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    s2.f((SharedPreferences.Editor)sharedPreferences);
                    sharedPreferences.apply();
                    return;
                }
                object = (Map.Entry)iterator.next();
                object2 = this.h.a(((String)object.getValue()).getBytes(this.b));
                sharedPreferences.putString((String)object.getKey(), Base64.encodeToString((byte[])object2, (int)0));
            }
        }
        Log.e((String)"SecureStorageAndroid", (String)"re-encryption failed", (Throwable)exception2);
        this.h = s2.c(this.c);
    }

    public String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d);
        stringBuilder.append("_");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public boolean c(String string) {
        this.g();
        return this.g.contains(string);
    }

    public void e(String string) {
        this.g();
        SharedPreferences.Editor editor = this.g.edit();
        editor.remove(string);
        editor.apply();
    }

    public void f() {
        this.g();
        SharedPreferences.Editor editor = this.g.edit();
        editor.clear();
        if (!this.j()) {
            this.i.f(editor);
        }
        editor.apply();
    }

    protected void h() {
        if (this.e.containsKey((Object)"sharedPreferencesName") && !((String)this.e.get((Object)"sharedPreferencesName")).isEmpty()) {
            this.f = (String)this.e.get((Object)"sharedPreferencesName");
        }
        if (this.e.containsKey((Object)"preferencesKeyPrefix") && !((String)this.e.get((Object)"preferencesKeyPrefix")).isEmpty()) {
            this.d = (String)this.e.get((Object)"preferencesKeyPrefix");
        }
    }

    boolean i() {
        boolean bl = this.e.containsKey((Object)"resetOnError") && this.e.get((Object)"resetOnError").equals((Object)"true");
        return bl;
    }

    public String n(String string) {
        this.g();
        string = this.g.getString(string, null);
        if (this.j()) {
            return string;
        }
        return this.d(string);
    }

    public Map o() {
        this.g();
        Map map = this.g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).contains((CharSequence)this.d)) continue;
            String string = (String)entry.getKey();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append('_');
            string = string.replaceFirst(stringBuilder.toString(), "");
            if (this.j()) {
                hashMap.put((Object)string, (Object)((String)entry.getValue()));
                continue;
            }
            hashMap.put((Object)string, (Object)this.d((String)entry.getValue()));
        }
        return hashMap;
    }

    public void p(String string, String string2) {
        this.g();
        SharedPreferences.Editor editor = this.g.edit();
        if (this.j()) {
            editor.putString(string, string2);
        } else {
            editor.putString(string, Base64.encodeToString((byte[])this.h.a(string2.getBytes(this.b)), (int)0));
        }
        editor.apply();
    }
}

