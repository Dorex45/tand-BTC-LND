/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashMap
 *  java.util.Map$Entry
 */
package b;

import b.b;
import java.util.HashMap;
import java.util.Map;

public class a
extends b {
    private HashMap h = new HashMap();

    public boolean contains(Object object) {
        return this.h.containsKey(object);
    }

    @Override
    protected b.c k(Object object) {
        return (b.c)this.h.get(object);
    }

    @Override
    public Object o(Object object, Object object2) {
        b.c c2 = this.k(object);
        if (c2 != null) {
            return c2.e;
        }
        this.h.put(object, (Object)this.n(object, object2));
        return null;
    }

    @Override
    public Object p(Object object) {
        Object object2 = super.p(object);
        this.h.remove(object);
        return object2;
    }

    public Map.Entry q(Object object) {
        if (this.contains(object)) {
            return ((b.c)this.h.get((Object)object)).g;
        }
        return null;
    }
}

