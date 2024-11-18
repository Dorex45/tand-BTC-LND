/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  d1.u
 *  d1.u$b
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package d1;

import d1.u;
import java.util.List;

public final class v
implements Runnable {
    public final u d;
    public final List e;

    public /* synthetic */ v(u u2, List list) {
        this.d = u2;
        this.e = list;
    }

    public final void run() {
        u.b.a((u)this.d, (List)this.e);
    }
}

