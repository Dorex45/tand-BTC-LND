/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  d1.u$f
 *  java.lang.Object
 *  java.lang.Runnable
 *  p1.k$d
 */
package d1;

import d1.u;
import e1.c;
import p1.k;

public final class w
implements Runnable {
    public final k.d d;
    public final c e;

    public /* synthetic */ w(k.d d2, c c2) {
        this.d = d2;
        this.e = c2;
    }

    public final void run() {
        u.f.a((k.d)this.d, (c)this.e);
    }
}

