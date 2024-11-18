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
import b0.k;

public class g
extends a {
    public static final Parcelable.Creator<g> CREATOR = new k();
    private final int a;
    private final boolean b;

    public g(int n3) {
        this(n3, false);
    }

    public g(int n3, boolean bl) {
        this.a = n3;
        this.b = bl;
    }

    public int a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = c.a(parcel);
        c.h(parcel, 1, this.a());
        c.c(parcel, 2, this.b);
        c.b(parcel, n3);
    }
}

