/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  androidx.core.content.a
 *  java.lang.Object
 */
package i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.a;
import i0.e;
import i0.f;

public abstract class g
extends a {
    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (e.a()) {
            int n3 = true != e.a() ? 0 : 2;
            return f.a(context, broadcastReceiver, intentFilter, n3);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}

