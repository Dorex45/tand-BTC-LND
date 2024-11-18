/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.a
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k
extends g {
    private static final Logger c = Logger.getLogger((String)k.class.getName());
    private static final boolean d = o0.E();
    l a;
    private boolean b;

    private k() {
    }

    public static int A(int n3, h h2) {
        return k.L(1) * 2 + k.M(2, n3) + k.f(3, h2);
    }

    public static int B(int n3, int n4) {
        return k.L(n3) + k.C(n4);
    }

    public static int C(int n3) {
        return 4;
    }

    public static int D(int n3, long l2) {
        return k.L(n3) + k.E(l2);
    }

    public static int E(long l2) {
        return 8;
    }

    public static int F(int n3, int n4) {
        return k.L(n3) + k.G(n4);
    }

    public static int G(int n3) {
        return k.N(k.Q(n3));
    }

    public static int H(int n3, long l2) {
        return k.L(n3) + k.I(l2);
    }

    public static int I(long l2) {
        return k.P(k.R(l2));
    }

    public static int J(int n3, String string) {
        return k.L(n3) + k.K(string);
    }

    public static int K(String string) {
        int n3;
        try {
            n3 = p0.g(string);
        }
        catch (p0.d d2) {
            n3 = string.getBytes(z.b).length;
        }
        return k.x(n3);
    }

    public static int L(int n3) {
        return k.N(q0.c(n3, 0));
    }

    public static int M(int n3, int n4) {
        return k.L(n3) + k.N(n4);
    }

    public static int N(int n3) {
        if ((n3 & 0xFFFFFF80) == 0) {
            return 1;
        }
        if ((n3 & 0xFFFFC000) == 0) {
            return 2;
        }
        if ((0xFFE00000 & n3) == 0) {
            return 3;
        }
        if ((n3 & 0xF0000000) == 0) {
            return 4;
        }
        return 5;
    }

    public static int O(int n3, long l2) {
        return k.L(n3) + k.P(l2);
    }

    public static int P(long l2) {
        int n3;
        if ((0xFFFFFFFFFFFFFF80L & l2) == 0L) {
            return 1;
        }
        if (l2 < 0L) {
            return 10;
        }
        if ((0xFFFFFFF800000000L & l2) != 0L) {
            l2 >>>= 28;
            n3 = 6;
        } else {
            n3 = 2;
        }
        int n4 = n3;
        long l3 = l2;
        if ((0xFFFFFFFFFFE00000L & l2) != 0L) {
            n4 = n3 + 2;
            l3 = l2 >>> 14;
        }
        n3 = n4;
        if ((l3 & 0xFFFFFFFFFFFFC000L) != 0L) {
            n3 = n4 + 1;
        }
        return n3;
    }

    public static int Q(int n3) {
        return n3 >> 31 ^ n3 << 1;
    }

    public static long R(long l2) {
        return l2 >> 63 ^ l2 << 1;
    }

    public static k U(byte[] byArray) {
        return k.V(byArray, 0, byArray.length);
    }

    public static k V(byte[] byArray, int n3, int n4) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static /* synthetic */ boolean b() {
        return d;
    }

    public static int d(int n3, boolean bl) {
        return k.L(n3) + k.e(bl);
    }

    public static int e(boolean bl) {
        return 1;
    }

    public static int f(int n3, h h2) {
        return k.L(n3) + k.g(h2);
    }

    public static int g(h h2) {
        return k.x(h2.size());
    }

    public static int h(int n3, double d2) {
        return k.L(n3) + k.i(d2);
    }

    public static int i(double d2) {
        return 8;
    }

    public static int j(int n3, int n4) {
        return k.L(n3) + k.k(n4);
    }

    public static int k(int n3) {
        return k.u(n3);
    }

    public static int l(int n3, int n4) {
        return k.L(n3) + k.m(n4);
    }

    public static int m(int n3) {
        return 4;
    }

    public static int n(int n3, long l2) {
        return k.L(n3) + k.o(l2);
    }

    public static int o(long l2) {
        return 8;
    }

    public static int p(int n3, float f2) {
        return k.L(n3) + k.q(f2);
    }

    public static int q(float f2) {
        return 4;
    }

    static int r(int n3, O o2, e0 e02) {
        return k.L(n3) * 2 + k.s(o2, e02);
    }

    static int s(O o2, e0 e02) {
        return ((a)o2).g(e02);
    }

    public static int t(int n3, int n4) {
        return k.L(n3) + k.u(n4);
    }

    public static int u(int n3) {
        if (n3 >= 0) {
            return k.N(n3);
        }
        return 10;
    }

    public static int v(int n3, long l2) {
        return k.L(n3) + k.w(l2);
    }

    public static int w(long l2) {
        return k.P(l2);
    }

    static int x(int n3) {
        return k.N(n3) + n3;
    }

    static int y(int n3, O o2, e0 e02) {
        return k.L(n3) + k.z(o2, e02);
    }

    static int z(O o2, e0 e02) {
        return k.x(((a)o2).g(e02));
    }

    public final void A0(int n3, long l2) {
        this.G0(n3, k.R(l2));
    }

    public final void B0(long l2) {
        this.H0(k.R(l2));
    }

    public abstract void C0(int var1, String var2);

    public abstract void D0(int var1, int var2);

    public abstract void E0(int var1, int var2);

    public abstract void F0(int var1);

    public abstract void G0(int var1, long var2);

    public abstract void H0(long var1);

    final void S(String object, p0.d d2) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)d2);
        object = object.getBytes(z.b);
        try {
            this.F0(((Object)object).length);
            this.a((byte[])object, 0, ((Object)object).length);
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IOException(indexOutOfBoundsException){
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
                    stringBuilder.append(string);
                    super(stringBuilder.toString(), throwable);
                }
            };
        }
    }

    boolean T() {
        return this.b;
    }

    public abstract int W();

    public abstract void X(byte var1);

    public abstract void Y(int var1, boolean var2);

    public final void Z(boolean bl) {
        this.X((byte)(bl ? 1 : 0));
    }

    @Override
    public abstract void a(byte[] var1, int var2, int var3);

    public abstract void a0(int var1, h var2);

    public final void b0(int n3, double d2) {
        this.h0(n3, Double.doubleToRawLongBits((double)d2));
    }

    public final void c() {
        if (this.W() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void c0(double d2) {
        this.i0(Double.doubleToRawLongBits((double)d2));
    }

    public final void d0(int n3, int n4) {
        this.n0(n3, n4);
    }

    public final void e0(int n3) {
        this.o0(n3);
    }

    public abstract void f0(int var1, int var2);

    public abstract void g0(int var1);

    public abstract void h0(int var1, long var2);

    public abstract void i0(long var1);

    public final void j0(int n3, float f2) {
        this.f0(n3, Float.floatToRawIntBits((float)f2));
    }

    public final void k0(float f2) {
        this.g0(Float.floatToRawIntBits((float)f2));
    }

    final void l0(int n3, O o2, e0 e02) {
        this.D0(n3, 3);
        this.m0(o2, e02);
        this.D0(n3, 4);
    }

    final void m0(O o2, e0 e02) {
        e02.e(o2, this.a);
    }

    public abstract void n0(int var1, int var2);

    public abstract void o0(int var1);

    public final void p0(int n3, long l2) {
        this.G0(n3, l2);
    }

    public final void q0(long l2) {
        this.H0(l2);
    }

    abstract void r0(int var1, O var2, e0 var3);

    public abstract void s0(int var1, O var2);

    public abstract void t0(int var1, h var2);

    public final void u0(int n3, int n4) {
        this.f0(n3, n4);
    }

    public final void v0(int n3) {
        this.g0(n3);
    }

    public final void w0(int n3, long l2) {
        this.h0(n3, l2);
    }

    public final void x0(long l2) {
        this.i0(l2);
    }

    public final void y0(int n3, int n4) {
        this.E0(n3, k.Q(n4));
    }

    public final void z0(int n3) {
        this.F0(k.Q(n3));
    }
}

