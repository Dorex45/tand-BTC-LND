/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package I0;

import O0.b;

public class u
implements b {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile b b;

    public u(b b2) {
        this.b = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object get() {
        Object object = this.a;
        Object object2 = c;
        Object object3 = object;
        if (object != object2) return object3;
        u u2 = this;
        synchronized (u2) {
            Throwable throwable2;
            block4: {
                try {
                    object3 = object = this.a;
                    if (object != object2) return object3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.a = object3 = this.b.get();
                this.b = null;
                return object3;
            }
            throw throwable2;
        }
    }
}

