/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package A1;

import A1.g;
import H1.l;
import kotlin.jvm.internal.i;

public abstract class b
implements g.c {
    private final l d;
    private final g.c e;

    public b(g.c c2, l object) {
        i.e((Object)c2, (String)"baseKey");
        i.e((Object)object, (String)"safeCast");
        this.d = object;
        object = c2;
        if (c2 instanceof b) {
            object = ((b)c2).e;
        }
        this.e = object;
    }

    public final boolean a(g.c c2) {
        i.e((Object)c2, (String)"key");
        boolean bl = c2 == this || this.e == c2;
        return bl;
    }

    public final g.b b(g.b b2) {
        i.e((Object)b2, (String)"element");
        return this.d.invoke(b2);
    }
}

