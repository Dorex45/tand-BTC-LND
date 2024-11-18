/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 */
package c0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c0.a;
import c0.f;
import c0.h;
import i0.c;

public final class g
extends i0.a
implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void q(f f2, a a2) {
        Parcel parcel = this.c();
        c.d(parcel, f2);
        c.c(parcel, a2);
        this.d(1, parcel);
    }

    public final void r(f f2, a a2, h h2) {
        Parcel parcel = this.c();
        c.d(parcel, f2);
        c.c(parcel, a2);
        c.d(parcel, h2);
        this.d(2, parcel);
    }
}

