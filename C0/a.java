/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.TreeSet
 */
package c0;

import Y.o;
import Y.p;
import android.os.Parcel;
import android.os.Parcelable;
import b0.f;
import c0.c;
import c0.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class a
extends Z.a {
    public static final Parcelable.Creator<a> CREATOR = new d();
    private static final Comparator e = c0.c.a;
    private final List a;
    private final boolean b;
    private final String c;
    private final String d;

    public a(List list, boolean bl, String string, String string2) {
        p.i(list);
        this.a = list;
        this.b = bl;
        this.c = string;
        this.d = string2;
    }

    public static a a(f f2) {
        return c0.a.c(f2.a(), true);
    }

    static a c(List list, boolean bl) {
        TreeSet treeSet = new TreeSet(e);
        list = list.iterator();
        while (list.hasNext()) {
            Collections.addAll((Collection)treeSet, (Object[])((W.f)list.next()).c());
        }
        return new a((List)new ArrayList((Collection)treeSet), bl, null, null);
    }

    public List b() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.b == ((a)object).b && o.a(this.a, ((a)object).a) && o.a(this.c, ((a)object).c) && o.a(this.d, ((a)object).d);
    }

    public final int hashCode() {
        return o.b(this.b, this.a, this.c, this.d);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = Z.c.a(parcel);
        Z.c.p(parcel, 1, this.b(), false);
        Z.c.c(parcel, 2, this.b);
        Z.c.l(parcel, 3, this.c, false);
        Z.c.l(parcel, 4, this.d, false);
        Z.c.b(parcel, n3);
    }
}

