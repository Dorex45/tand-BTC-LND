/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  s0.k
 */
package D0;

import D0.a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import s0.k;

public final class c {
    private final a a;
    private final List b;
    private final Integer c;

    private c(a a2, List list, Integer n2) {
        this.a = a2;
        this.b = list;
        this.c = n2;
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof c;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (c)object;
        bl = bl2;
        if (this.a.equals(((c)object).a)) {
            bl = bl2;
            if (this.b.equals((Object)((c)object).b)) {
                bl = bl2;
                if (Objects.equals((Object)this.c, (Object)((c)object).c)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b});
    }

    public String toString() {
        return String.format((String)"(annotations=%s, entries=%s, primaryKeyId=%s)", (Object[])new Object[]{this.a, this.b, this.c});
    }

    public static final class b {
        private ArrayList a = new ArrayList();
        private a b = D0.a.b;
        private Integer c = null;

        private boolean c(int n2) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (((c)iterator.next()).a() != n2) continue;
                return true;
            }
            return false;
        }

        public b a(k k2, int n2, String string, String string2) {
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                arrayList.add((Object)new c(k2, n2, string, string2));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public c b() {
            if (this.a != null) {
                Object object = this.c;
                if (object != null && !this.c((int)object)) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
                object = new c(this.b, Collections.unmodifiableList((List)this.a), this.c);
                this.a = null;
                return object;
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        public b d(a a2) {
            if (this.a != null) {
                this.b = a2;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        public b e(int n2) {
            if (this.a != null) {
                this.c = n2;
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    public static final class c {
        private final k a;
        private final int b;
        private final String c;
        private final String d;

        private c(k k2, int n2, String string, String string2) {
            this.a = k2;
            this.b = n2;
            this.c = string;
            this.d = string2;
        }

        public int a() {
            return this.b;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof c;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (c)object;
            bl = bl2;
            if (this.a == ((c)object).a) {
                bl = bl2;
                if (this.b == ((c)object).b) {
                    bl = bl2;
                    if (this.c.equals((Object)((c)object).c)) {
                        bl = bl2;
                        if (this.d.equals((Object)((c)object).d)) {
                            bl = true;
                        }
                    }
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
        }

        public String toString() {
            return String.format((String)"(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", (Object[])new Object[]{this.a, this.b, this.c, this.d});
        }
    }
}

