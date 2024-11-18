/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package d0;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

public abstract class a {
    public static /* bridge */ /* synthetic */ boolean a(Context context, Intent intent, int n2, Executor executor, ServiceConnection serviceConnection) {
        return context.bindService(intent, n2, executor, serviceConnection);
    }
}

