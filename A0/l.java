/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.l$a
 *  java.lang.Class
 *  java.lang.Object
 *  s0.g
 */
package A0;

import A0.l;
import s0.g;

public abstract class l {
    private final Class a;
    private final Class b;

    private l(Class clazz, Class clazz2) {
        this.a = clazz;
        this.b = clazz2;
    }

    public static l b(b b2, Class clazz, Class clazz2) {
        return new a(clazz, clazz2, b2);
    }

    public abstract Object a(g var1);

    public Class c() {
        return this.a;
    }

    public Class d() {
        return this.b;
    }

    public static interface b {
        public Object a(g var1);
    }
}

