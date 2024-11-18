/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package c0;

import V.c;
import X.h;
import Y.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c0.g;
import i0.j;

public final class o
extends Y.g {
    protected o(Context context, Looper looper, d d2, X.c c2, h h2) {
        super(context, looper, 308, d2, c2, h2);
    }

    @Override
    protected final String D() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    protected final boolean H() {
        return true;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final int p() {
        return 17895000;
    }

    @Override
    protected final /* synthetic */ IInterface r(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService")) instanceof g ? (g)iInterface : new g((IBinder)object));
        return object;
    }

    @Override
    public final c[] u() {
        return j.b;
    }
}

