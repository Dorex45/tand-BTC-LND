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

abstract class b {
    public static void a(String string) {
        Trace.beginSection((String)string);
    }

    public static void b() {
        Trace.endSection();
    }
}

