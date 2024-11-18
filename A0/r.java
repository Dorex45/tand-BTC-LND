/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  s0.g
 *  s0.y
 */
package A0;

import A0.j;
import A0.k;
import A0.q;
import H0.a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s0.g;
import s0.y;

public final class r {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    private r(b b2) {
        this.a = new HashMap(b2.a);
        this.b = new HashMap(b2.b);
        this.c = new HashMap(b2.c);
        this.d = new HashMap(b2.d);
    }

    public boolean e(q object) {
        object = new c(object.getClass(), object.a());
        return this.b.containsKey(object);
    }

    public g f(q q2, y y2) {
        c c2 = new c(q2.getClass(), q2.a());
        if (this.b.containsKey((Object)c2)) {
            return ((A0.b)this.b.get((Object)c2)).d(q2, y2);
        }
        q2 = new StringBuilder();
        q2.append("No Key Parser for requested key type ");
        q2.append(c2);
        q2.append(" available");
        throw new GeneralSecurityException(q2.toString());
    }

    public static final class b {
        private final Map a;
        private final Map b;
        private final Map c;
        private final Map d;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }

        public b(r r2) {
            this.a = new HashMap(r2.a);
            this.b = new HashMap(r2.b);
            this.c = new HashMap(r2.c);
            this.d = new HashMap(r2.d);
        }

        r e() {
            return new r(this);
        }

        public b f(A0.b b2) {
            c c2 = new c(b2.c(), b2.b());
            if (this.b.containsKey((Object)c2)) {
                A0.b b3 = (A0.b)this.b.get((Object)c2);
                if (!b3.equals(b2) || !b2.equals(b3)) {
                    b2 = new StringBuilder();
                    b2.append("Attempt to register non-equal parser for already existing object of type: ");
                    b2.append(c2);
                    throw new GeneralSecurityException(b2.toString());
                }
            } else {
                this.b.put((Object)c2, (Object)b2);
            }
            return this;
        }

        public b g(A0.c c2) {
            d d2 = new d(c2.b(), c2.c());
            if (this.a.containsKey((Object)d2)) {
                A0.c c3 = (A0.c)this.a.get((Object)d2);
                if (!c3.equals(c2) || !c2.equals(c3)) {
                    c2 = new StringBuilder();
                    c2.append("Attempt to register non-equal serializer for already existing object of type: ");
                    c2.append(d2);
                    throw new GeneralSecurityException(c2.toString());
                }
            } else {
                this.a.put((Object)d2, (Object)c2);
            }
            return this;
        }

        public b h(j j2) {
            c c2 = new c(j2.c(), j2.b());
            if (this.d.containsKey((Object)c2)) {
                j j3 = (j)this.d.get((Object)c2);
                if (!j3.equals(j2) || !j2.equals(j3)) {
                    j2 = new StringBuilder();
                    j2.append("Attempt to register non-equal parser for already existing object of type: ");
                    j2.append(c2);
                    throw new GeneralSecurityException(j2.toString());
                }
            } else {
                this.d.put((Object)c2, (Object)j2);
            }
            return this;
        }

        public b i(k k2) {
            d d2 = new d(k2.b(), k2.c());
            if (this.c.containsKey((Object)d2)) {
                k k3 = (k)this.c.get((Object)d2);
                if (!k3.equals(k2) || !k2.equals(k3)) {
                    k2 = new StringBuilder();
                    k2.append("Attempt to register non-equal serializer for already existing object of type: ");
                    k2.append(d2);
                    throw new GeneralSecurityException(k2.toString());
                }
            } else {
                this.c.put((Object)d2, (Object)k2);
            }
            return this;
        }
    }

    private static class c {
        private final Class a;
        private final a b;

        private c(Class clazz, a a2) {
            this.a = clazz;
            this.b = a2;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof c;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (c)object;
            bl = bl2;
            if (((c)object).a.equals((Object)this.a)) {
                bl = bl2;
                if (((c)object).b.equals(this.b)) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b});
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.getSimpleName());
            stringBuilder.append(", object identifier: ");
            stringBuilder.append((Object)this.b);
            return stringBuilder.toString();
        }
    }

    private static class d {
        private final Class a;
        private final Class b;

        private d(Class clazz, Class clazz2) {
            this.a = clazz;
            this.b = clazz2;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof d;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (d)object;
            bl = bl2;
            if (((d)object).a.equals((Object)this.a)) {
                bl = bl2;
                if (((d)object).b.equals((Object)this.b)) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b});
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.getSimpleName());
            stringBuilder.append(" with serialization type: ");
            stringBuilder.append(this.b.getSimpleName());
            return stringBuilder.toString();
        }
    }
}

