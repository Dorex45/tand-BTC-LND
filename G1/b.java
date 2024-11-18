/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package g1;

import android.util.Log;

public abstract class b {
    public static void a(String string, String string2) {
    }

    public static void b(String string, String string2) {
        Log.e((String)string, (String)string2);
    }

    public static void c(String string, String string2, Throwable throwable) {
        Log.e((String)string, (String)string2, (Throwable)throwable);
    }

    public static String d(Throwable throwable) {
        return Log.getStackTraceString((Throwable)throwable);
    }

    public static void e(String string, String string2) {
    }

    public static void f(String string, String string2) {
    }

    public static void g(String string, String string2) {
        Log.w((String)string, (String)string2);
    }

    public static void h(String string, String string2, Throwable throwable) {
        Log.w((String)string, (String)string2, (Throwable)throwable);
    }
}

