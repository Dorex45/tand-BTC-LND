/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.Object
 */
package e0;

import android.os.Looper;

public abstract class i {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}

