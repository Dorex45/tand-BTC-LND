/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.g$b
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReference
 */
package A0;

import A0.g;
import java.util.concurrent.atomic.AtomicReference;

public final class g {
    private static final g b = new g();
    private static final b c = new /* Unavailable Anonymous Inner Class!! */;
    private final AtomicReference a = new AtomicReference();

    public static g b() {
        return b;
    }

    public D0.b a() {
        D0.b b2;
        D0.b b3 = b2 = (D0.b)this.a.get();
        if (b2 == null) {
            b3 = c;
        }
        return b3;
    }
}

