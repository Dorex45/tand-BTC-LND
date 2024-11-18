/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  H1.l
 *  android.util.Size
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 *  l.q
 *  r0.a
 */
package d1;

import H1.l;
import android.util.Size;
import d1.s;
import java.util.concurrent.Executor;
import r0.a;

public final class q
implements Runnable {
    public final s d;
    public final a e;
    public final l f;
    public final Size g;
    public final boolean h;
    public final l.q i;
    public final l j;
    public final Executor k;
    public final boolean l;
    public final l m;
    public final l n;

    public /* synthetic */ q(s s2, a a2, l l2, Size size, boolean bl, l.q q2, l l3, Executor executor, boolean bl2, l l4, l l5) {
        this.d = s2;
        this.e = a2;
        this.f = l2;
        this.g = size;
        this.h = bl;
        this.i = q2;
        this.j = l3;
        this.k = executor;
        this.l = bl2;
        this.m = l4;
        this.n = l5;
    }

    public final void run() {
        s.f(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }
}

