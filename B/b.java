/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  b.b$a
 *  b.b$b
 *  b.b$d
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Map$Entry
 *  java.util.WeakHashMap
 */
package b;

import b.b;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b
implements Iterable {
    c d;
    private c e;
    private WeakHashMap f = new WeakHashMap();
    private int g = 0;

    public Iterator descendingIterator() {
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        this.f.put((Object)b2, (Object)Boolean.FALSE);
        return b2;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        if (this.size() != b2.size()) {
            return false;
        }
        object = this.iterator();
        b2 = b2.iterator();
        while (object.hasNext() && b2.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object object2 = b2.next();
            if ((entry != null || object2 == null) && (entry == null || entry.equals(object2))) continue;
            return false;
        }
        if (object.hasNext() || b2.hasNext()) {
            bl = false;
        }
        return bl;
    }

    public Map.Entry h() {
        return this.d;
    }

    public int hashCode() {
        Iterator iterator = this.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            n2 += ((Map.Entry)iterator.next()).hashCode();
        }
        return n2;
    }

    public Iterator iterator() {
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.f.put((Object)a2, (Object)Boolean.FALSE);
        return a2;
    }

    protected c k(Object object) {
        c c2 = this.d;
        while (c2 != null && !c2.d.equals(object)) {
            c2 = c2.f;
        }
        return c2;
    }

    public d l() {
        d d2 = new /* Unavailable Anonymous Inner Class!! */;
        this.f.put((Object)d2, (Object)Boolean.FALSE);
        return d2;
    }

    public Map.Entry m() {
        return this.e;
    }

    protected c n(Object object, Object object2) {
        object = new c(object, object2);
        ++this.g;
        object2 = this.e;
        if (object2 == null) {
            this.d = object;
            this.e = object;
            return object;
        }
        ((c)object2).f = object;
        ((c)object).g = object2;
        this.e = object;
        return object;
    }

    public Object o(Object object, Object object2) {
        c c2 = this.k(object);
        if (c2 != null) {
            return c2.e;
        }
        this.n(object, object2);
        return null;
    }

    public Object p(Object object) {
        c c2;
        if ((object = this.k(object)) == null) {
            return null;
        }
        --this.g;
        if (!this.f.isEmpty()) {
            c2 = this.f.keySet().iterator();
            while (c2.hasNext()) {
                ((f)c2.next()).b((c)object);
            }
        }
        if ((c2 = ((c)object).g) != null) {
            c2.f = ((c)object).f;
        } else {
            this.d = ((c)object).f;
        }
        c c3 = ((c)object).f;
        if (c3 != null) {
            c3.g = c2;
        } else {
            this.e = c2;
        }
        ((c)object).f = null;
        ((c)object).g = null;
        return ((c)object).e;
    }

    public int size() {
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((Map.Entry)iterator.next()).toString());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class c
    implements Map.Entry {
        final Object d;
        final Object e;
        c f;
        c g;

        c(Object object, Object object2) {
            this.d = object;
            this.e = object2;
        }

        public boolean equals(Object object) {
            boolean bl = true;
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            if (!this.d.equals(((c)object).d) || !this.e.equals(((c)object).e)) {
                bl = false;
            }
            return bl;
        }

        public Object getKey() {
            return this.d;
        }

        public Object getValue() {
            return this.e;
        }

        public int hashCode() {
            return this.d.hashCode() ^ this.e.hashCode();
        }

        public Object setValue(Object object) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append("=");
            stringBuilder.append(this.e);
            return stringBuilder.toString();
        }
    }

    static interface f {
        public void b(c var1);
    }
}

