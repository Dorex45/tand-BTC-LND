/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  d1.u$g
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  p1.k$d
 */
package d1;

import d1.u;
import p1.k;

public final class x
implements Runnable {
    public final Exception d;
    public final k.d e;

    public /* synthetic */ x(Exception exception, k.d d2) {
        this.d = exception;
        this.e = d2;
    }

    public final void run() {
        u.g.a((Exception)this.d, (k.d)this.e);
    }
}

