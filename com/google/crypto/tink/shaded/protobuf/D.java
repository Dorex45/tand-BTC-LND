/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

abstract class d {
    private static boolean a;
    private static final Class b;
    private static final boolean c;

    static {
        b = d.a("libcore.io.Memory");
        boolean bl = !a && d.a("org.robolectric.Robolectric") != null;
        c = bl;
    }

    private static Class a(String string) {
        try {
            string = Class.forName((String)string);
            return string;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static Class b() {
        return b;
    }

    static boolean c() {
        boolean bl = a || b != null && !c;
        return bl;
    }
}

