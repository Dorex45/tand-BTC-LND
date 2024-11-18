/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package e0;

import Y.p;
import android.content.Context;
import android.util.Log;

public abstract class c {
    private static final String[] a = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable throwable) {
        try {
            p.i(context);
            p.i(throwable);
        }
        catch (Exception exception) {
            Log.e((String)"CrashUtils", (String)"Error adding exception to DropBox!", (Throwable)exception);
        }
        return false;
    }
}

