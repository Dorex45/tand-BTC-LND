/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package A1;

import A1.g;
import H1.p;
import kotlin.jvm.internal.i;

public abstract class a
implements g.b {
    private final g.c key;

    public a(g.c c2) {
        i.e((Object)c2, (String)"key");
        this.key = c2;
    }

    public <R> R fold(R r2, p p2) {
        return (R)g.a.a(this, r2, p2);
    }

    public <E extends g.b> E get(g.c c2) {
        return (E)g.a.b(this, c2);
    }

    @Override
    public g.c getKey() {
        return this.key;
    }

    @Override
    public g minusKey(g.c c2) {
        return g.a.c(this, c2);
    }

    @Override
    public g plus(g g2) {
        return g.a.d(this, g2);
    }
}

