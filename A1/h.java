/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package A1;

import A1.g;
import H1.p;
import java.io.Serializable;
import kotlin.jvm.internal.i;

public final class h
implements g,
Serializable {
    public static final h d = new h();

    private h() {
    }

    @Override
    public Object fold(Object object, p p2) {
        i.e((Object)p2, (String)"operation");
        return object;
    }

    @Override
    public g.b get(g.c c2) {
        i.e((Object)c2, (String)"key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override
    public g minusKey(g.c c2) {
        i.e((Object)c2, (String)"key");
        return this;
    }

    @Override
    public g plus(g g2) {
        i.e((Object)g2, (String)"context");
        return g2;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}

