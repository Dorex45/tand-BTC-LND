/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Set
 */
package I;

import G.b;
import G.e;
import G.f;
import G.g;
import I.m;
import I.p;
import I.q;
import java.util.Set;

final class n
implements g {
    private final Set a;
    private final m b;
    private final q c;

    n(Set set, m m2, q q2) {
        this.a = set;
        this.b = m2;
        this.c = q2;
    }

    @Override
    public f a(String string, Class clazz, b b2, e e2) {
        if (this.a.contains((Object)b2)) {
            return new p(this.b, string, b2, e2, this.c);
        }
        throw new IllegalArgumentException(String.format((String)"%s is not supported byt this factory. Supported encodings are: %s.", (Object[])new Object[]{b2, this.a}));
    }
}

