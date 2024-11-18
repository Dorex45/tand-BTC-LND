/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.j$a
 *  java.lang.Class
 *  java.lang.Object
 */
package A0;

import A0.j;

public abstract class j {
    private final H0.a a;
    private final Class b;

    private j(H0.a a2, Class clazz) {
        this.a = a2;
        this.b = clazz;
    }

    public static j a(b b2, H0.a a2, Class clazz) {
        return new a(a2, clazz, b2);
    }

    public final H0.a b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public static interface b {
    }
}

