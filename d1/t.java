/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  d1.u
 *  d1.u$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d1;

import d1.u;

public final class t
implements Runnable {
    public final u d;
    public final String e;

    public /* synthetic */ t(u u2, String string) {
        this.d = u2;
        this.e = string;
    }

    public final void run() {
        u.a.a((u)this.d, (String)this.e);
    }
}

