/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package a0;

import V.c;
import X.h;
import Y.g;
import Y.v;
import a0.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i0.d;

public final class e
extends g {
    private final v I;

    public e(Context context, Looper looper, Y.d d2, v v2, X.c c2, h h2) {
        super(context, looper, 270, d2, c2, h2);
        this.I = v2;
    }

    @Override
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    protected final boolean H() {
        return true;
    }

    @Override
    public final int p() {
        return 203400000;
    }

    @Override
    protected final /* synthetic */ IInterface r(IBinder object) {
        IInterface iInterface;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService")) instanceof a ? (a)iInterface : new a((IBinder)object));
        return object;
    }

    @Override
    public final c[] u() {
        return d.b;
    }

    @Override
    protected final Bundle z() {
        return this.I.b();
    }
}

