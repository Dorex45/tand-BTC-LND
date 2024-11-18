/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  d1.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
package d1;

import d1.d;
import java.util.Map;

public final class c
implements Runnable {
    public final d d;
    public final Map e;

    public /* synthetic */ c(d d2, Map map) {
        this.d = d2;
        this.e = map;
    }

    public final void run() {
        d1.d.c((d)this.d, (Map)this.e);
    }
}

