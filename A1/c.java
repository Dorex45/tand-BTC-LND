/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A1.c$a
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.i
 */
package A1;

import A1.c;
import A1.g;
import A1.h;
import H1.p;
import java.io.Serializable;
import kotlin.jvm.internal.i;

public final class c
implements g,
Serializable {
    private final g d;
    private final g.b e;

    public c(g g2, g.b b2) {
        i.e((Object)g2, (String)"left");
        i.e((Object)b2, (String)"element");
        this.d = g2;
        this.e = b2;
    }

    private final boolean a(g.b b2) {
        return i.a((Object)this.get(b2.getKey()), (Object)b2);
    }

    private final boolean b(c g2) {
        do {
            if (this.a(g2.e)) continue;
            return false;
        } while ((g2 = g2.d) instanceof c);
        i.c((Object)g2, (String)"null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.a(g2);
    }

    private final int d() {
        int n2 = 2;
        g g2 = this;
        while (true) {
            if (!((g2 = g2.d) instanceof c)) {
                g2 = null;
            }
            if (g2 == null) {
                return n2;
            }
            ++n2;
        }
    }

    public boolean equals(Object object) {
        boolean bl = this == object || object instanceof c && super.d() == this.d() && super.b(this);
        return bl;
    }

    @Override
    public Object fold(Object object, p p2) {
        i.e((Object)p2, (String)"operation");
        return p2.invoke(this.d.fold(object, p2), this.e);
    }

    @Override
    public g.b get(g.c c2) {
        i.e((Object)c2, (String)"key");
        g g2 = this;
        do {
            g.b b2;
            if ((b2 = ((c)g2).e.get(c2)) == null) continue;
            return b2;
        } while ((g2 = ((c)g2).d) instanceof c);
        return g2.get(c2);
    }

    public int hashCode() {
        return this.d.hashCode() + this.e.hashCode();
    }

    @Override
    public g minusKey(g.c object) {
        i.e((Object)object, (String)"key");
        if (this.e.get((g.c)object) != null) {
            return this.d;
        }
        object = (object = this.d.minusKey((g.c)object)) == this.d ? this : (object == h.d ? this.e : new c((g)object, this.e));
        return object;
    }

    @Override
    public g plus(g g2) {
        return g.a.a(this, g2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append((String)this.fold("", (p)a.d));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

