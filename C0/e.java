/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  com.google.android.gms.common.api.Status
 *  java.lang.Object
 *  java.lang.Override
 */
package c0;

import android.os.Parcel;
import b0.g;
import c0.f;
import com.google.android.gms.common.api.Status;
import i0.b;
import i0.c;

public abstract class e
extends b
implements f {
    public e() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override
    protected final boolean q(int n3, Parcel parcel, Parcel object, int n4) {
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        return false;
                    }
                    object = (Status)c.a(parcel, Status.CREATOR);
                    c.b(parcel);
                    this.h((Status)object);
                } else {
                    Status status = (Status)c.a(parcel, Status.CREATOR);
                    object = (b0.e)c.a(parcel, b0.e.CREATOR);
                    c.b(parcel);
                    this.k(status, (b0.e)object);
                }
            } else {
                Status status = (Status)c.a(parcel, Status.CREATOR);
                object = (g)c.a(parcel, g.CREATOR);
                c.b(parcel);
                this.m(status, (g)object);
            }
        } else {
            Status status = (Status)c.a(parcel, Status.CREATOR);
            object = (b0.b)c.a(parcel, b0.b.CREATOR);
            c.b(parcel);
            this.l(status, (b0.b)object);
        }
        return true;
    }
}

