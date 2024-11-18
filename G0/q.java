/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package G0;

import A0.t;

public abstract class q {
    public static int a() {
        Integer n2 = t.a();
        if (n2 != null) {
            return n2;
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals((Object)System.getProperty((String)"java.vendor"));
    }
}

