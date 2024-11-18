/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package I0;

import I0.f;
import O0.b;

final class e
implements b {
    private final String a;

    private e(String string) {
        this.a = string;
    }

    public static b a(String string) {
        return new e(string);
    }

    @Override
    public Object get() {
        return f.d(this.a);
    }
}

