/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package e0;

import android.os.Build;

public abstract class g {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 31;
    }
}

