/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package I0;

import I0.A;
import I0.r;
import N0.a;
import N0.b;
import N0.c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

class s
implements c,
b {
    private final Map a = new HashMap();
    private Queue b = new ArrayDeque();
    private final Executor c;

    s(Executor executor) {
        this.c = executor;
    }

    private Set b(a a2) {
        s s2 = this;
        synchronized (s2) {
            throw null;
        }
    }

    static /* synthetic */ void c(Map.Entry entry, a a2) {
        f.c.a(entry.getKey());
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void a() {
        Queue queue;
        block6: {
            block5: {
                s s2 = this;
                // MONITORENTER : s2
                queue = this.b;
                if (queue == null) break block5;
                this.b = null;
                break block6;
            }
            queue = null;
        }
        // MONITOREXIT : s2
        if (queue == null) return;
        queue = queue.iterator();
        while (queue.hasNext()) {
            f.c.a(queue.next());
            this.d(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void d(a a2) {
        A.b(a2);
        s s2 = this;
        // MONITORENTER : s2
        Queue queue = this.b;
        if (queue != null) {
            queue.add((Object)a2);
            // MONITOREXIT : s2
            return;
        }
        Iterator iterator = this.b(a2).iterator();
        while (iterator.hasNext()) {
            queue = (Map.Entry)iterator.next();
            ((Executor)queue.getValue()).execute(r.a((Map.Entry)queue, a2));
        }
    }
}

