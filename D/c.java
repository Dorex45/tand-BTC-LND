/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  java.lang.Object
 *  java.lang.String
 */
package D;

import android.os.Trace;

abstract class c {
    public static void a(String string, int n2) {
        Trace.beginAsyncSection((String)string, (int)n2);
    }

    public static void b(String string, int n2) {
        Trace.endAsyncSection((String)string, (int)n2);
    }
}

