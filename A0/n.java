/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  s0.g
 *  s0.v
 *  s0.w
 */
package A0;

import A0.l;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s0.g;
import s0.v;
import s0.w;

public class n {
    private final Map a;
    private final Map b;

    private n(b b2) {
        this.a = new HashMap(b2.a);
        this.b = new HashMap(b2.b);
    }

    public Class c(Class clazz) {
        if (this.b.containsKey((Object)clazz)) {
            return ((w)this.b.get((Object)clazz)).a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No input primitive class for ");
        stringBuilder.append((Object)clazz);
        stringBuilder.append(" available");
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public Object d(g g2, Class object) {
        object = new c(g2.getClass(), (Class)object);
        if (this.a.containsKey(object)) {
            return ((l)this.a.get(object)).a(g2);
        }
        g2 = new StringBuilder();
        g2.append("No PrimitiveConstructor for ");
        g2.append(object);
        g2.append(" available");
        throw new GeneralSecurityException(g2.toString());
    }

    public Object e(v v2, Class clazz) {
        if (this.b.containsKey((Object)clazz)) {
            clazz = (w)this.b.get((Object)clazz);
            if (v2.g().equals((Object)clazz.a()) && clazz.a().equals((Object)v2.g())) {
                return clazz.b(v2);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        v2 = new StringBuilder();
        v2.append("No wrapper found for ");
        v2.append((Object)clazz);
        throw new GeneralSecurityException(v2.toString());
    }

    public static final class b {
        private final Map a;
        private final Map b;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public b(n n2) {
            this.a = new HashMap(n2.a);
            this.b = new HashMap(n2.b);
        }

        n c() {
            return new n(this);
        }

        public b d(l l2) {
            if (l2 != null) {
                c c2 = new c(l2.c(), l2.d());
                if (this.a.containsKey((Object)c2)) {
                    l l3 = (l)this.a.get((Object)c2);
                    if (!l3.equals(l2) || !l2.equals(l3)) {
                        l2 = new StringBuilder();
                        l2.append("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                        l2.append(c2);
                        throw new GeneralSecurityException(l2.toString());
                    }
                } else {
                    this.a.put((Object)c2, (Object)l2);
                }
                return this;
            }
            throw new NullPointerException("primitive constructor must be non-null");
        }

        public b e(w w2) {
            if (w2 != null) {
                Class clazz = w2.c();
                if (this.b.containsKey((Object)clazz)) {
                    w w3 = (w)this.b.get((Object)clazz);
                    if (!w3.equals((Object)w2) || !w2.equals((Object)w3)) {
                        w2 = new StringBuilder();
                        w2.append("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                        w2.append((Object)clazz);
                        throw new GeneralSecurityException(w2.toString());
                    }
                } else {
                    this.b.put((Object)clazz, (Object)w2);
                }
                return this;
            }
            throw new NullPointerException("wrapper must be non-null");
        }
    }

    private static final class c {
        private final Class a;
        private final Class b;

        private c(Class clazz, Class clazz2) {
            this.a = clazz;
            this.b = clazz2;
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
                if (((c)object).b.equals((Object)this.b)) {
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
            stringBuilder.append(" with primitive type: ");
            stringBuilder.append(this.b.getSimpleName());
            return stringBuilder.toString();
        }
    }
}

