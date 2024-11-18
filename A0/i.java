/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.e
 *  A0.o
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.security.GeneralSecurityException
 *  java.util.concurrent.atomic.AtomicReference
 *  s0.g
 *  s0.y
 */
package A0;

import A0.b;
import A0.c;
import A0.e;
import A0.j;
import A0.k;
import A0.o;
import A0.q;
import A0.r;
import A0.s;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import s0.g;
import s0.y;

public final class i {
    private static final i b = new i();
    private final AtomicReference a = new AtomicReference((Object)new r.b().e());

    public static i a() {
        return b;
    }

    public boolean b(q q2) {
        return ((r)this.a.get()).e(q2);
    }

    public g c(q q2, y y2) {
        return ((r)this.a.get()).f(q2, y2);
    }

    public g d(o o2, y y2) {
        if (y2 != null) {
            if (!this.b((q)o2)) {
                try {
                    o2 = new e(o2, y2);
                    return o2;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new s("Creating a LegacyProtoKey failed", generalSecurityException);
                }
            }
            return this.c((q)o2, y2);
        }
        throw new NullPointerException("access cannot be null");
    }

    public void e(b object) {
        i i2 = this;
        synchronized (i2) {
            r.b b2 = new r.b((r)this.a.get());
            object = b2.f((b)object).e();
            this.a.set(object);
            return;
        }
    }

    public void f(c object) {
        i i2 = this;
        synchronized (i2) {
            r.b b2 = new r.b((r)this.a.get());
            object = b2.g((c)object).e();
            this.a.set(object);
            return;
        }
    }

    public void g(j object) {
        i i2 = this;
        synchronized (i2) {
            r.b b2 = new r.b((r)this.a.get());
            object = b2.h((j)object).e();
            this.a.set(object);
            return;
        }
    }

    public void h(k object) {
        i i2 = this;
        synchronized (i2) {
            r.b b2 = new r.b((r)this.a.get());
            object = b2.i((k)object).e();
            this.a.set(object);
            return;
        }
    }
}

