/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReference
 *  s0.g
 *  s0.v
 *  s0.w
 */
package A0;

import A0.l;
import A0.n;
import java.util.concurrent.atomic.AtomicReference;
import s0.g;
import s0.v;
import s0.w;

public final class h {
    private static h b = new h();
    private final AtomicReference a = new AtomicReference((Object)new n.b().c());

    h() {
    }

    public static h c() {
        return b;
    }

    public Class a(Class clazz) {
        return ((n)this.a.get()).c(clazz);
    }

    public Object b(g g2, Class clazz) {
        return ((n)this.a.get()).d(g2, clazz);
    }

    public void d(l object) {
        h h2 = this;
        synchronized (h2) {
            n.b b2 = new n.b((n)this.a.get());
            object = b2.d((l)object).c();
            this.a.set(object);
            return;
        }
    }

    public void e(w object) {
        h h2 = this;
        synchronized (h2) {
            n.b b2 = new n.b((n)this.a.get());
            object = b2.e((w)object).c();
            this.a.set(object);
            return;
        }
    }

    public Object f(v v2, Class clazz) {
        return ((n)this.a.get()).e(v2, clazz);
    }
}

