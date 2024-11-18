/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package b0;

import Z.a;
import Z.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b0.i;

public class e
extends a {
    public static final Parcelable.Creator<e> CREATOR = new i();
    private final PendingIntent a;

    public e(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public PendingIntent a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = c.a(parcel);
        c.k(parcel, 1, (Parcelable)this.a(), n3, false);
        c.b(parcel, n4);
    }
}

