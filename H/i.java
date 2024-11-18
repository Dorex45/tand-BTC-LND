/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.camera.camera2.internal.compat.E
 *  java.lang.Object
 */
package h;

import android.os.Build;
import androidx.camera.camera2.internal.compat.E;
import s.h;

public final class I
implements h {
    private static boolean a() {
        boolean bl = "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
        return bl;
    }

    private static boolean b() {
        boolean bl = "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
        return bl;
    }

    private static boolean c() {
        boolean bl = "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
        return bl;
    }

    static boolean d(E e2) {
        boolean bl = I.a() || I.b() || I.c();
        return bl;
    }
}

