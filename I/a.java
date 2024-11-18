/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package I;

import I.g;
import I.h;
import java.util.Map;

final class a
extends h {
    private final String a;
    private final Integer b;
    private final g c;
    private final long d;
    private final long e;
    private final Map f;

    private a(String string, Integer n2, g g2, long l2, long l3, Map map) {
        this.a = string;
        this.b = n2;
        this.c = g2;
        this.d = l2;
        this.e = l3;
        this.f = map;
    }

    @Override
    protected Map c() {
        return this.f;
    }

    @Override
    public Integer d() {
        return this.b;
    }

    @Override
    public g e() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            Integer n2;
            if (!(this.a.equals((Object)((h)(object = (h)object)).j()) && ((n2 = this.b) == null ? ((h)object).d() == null : n2.equals((Object)((h)object).d())) && this.c.equals(((h)object).e()) && this.d == ((h)object).f() && this.e == ((h)object).k() && this.f.equals((Object)((h)object).c()))) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        Integer n3 = this.b;
        int n4 = n3 == null ? 0 : n3.hashCode();
        int n5 = this.c.hashCode();
        long l2 = this.d;
        int n6 = (int)(l2 ^ l2 >>> 32);
        l2 = this.e;
        return (((((n2 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ (int)(l2 ^ l2 >>> 32)) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public String j() {
        return this.a;
    }

    @Override
    public long k() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EventInternal{transportName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", encodedPayload=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", eventMillis=");
        stringBuilder.append(this.d);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(", autoMetadata=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class b
    extends h.a {
        private String a;
        private Integer b;
        private g c;
        private Long d;
        private Long e;
        private Map f;

        b() {
        }

        @Override
        public h d() {
            String string = this.a;
            String string2 = "";
            if (string == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" transportName");
                string2 = string2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                string = new StringBuilder();
                string.append(string2);
                string.append(" encodedPayload");
                string3 = string.toString();
            }
            string = string3;
            if (this.d == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" eventMillis");
                string = string2.toString();
            }
            string2 = string;
            if (this.e == null) {
                string2 = new StringBuilder();
                string2.append(string);
                string2.append(" uptimeMillis");
                string2 = string2.toString();
            }
            string = string2;
            if (this.f == null) {
                string = new StringBuilder();
                string.append(string2);
                string.append(" autoMetadata");
                string = string.toString();
            }
            if (string.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        protected Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        protected h.a f(Map map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override
        public h.a g(Integer n2) {
            this.b = n2;
            return this;
        }

        @Override
        public h.a h(g g2) {
            if (g2 != null) {
                this.c = g2;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override
        public h.a i(long l2) {
            this.d = l2;
            return this;
        }

        @Override
        public h.a j(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override
        public h.a k(long l2) {
            this.e = l2;
            return this;
        }
    }
}

