/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.h$a
 *  com.google.crypto.tink.shaded.protobuf.k
 *  java.io.Serializable
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.Locale
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.i0;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class h
implements Iterable,
Serializable {
    public static final h e = new /* Unavailable Anonymous Inner Class!! */;
    private static final f f;
    private static final Comparator g;
    private int d = 0;

    static {
        Object object = com.google.crypto.tink.shaded.protobuf.d.c() ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */;
        f = object;
        g = new Comparator(){

            public int a(h h2, h h3) {
                g g2 = h2.t();
                g g3 = h3.t();
                while (g2.hasNext() && g3.hasNext()) {
                    int n2 = Integer.valueOf((int)h.A(g2.a())).compareTo(Integer.valueOf((int)h.A(g3.a())));
                    if (n2 == 0) continue;
                    return n2;
                }
                return Integer.valueOf((int)h2.size()).compareTo(Integer.valueOf((int)h3.size()));
            }
        };
    }

    h() {
    }

    private static int A(byte by) {
        return by & 0xFF;
    }

    private String E() {
        String string;
        if (this.size() <= 50) {
            string = i0.a(this);
        } else {
            string = new StringBuilder();
            string.append(i0.a(this.y(0, 47)));
            string.append("...");
            string = string.toString();
        }
        return string;
    }

    static h F(byte[] byArray) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static h G(byte[] byArray, int n2, int n3) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static void l(int n2, int n3) {
        if ((n3 - (n2 + 1) | n2) < 0) {
            if (n2 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n2);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    static int m(int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if ((n2 | n3 | n5 | n4 - n3) < 0) {
            if (n2 >= 0) {
                if (n3 < n2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n2);
                    stringBuilder.append(", ");
                    stringBuilder.append(n3);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n3);
                stringBuilder.append(" >= ");
                stringBuilder.append(n4);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n2);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n5;
    }

    public static h n(byte[] byArray) {
        return h.o(byArray, 0, byArray.length);
    }

    public static h o(byte[] byArray, int n2, int n3) {
        h.m(n2, n2 + n3, byArray.length);
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static h p(String string) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static h u(int n2) {
        return new h(n2);
    }

    public final String B(Charset object) {
        object = this.size() == 0 ? "" : this.C((Charset)object);
        return object;
    }

    protected abstract String C(Charset var1);

    public final String D() {
        return this.B(z.b);
    }

    abstract void H(com.google.crypto.tink.shaded.protobuf.g var1);

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            n3 = this.size();
            n3 = n2 = this.w(n3, 0, n3);
            if (n2 == 0) {
                n3 = 1;
            }
            this.d = n3;
        }
        return n3;
    }

    public abstract byte k(int var1);

    protected abstract void q(byte[] var1, int var2, int var3, int var4);

    abstract byte r(int var1);

    public abstract boolean s();

    public abstract int size();

    public g t() {
        return new a(this);
    }

    public final String toString() {
        return String.format((Locale)Locale.ROOT, (String)"<ByteString@%s size=%d contents=\"%s\">", (Object[])new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.size(), this.E()});
    }

    public abstract i v();

    protected abstract int w(int var1, int var2, int var3);

    protected final int x() {
        return this.d;
    }

    public abstract h y(int var1, int var2);

    public final byte[] z() {
        int n2 = this.size();
        if (n2 == 0) {
            return z.d;
        }
        byte[] byArray = new byte[n2];
        this.q(byArray, 0, 0, n2);
        return byArray;
    }

    private static interface f {
        public byte[] a(byte[] var1, int var2, int var3);
    }

    public static interface g
    extends Iterator {
        public byte a();
    }

    static final class h {
        private final k a;
        private final byte[] b;

        private h(int n2) {
            byte[] byArray = new byte[n2];
            this.b = byArray;
            this.a = k.U((byte[])byArray);
        }

        public h a() {
            this.a.c();
            return new /* Unavailable Anonymous Inner Class!! */;
        }

        public k b() {
            return this.a;
        }
    }
}

