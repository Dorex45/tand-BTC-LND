/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package I;

import I.r;
import K.b;
import N.e;
import O.j;
import O.n;
import R.a;

public final class t
implements b {
    private final w1.a a;
    private final w1.a b;
    private final w1.a c;
    private final w1.a d;
    private final w1.a e;

    public t(w1.a a2, w1.a a3, w1.a a4, w1.a a5, w1.a a6) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
        this.e = a6;
    }

    public static t a(w1.a a2, w1.a a3, w1.a a4, w1.a a5, w1.a a6) {
        return new t(a2, a3, a4, a5, a6);
    }

    public static r c(a a2, a a3, e e2, j j2, n n2) {
        return new r(a2, a3, e2, j2, n2);
    }

    public r b() {
        return t.c((a)this.a.get(), (a)this.b.get(), (e)this.c.get(), (j)this.d.get(), (n)this.e.get());
    }
}

