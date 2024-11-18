/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Object
 */
package i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public abstract class f {
    public static /* bridge */ /* synthetic */ Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n2) {
        return context.registerReceiver(broadcastReceiver, intentFilter, n2);
    }
}

