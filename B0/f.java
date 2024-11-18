/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package b0;

import Y.p;
import b0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class f {
    private final List a;
    private final Executor b;
    private final boolean c;

    /* synthetic */ f(List list, b0.a a2, Executor executor, boolean bl, j j2) {
        p.j(list, "APIs must not be null.");
        p.b(list.isEmpty() ^ true, "APIs must not be empty.");
        if (executor != null) {
            p.j(a2, "Listener must not be null when listener executor is set.");
        }
        this.a = list;
        this.b = executor;
        this.c = bl;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.a;
    }

    public b0.a b() {
        return null;
    }

    public Executor c() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public static class a {
        private final List a = new ArrayList();
        private boolean b = true;
        private Executor c;

        public a a(W.f f2) {
            this.a.add((Object)f2);
            return this;
        }

        public f b() {
            return new f(this.a, null, this.c, this.b, null);
        }
    }
}

