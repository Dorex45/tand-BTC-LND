/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package b0;

import Z.a;
import Z.c;
import android.os.Parcel;
import android.os.Parcelable;
import b0.h;

public class b
extends a {
    public static final Parcelable.Creator<b> CREATOR = new h();
    private final boolean a;
    private final int b;

    public b(boolean bl, int n3) {
        this.a = bl;
        this.b = n3;
    }

    public boolean a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = c.a(parcel);
        c.c(parcel, 1, this.a());
        c.h(parcel, 2, this.b());
        c.b(parcel, n3);
    }
}

