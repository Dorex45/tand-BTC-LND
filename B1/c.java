/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  b1.e$a
 *  java.lang.Object
 *  java.lang.Runnable
 */
package b1;

import b1.e;

public final class c
implements Runnable {
    public final e.a d;
    public final Object e;

    public /* synthetic */ c(e.a a2, Object object) {
        this.d = a2;
        this.e = object;
    }

    public final void run() {
        e.a.d((e.a)this.d, (Object)this.e);
    }
}

