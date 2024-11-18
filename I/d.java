/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I.j
 *  I.t
 *  J.j
 *  J.l
 *  K.c
 *  N.d
 *  N.g
 *  N.i
 *  O.k
 *  O.o
 *  P.C
 *  P.I
 *  P.f
 *  P.g
 *  P.h
 *  R.c
 *  R.d
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 */
package I;

import I.j;
import I.r;
import I.s;
import I.t;
import J.l;
import K.c;
import N.g;
import N.i;
import O.k;
import O.o;
import P.C;
import P.I;
import P.f;
import P.h;
import android.content.Context;
import w1.a;

final class d
extends s {
    private a d;
    private a e;
    private a f;
    private a g;
    private a h;
    private a i;
    private a j;
    private a k;
    private a l;
    private a m;
    private a n;
    private a o;

    private d(Context context) {
        this.u(context);
    }

    public static s.a n() {
        return new b();
    }

    private void u(Context object) {
        this.d = K.a.a((a)I.j.a());
        object = c.a((Object)object);
        this.e = object;
        object = J.j.a((a)object, (a)R.c.a(), (a)R.d.a());
        this.f = object;
        this.g = K.a.a((a)J.l.a((a)this.e, (a)object));
        this.h = I.a((a)this.e, (a)P.f.a(), (a)P.g.a());
        this.i = K.a.a((a)C.a((a)R.c.a(), (a)R.d.a(), (a)P.h.a(), (a)this.h));
        object = N.g.b((a)R.c.a());
        this.j = object;
        Object object2 = N.i.a((a)this.e, (a)this.i, (a)object, (a)R.d.a());
        this.k = object2;
        a a2 = this.d;
        a a3 = this.g;
        object = this.i;
        this.l = N.d.a((a)a2, (a)a3, (a)object2, (a)object, (a)object);
        object = this.e;
        a3 = this.g;
        object2 = this.i;
        this.m = O.k.a((a)object, (a)a3, (a)object2, (a)this.k, (a)this.d, (a)object2, (a)R.c.a());
        object = this.d;
        a3 = this.i;
        this.n = O.o.a((a)object, (a)a3, (a)this.k, (a)a3);
        this.o = K.a.a((a)t.a((a)R.c.a(), (a)R.d.a(), (a)this.l, (a)this.m, (a)this.n));
    }

    @Override
    P.c c() {
        return (P.c)this.i.get();
    }

    @Override
    r f() {
        return (r)this.o.get();
    }

    private static final class b
    implements s.a {
        private Context a;

        private b() {
        }

        @Override
        public s a() {
            K.d.a(this.a, Context.class);
            return new d(this.a);
        }

        public b c(Context context) {
            this.a = (Context)K.d.b(context);
            return this;
        }
    }
}

