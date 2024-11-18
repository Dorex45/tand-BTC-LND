/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 */
package I0;

import I0.x;
import I0.y;
import O0.a;
import O0.b;

class z
implements b {
    private static final a c = x.b();
    private static final b d = y.a();
    private a a;
    private volatile b b;

    private z(a a2, b b2) {
        this.a = a2;
        this.b = b2;
    }

    static z a() {
        return new z(c, d);
    }

    static /* synthetic */ void b(b b2) {
    }

    static /* synthetic */ Object c() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d(b b2) {
        if (this.b == d) {
            a a2;
            z z2 = this;
            synchronized (z2) {
                a2 = this.a;
                this.a = null;
                this.b = b2;
            }
            a2.a(b2);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public Object get() {
        return this.b.get();
    }
}

