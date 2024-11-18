/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.List
 */
package B0;

import B0.g;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import s0.v;
import s0.w;
import s0.x;

public class h
implements w {
    private static final h a = new h();

    private h() {
    }

    static void d() {
        x.n(a);
    }

    @Override
    public Class a() {
        return g.class;
    }

    @Override
    public Class c() {
        return g.class;
    }

    public g e(v v2) {
        if (v2 != null) {
            if (v2.e() != null) {
                Iterator iterator = v2.c().iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2 = ((List)iterator.next()).iterator();
                    while (iterator2.hasNext()) {
                        g g2 = (g)((v.c)iterator2.next()).a();
                    }
                }
                return new b(v2);
            }
            throw new GeneralSecurityException("no primary in primitive set");
        }
        throw new GeneralSecurityException("primitive set must be non-null");
    }

    private static class b
    implements g {
        private final v a;

        private b(v v2) {
            this.a = v2;
        }
    }
}

