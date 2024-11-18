/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 */
package a;

import android.os.Handler;
import android.os.Looper;

public abstract class b {
    public static /* bridge */ /* synthetic */ Handler a(Looper looper) {
        return Handler.createAsync((Looper)looper);
    }
}

