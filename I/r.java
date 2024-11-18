/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Set
 */
package I;

import G.b;
import I.d;
import I.e;
import I.f;
import I.g;
import I.h;
import I.l;
import I.m;
import I.n;
import I.q;
import I.s;
import O.j;
import R.a;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

public class r
implements q {
    private static volatile s e;
    private final a a;
    private final a b;
    private final N.e c;
    private final j d;

    r(a a2, a a3, N.e e2, j j2, O.n n2) {
        this.a = a2;
        this.b = a3;
        this.c = e2;
        this.d = j2;
        n2.a();
    }

    private h b(l l2) {
        return h.a().i(this.a.a()).k(this.b.a()).j(l2.g()).h(new g(l2.b(), l2.d())).g(l2.c().a()).d();
    }

    public static r c() {
        s s2 = e;
        if (s2 != null) {
            return s2.f();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(e e2) {
        if (e2 instanceof f) {
            return Collections.unmodifiableSet((Set)((f)e2).a());
        }
        return Collections.singleton((Object)G.b.b("proto"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Context context) {
        if (e != null) return;
        Class<r> clazz = r.class;
        synchronized (r.class) {
            try {
                if (e != null) return;
                e = I.d.n().b(context).a();
                // ** MonitorExit[var1_2] (shouldn't be in output)
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void a(l l2, G.h h2) {
        this.c.a(l2.f().e(l2.c().c()), this.b(l2), h2);
    }

    public j e() {
        return this.d;
    }

    public G.g g(e e2) {
        return new n(r.d(e2), m.a().b(e2.f()).c(e2.e()).a(), this);
    }
}

