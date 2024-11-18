/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A1.g$a$a
 *  A1.g$b
 *  A1.h
 *  H1.p
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package A1;

import A1.g;
import A1.h;
import H1.p;
import kotlin.jvm.internal.i;

public interface g {
    public Object fold(Object var1, p var2);

    public b get(c var1);

    public g minusKey(c var1);

    public g plus(g var1);

    public static final abstract class A1.g$a {
        public static g a(g g2, g g3) {
            i.e((Object)g3, (String)"context");
            if (g3 != h.d) {
                g2 = (g)g3.fold(g2, (p)a.d);
            }
            return g2;
        }
    }

    public static interface c {
    }
}

