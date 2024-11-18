/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I0.m
 *  I0.v
 *  java.lang.Object
 *  java.lang.Runnable
 */
package I0;

import I0.m;
import I0.v;
import O0.b;

final class k
implements Runnable {
    private final v d;
    private final b e;

    private k(v v2, b b2) {
        this.d = v2;
        this.e = b2;
    }

    public static Runnable a(v v2, b b2) {
        return new k(v2, b2);
    }

    public void run() {
        m.l((v)this.d, (b)this.e);
    }
}

