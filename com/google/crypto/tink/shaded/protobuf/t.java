/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.x
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Map$Entry
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.x;
import f.c;
import java.util.Iterator;
import java.util.Map;

final class T
implements e0 {
    private final O a;
    private final k0 b;
    private final boolean c;
    private final q d;

    private T(k0 k02, q q2, O o2) {
        this.b = k02;
        this.c = q2.e(o2);
        this.d = q2;
        this.a = o2;
    }

    private int k(k0 k02, Object object) {
        return k02.i(k02.g(object));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(k0 k02, q q2, Object object, d0 d02, p p2) {
        Object object2 = k02.f(object);
        t t2 = q2.d(object);
        while (true) {
            try {
                int n3 = d02.K();
                if (n3 != Integer.MAX_VALUE) continue;
            }
            catch (Throwable throwable) {
                k02.o(object, object2);
                throw throwable;
            }
            k02.o(object, object2);
            return;
            {
                boolean bl;
                if (bl = this.n(d02, p2, q2, t2, k02, object2)) continue;
            }
            break;
        }
        k02.o(object, object2);
    }

    static T m(k0 k02, q q2, O o2) {
        return new T(k02, q2, o2);
    }

    private boolean n(d0 d02, p p2, q q2, t t2, k0 k02, Object object) {
        int n3 = d02.j();
        if (n3 != q0.a) {
            if (q0.b(n3) == 2) {
                Object object2 = q2.b(p2, this.a, q0.a(n3));
                if (object2 != null) {
                    q2.h(d02, object2, p2, t2);
                    return true;
                }
                return k02.m(object, d02);
            }
            return d02.o();
        }
        Object object3 = null;
        h h2 = null;
        n3 = 0;
        while (d02.K() != Integer.MAX_VALUE) {
            int n4 = d02.j();
            if (n4 == q0.c) {
                n3 = d02.g();
                object3 = q2.b(p2, this.a, n3);
                continue;
            }
            if (n4 == q0.d) {
                if (object3 != null) {
                    q2.h(d02, object3, p2, t2);
                    continue;
                }
                h2 = d02.c();
                continue;
            }
            if (d02.o()) continue;
        }
        if (d02.j() == q0.b) {
            if (h2 != null) {
                if (object3 != null) {
                    q2.i(h2, object3, p2, t2);
                } else {
                    k02.d(object, n3, h2);
                }
            }
            return true;
        }
        throw A.b();
    }

    private void o(k0 k02, Object object, r0 r02) {
        k02.s(k02.g(object), r02);
    }

    @Override
    public void a(Object object, Object object2) {
        g0.F(this.b, object, object2);
        if (this.c) {
            g0.D(this.d, object, object2);
        }
    }

    @Override
    public final boolean b(Object object) {
        return this.d.c(object).e();
    }

    @Override
    public boolean c(Object object, Object object2) {
        if (!this.b.g(object).equals(this.b.g(object2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(object).equals(this.d.c(object2));
        }
        return true;
    }

    @Override
    public void d(Object object, byte[] object2, int n3, int n4, e.a a2) {
        object2 = (x)object;
        if (object2.unknownFields == l0.c()) {
            object2.unknownFields = l0.k();
        }
        f.c.a(object);
        throw null;
    }

    @Override
    public void e(Object object, r0 r02) {
        Iterator iterator = this.d.c(object).f();
        if (!iterator.hasNext()) {
            this.o(this.b, object, r02);
            return;
        }
        f.c.a(((Map.Entry)iterator.next()).getKey());
        throw null;
    }

    @Override
    public int f(Object object) {
        int n3;
        int n4 = n3 = this.k(this.b, object);
        if (this.c) {
            n4 = n3 + this.d.c(object).b();
        }
        return n4;
    }

    @Override
    public Object g() {
        O o2 = this.a;
        if (o2 instanceof x) {
            return ((x)o2).J();
        }
        return o2.d().h();
    }

    @Override
    public void h(Object object, d0 d02, p p2) {
        this.l(this.b, this.d, object, d02, p2);
    }

    @Override
    public void i(Object object) {
        this.b.j(object);
        this.d.f(object);
    }

    @Override
    public int j(Object object) {
        int n3;
        int n4 = n3 = this.b.g(object).hashCode();
        if (this.c) {
            n4 = n3 * 53 + this.d.c(object).hashCode();
        }
        return n4;
    }
}

