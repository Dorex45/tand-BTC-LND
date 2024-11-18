/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package I;

import G.c;
import G.e;
import I.l;
import I.m;

final class b
extends l {
    private final m a;
    private final String b;
    private final c c;
    private final e d;
    private final G.b e;

    private b(m m2, String string, c c2, e e2, G.b b2) {
        this.a = m2;
        this.b = string;
        this.c = c2;
        this.d = e2;
        this.e = b2;
    }

    @Override
    public G.b b() {
        return this.e;
    }

    @Override
    c c() {
        return this.c;
    }

    @Override
    e e() {
        return this.d;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof l) {
            if (!(this.a.equals(((l)(object = (l)object)).f()) && this.b.equals((Object)((l)object).g()) && this.c.equals(((l)object).c()) && this.d.equals(((l)object).e()) && this.e.equals(((l)object).b()))) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public m f() {
        return this.a;
    }

    @Override
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendRequest{transportContext=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", transportName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", event=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", transformer=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", encoding=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends l.a {
        private m a;
        private String b;
        private c c;
        private e d;
        private G.b e;

        b() {
        }

        @Override
        public l a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" transportContext");
                object2 = object2.toString();
            }
            String string = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" transportName");
                string = object.toString();
            }
            object = string;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append(string);
                object2.append(" event");
                object = object2.toString();
            }
            object2 = object;
            if (this.d == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" transformer");
                object2 = object2.toString();
            }
            object = object2;
            if (this.e == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" encoding");
                object = object.toString();
            }
            if (object.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d, this.e);
            }
            object2 = new StringBuilder();
            object2.append("Missing required properties:");
            object2.append((String)object);
            throw new IllegalStateException(object2.toString());
        }

        @Override
        l.a b(G.b b2) {
            if (b2 != null) {
                this.e = b2;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override
        l.a c(c c2) {
            if (c2 != null) {
                this.c = c2;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override
        l.a d(e e2) {
            if (e2 != null) {
                this.d = e2;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override
        public l.a e(m m2) {
            if (m2 != null) {
                this.a = m2;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override
        public l.a f(String string) {
            if (string != null) {
                this.b = string;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }
}

