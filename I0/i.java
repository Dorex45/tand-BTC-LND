/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I0.m
 *  java.lang.Object
 *  java.lang.Override
 */
package I0;

import I0.c;
import I0.m;
import O0.b;

final class i
implements b {
    private final m a;
    private final c b;

    private i(m m2, c c2) {
        this.a = m2;
        this.b = c2;
    }

    public static b a(m m2, c c2) {
        return new i(m2, c2);
    }

    @Override
    public Object get() {
        return m.j((m)this.a, (c)this.b);
    }
}

