/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.k$a
 *  java.lang.Class
 *  java.lang.Object
 */
package A0;

import A0.k;

public abstract class k {
    private final Class a;
    private final Class b;

    private k(Class clazz, Class clazz2) {
        this.a = clazz;
        this.b = clazz2;
    }

    public static k a(b b2, Class clazz, Class clazz2) {
        return new a(clazz, clazz2, b2);
    }

    public Class b() {
        return this.a;
    }

    public Class c() {
        return this.b;
    }

    public static interface b {
    }
}

