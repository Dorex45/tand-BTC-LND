/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 */
package h1;

import android.os.Handler;
import android.os.Looper;
import h1.c;
import v1.a;

public class g
implements c.d {
    private final Handler a = v1.a.a(Looper.getMainLooper());

    @Override
    public void a(Runnable runnable) {
        this.a.post(runnable);
    }
}

