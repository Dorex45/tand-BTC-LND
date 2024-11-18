/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Object
 */
package e0;

import android.content.Context;
import e0.g;

public abstract class e {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        context = context.getPackageManager();
        if (d == null) {
            boolean bl;
            boolean bl2 = g.f();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.hasSystemFeature("android.hardware.type.automotive")) {
                    bl3 = true;
                }
            }
            d = bl3;
        }
        return d;
    }

    public static boolean b(Context context) {
        context = context.getPackageManager();
        if (a == null) {
            boolean bl;
            boolean bl2 = g.c();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.hasSystemFeature("android.hardware.type.watch")) {
                    bl3 = true;
                }
            }
            a = bl3;
        }
        return a;
    }

    public static boolean c(Context context) {
        return e.b(context) && !g.e() || e.d(context) && (!g.f() || g.h());
    }

    public static boolean d(Context context) {
        if (b == null) {
            boolean bl;
            boolean bl2 = g.d();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    bl3 = true;
                }
            }
            b = bl3;
        }
        return b;
    }

    public static boolean e(Context context) {
        if (c == null) {
            boolean bl;
            boolean bl2 = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            boolean bl3 = bl = true;
            if (!bl2) {
                bl3 = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? bl : false;
            }
            c = bl3;
        }
        return c;
    }
}

