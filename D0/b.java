/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.NoSuchElementException
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package d0;

import Y.i0;
import Y.p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import d0.a;
import e0.g;
import f0.d;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class b {
    private static final Object b = new Object();
    private static volatile b c;
    public ConcurrentHashMap a = new ConcurrentHashMap();

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a() {
        Object object;
        block6: {
            if (c == null) {
                Object object2 = object = b;
                synchronized (object2) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                b b2;
                                if (c != null) break block4;
                                c = b2 = new b();
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = c;
        p.i(object);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void d(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean e(Context context, String string, Intent intent, ServiceConnection serviceConnection, int n2, boolean bl, Executor executor) {
        block8: {
            ComponentName componentName = intent.getComponent();
            if (componentName != null) {
                String string2 = componentName.getPackageName();
                "com.google.android.gms".equals((Object)string2);
                try {
                    int n3 = d.a((Context)context).a((String)string2, (int)0).flags;
                    if ((n3 & 0x200000) == 0) break block8;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    // empty catch block
                    break block8;
                }
                Log.w((String)"ConnectionTracker", (String)"Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        if (!d0.b.f(serviceConnection)) {
            return d0.b.g(context, intent, serviceConnection, n2, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w((String)"ConnectionTracker", (String)String.format((String)"Duplicate binding with the same ServiceConnection: %s, %s, %s.", (Object[])new Object[]{serviceConnection, string, intent.getAction()}));
        }
        try {
            bl = d0.b.g(context, intent, serviceConnection, n2, executor);
            if (!bl) return false;
            return bl;
        }
        finally {
            this.a.remove((Object)serviceConnection, (Object)serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof i0);
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int n2, Executor executor) {
        if (g.g() && executor != null) {
            return d0.a.a(context, intent, n2, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n2);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (d0.b.f(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                d0.b.d(context, (ServiceConnection)this.a.get((Object)serviceConnection));
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        d0.b.d(context, serviceConnection);
    }

    public final boolean c(Context context, String string, Intent intent, ServiceConnection serviceConnection, int n2, Executor executor) {
        return this.e(context, string, intent, serviceConnection, n2, true, executor);
    }
}

