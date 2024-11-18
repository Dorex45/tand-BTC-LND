/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package I0;

import O0.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class v
implements b {
    private volatile Set a = Collections.newSetFromMap((Map)new ConcurrentHashMap());
    private volatile Set b = null;

    v(Collection collection) {
        this.a.addAll(collection);
    }

    static v b(Collection collection) {
        return new v((Collection)((Set)collection));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        v v2 = this;
        synchronized (v2) {
            try {
                Iterator iterator = this.a.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.a = null;
                        return;
                    }
                    b b2 = (b)iterator.next();
                    this.b.add(b2.get());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(b b2) {
        v v2 = this;
        synchronized (v2) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (this.b != null) break block3;
                            this.a.add((Object)b2);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.b.add(b2.get());
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set c() {
        if (this.b != null) return Collections.unmodifiableSet((Set)this.b);
        v v2 = this;
        synchronized (v2) {
            try {
                if (this.b != null) return Collections.unmodifiableSet((Set)this.b);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                this.b = Collections.newSetFromMap((Map)concurrentHashMap);
                this.d();
                return Collections.unmodifiableSet((Set)this.b);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

