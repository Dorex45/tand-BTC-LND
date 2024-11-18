/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collections
 */
package I0;

import O0.b;
import java.util.Collections;

final class l
implements b {
    private static final l a = new l();

    private l() {
    }

    public static b a() {
        return a;
    }

    @Override
    public Object get() {
        return Collections.emptySet();
    }
}

