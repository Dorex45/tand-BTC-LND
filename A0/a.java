/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 */
package a0;

import Y.s;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i0.c;

public final class a
extends i0.a
implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void q(s s2) {
        Parcel parcel = this.c();
        c.c(parcel, s2);
        this.e(1, parcel);
    }
}

