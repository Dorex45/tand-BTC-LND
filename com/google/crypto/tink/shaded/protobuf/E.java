/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.F
 *  com.google.crypto.tink.shaded.protobuf.O
 *  com.google.crypto.tink.shaded.protobuf.S
 *  com.google.crypto.tink.shaded.protobuf.f
 *  com.google.crypto.tink.shaded.protobuf.m
 *  com.google.crypto.tink.shaded.protobuf.v
 *  com.google.crypto.tink.shaded.protobuf.y
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;

abstract class e {
    static int A(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (F)d2;
        n3 = e.K(byArray, n3, a2);
        d2.k(i.c(a2.b));
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.K(byArray, n5, a2);
            d2.k(i.c(a2.b));
        }
        return n3;
    }

    static int B(byte[] byArray, int n2, a a2) {
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a;
        if (n3 >= 0) {
            if (n3 == 0) {
                a2.c = "";
                return n2;
            }
            a2.c = new String(byArray, n2, n3, z.b);
            return n2 + n3;
        }
        throw A.g();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int C(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        block3: {
            var2_2 = e.H(var1_1, var2_2, var5_5);
            var7_6 = var5_5.a;
            if (var7_6 < 0) throw A.g();
            if (var7_6 != 0) break block3;
            var4_4.add("");
            ** GOTO lbl15
        }
        var4_4.add(new String(var1_1, var2_2, var7_6, z.b));
        var6_7 = var2_2;
        var2_2 = var7_6;
        block0: while (true) {
            var2_2 = var6_7 + var2_2;
            while (var2_2 < var3_3) {
                var6_7 = e.H(var1_1, var2_2, var5_5);
                if (var0 != var5_5.a) return var2_2;
                var6_7 = e.H(var1_1, var6_7, var5_5);
                var2_2 = var5_5.a;
                if (var2_2 < 0) throw A.g();
                if (var2_2 == 0) {
                    var4_4.add("");
                    var2_2 = var6_7;
                    continue;
                }
                var4_4.add(new String(var1_1, var6_7, var2_2, z.b));
                continue block0;
            }
            break;
        }
        return var2_2;
    }

    static int D(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        block7: {
            block10: {
                int n5;
                int n6;
                block9: {
                    block8: {
                        n6 = e.H(byArray, n3, a2);
                        n5 = a2.a;
                        if (n5 < 0) break block7;
                        if (n5 != 0) break block8;
                        d2.add("");
                        n3 = n6;
                        break block9;
                    }
                    n3 = n6 + n5;
                    if (!p0.n(byArray, n6, n3)) break block10;
                    d2.add(new String(byArray, n6, n5, z.b));
                }
                while (n3 < n4) {
                    n6 = e.H(byArray, n3, a2);
                    if (n2 != a2.a) break;
                    n6 = e.H(byArray, n6, a2);
                    n5 = a2.a;
                    if (n5 >= 0) {
                        if (n5 == 0) {
                            d2.add("");
                            n3 = n6;
                            continue;
                        }
                        n3 = n6 + n5;
                        if (p0.n(byArray, n6, n3)) {
                            d2.add(new String(byArray, n6, n5, z.b));
                            continue;
                        }
                        throw A.d();
                    }
                    throw A.g();
                }
                return n3;
            }
            throw A.d();
        }
        throw A.g();
    }

    static int E(byte[] byArray, int n2, a a2) {
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a;
        if (n3 >= 0) {
            if (n3 == 0) {
                a2.c = "";
                return n2;
            }
            a2.c = p0.e(byArray, n2, n3);
            return n2 + n3;
        }
        throw A.g();
    }

    static int F(int n2, byte[] byArray, int n3, int n4, l0 l02, a a2) {
        if (q0.a(n2) != 0) {
            int n5 = q0.b(n2);
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        int n6;
                        if (n5 != 3) {
                            if (n5 == 5) {
                                l02.n(n2, e.g(byArray, n3));
                                return n3 + 4;
                            }
                            throw A.c();
                        }
                        l0 l03 = l0.k();
                        int n7 = n2 & 0xFFFFFFF8 | 4;
                        n5 = 0;
                        while (true) {
                            n6 = n3;
                            if (n3 >= n4) break;
                            n6 = e.H(byArray, n3, a2);
                            n3 = a2.a;
                            if (n3 == n7) {
                                n5 = n3;
                                break;
                            }
                            n6 = e.F(n3, byArray, n6, n4, l03, a2);
                            n5 = n3;
                            n3 = n6;
                        }
                        if (n6 <= n4 && n5 == n7) {
                            l02.n(n2, l03);
                            return n6;
                        }
                        throw A.h();
                    }
                    n3 = e.H(byArray, n3, a2);
                    n4 = a2.a;
                    if (n4 >= 0) {
                        if (n4 <= byArray.length - n3) {
                            if (n4 == 0) {
                                l02.n(n2, h.e);
                            } else {
                                l02.n(n2, h.o(byArray, n3, n4));
                            }
                            return n3 + n4;
                        }
                        throw A.m();
                    }
                    throw A.g();
                }
                l02.n(n2, e.i(byArray, n3));
                return n3 + 8;
            }
            n3 = e.K(byArray, n3, a2);
            l02.n(n2, a2.b);
            return n3;
        }
        throw A.c();
    }

    static int G(int n2, byte[] byArray, int n3, a a2) {
        n2 &= 0x7F;
        int n4 = n3 + 1;
        int n5 = byArray[n3];
        if (n5 >= 0) {
            a2.a = n2 | n5 << 7;
            return n4;
        }
        n5 = n2 | (n5 & 0x7F) << 7;
        n2 = n3 + 2;
        if ((n4 = byArray[n4]) >= 0) {
            a2.a = n5 | n4 << 14;
            return n2;
        }
        n4 = n5 | (n4 & 0x7F) << 14;
        n5 = n3 + 3;
        if ((n2 = byArray[n2]) >= 0) {
            a2.a = n4 | n2 << 21;
            return n5;
        }
        n4 |= (n2 & 0x7F) << 21;
        n2 = n3 + 4;
        if ((n5 = byArray[n5]) >= 0) {
            a2.a = n4 | n5 << 28;
            return n2;
        }
        while (true) {
            n3 = n2 + 1;
            if (byArray[n2] >= 0) break;
            n2 = n3;
        }
        a2.a = n4 | (n5 & 0x7F) << 28;
        return n3;
    }

    static int H(byte[] byArray, int n2, a a2) {
        int n3 = n2 + 1;
        if ((n2 = byArray[n2]) >= 0) {
            a2.a = n2;
            return n3;
        }
        return e.G(n2, byArray, n3, a2);
    }

    static int I(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (y)d2;
        n3 = e.H(byArray, n3, a2);
        d2.k(a2.a);
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.H(byArray, n5, a2);
            d2.k(a2.a);
        }
        return n3;
    }

    static int J(long l2, byte[] byArray, int n2, a a2) {
        int n3 = n2 + 1;
        byte by = byArray[n2];
        l2 = l2 & 0x7FL | (long)(by & 0x7F) << 7;
        int n4 = 7;
        n2 = n3;
        while (by < 0) {
            by = byArray[n2];
            l2 |= (long)(by & 0x7F) << (n4 += 7);
            ++n2;
        }
        a2.b = l2;
        return n2;
    }

    static int K(byte[] byArray, int n2, a a2) {
        int n3 = n2 + 1;
        long l2 = byArray[n2];
        if (l2 >= 0L) {
            a2.b = l2;
            return n3;
        }
        return e.J(l2, byArray, n3, a2);
    }

    static int L(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (F)d2;
        n3 = e.K(byArray, n3, a2);
        d2.k(a2.b);
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.K(byArray, n5, a2);
            d2.k(a2.b);
        }
        return n3;
    }

    static int M(Object object, e0 e02, byte[] byArray, int n2, int n3, int n4, a a2) {
        n2 = ((S)e02).f0(object, byArray, n2, n3, n4, a2);
        a2.c = object;
        return n2;
    }

    static int N(Object object, e0 e02, byte[] byArray, int n2, int n3, a a2) {
        int n4 = n2 + 1;
        int n5 = byArray[n2];
        n2 = n4;
        int n6 = n5;
        if (n5 < 0) {
            n2 = e.G(n5, byArray, n4, a2);
            n6 = a2.a;
        }
        if (n6 >= 0 && n6 <= n3 - n2) {
            n3 = n6 + n2;
            e02.d(object, byArray, n2, n3, a2);
            a2.c = object;
            return n3;
        }
        throw A.m();
    }

    static int a(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (f)d2;
        n3 = e.K(byArray, n3, a2);
        boolean bl = a2.b != 0L;
        d2.k(bl);
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.K(byArray, n5, a2);
            bl = a2.b != 0L;
            d2.k(bl);
        }
        return n3;
    }

    static int b(byte[] byArray, int n2, a a2) {
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a;
        if (n3 >= 0) {
            if (n3 <= byArray.length - n2) {
                if (n3 == 0) {
                    a2.c = h.e;
                    return n2;
                }
                a2.c = h.o(byArray, n2, n3);
                return n2 + n3;
            }
            throw A.m();
        }
        throw A.g();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int c(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        block3: {
            var2_2 = e.H(var1_1, var2_2, var5_5);
            var6_6 = var5_5.a;
            if (var6_6 < 0) throw A.g();
            if (var6_6 > var1_1.length - var2_2) throw A.m();
            if (var6_6 != 0) break block3;
            var4_4.add(h.e);
            ** GOTO lbl14
        }
        var4_4.add(h.o(var1_1, var2_2, var6_6));
        block0: while (true) {
            var2_2 += var6_6;
            while (var2_2 < var3_3) {
                var6_6 = e.H(var1_1, var2_2, var5_5);
                if (var0 != var5_5.a) return var2_2;
                var2_2 = e.H(var1_1, var6_6, var5_5);
                var6_6 = var5_5.a;
                if (var6_6 < 0) throw A.g();
                if (var6_6 > var1_1.length - var2_2) throw A.m();
                if (var6_6 == 0) {
                    var4_4.add(h.e);
                    continue;
                }
                var4_4.add(h.o(var1_1, var2_2, var6_6));
                continue block0;
            }
            break;
        }
        return var2_2;
    }

    static double d(byte[] byArray, int n2) {
        return Double.longBitsToDouble((long)e.i(byArray, n2));
    }

    static int e(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (m)d2;
        d2.k(e.d(byArray, n3));
        n3 += 8;
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            d2.k(e.d(byArray, n5));
            n3 = n5 + 8;
        }
        return n3;
    }

    static int f(int n2, byte[] byArray, int n3, int n4, Object object, O o2, k0 k02, a a2) {
        a2.d.a(o2, n2 >>> 3);
        return e.F(n2, byArray, n3, n4, S.v((Object)object), a2);
    }

    static int g(byte[] byArray, int n2) {
        byte by = byArray[n2];
        byte by2 = byArray[n2 + 1];
        byte by3 = byArray[n2 + 2];
        return (byArray[n2 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    static int h(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (y)d2;
        d2.k(e.g(byArray, n3));
        n3 += 4;
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            d2.k(e.g(byArray, n5));
            n3 = n5 + 4;
        }
        return n3;
    }

    static long i(byte[] byArray, int n2) {
        long l2 = byArray[n2];
        long l3 = byArray[n2 + 1];
        long l4 = byArray[n2 + 2];
        long l5 = byArray[n2 + 3];
        long l6 = byArray[n2 + 4];
        long l7 = byArray[n2 + 5];
        long l8 = byArray[n2 + 6];
        return ((long)byArray[n2 + 7] & 0xFFL) << 56 | (l2 & 0xFFL | (l3 & 0xFFL) << 8 | (l4 & 0xFFL) << 16 | (l5 & 0xFFL) << 24 | (l6 & 0xFFL) << 32 | (l7 & 0xFFL) << 40 | (l8 & 0xFFL) << 48);
    }

    static int j(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (F)d2;
        d2.k(e.i(byArray, n3));
        n3 += 8;
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            d2.k(e.i(byArray, n5));
            n3 = n5 + 8;
        }
        return n3;
    }

    static float k(byte[] byArray, int n2) {
        return Float.intBitsToFloat((int)e.g(byArray, n2));
    }

    static int l(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (v)d2;
        d2.k(e.k(byArray, n3));
        n3 += 4;
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            d2.k(e.k(byArray, n5));
            n3 = n5 + 4;
        }
        return n3;
    }

    static int m(e0 e02, byte[] byArray, int n2, int n3, int n4, a a2) {
        Object object = e02.g();
        n2 = e.M(object, e02, byArray, n2, n3, n4, a2);
        e02.i(object);
        a2.c = object;
        return n2;
    }

    static int n(e0 e02, int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        int n5 = n2 & 0xFFFFFFF8 | 4;
        n3 = e.m(e02, byArray, n3, n4, n5, a2);
        d2.add(a2.c);
        while (n3 < n4) {
            int n6 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.m(e02, byArray, n6, n4, n5, a2);
            d2.add(a2.c);
        }
        return n3;
    }

    static int o(e0 e02, byte[] byArray, int n2, int n3, a a2) {
        Object object = e02.g();
        n2 = e.N(object, e02, byArray, n2, n3, a2);
        e02.i(object);
        a2.c = object;
        return n2;
    }

    static int p(e0 e02, int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        n3 = e.o(e02, byArray, n3, n4, a2);
        d2.add(a2.c);
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.o(e02, byArray, n5, n4, a2);
            d2.add(a2.c);
        }
        return n3;
    }

    static int q(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (f)d2;
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a + n2;
        while (n2 < n3) {
            n2 = e.K(byArray, n2, a2);
            boolean bl = a2.b != 0L;
            d2.k(bl);
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int r(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (m)d2;
        int n3 = a2.a + n2;
        for (n2 = e.H(byArray, n2, a2); n2 < n3; n2 += 8) {
            d2.k(e.d(byArray, n2));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int s(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (y)d2;
        int n3 = a2.a + n2;
        for (n2 = e.H(byArray, n2, a2); n2 < n3; n2 += 4) {
            d2.k(e.g(byArray, n2));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int t(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (F)d2;
        int n3 = a2.a + n2;
        for (n2 = e.H(byArray, n2, a2); n2 < n3; n2 += 8) {
            d2.k(e.i(byArray, n2));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int u(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (v)d2;
        int n3 = a2.a + n2;
        for (n2 = e.H(byArray, n2, a2); n2 < n3; n2 += 4) {
            d2.k(e.k(byArray, n2));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int v(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (y)d2;
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a + n2;
        while (n2 < n3) {
            n2 = e.H(byArray, n2, a2);
            d2.k(i.b(a2.a));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int w(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (F)d2;
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a + n2;
        while (n2 < n3) {
            n2 = e.K(byArray, n2, a2);
            d2.k(i.c(a2.b));
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int x(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (y)d2;
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a + n2;
        while (n2 < n3) {
            n2 = e.H(byArray, n2, a2);
            d2.k(a2.a);
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int y(byte[] byArray, int n2, z.d d2, a a2) {
        d2 = (F)d2;
        n2 = e.H(byArray, n2, a2);
        int n3 = a2.a + n2;
        while (n2 < n3) {
            n2 = e.K(byArray, n2, a2);
            d2.k(a2.b);
        }
        if (n2 == n3) {
            return n2;
        }
        throw A.m();
    }

    static int z(int n2, byte[] byArray, int n3, int n4, z.d d2, a a2) {
        d2 = (y)d2;
        n3 = e.H(byArray, n3, a2);
        d2.k(i.b(a2.a));
        while (n3 < n4) {
            int n5 = e.H(byArray, n3, a2);
            if (n2 != a2.a) break;
            n3 = e.H(byArray, n5, a2);
            d2.k(i.b(a2.a));
        }
        return n3;
    }

    static final class a {
        public int a;
        public long b;
        public Object c;
        public final p d;

        a(p p2) {
            p2.getClass();
            this.d = p2;
        }
    }
}

