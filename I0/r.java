/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I0.s
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map$Entry
 */
package I0;

import I0.s;
import N0.a;
import java.util.Map;

final class r
implements Runnable {
    private final Map.Entry d;

    private r(Map.Entry entry, a a2) {
        this.d = entry;
    }

    public static Runnable a(Map.Entry entry, a a2) {
        return new r(entry, a2);
    }

    public void run() {
        s.c((Map.Entry)this.d, null);
    }
}

