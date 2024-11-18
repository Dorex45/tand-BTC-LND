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
 *  java.util.Arrays
 */
package I;

import G.d;
import I.m;
import java.util.Arrays;

final class c
extends m {
    private final String a;
    private final byte[] b;
    private final d c;

    private c(String string, byte[] byArray, d d2) {
        this.a = string;
        this.b = byArray;
        this.c = d2;
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public byte[] c() {
        return this.b;
    }

    @Override
    public d d() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (object instanceof m) {
            byte[] byArray;
            m m2 = (m)object;
            if (!(this.a.equals((Object)m2.b()) && Arrays.equals((byte[])(byArray = this.b), (byte[])(object = m2 instanceof c ? (Object)((c)m2).b : (Object)m2.c())) && this.c.equals((Object)m2.d()))) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode((byte[])this.b)) * 1000003 ^ this.c.hashCode();
    }

    static final class b
    extends m.a {
        private String a;
        private byte[] b;
        private d c;

        b() {
        }

        @Override
        public m a() {
            String string = this.a;
            String string2 = "";
            if (string == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" backendName");
                string2 = string2.toString();
            }
            string = string2;
            if (this.c == null) {
                string = new StringBuilder();
                string.append(string2);
                string.append(" priority");
                string = string.toString();
            }
            if (string.isEmpty()) {
                return new c(this.a, this.b, this.c);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public m.a b(String string) {
            if (string != null) {
                this.a = string;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override
        public m.a c(byte[] byArray) {
            this.b = byArray;
            return this;
        }

        @Override
        public m.a d(d d2) {
            if (d2 != null) {
                this.c = d2;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }
}

