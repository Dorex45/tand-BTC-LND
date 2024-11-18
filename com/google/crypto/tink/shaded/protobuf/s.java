/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.x
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  sun.misc.Unsafe
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.E;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.Z;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;
import f.c;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class S
implements e0 {
    private static final int[] r = new int[0];
    private static final Unsafe s = o0.D();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final O e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final U m;
    private final E n;
    private final k0 o;
    private final q p;
    private final J q;

    private S(int[] nArray, Object[] objectArray, int n3, int n4, O o2, boolean bl, boolean bl2, int[] nArray2, int n5, int n6, U u2, E e2, k0 k02, q q2, J j2) {
        this.a = nArray;
        this.b = objectArray;
        this.c = n3;
        this.d = n4;
        this.g = o2 instanceof x;
        this.h = bl;
        bl = q2 != null && q2.e(o2);
        this.f = bl;
        this.i = bl2;
        this.j = nArray2;
        this.k = n5;
        this.l = n6;
        this.m = u2;
        this.n = e2;
        this.o = k02;
        this.p = q2;
        this.e = o2;
        this.q = j2;
    }

    private static boolean A(int n3) {
        boolean bl = (n3 & 0x20000000) != 0;
        return bl;
    }

    private void A0(r0 r02, int n3, Object object, int n4) {
        if (object != null) {
            this.q.h(this.t(n4));
            r02.g(n3, null, this.q.b(object));
        }
    }

    private boolean B(Object object, int n3) {
        int n4 = this.k0(n3);
        long l2 = 0xFFFFF & n4;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        if (l2 == 1048575L) {
            n3 = this.w0(n3);
            l2 = S.X(n3);
            switch (S.v0(n3)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 17: {
                    bl4 = bl16;
                    if (o0.C(object, l2) != null) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 16: {
                    bl4 = bl;
                    if (o0.A(object, l2) != 0L) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 15: {
                    bl4 = bl2;
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 14: {
                    bl4 = bl3;
                    if (o0.A(object, l2) != 0L) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 13: {
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 12: {
                    bl4 = bl5;
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 11: {
                    bl4 = bl6;
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 10: {
                    return com.google.crypto.tink.shaded.protobuf.h.e.equals(o0.C(object, l2)) ^ true;
                }
                case 9: {
                    bl4 = bl7;
                    if (o0.C(object, l2) != null) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 8: {
                    object = o0.C(object, l2);
                    if (object instanceof String) {
                        return ((String)object).isEmpty() ^ true;
                    }
                    if (object instanceof h) {
                        return com.google.crypto.tink.shaded.protobuf.h.e.equals(object) ^ true;
                    }
                    throw new IllegalArgumentException();
                }
                case 7: {
                    return o0.r(object, l2);
                }
                case 6: {
                    bl4 = bl8;
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 5: {
                    bl4 = bl9;
                    if (o0.A(object, l2) != 0L) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 4: {
                    bl4 = bl10;
                    if (o0.z(object, l2) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 3: {
                    bl4 = bl11;
                    if (o0.A(object, l2) != 0L) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 2: {
                    bl4 = bl12;
                    if (o0.A(object, l2) != 0L) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 1: {
                    bl4 = bl13;
                    if (Float.floatToRawIntBits((float)o0.y(object, l2)) != 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
                case 0: 
            }
            bl4 = bl14;
            if (Double.doubleToRawLongBits((double)o0.x(object, l2)) != 0L) {
                bl4 = true;
            }
            return bl4;
        }
        bl4 = bl15;
        if ((o0.z(object, l2) & 1 << (n4 >>> 20)) != 0) {
            bl4 = true;
        }
        return bl4;
    }

    private void B0(int n3, Object object, r0 r02) {
        if (object instanceof String) {
            r02.u(n3, (String)object);
        } else {
            r02.a(n3, (h)object);
        }
    }

    private boolean C(Object object, int n3, int n4, int n5, int n6) {
        if (n4 == 1048575) {
            return this.B(object, n3);
        }
        boolean bl = (n5 & n6) != 0;
        return bl;
    }

    private void C0(k0 k02, Object object, r0 r02) {
        k02.t(k02.g(object), r02);
    }

    private static boolean D(Object object, int n3, e0 e02) {
        return e02.b(o0.C(object, S.X(n3)));
    }

    private boolean E(Object object, int n3, int n4) {
        if ((object = (List)o0.C(object, S.X(n3))).isEmpty()) {
            return true;
        }
        e0 e02 = this.u(n4);
        for (n3 = 0; n3 < object.size(); ++n3) {
            if (e02.b(object.get(n3))) continue;
            return false;
        }
        return true;
    }

    private boolean F(Object object, int n3, int n4) {
        if (this.q.b(o0.C(object, S.X(n3))).isEmpty()) {
            return true;
        }
        object = this.t(n4);
        this.q.h(object);
        throw null;
    }

    private static boolean G(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof x) {
            return ((x)object).D();
        }
        return true;
    }

    private boolean H(Object object, Object object2, int n3) {
        long l2 = this.k0(n3) & 0xFFFFF;
        boolean bl = o0.z(object, l2) == o0.z(object2, l2);
        return bl;
    }

    private boolean I(Object object, int n3, int n4) {
        boolean bl = o0.z(object, this.k0(n4) & 0xFFFFF) == n3;
        return bl;
    }

    private static boolean J(int n3) {
        boolean bl = (n3 & 0x10000000) != 0;
        return bl;
    }

    private static List K(Object object, long l2) {
        return (List)o0.C(object, l2);
    }

    private static long L(Object object, long l2) {
        return o0.A(object, l2);
    }

    /*
     * Exception decompiling
     */
    private void M(k0 var1_1, q var2_2, Object var3_3, d0 var4_4, p var5_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 169->178)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:644)
         *     at java.lang.Thread.run(Thread.java:1012)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final void N(Object object, int n3, Object object2, p p2, d0 d02) {
        Object object3;
        long l2 = S.X(this.w0(n3));
        Object object4 = o0.C(object, l2);
        if (object4 == null) {
            object3 = this.q.c(object2);
            o0.R(object, l2, object3);
        } else {
            object3 = object4;
            if (this.q.f(object4)) {
                object3 = this.q.c(object2);
                this.q.a(object3, object4);
                o0.R(object, l2, object3);
            }
        }
        object = this.q.e(object3);
        this.q.h(object2);
        d02.v((Map)object, null, p2);
    }

    private void O(Object object, Object object2, int n3) {
        if (!this.B(object2, n3)) {
            return;
        }
        Unsafe unsafe = s;
        long l2 = S.X(this.w0(n3));
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            Object object4;
            e0 e02 = this.u(n3);
            if (!this.B(object, n3)) {
                if (!S.G(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = e02.g();
                    e02.a(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.q0(object, n3);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l2);
            if (!S.G(object4)) {
                object2 = e02.g();
                e02.a(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            e02.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.W(n3));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    private void P(Object object, Object object2, int n3) {
        int n4 = this.W(n3);
        if (!this.I(object2, n4, n3)) {
            return;
        }
        Unsafe unsafe = s;
        long l2 = S.X(this.w0(n3));
        Object object3 = unsafe.getObject(object2, l2);
        if (object3 != null) {
            Object object4;
            e0 e02 = this.u(n3);
            if (!this.I(object, n4, n3)) {
                if (!S.G(object3)) {
                    unsafe.putObject(object, l2, object3);
                } else {
                    object2 = e02.g();
                    e02.a(object2, object3);
                    unsafe.putObject(object, l2, object2);
                }
                this.r0(object, n4, n3);
                return;
            }
            object2 = object4 = unsafe.getObject(object, l2);
            if (!S.G(object4)) {
                object2 = e02.g();
                e02.a(object2, object4);
                unsafe.putObject(object, l2, object2);
            }
            e02.a(object2, object3);
            return;
        }
        object = new StringBuilder();
        object.append("Source subfield ");
        object.append(this.W(n3));
        object.append(" is present but null: ");
        object.append(object2);
        throw new IllegalStateException(object.toString());
    }

    private void Q(Object object, Object object2, int n3) {
        int n4 = this.w0(n3);
        long l2 = S.X(n4);
        int n5 = this.W(n3);
        switch (S.v0(n4)) {
            default: {
                break;
            }
            case 68: {
                this.P(object, object2, n3);
                break;
            }
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: {
                if (!this.I(object2, n5, n3)) break;
                o0.R(object, l2, o0.C(object2, l2));
                this.r0(object, n5, n3);
                break;
            }
            case 60: {
                this.P(object, object2, n3);
                break;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                if (!this.I(object2, n5, n3)) break;
                o0.R(object, l2, o0.C(object2, l2));
                this.r0(object, n5, n3);
                break;
            }
            case 50: {
                g0.E(this.q, object, object2, l2);
                break;
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: {
                this.n.d(object, object2, l2);
                break;
            }
            case 17: {
                this.O(object, object2, n3);
                break;
            }
            case 16: {
                if (!this.B(object2, n3)) break;
                o0.Q(object, l2, o0.A(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 15: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 14: {
                if (!this.B(object2, n3)) break;
                o0.Q(object, l2, o0.A(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 13: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 12: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 11: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 10: {
                if (!this.B(object2, n3)) break;
                o0.R(object, l2, o0.C(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 9: {
                this.O(object, object2, n3);
                break;
            }
            case 8: {
                if (!this.B(object2, n3)) break;
                o0.R(object, l2, o0.C(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 7: {
                if (!this.B(object2, n3)) break;
                o0.H(object, l2, o0.r(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 6: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 5: {
                if (!this.B(object2, n3)) break;
                o0.Q(object, l2, o0.A(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 4: {
                if (!this.B(object2, n3)) break;
                o0.P(object, l2, o0.z(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 3: {
                if (!this.B(object2, n3)) break;
                o0.Q(object, l2, o0.A(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 2: {
                if (!this.B(object2, n3)) break;
                o0.Q(object, l2, o0.A(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 1: {
                if (!this.B(object2, n3)) break;
                o0.O(object, l2, o0.y(object2, l2));
                this.q0(object, n3);
                break;
            }
            case 0: {
                if (!this.B(object2, n3)) break;
                o0.N(object, l2, o0.x(object2, l2));
                this.q0(object, n3);
            }
        }
    }

    private Object R(Object object, int n3) {
        e0 e02 = this.u(n3);
        long l2 = S.X(this.w0(n3));
        if (!this.B(object, n3)) {
            return e02.g();
        }
        if (S.G(object = s.getObject(object, l2))) {
            return object;
        }
        Object object2 = e02.g();
        if (object != null) {
            e02.a(object2, object);
        }
        return object2;
    }

    private Object S(Object object, int n3, int n4) {
        e0 e02 = this.u(n4);
        if (!this.I(object, n3, n4)) {
            return e02.g();
        }
        Object object2 = s.getObject(object, S.X(this.w0(n4)));
        if (S.G(object2)) {
            return object2;
        }
        object = e02.g();
        if (object2 != null) {
            e02.a(object, object2);
        }
        return object;
    }

    static S T(Class clazz, M m2, U u2, E e2, k0 k02, q q2, J j2) {
        if (m2 instanceof c0) {
            return S.V((c0)m2, u2, e2, k02, q2, j2);
        }
        f.c.a(m2);
        return S.U(null, u2, e2, k02, q2, j2);
    }

    static S U(h0 h02, U u2, E e2, k0 k02, q q2, J j2) {
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static S V(c0 c02, U u2, E e2, k0 k02, q q2, J j2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int[] nArray;
        int n10;
        int n11;
        int n12;
        boolean bl = c02.a() == Z.PROTO3;
        String string = c02.e();
        int n13 = string.length();
        if (string.charAt(0) >= '\ud800') {
            n12 = 1;
            while (true) {
                n10 = n11 = n12 + 1;
                if (string.charAt(n12) >= '\ud800') {
                    n12 = n11;
                    continue;
                }
                break;
            }
        } else {
            n10 = 1;
        }
        n12 = n10 + 1;
        int n14 = string.charAt(n10);
        n11 = n12;
        n10 = n14;
        if (n14 >= 55296) {
            n11 = n14 & 0x1FFF;
            n10 = 13;
            n14 = n12;
            while (true) {
                n12 = n14 + 1;
                if ((n14 = (int)string.charAt(n14)) < 55296) break;
                n11 |= (n14 & 0x1FFF) << n10;
                n10 += 13;
                n14 = n12;
            }
            n10 = n11 | n14 << n10;
            n11 = n12;
        }
        if (n10 == 0) {
            nArray = r;
            n9 = 0;
            n14 = 0;
            n8 = 0;
            n7 = 0;
            n6 = 0;
            n10 = 0;
            n5 = 0;
        } else {
            n10 = n11 + 1;
            n12 = n11 = (int)string.charAt(n11);
            n14 = n10;
            if (n11 >= 55296) {
                n11 &= 0x1FFF;
                n12 = 13;
                n14 = n10;
                while (true) {
                    n10 = n14 + 1;
                    if ((n14 = (int)string.charAt(n14)) < 55296) break;
                    n11 |= (n14 & 0x1FFF) << n12;
                    n12 += 13;
                    n14 = n10;
                }
                n12 = n11 | n14 << n12;
                n14 = n10;
            }
            n11 = n14 + 1;
            n5 = n14 = (int)string.charAt(n14);
            n10 = n11;
            if (n14 >= 55296) {
                n14 &= 0x1FFF;
                n10 = 13;
                n7 = n11;
                while (true) {
                    n11 = n7 + 1;
                    if ((n7 = (int)string.charAt(n7)) < 55296) break;
                    n14 |= (n7 & 0x1FFF) << n10;
                    n10 += 13;
                    n7 = n11;
                }
                n5 = n14 | n7 << n10;
                n10 = n11;
            }
            n14 = n10 + 1;
            n11 = n10 = (int)string.charAt(n10);
            n7 = n14;
            if (n10 >= 55296) {
                n11 = n10 & 0x1FFF;
                n10 = 13;
                n7 = n14;
                n14 = n11;
                while (true) {
                    n11 = n7 + 1;
                    if ((n7 = (int)string.charAt(n7)) < 55296) break;
                    n14 |= (n7 & 0x1FFF) << n10;
                    n10 += 13;
                    n7 = n11;
                }
                n10 = n14 | n7 << n10;
                n7 = n11;
                n11 = n10;
            }
            n10 = n7 + 1;
            n14 = n6 = (int)string.charAt(n7);
            n7 = n10;
            if (n6 >= 55296) {
                n7 = n6 & 0x1FFF;
                n14 = 13;
                n6 = n10;
                while (true) {
                    n10 = n6 + 1;
                    if ((n6 = (int)string.charAt(n6)) < 55296) break;
                    n7 |= (n6 & 0x1FFF) << n14;
                    n14 += 13;
                    n6 = n10;
                }
                n14 = n7 | n6 << n14;
                n7 = n10;
            }
            n10 = n7 + 1;
            n8 = string.charAt(n7);
            n7 = n8;
            n6 = n10;
            if (n8 >= 55296) {
                n6 = n8 & 0x1FFF;
                n7 = 13;
                n8 = n10;
                while (true) {
                    n10 = n8 + 1;
                    if ((n8 = (int)string.charAt(n8)) < 55296) break;
                    n6 |= (n8 & 0x1FFF) << n7;
                    n7 += 13;
                    n8 = n10;
                }
                n7 = n6 | n8 << n7;
                n6 = n10;
            }
            n8 = n6 + 1;
            n6 = n10 = (int)string.charAt(n6);
            n4 = n8;
            if (n10 >= 55296) {
                n6 = n10 & 0x1FFF;
                n10 = 13;
                n4 = n8;
                n8 = n6;
                while (true) {
                    n6 = n4 + 1;
                    if ((n4 = (int)string.charAt(n4)) < 55296) break;
                    n8 |= (n4 & 0x1FFF) << n10;
                    n10 += 13;
                    n4 = n6;
                }
                n10 = n8 | n4 << n10;
                n4 = n6;
                n6 = n10;
            }
            n10 = n4 + 1;
            n9 = string.charAt(n4);
            n4 = n9;
            n8 = n10;
            if (n9 >= 55296) {
                n4 = n9 & 0x1FFF;
                n8 = 13;
                n9 = n10;
                while (true) {
                    n10 = n9 + 1;
                    if ((n9 = (int)string.charAt(n9)) < 55296) break;
                    n4 |= (n9 & 0x1FFF) << n8;
                    n8 += 13;
                    n9 = n10;
                }
                n4 |= n9 << n8;
                n8 = n10;
            }
            n9 = n8 + 1;
            n10 = n3 = (int)string.charAt(n8);
            n8 = n9;
            if (n3 >= 55296) {
                n10 = n3 & 0x1FFF;
                n8 = 13;
                n3 = n9;
                n9 = n10;
                while (true) {
                    n10 = n3 + 1;
                    if ((n3 = (int)string.charAt(n3)) < 55296) break;
                    n9 |= (n3 & 0x1FFF) << n8;
                    n8 += 13;
                    n3 = n10;
                }
                n9 |= n3 << n8;
                n8 = n10;
                n10 = n9;
            }
            nArray = new int[n10 + n6 + n4];
            n5 = n12 * 2 + n5;
            n9 = n12;
            n12 = n8;
            n8 = n14;
            n14 = n11;
            n11 = n12;
        }
        Unsafe unsafe = s;
        Object[] objectArray = c02.d();
        Class clazz = c02.b().getClass();
        int[] nArray2 = new int[n7 * 3];
        Object[] objectArray2 = new Object[n7 * 2];
        int n15 = n10 + n6;
        n12 = n10;
        int n16 = n15;
        n6 = 0;
        n4 = 0;
        n7 = n5;
        int n17 = n10;
        n3 = n8;
        int n18 = n14;
        n10 = n13;
        while (true) {
            int n19;
            int n20;
            int n21;
            int n22;
            int n23;
            int n24;
            int n25;
            block52: {
                int n26;
                Field field;
                block58: {
                    block59: {
                        block53: {
                            block54: {
                                block56: {
                                    block55: {
                                        block57: {
                                            block48: {
                                                void var35_46;
                                                void var35_42;
                                                Object object;
                                                block50: {
                                                    block51: {
                                                        block49: {
                                                            n25 = n4;
                                                            if (n11 >= n10) {
                                                                return new S(nArray2, objectArray2, n18, n3, c02.b(), bl, false, nArray, n17, n15, u2, e2, k02, q2, j2);
                                                            }
                                                            n5 = n11 + 1;
                                                            n4 = string.charAt(n11);
                                                            if (n4 >= 55296) {
                                                                n8 = n4 & 0x1FFF;
                                                                n14 = 13;
                                                                while (true) {
                                                                    n11 = n5 + 1;
                                                                    if ((n5 = (int)string.charAt(n5)) < 55296) break;
                                                                    n8 |= (n5 & 0x1FFF) << n14;
                                                                    n14 += 13;
                                                                    n5 = n11;
                                                                }
                                                                n4 = n8 | n5 << n14;
                                                                n14 = n11;
                                                            } else {
                                                                n14 = n5;
                                                            }
                                                            n11 = n14 + 1;
                                                            n13 = string.charAt(n14);
                                                            if (n13 >= 55296) {
                                                                n5 = n13 & 0x1FFF;
                                                                n14 = 13;
                                                                while (true) {
                                                                    n8 = n11 + 1;
                                                                    n13 = string.charAt(n11);
                                                                    n11 = n10;
                                                                    if (n13 < 55296) break;
                                                                    n5 |= (n13 & 0x1FFF) << n14;
                                                                    n14 += 13;
                                                                    n10 = n11;
                                                                    n11 = n8;
                                                                }
                                                                n13 = n5 | n13 << n14;
                                                            } else {
                                                                n8 = n11;
                                                                n11 = n10;
                                                            }
                                                            n24 = n13 & 0xFF;
                                                            n14 = n6;
                                                            if ((n13 & 0x400) != 0) {
                                                                nArray[n6] = n25;
                                                                n14 = n6 + 1;
                                                            }
                                                            if (n24 < 51) break block48;
                                                            n6 = n8 + 1;
                                                            n8 = n5 = (int)string.charAt(n8);
                                                            n10 = n6;
                                                            if (n5 >= 55296) {
                                                                n10 = n5 & 0x1FFF;
                                                                n8 = 13;
                                                                n5 = n6;
                                                                n6 = n10;
                                                                while (true) {
                                                                    n10 = n5 + 1;
                                                                    if ((n5 = (int)string.charAt(n5)) < 55296) break;
                                                                    n6 |= (n5 & 0x1FFF) << n8;
                                                                    n8 += 13;
                                                                    n5 = n10;
                                                                }
                                                                n8 = n6 | n5 << n8;
                                                            }
                                                            if ((n5 = n24 - 51) == 9 || n5 == 17) break block49;
                                                            n6 = n7;
                                                            if (n5 != 12) break block50;
                                                            n6 = n7;
                                                            if (bl) break block50;
                                                            n5 = n25 / 3;
                                                            n6 = n7 + 1;
                                                            objectArray2[n5 * 2 + 1] = objectArray[n7];
                                                            n7 = n6;
                                                            break block51;
                                                        }
                                                        n5 = n25 / 3;
                                                        n6 = n7 + 1;
                                                        objectArray2[n5 * 2 + 1] = objectArray[n7];
                                                        n7 = n6;
                                                    }
                                                    n6 = n7;
                                                }
                                                if ((object = objectArray[n7 = n8 * 2]) instanceof Field) {
                                                    Field field2 = (Field)object;
                                                } else {
                                                    Field field3 = S.p0(clazz, (String)object);
                                                    objectArray[n7] = field3;
                                                }
                                                n23 = (int)unsafe.objectFieldOffset((Field)var35_42);
                                                Object object2 = objectArray[++n7];
                                                if (object2 instanceof Field) {
                                                    Field field4 = (Field)object2;
                                                } else {
                                                    Field field5 = S.p0(clazz, (String)object2);
                                                    objectArray[n7] = field5;
                                                }
                                                n22 = (int)unsafe.objectFieldOffset((Field)var35_46);
                                                n21 = 0;
                                                n7 = n6;
                                                n20 = n12;
                                                n19 = n16;
                                                break block52;
                                            }
                                            n5 = n7 + 1;
                                            field = S.p0(clazz, (String)objectArray[n7]);
                                            if (n24 == 9 || n24 == 17) break block53;
                                            if (n24 == 27 || n24 == 49) break block54;
                                            if (n24 == 12 || n24 == 30 || n24 == 44) break block55;
                                            n6 = n5;
                                            n10 = n12;
                                            if (n24 != 50) break block56;
                                            n10 = n12 + 1;
                                            nArray[n12] = n25;
                                            n26 = n25 / 3 * 2;
                                            n6 = n7 + 2;
                                            objectArray2[n26] = objectArray[n5];
                                            if ((n13 & 0x800) == 0) break block57;
                                            n12 = n7 + 3;
                                            objectArray2[n26 + 1] = objectArray[n6];
                                            n6 = n12;
                                            break block56;
                                        }
                                        n12 = n10;
                                        n10 = n6;
                                        break block58;
                                    }
                                    n6 = n5;
                                    n10 = n12;
                                    if (bl) break block56;
                                    n6 = n25 / 3;
                                    n10 = n7 + 2;
                                    objectArray2[n6 * 2 + 1] = objectArray[n5];
                                    break block58;
                                }
                                n12 = n10;
                                break block59;
                            }
                            n6 = n25 / 3;
                            n10 = n7 + 2;
                            objectArray2[n6 * 2 + 1] = objectArray[n5];
                            break block58;
                        }
                        objectArray2[n25 / 3 * 2 + 1] = field.getType();
                        n6 = n5;
                    }
                    n10 = n6;
                }
                int n27 = (int)unsafe.objectFieldOffset(field);
                n26 = n10;
                if ((n13 & 0x1000) == 4096 && n24 <= 17) {
                    void var35_51;
                    n6 = n8 + 1;
                    n10 = string.charAt(n8);
                    if (n10 >= 55296) {
                        n7 = n10 & 0x1FFF;
                        n10 = 13;
                        while (true) {
                            n5 = n6 + 1;
                            if ((n6 = (int)string.charAt(n6)) < 55296) break;
                            n7 |= (n6 & 0x1FFF) << n10;
                            n10 += 13;
                            n6 = n5;
                        }
                        n10 = n7 | n6 << n10;
                    } else {
                        n5 = n6;
                    }
                    n7 = n9 * 2 + n10 / 32;
                    Object object = objectArray[n7];
                    if (object instanceof Field) {
                        Field field6 = (Field)object;
                    } else {
                        Field field7 = S.p0(clazz, (String)object);
                        objectArray[n7] = field7;
                    }
                    n8 = (int)unsafe.objectFieldOffset((Field)var35_51);
                    n6 = n10 % 32;
                } else {
                    n10 = 1048575;
                    n6 = 0;
                    n5 = n8;
                    n8 = n10;
                }
                n21 = n6;
                n23 = n27;
                n22 = n8;
                n7 = n26;
                n20 = n12;
                n19 = n16;
                n10 = n5;
                if (n24 >= 18) {
                    n21 = n6;
                    n23 = n27;
                    n22 = n8;
                    n7 = n26;
                    n20 = n12;
                    n19 = n16;
                    n10 = n5;
                    if (n24 <= 49) {
                        nArray[n16] = n27;
                        n19 = n16 + 1;
                        n10 = n5;
                        n20 = n12;
                        n7 = n26;
                        n22 = n8;
                        n23 = n27;
                        n21 = n6;
                    }
                }
            }
            nArray2[n25] = n4;
            n12 = (n13 & 0x200) != 0 ? 0x20000000 : 0;
            n6 = (n13 & 0x100) != 0 ? 0x10000000 : 0;
            nArray2[n25 + 1] = n6 | n12 | n24 << 20 | n23;
            n4 = n25 + 3;
            nArray2[n25 + 2] = n21 << 20 | n22;
            n12 = n10;
            n10 = n11;
            n11 = n12;
            n6 = n14;
            n12 = n20;
            n16 = n19;
        }
    }

    private int W(int n3) {
        return this.a[n3];
    }

    private static long X(int n3) {
        return n3 & 0xFFFFF;
    }

    private static boolean Y(Object object, long l2) {
        return (Boolean)o0.C(object, l2);
    }

    private static double Z(Object object, long l2) {
        return (Double)o0.C(object, l2);
    }

    private static float a0(Object object, long l2) {
        return ((Float)o0.C(object, l2)).floatValue();
    }

    private static int b0(Object object, long l2) {
        return (Integer)o0.C(object, l2);
    }

    private static long c0(Object object, long l2) {
        return (Long)o0.C(object, l2);
    }

    private int d0(Object object, byte[] byArray, int n3, int n4, int n5, long l2, e.a a2) {
        Object object2;
        Unsafe unsafe = s;
        Object object3 = this.t(n5);
        Object object4 = object2 = unsafe.getObject(object, l2);
        if (this.q.f(object2)) {
            object4 = this.q.c(object3);
            this.q.a(object4, object2);
            unsafe.putObject(object, l2, object4);
        }
        this.q.h(object3);
        return this.n(byArray, n3, n4, null, this.q.e(object4), a2);
    }

    private int e0(Object object, byte[] byArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2, int n10, e.a a2) {
        Object object2 = s;
        long l3 = this.a[n10 + 2] & 0xFFFFF;
        boolean bl = true;
        switch (n9) {
            default: {
                break;
            }
            case 68: {
                if (n7 != 3) break;
                object2 = this.S(object, n6, n10);
                n3 = com.google.crypto.tink.shaded.protobuf.e.M(object2, this.u(n10), byArray, n3, n4, n5 & 0xFFFFFFF8 | 4, a2);
                this.u0(object, n6, n10, object2);
                break;
            }
            case 67: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.K(byArray, n3, a2);
                object2.putObject(object, l2, (Object)com.google.crypto.tink.shaded.protobuf.i.c(a2.b));
                object2.putInt(object, l3, n6);
                break;
            }
            case 66: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.H(byArray, n3, a2);
                object2.putObject(object, l2, (Object)com.google.crypto.tink.shaded.protobuf.i.b(a2.a));
                object2.putInt(object, l3, n6);
                break;
            }
            case 63: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.H(byArray, n3, a2);
                n4 = a2.a;
                this.s(n10);
                object2.putObject(object, l2, (Object)n4);
                object2.putInt(object, l3, n6);
                break;
            }
            case 61: {
                if (n7 != 2) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.b(byArray, n3, a2);
                object2.putObject(object, l2, a2.c);
                object2.putInt(object, l3, n6);
                break;
            }
            case 60: {
                if (n7 != 2) break;
                object2 = this.S(object, n6, n10);
                n3 = com.google.crypto.tink.shaded.protobuf.e.N(object2, this.u(n10), byArray, n3, n4, a2);
                this.u0(object, n6, n10, object2);
                break;
            }
            case 59: {
                if (n7 != 2) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.H(byArray, n3, a2);
                n4 = a2.a;
                if (n4 == 0) {
                    object2.putObject(object, l2, (Object)"");
                } else {
                    if ((n8 & 0x20000000) != 0 && !p0.n(byArray, n3, n3 + n4)) {
                        throw A.d();
                    }
                    object2.putObject(object, l2, (Object)new String(byArray, n3, n4, z.b));
                    n3 += n4;
                }
                object2.putInt(object, l3, n6);
                break;
            }
            case 58: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.K(byArray, n3, a2);
                if (a2.b == 0L) {
                    bl = false;
                }
                object2.putObject(object, l2, (Object)bl);
                object2.putInt(object, l3, n6);
                break;
            }
            case 57: 
            case 64: {
                if (n7 != 5) break;
                object2.putObject(object, l2, (Object)com.google.crypto.tink.shaded.protobuf.e.g(byArray, n3));
                n3 += 4;
                object2.putInt(object, l3, n6);
                break;
            }
            case 56: 
            case 65: {
                if (n7 != 1) break;
                object2.putObject(object, l2, (Object)com.google.crypto.tink.shaded.protobuf.e.i(byArray, n3));
                n3 += 8;
                object2.putInt(object, l3, n6);
                break;
            }
            case 55: 
            case 62: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.H(byArray, n3, a2);
                object2.putObject(object, l2, (Object)a2.a);
                object2.putInt(object, l3, n6);
                break;
            }
            case 53: 
            case 54: {
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.K(byArray, n3, a2);
                object2.putObject(object, l2, (Object)a2.b);
                object2.putInt(object, l3, n6);
                break;
            }
            case 52: {
                if (n7 != 5) break;
                object2.putObject(object, l2, (Object)Float.valueOf((float)com.google.crypto.tink.shaded.protobuf.e.k(byArray, n3)));
                n3 += 4;
                object2.putInt(object, l3, n6);
                break;
            }
            case 51: {
                if (n7 != 1) break;
                object2.putObject(object, l2, (Object)com.google.crypto.tink.shaded.protobuf.e.d(byArray, n3));
                n3 += 8;
                object2.putInt(object, l3, n6);
                break;
            }
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    private int g0(Object var1_1, byte[] var2_2, int var3_3, int var4_4, e.a var5_5) {
        var25_6 = this;
        var23_7 = var1_1;
        var24_8 = var2_2;
        var12_9 = var4_4;
        S.m(var1_1);
        var22_10 = S.s;
        var8_11 = var3_3;
        var10_12 = -1;
        var3_3 = 0;
        var6_13 = 0;
        var7_14 = 1048575;
        block15: while (var8_11 < var12_9) {
            block38: {
                block42: {
                    block41: {
                        block40: {
                            block39: {
                                var9_15 = var8_11 + 1;
                                var13_17 = var24_8[var8_11];
                                if (var13_17 < 0) {
                                    var9_15 = com.google.crypto.tink.shaded.protobuf.e.G(var13_17, var24_8, var9_15, var5_5);
                                    var13_17 = var5_5.a;
                                }
                                var8_11 = var13_17 >>> 3;
                                var16_20 = var13_17 & 7;
                                var3_3 = var8_11 > var10_12 ? var25_6.j0(var8_11, var3_3 / 3) : var25_6.i0(var8_11);
                                if (var3_3 != -1) break block39;
                                var3_3 = 0;
                                break block38;
                            }
                            var18_22 = var25_6.a[var3_3 + 1];
                            var17_21 = S.v0(var18_22);
                            var20_24 = S.X(var18_22);
                            if (var17_21 > 17) break block40;
                            var10_12 = var25_6.a[var3_3 + 2];
                            var15_19 = 1 << (var10_12 >>> 20);
                            var14_18 = var10_12 & 1048575;
                            var11_16 = var6_13;
                            var10_12 = var7_14;
                            if (var14_18 != var7_14) {
                                if (var7_14 != 1048575) {
                                    var22_10.putInt(var23_7, (long)var7_14, var6_13);
                                }
                                if (var14_18 != 1048575) {
                                    var6_13 = var22_10.getInt(var23_7, (long)var14_18);
                                }
                                var10_12 = var14_18;
                                var11_16 = var6_13;
                            }
                            switch (var17_21) lbl-1000:
                            // 6 sources

                            {
                                default: {
                                    break;
                                }
                                case 16: {
                                    if (var16_20 != 0) ** GOTO lbl-1000
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.K(var24_8, var9_15, var5_5);
                                    var22_10.putLong(var1_1, var20_24, com.google.crypto.tink.shaded.protobuf.i.c(var5_5.b));
                                    var9_15 = var11_16 | var15_19;
                                    var7_14 = var3_3;
                                    var7_14 = var10_12;
lbl51:
                                    // 4 sources

                                    while (true) {
                                        var10_12 = var8_11;
                                        var26_25 = var25_6;
                                        var25_6 = var23_7;
                                        var10_12 = var6_13;
lbl56:
                                        // 2 sources

                                        while (true) {
                                            var6_13 = var8_11;
                                            var8_11 = var10_12;
                                            var10_12 = var6_13;
                                            var6_13 = var9_15;
                                            var23_7 = var25_6;
                                            var25_6 = var26_25;
                                            continue block15;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                case 15: {
                                    if (var16_20 != 0) ** GOTO lbl-1000
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.H(var24_8, var9_15, var5_5);
                                    var22_10.putInt(var23_7, var20_24, com.google.crypto.tink.shaded.protobuf.i.b(var5_5.a));
lbl68:
                                    // 2 sources

                                    while (true) {
                                        var9_15 = var11_16 | var15_19;
lbl70:
                                        // 4 sources

                                        while (true) {
                                            var7_14 = var3_3;
                                            var7_14 = var10_12;
                                            ** GOTO lbl51
                                            break;
                                        }
                                        break;
                                    }
                                }
                                case 12: {
                                    if (var16_20 != 0) ** GOTO lbl-1000
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.H(var24_8, var9_15, var5_5);
                                    var22_10.putInt(var23_7, var20_24, var5_5.a);
lbl78:
                                    // 2 sources

                                    while (true) {
                                        var9_15 = var11_16 | var15_19;
                                        ** GOTO lbl70
                                        break;
                                    }
                                }
                                case 10: {
                                    if (var16_20 != 2) ** GOTO lbl-1000
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.b(var24_8, var9_15, var5_5);
                                    var22_10.putObject(var23_7, var20_24, var5_5.c);
                                    ** continue;
                                }
                                case 9: {
                                    if (var16_20 != 2) ** GOTO lbl-1000
                                    var26_25 = super.R(var23_7, var3_3);
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.N(var26_25, super.u(var3_3), var2_2, var9_15, var4_4, var5_5);
                                    super.t0(var23_7, var3_3, var26_25);
                                    ** continue;
                                }
                                case 8: {
                                    if (var16_20 != 2) break;
                                    var6_13 = (0x20000000 & var18_22) == 0 ? com.google.crypto.tink.shaded.protobuf.e.B(var24_8, var9_15, var5_5) : com.google.crypto.tink.shaded.protobuf.e.E(var24_8, var9_15, var5_5);
                                    var22_10.putObject(var23_7, var20_24, var5_5.c);
lbl96:
                                    // 5 sources

                                    while (true) {
                                        var9_15 = var11_16 | var15_19;
                                        ** GOTO lbl70
                                        break;
                                    }
                                }
                                case 7: {
                                    var19_23 = true;
                                    if (var16_20 != 0) break;
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.K(var24_8, var9_15, var5_5);
                                    if (var5_5.b == 0L) {
                                        var19_23 = false;
                                    }
                                    o0.H(var23_7, var20_24, var19_23);
                                    var9_15 = var11_16 | var15_19;
                                    ** continue;
                                }
                                case 6: 
                                case 13: {
                                    if (var16_20 != 5) break;
                                    var22_10.putInt(var23_7, var20_24, com.google.crypto.tink.shaded.protobuf.e.g(var24_8, var9_15));
                                    var6_13 = var9_15 + 4;
                                    ** GOTO lbl96
                                }
                                case 5: 
                                case 14: {
                                    if (var16_20 != 1) break;
                                    var22_10.putLong(var1_1, var20_24, com.google.crypto.tink.shaded.protobuf.e.i(var24_8, var9_15));
lbl116:
                                    // 2 sources

                                    while (true) {
                                        var6_13 = var9_15 + 8;
                                        ** GOTO lbl96
                                        break;
                                    }
                                }
                                case 4: 
                                case 11: {
                                    if (var16_20 != 0) break;
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.H(var24_8, var9_15, var5_5);
                                    var22_10.putInt(var23_7, var20_24, var5_5.a);
                                    ** GOTO lbl96
                                }
                                case 2: 
                                case 3: {
                                    if (var16_20 != 0) break;
                                    var6_13 = com.google.crypto.tink.shaded.protobuf.e.K(var24_8, var9_15, var5_5);
                                    var22_10.putLong(var1_1, var20_24, var5_5.b);
                                    var9_15 = var11_16 | var15_19;
                                    var7_14 = var3_3;
                                    var7_14 = var10_12;
                                    ** GOTO lbl51
                                }
                                case 1: {
                                    if (var16_20 != 5) break;
                                    o0.O(var23_7, var20_24, com.google.crypto.tink.shaded.protobuf.e.k(var24_8, var9_15));
                                    var6_13 = var9_15 + 4;
                                    ** continue;
                                }
                                case 0: {
                                    if (var16_20 != 1) break;
                                    o0.N(var23_7, var20_24, com.google.crypto.tink.shaded.protobuf.e.d(var24_8, var9_15));
                                    ** continue;
                                }
                            }
                            var6_13 = var11_16;
                            var7_14 = var10_12;
                            break block38;
                        }
                        if (var17_21 != 27) break block41;
                        if (var16_20 == 2) {
                            var27_26 = (z.d)var22_10.getObject(var23_7, var20_24);
                            var26_25 = var27_26;
                            if (!var27_26.i()) {
                                var10_12 = var27_26.size();
                                var10_12 = var10_12 == 0 ? 10 : (var10_12 *= 2);
                                var26_25 = var27_26.f(var10_12);
                                var22_10.putObject(var23_7, var20_24, var26_25);
                            }
                            var10_12 = com.google.crypto.tink.shaded.protobuf.e.p(super.u(var3_3), var13_17, var2_2, var9_15, var4_4, (z.d)var26_25, var5_5);
                            var9_15 = var3_3;
                            var9_15 = var6_13;
                            var6_13 = var10_12;
                            ** continue;
                        }
                        break block38;
                    }
                    if (var17_21 <= 49) {
                        var10_12 = var11_16 = this.h0(var1_1, var2_2, var9_15, var4_4, var13_17, var8_11, var16_20, var3_3, var18_22, var17_21, var20_24, var5_5);
                        if (var11_16 != var9_15) {
                            var9_15 = var11_16;
lbl165:
                            // 3 sources

                            while (true) {
                                var10_12 = var8_11;
lbl167:
                                // 2 sources

                                while (true) {
                                    var10_12 = var8_11;
                                    var23_7 = this;
                                    var25_6 = var1_1;
                                    var12_9 = var4_4;
                                    var24_8 = var2_2;
                                    var10_12 = var9_15;
                                    var9_15 = var6_13;
                                    var26_25 = var23_7;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                        }
lbl177:
                        // 4 sources

                        while (true) {
                            var9_15 = var10_12;
                            break block38;
                            break;
                        }
                    }
                    if (var17_21 != 50) break block42;
                    if (var16_20 != 2) break block38;
                    var10_12 = var11_16 = this.d0(var1_1, var2_2, var9_15, var4_4, var3_3, var20_24, var5_5);
                    if (var11_16 == var9_15) ** GOTO lbl177
                    var9_15 = var11_16;
                    ** GOTO lbl165
                }
                var10_12 = var11_16 = this.e0(var1_1, var2_2, var9_15, var4_4, var13_17, var8_11, var16_20, var18_22, var17_21, var20_24, var3_3, var5_5);
                if (var11_16 == var9_15) ** continue;
                var9_15 = var11_16;
                ** continue;
            }
            var10_12 = com.google.crypto.tink.shaded.protobuf.e.F(var13_17, var2_2, var9_15, var4_4, S.v(var1_1), var5_5);
            var9_15 = var8_11;
            var9_15 = var10_12;
            ** continue;
        }
        if (var7_14 != 1048575) {
            var22_10.putInt(var1_1, (long)var7_14, var6_13);
        }
        if (var8_11 == var4_4) {
            return var8_11;
        }
        throw A.h();
    }

    private int h0(Object object, byte[] byArray, int n3, int n4, int n5, int n6, int n7, int n8, long l2, int n9, long l3, e.a a2) {
        z.d d2;
        Unsafe unsafe = s;
        z.d d3 = d2 = (z.d)unsafe.getObject(object, l3);
        if (!d2.i()) {
            int n10 = d2.size();
            n10 = n10 == 0 ? 10 : (n10 *= 2);
            d3 = d2.f(n10);
            unsafe.putObject(object, l3, (Object)d3);
        }
        switch (n9) {
            default: {
                break;
            }
            case 49: {
                if (n7 != 3) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.n(this.u(n8), n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 34: 
            case 48: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.w(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.A(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 33: 
            case 47: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.v(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.z(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 30: 
            case 44: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.x(byArray, n3, d3, a2);
                } else {
                    if (n7 != 0) break;
                    n3 = com.google.crypto.tink.shaded.protobuf.e.I(n5, byArray, n3, n4, d3, a2);
                }
                this.s(n8);
                g0.z(object, n6, d3, null, null, this.o);
                break;
            }
            case 28: {
                if (n7 != 2) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.c(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 27: {
                if (n7 != 2) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.p(this.u(n8), n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 26: {
                if (n7 != 2) break;
                if ((l2 & 0x20000000L) == 0L) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.C(n5, byArray, n3, n4, d3, a2);
                    break;
                }
                n3 = com.google.crypto.tink.shaded.protobuf.e.D(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 25: 
            case 42: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.q(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.a(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 24: 
            case 31: 
            case 41: 
            case 45: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.s(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 5) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.h(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 23: 
            case 32: 
            case 40: 
            case 46: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.t(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 1) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.j(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.x(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.I(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.y(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 0) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.L(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 19: 
            case 36: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.u(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 5) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.l(n5, byArray, n3, n4, d3, a2);
                break;
            }
            case 18: 
            case 35: {
                if (n7 == 2) {
                    n3 = com.google.crypto.tink.shaded.protobuf.e.r(byArray, n3, d3, a2);
                    break;
                }
                if (n7 != 1) break;
                n3 = com.google.crypto.tink.shaded.protobuf.e.e(n5, byArray, n3, n4, d3, a2);
                break;
            }
        }
        return n3;
    }

    private int i0(int n3) {
        if (n3 >= this.c && n3 <= this.d) {
            return this.s0(n3, 0);
        }
        return -1;
    }

    private int j0(int n3, int n4) {
        if (n3 >= this.c && n3 <= this.d) {
            return this.s0(n3, n4);
        }
        return -1;
    }

    private boolean k(Object object, Object object2, int n3) {
        boolean bl = this.B(object, n3) == this.B(object2, n3);
        return bl;
    }

    private int k0(int n3) {
        return this.a[n3 + 2];
    }

    private static boolean l(Object object, long l2) {
        return o0.r(object, l2);
    }

    private void l0(Object object, long l2, d0 d02, e0 e02, p p2) {
        d02.B(this.n.e(object, l2), e02, p2);
    }

    private static void m(Object object) {
        if (S.G(object)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutating immutable message: ");
        stringBuilder.append(object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void m0(Object object, int n3, d0 d02, e0 e02, p p2) {
        long l2 = S.X(n3);
        d02.C(this.n.e(object, l2), e02, p2);
    }

    private int n(byte[] byArray, int n3, int n4, H.a a2, Map map, e.a a3) {
        int n5 = com.google.crypto.tink.shaded.protobuf.e.H(byArray, n3, a3);
        n3 = a3.a;
        if (n3 >= 0 && n3 <= n4 - n5) {
            throw null;
        }
        throw A.m();
    }

    private void n0(Object object, int n3, d0 d02) {
        if (S.A(n3)) {
            o0.R(object, S.X(n3), d02.E());
        } else if (this.g) {
            o0.R(object, S.X(n3), d02.A());
        } else {
            o0.R(object, S.X(n3), d02.c());
        }
    }

    private static double o(Object object, long l2) {
        return o0.x(object, l2);
    }

    private void o0(Object object, int n3, d0 d02) {
        if (S.A(n3)) {
            d02.b(this.n.e(object, S.X(n3)));
        } else {
            d02.M(this.n.e(object, S.X(n3)));
        }
    }

    private boolean p(Object object, Object object2, int n3) {
        int n4 = this.w0(n3);
        long l2 = S.X(n4);
        n4 = S.v0(n4);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        boolean bl17 = false;
        boolean bl18 = false;
        boolean bl19 = false;
        switch (n4) {
            default: {
                return true;
            }
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 65: 
            case 66: 
            case 67: 
            case 68: {
                boolean bl20 = bl19;
                if (this.H(object, object2, n3)) {
                    bl20 = bl19;
                    if (g0.J(o0.C(object, l2), o0.C(object2, l2))) {
                        bl20 = true;
                    }
                }
                return bl20;
            }
            case 50: {
                return g0.J(o0.C(object, l2), o0.C(object2, l2));
            }
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: 
            case 48: 
            case 49: {
                return g0.J(o0.C(object, l2), o0.C(object2, l2));
            }
            case 17: {
                boolean bl21 = bl;
                if (this.k(object, object2, n3)) {
                    bl21 = bl;
                    if (g0.J(o0.C(object, l2), o0.C(object2, l2))) {
                        bl21 = true;
                    }
                }
                return bl21;
            }
            case 16: {
                boolean bl22 = bl2;
                if (this.k(object, object2, n3)) {
                    bl22 = bl2;
                    if (o0.A(object, l2) == o0.A(object2, l2)) {
                        bl22 = true;
                    }
                }
                return bl22;
            }
            case 15: {
                boolean bl23 = bl3;
                if (this.k(object, object2, n3)) {
                    bl23 = bl3;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl23 = true;
                    }
                }
                return bl23;
            }
            case 14: {
                boolean bl24 = bl4;
                if (this.k(object, object2, n3)) {
                    bl24 = bl4;
                    if (o0.A(object, l2) == o0.A(object2, l2)) {
                        bl24 = true;
                    }
                }
                return bl24;
            }
            case 13: {
                boolean bl25 = bl5;
                if (this.k(object, object2, n3)) {
                    bl25 = bl5;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl25 = true;
                    }
                }
                return bl25;
            }
            case 12: {
                boolean bl26 = bl6;
                if (this.k(object, object2, n3)) {
                    bl26 = bl6;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl26 = true;
                    }
                }
                return bl26;
            }
            case 11: {
                boolean bl27 = bl7;
                if (this.k(object, object2, n3)) {
                    bl27 = bl7;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl27 = true;
                    }
                }
                return bl27;
            }
            case 10: {
                boolean bl28 = bl8;
                if (this.k(object, object2, n3)) {
                    bl28 = bl8;
                    if (g0.J(o0.C(object, l2), o0.C(object2, l2))) {
                        bl28 = true;
                    }
                }
                return bl28;
            }
            case 9: {
                boolean bl29 = bl9;
                if (this.k(object, object2, n3)) {
                    bl29 = bl9;
                    if (g0.J(o0.C(object, l2), o0.C(object2, l2))) {
                        bl29 = true;
                    }
                }
                return bl29;
            }
            case 8: {
                boolean bl30 = bl10;
                if (this.k(object, object2, n3)) {
                    bl30 = bl10;
                    if (g0.J(o0.C(object, l2), o0.C(object2, l2))) {
                        bl30 = true;
                    }
                }
                return bl30;
            }
            case 7: {
                boolean bl31 = bl11;
                if (this.k(object, object2, n3)) {
                    bl31 = bl11;
                    if (o0.r(object, l2) == o0.r(object2, l2)) {
                        bl31 = true;
                    }
                }
                return bl31;
            }
            case 6: {
                boolean bl32 = bl12;
                if (this.k(object, object2, n3)) {
                    bl32 = bl12;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl32 = true;
                    }
                }
                return bl32;
            }
            case 5: {
                boolean bl33 = bl13;
                if (this.k(object, object2, n3)) {
                    bl33 = bl13;
                    if (o0.A(object, l2) == o0.A(object2, l2)) {
                        bl33 = true;
                    }
                }
                return bl33;
            }
            case 4: {
                boolean bl34 = bl14;
                if (this.k(object, object2, n3)) {
                    bl34 = bl14;
                    if (o0.z(object, l2) == o0.z(object2, l2)) {
                        bl34 = true;
                    }
                }
                return bl34;
            }
            case 3: {
                boolean bl35 = bl15;
                if (this.k(object, object2, n3)) {
                    bl35 = bl15;
                    if (o0.A(object, l2) == o0.A(object2, l2)) {
                        bl35 = true;
                    }
                }
                return bl35;
            }
            case 2: {
                boolean bl36 = bl16;
                if (this.k(object, object2, n3)) {
                    bl36 = bl16;
                    if (o0.A(object, l2) == o0.A(object2, l2)) {
                        bl36 = true;
                    }
                }
                return bl36;
            }
            case 1: {
                boolean bl37 = bl17;
                if (this.k(object, object2, n3)) {
                    bl37 = bl17;
                    if (Float.floatToIntBits((float)o0.y(object, l2)) == Float.floatToIntBits((float)o0.y(object2, l2))) {
                        bl37 = true;
                    }
                }
                return bl37;
            }
            case 0: 
        }
        boolean bl38 = bl18;
        if (this.k(object, object2, n3)) {
            bl38 = bl18;
            if (Double.doubleToLongBits((double)o0.x(object, l2)) == Double.doubleToLongBits((double)o0.x(object2, l2))) {
                bl38 = true;
            }
        }
        return bl38;
    }

    private static Field p0(Class clazz, String string) {
        try {
            Field field = clazz.getDeclaredField(string);
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Field field;
            Object[] objectArray = clazz.getDeclaredFields();
            int n3 = objectArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                field = objectArray[i2];
                if (!string.equals((Object)field.getName())) continue;
                return field;
            }
            field = new StringBuilder();
            field.append("Field ");
            field.append(string);
            field.append(" for ");
            field.append(clazz.getName());
            field.append(" not found. Known fields are ");
            field.append(Arrays.toString((Object[])objectArray));
            throw new RuntimeException(field.toString());
        }
    }

    private Object q(Object object, int n3, Object object2, k0 k02, Object object3) {
        this.W(n3);
        if (o0.C(object, S.X(this.w0(n3))) == null) {
            return object2;
        }
        this.s(n3);
        return object2;
    }

    private void q0(Object object, int n3) {
        long l2 = 0xFFFFF & (n3 = this.k0(n3));
        if (l2 == 1048575L) {
            return;
        }
        o0.P(object, l2, 1 << (n3 >>> 20) | o0.z(object, l2));
    }

    private static float r(Object object, long l2) {
        return o0.y(object, l2);
    }

    private void r0(Object object, int n3, int n4) {
        o0.P(object, this.k0(n4) & 0xFFFFF, n3);
    }

    private z.c s(int n3) {
        f.c.a(this.b[n3 / 3 * 2 + 1]);
        return null;
    }

    private int s0(int n3, int n4) {
        int n5 = this.a.length / 3 - 1;
        while (n4 <= n5) {
            int n6 = n5 + n4 >>> 1;
            int n7 = n6 * 3;
            int n8 = this.W(n7);
            if (n3 == n8) {
                return n7;
            }
            if (n3 < n8) {
                n5 = n6 - 1;
                continue;
            }
            n4 = n6 + 1;
        }
        return -1;
    }

    private Object t(int n3) {
        return this.b[n3 / 3 * 2];
    }

    private void t0(Object object, int n3, Object object2) {
        s.putObject(object, S.X(this.w0(n3)), object2);
        this.q0(object, n3);
    }

    private e0 u(int n3) {
        e0 e02 = (e0)this.b[n3 = n3 / 3 * 2];
        if (e02 != null) {
            return e02;
        }
        e02 = a0.a().c((Class)this.b[n3 + 1]);
        this.b[n3] = e02;
        return e02;
    }

    private void u0(Object object, int n3, int n4, Object object2) {
        s.putObject(object, S.X(this.w0(n4)), object2);
        this.r0(object, n3, n4);
    }

    static l0 v(Object object) {
        x x2 = (x)object;
        l0 l02 = x2.unknownFields;
        object = l02;
        if (l02 == l0.c()) {
            x2.unknownFields = object = l0.k();
        }
        return object;
    }

    private static int v0(int n3) {
        return (n3 & 0xFF00000) >>> 20;
    }

    /*
     * Unable to fully structure code
     */
    private int w(Object var1_1) {
        var17_2 = S.s;
        var5_4 = 0;
        var4_5 = 1048575;
        var8_6 = 0;
        for (var6_3 = 0; var6_3 < this.a.length; var6_3 += 3) {
            var13_14 = this.w0(var6_3);
            var12_13 = this.W(var6_3);
            var14_15 = S.v0(var13_14);
            if (var14_15 <= 17) {
                var10_11 = this.a[var6_3 + 2];
                var11_12 = var10_11 & 1048575;
                var2_7 = 1 << (var10_11 >>> 20);
                var7_9 = var4_5;
                var3_8 = var10_11;
                var9_10 = var2_7;
                if (var11_12 != var4_5) {
                    var8_6 = var17_2.getInt(var1_1, (long)var11_12);
                    var7_9 = var11_12;
                    var3_8 = var10_11;
                    var9_10 = var2_7;
                }
            } else if (this.i && var14_15 >= u.DOUBLE_LIST_PACKED.a() && var14_15 <= u.SINT64_LIST_PACKED.a()) {
                var2_7 = this.a[var6_3 + 2] & 1048575;
lbl24:
                // 2 sources

                while (true) {
                    var9_10 = 0;
                    var7_9 = var4_5;
                    var3_8 = var2_7;
                    break;
                }
            } else {
                var2_7 = 0;
                ** continue;
            }
            var15_16 = S.X(var13_14);
            block0 : switch (var14_15) {
                default: {
                    var2_7 = var5_4;
                    break;
                }
                case 68: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.r(var12_13, (O)var17_2.getObject(var1_1, var15_16), this.u(var6_3));
lbl40:
                    // 47 sources

                    while (true) {
                        var2_7 = var5_4 + var2_7;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.H(var12_13, S.c0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 66: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.F(var12_13, S.b0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 65: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.D(var12_13, 0L);
                    ** GOTO lbl40
                }
                case 64: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.B(var12_13, 0);
lbl62:
                    // 4 sources

                    while (true) {
                        var2_7 = var5_4 + var2_7;
                        break block0;
                        break;
                    }
                }
                case 63: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.j(var12_13, S.b0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 62: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.M(var12_13, S.b0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 61: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.f(var12_13, (h)var17_2.getObject(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 60: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = g0.o(var12_13, var17_2.getObject(var1_1, var15_16), this.u(var6_3));
                    ** GOTO lbl40
                }
                case 59: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var18_17 = var17_2.getObject(var1_1, var15_16);
                    if (!(var18_17 instanceof h)) ** GOTO lbl92
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.f(var12_13, (h)var18_17);
                    ** GOTO lbl40
lbl92:
                    // 1 sources

                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.J(var12_13, (String)var18_17);
                    ** GOTO lbl40
                }
                case 58: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.d(var12_13, true);
                    ** GOTO lbl40
                }
                case 57: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.l(var12_13, 0);
                    ** GOTO lbl62
                }
                case 56: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.n(var12_13, 0L);
                    ** GOTO lbl40
                }
                case 55: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.t(var12_13, S.b0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 54: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.O(var12_13, S.c0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 53: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.v(var12_13, S.c0(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 52: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.p(var12_13, 0.0f);
                    ** GOTO lbl40
                }
                case 51: {
                    var2_7 = var5_4;
                    if (!this.I(var1_1, var12_13, var6_3)) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.h(var12_13, 0.0);
                    ** GOTO lbl40
                }
                case 50: {
                    var2_7 = this.q.d(var12_13, var17_2.getObject(var1_1, var15_16), this.t(var6_3));
                    ** GOTO lbl40
                }
                case 49: {
                    var2_7 = g0.j(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.u(var6_3));
                    ** GOTO lbl40
                }
                case 48: {
                    var9_10 = g0.t((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var9_10 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var9_10);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var4_5 = com.google.crypto.tink.shaded.protobuf.k.N(var9_10);
                    var2_7 = var9_10;
lbl149:
                    // 14 sources

                    while (true) {
                        var2_7 = var3_8 + var4_5 + var2_7;
                        ** GOTO lbl62
                        break;
                    }
                }
                case 47: {
                    var4_5 = g0.r((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 46: {
                    var4_5 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 45: {
                    var4_5 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 44: {
                    var4_5 = g0.e((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 43: {
                    var4_5 = g0.w((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 42: {
                    var4_5 = g0.b((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 41: {
                    var4_5 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 40: {
                    var4_5 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 39: {
                    var4_5 = g0.l((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 38: {
                    var4_5 = g0.y((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 37: {
                    var4_5 = g0.n((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 36: {
                    var4_5 = g0.g((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** GOTO lbl149
                }
                case 35: {
                    var4_5 = g0.i((List)var17_2.getObject(var1_1, var15_16));
                    var2_7 = var5_4;
                    if (var4_5 <= 0) break;
                    if (this.i) {
                        var17_2.putInt(var1_1, (long)var3_8, var4_5);
                    }
                    var3_8 = com.google.crypto.tink.shaded.protobuf.k.L(var12_13);
                    var9_10 = com.google.crypto.tink.shaded.protobuf.k.N(var4_5);
                    var2_7 = var4_5;
                    var4_5 = var9_10;
                    ** continue;
                }
                case 34: {
                    var2_7 = g0.s(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 33: {
                    var2_7 = g0.q(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 32: {
                    var2_7 = g0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 31: {
                    var2_7 = g0.f(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 30: {
                    var2_7 = g0.d(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 29: {
                    var2_7 = g0.v(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 28: {
                    var2_7 = g0.c(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 27: {
                    var2_7 = g0.p(var12_13, (List)var17_2.getObject(var1_1, var15_16), this.u(var6_3));
                    ** GOTO lbl40
                }
                case 26: {
                    var2_7 = g0.u(var12_13, (List)var17_2.getObject(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 25: {
                    var2_7 = g0.a(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 24: {
                    var2_7 = g0.f(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 23: {
                    var2_7 = g0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 22: {
                    var2_7 = g0.k(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 21: {
                    var2_7 = g0.x(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 20: {
                    var2_7 = g0.m(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 19: {
                    var2_7 = g0.f(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 18: {
                    var2_7 = g0.h(var12_13, (List)var17_2.getObject(var1_1, var15_16), false);
                    ** GOTO lbl40
                }
                case 17: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.r(var12_13, (O)var17_2.getObject(var1_1, var15_16), this.u(var6_3));
                    ** GOTO lbl40
                }
                case 16: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.H(var12_13, var17_2.getLong(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 15: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.F(var12_13, var17_2.getInt(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 14: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.D(var12_13, 0L);
                    ** GOTO lbl40
                }
                case 13: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.B(var12_13, 0);
                    ** continue;
                }
                case 12: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.j(var12_13, var17_2.getInt(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 11: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.M(var12_13, var17_2.getInt(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 10: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.f(var12_13, (h)var17_2.getObject(var1_1, var15_16));
                    ** GOTO lbl40
                }
                case 9: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = g0.o(var12_13, var17_2.getObject(var1_1, var15_16), this.u(var6_3));
                    ** GOTO lbl40
                }
                case 8: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var18_17 = var17_2.getObject(var1_1, var15_16);
                    if (!(var18_17 instanceof h)) ** GOTO lbl398
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.f(var12_13, (h)var18_17);
                    ** GOTO lbl40
lbl398:
                    // 1 sources

                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.J(var12_13, (String)var18_17);
                    ** GOTO lbl40
                }
                case 7: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.d(var12_13, true);
                    ** continue;
                }
                case 6: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.l(var12_13, 0);
lbl409:
                    // 7 sources

                    while (true) {
                        var2_7 = var5_4 + var2_7;
                        break block0;
                        break;
                    }
                }
                case 5: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.n(var12_13, 0L);
                    ** GOTO lbl409
                }
                case 4: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.t(var12_13, var17_2.getInt(var1_1, var15_16));
                    ** GOTO lbl409
                }
                case 3: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.O(var12_13, var17_2.getLong(var1_1, var15_16));
                    ** GOTO lbl409
                }
                case 2: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.v(var12_13, var17_2.getLong(var1_1, var15_16));
                    ** GOTO lbl409
                }
                case 1: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.p(var12_13, 0.0f);
                    ** GOTO lbl409
                }
                case 0: {
                    var2_7 = var5_4;
                    if ((var8_6 & var9_10) == 0) break;
                    var2_7 = com.google.crypto.tink.shaded.protobuf.k.h(var12_13, 0.0);
                    ** continue;
                }
            }
            var5_4 = var2_7;
            var4_5 = var7_9;
        }
        var2_7 = var3_8 = var5_4 + this.y(this.o, var1_1);
        if (this.f) {
            var2_7 = var3_8 + this.p.c(var1_1).c();
        }
        return var2_7;
    }

    private int w0(int n3) {
        return this.a[n3 + 1];
    }

    /*
     * Unable to fully structure code
     */
    private int x(Object var1_1) {
        var11_2 = S.s;
        var5_4 = 0;
        for (var6_3 = 0; var6_3 < this.a.length; var6_3 += 3) {
            var2_5 = this.w0(var6_3);
            var3_6 = S.v0(var2_5);
            var8_9 = this.W(var6_3);
            var9_10 = S.X(var2_5);
            var2_5 = var3_6 >= u.DOUBLE_LIST_PACKED.a() && var3_6 <= u.SINT64_LIST_PACKED.a() ? this.a[var6_3 + 2] & 1048575 : 0;
            block0 : switch (var3_6) {
                default: {
                    var3_6 = var5_4;
                    break;
                }
                case 68: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.r(var8_9, (O)o0.C(var1_1, var9_10), this.u(var6_3));
lbl17:
                    // 58 sources

                    while (true) {
                        var3_6 = var5_4 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.H(var8_9, S.c0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 66: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.F(var8_9, S.b0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 65: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.D(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 64: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.B(var8_9, 0);
                    ** GOTO lbl17
                }
                case 63: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.j(var8_9, S.b0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 62: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.M(var8_9, S.b0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 61: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.f(var8_9, (h)o0.C(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 60: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = g0.o(var8_9, o0.C(var1_1, var9_10), this.u(var6_3));
                    ** GOTO lbl17
                }
                case 59: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var12_11 = o0.C(var1_1, var9_10);
                    if (!(var12_11 instanceof h)) ** GOTO lbl67
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.f(var8_9, (h)var12_11);
                    ** GOTO lbl17
lbl67:
                    // 1 sources

                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.J(var8_9, (String)var12_11);
                    ** GOTO lbl17
                }
                case 58: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.d(var8_9, true);
                    ** GOTO lbl17
                }
                case 57: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.l(var8_9, 0);
                    ** GOTO lbl17
                }
                case 56: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.n(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 55: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.t(var8_9, S.b0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 54: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.O(var8_9, S.c0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 53: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.v(var8_9, S.c0(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 52: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.p(var8_9, 0.0f);
                    ** GOTO lbl17
                }
                case 51: {
                    var3_6 = var5_4;
                    if (!this.I(var1_1, var8_9, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.h(var8_9, 0.0);
                    ** GOTO lbl17
                }
                case 50: {
                    var2_5 = this.q.d(var8_9, o0.C(var1_1, var9_10), this.t(var6_3));
                    ** GOTO lbl17
                }
                case 49: {
                    var2_5 = g0.j(var8_9, S.K(var1_1, var9_10), this.u(var6_3));
                    ** GOTO lbl17
                }
                case 48: {
                    var7_8 = g0.t((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var7_8 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var7_8);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var4_7 = com.google.crypto.tink.shaded.protobuf.k.N(var7_8);
                    var3_6 = var7_8;
lbl124:
                    // 14 sources

                    while (true) {
                        var2_5 = var2_5 + var4_7 + var3_6;
                        ** GOTO lbl17
                        break;
                    }
                }
                case 47: {
                    var4_7 = g0.r((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 46: {
                    var4_7 = g0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 45: {
                    var4_7 = g0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 44: {
                    var4_7 = g0.e((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 43: {
                    var4_7 = g0.w((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 42: {
                    var4_7 = g0.b((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 41: {
                    var4_7 = g0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 40: {
                    var4_7 = g0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 39: {
                    var4_7 = g0.l((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 38: {
                    var4_7 = g0.y((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 37: {
                    var4_7 = g0.n((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 36: {
                    var4_7 = g0.g((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** GOTO lbl124
                }
                case 35: {
                    var4_7 = g0.i((List)var11_2.getObject(var1_1, var9_10));
                    var3_6 = var5_4;
                    if (var4_7 <= 0) break;
                    if (this.i) {
                        var11_2.putInt(var1_1, (long)var2_5, var4_7);
                    }
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.L(var8_9);
                    var7_8 = com.google.crypto.tink.shaded.protobuf.k.N(var4_7);
                    var3_6 = var4_7;
                    var4_7 = var7_8;
                    ** continue;
                }
                case 34: {
                    var2_5 = g0.s(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 33: {
                    var2_5 = g0.q(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 32: {
                    var2_5 = g0.h(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 31: {
                    var2_5 = g0.f(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 30: {
                    var2_5 = g0.d(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 29: {
                    var2_5 = g0.v(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 28: {
                    var2_5 = g0.c(var8_9, S.K(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 27: {
                    var2_5 = g0.p(var8_9, S.K(var1_1, var9_10), this.u(var6_3));
                    ** GOTO lbl17
                }
                case 26: {
                    var2_5 = g0.u(var8_9, S.K(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 25: {
                    var2_5 = g0.a(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 24: {
                    var2_5 = g0.f(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 23: {
                    var2_5 = g0.h(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 22: {
                    var2_5 = g0.k(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 21: {
                    var2_5 = g0.x(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 20: {
                    var2_5 = g0.m(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 19: {
                    var2_5 = g0.f(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 18: {
                    var2_5 = g0.h(var8_9, S.K(var1_1, var9_10), false);
                    ** GOTO lbl17
                }
                case 17: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.r(var8_9, (O)o0.C(var1_1, var9_10), this.u(var6_3));
                    ** GOTO lbl17
                }
                case 16: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.H(var8_9, o0.A(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 15: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.F(var8_9, o0.z(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 14: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.D(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 13: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.B(var8_9, 0);
                    ** GOTO lbl17
                }
                case 12: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.j(var8_9, o0.z(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 11: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.M(var8_9, o0.z(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 10: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.f(var8_9, (h)o0.C(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 9: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = g0.o(var8_9, o0.C(var1_1, var9_10), this.u(var6_3));
                    ** GOTO lbl17
                }
                case 8: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var12_11 = o0.C(var1_1, var9_10);
                    if (!(var12_11 instanceof h)) ** GOTO lbl373
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.f(var8_9, (h)var12_11);
                    ** GOTO lbl17
lbl373:
                    // 1 sources

                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.J(var8_9, (String)var12_11);
                    ** GOTO lbl17
                }
                case 7: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.d(var8_9, true);
                    ** GOTO lbl17
                }
                case 6: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.l(var8_9, 0);
                    ** GOTO lbl17
                }
                case 5: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.n(var8_9, 0L);
                    ** GOTO lbl17
                }
                case 4: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.t(var8_9, o0.z(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 3: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.O(var8_9, o0.A(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 2: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.v(var8_9, o0.A(var1_1, var9_10));
                    ** GOTO lbl17
                }
                case 1: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.p(var8_9, 0.0f);
                    ** GOTO lbl17
                }
                case 0: {
                    var3_6 = var5_4;
                    if (!this.B(var1_1, var6_3)) break;
                    var2_5 = com.google.crypto.tink.shaded.protobuf.k.h(var8_9, 0.0);
                    ** continue;
                }
            }
            var5_4 = var3_6;
        }
        return var5_4 + this.y(this.o, var1_1);
    }

    /*
     * Unable to fully structure code
     */
    private void x0(Object var1_1, r0 var2_2) {
        if (this.f && !(var15_3 = this.p.c(var1_1)).d()) {
            var17_4 = var15_3.f();
            var15_3 = (Map.Entry)var17_4.next();
        } else {
            var17_4 = null;
            var15_3 = null;
        }
        var8_5 = this.a.length;
        var18_6 = S.s;
        var6_7 = 0;
        var4_8 = 1048575;
        var3_9 = 0;
        while (true) {
            var16_17 = var15_3;
            if (var6_7 >= var8_5) break;
            var10_13 = this.w0(var6_7);
            var9_12 = this.W(var6_7);
            var11_14 = S.v0(var10_13);
            if (var11_14 <= 17) {
                var12_15 = this.a[var6_7 + 2];
                var7_11 = var12_15 & 1048575;
                var5_10 = var4_8;
                if (var7_11 != var4_8) {
                    var3_9 = var18_6.getInt(var1_1, (long)var7_11);
                    var5_10 = var7_11;
                }
                var7_11 = 1 << (var12_15 >>> 20);
                var4_8 = var5_10;
            } else {
                var7_11 = 0;
            }
            while (var15_3 != null && this.p.a((Map.Entry)var15_3) <= var9_12) {
                this.p.j(var2_2, (Map.Entry)var15_3);
                if (var17_4.hasNext()) {
                    var15_3 = (Map.Entry)var17_4.next();
                    continue;
                }
                var15_3 = null;
            }
            var13_16 = S.X(var10_13);
            switch (var11_14) lbl-1000:
            // 19 sources

            {
                default: {
                    break;
                }
                case 68: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.G(var9_12, var18_6.getObject(var1_1, var13_16), this.u(var6_7));
                    break;
                }
                case 67: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.o(var9_12, S.c0(var1_1, var13_16));
                    break;
                }
                case 66: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.J(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 65: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.H(var9_12, S.c0(var1_1, var13_16));
                    break;
                }
                case 64: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.r(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 63: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.A(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 62: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.k(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 61: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.a(var9_12, (h)var18_6.getObject(var1_1, var13_16));
                    break;
                }
                case 60: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.M(var9_12, var18_6.getObject(var1_1, var13_16), this.u(var6_7));
                    break;
                }
                case 59: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    this.B0(var9_12, var18_6.getObject(var1_1, var13_16), var2_2);
                    break;
                }
                case 58: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.i(var9_12, S.Y(var1_1, var13_16));
                    break;
                }
                case 57: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.C(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 56: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.j(var9_12, S.c0(var1_1, var13_16));
                    break;
                }
                case 55: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.v(var9_12, S.b0(var1_1, var13_16));
                    break;
                }
                case 54: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.x(var9_12, S.c0(var1_1, var13_16));
                    break;
                }
                case 53: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.f(var9_12, S.c0(var1_1, var13_16));
                    break;
                }
                case 52: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.p(var9_12, S.a0(var1_1, var13_16));
                    break;
                }
                case 51: {
                    if (!this.I(var1_1, var9_12, var6_7)) ** GOTO lbl-1000
                    var2_2.E(var9_12, S.Z(var1_1, var13_16));
                    break;
                }
                case 50: {
                    this.A0(var2_2, var9_12, var18_6.getObject(var1_1, var13_16), var6_7);
                    break;
                }
                case 49: {
                    g0.T(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.u(var6_7));
                    break;
                }
                case 48: {
                    g0.a0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 47: {
                    g0.Z(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 46: {
                    g0.Y(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 45: {
                    g0.X(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 44: {
                    g0.P(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 43: {
                    g0.c0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 42: {
                    g0.M(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 41: {
                    g0.Q(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 40: {
                    g0.R(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 39: {
                    g0.U(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 38: {
                    g0.d0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 37: {
                    g0.V(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 36: {
                    g0.S(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 35: {
                    g0.O(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, true);
                    break;
                }
                case 34: {
                    g0.a0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 33: {
                    g0.Z(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 32: {
                    g0.Y(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 31: {
                    g0.X(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 30: {
                    g0.P(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 29: {
                    g0.c0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 28: {
                    g0.N(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                    break;
                }
                case 27: {
                    g0.W(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, this.u(var6_7));
                    break;
                }
                case 26: {
                    g0.b0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2);
                    break;
                }
                case 25: {
                    g0.M(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 24: {
                    g0.Q(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 23: {
                    g0.R(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 22: {
                    g0.U(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 21: {
                    g0.d0(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 20: {
                    g0.V(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 19: {
                    g0.S(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 18: {
                    g0.O(this.W(var6_7), (List)var18_6.getObject(var1_1, var13_16), var2_2, false);
                    break;
                }
                case 17: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.G(var9_12, var18_6.getObject(var1_1, var13_16), this.u(var6_7));
                    break;
                }
                case 16: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.o(var9_12, var18_6.getLong(var1_1, var13_16));
                    break;
                }
                case 15: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.J(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 14: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.H(var9_12, var18_6.getLong(var1_1, var13_16));
                    break;
                }
                case 13: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.r(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 12: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.A(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 11: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.k(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 10: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.a(var9_12, (h)var18_6.getObject(var1_1, var13_16));
                    break;
                }
                case 9: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.M(var9_12, var18_6.getObject(var1_1, var13_16), this.u(var6_7));
                    break;
                }
                case 8: {
                    if ((var7_11 & var3_9) == 0) break;
                    this.B0(var9_12, var18_6.getObject(var1_1, var13_16), var2_2);
                    break;
                }
                case 7: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.i(var9_12, S.l(var1_1, var13_16));
                    break;
                }
                case 6: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.C(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 5: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.j(var9_12, var18_6.getLong(var1_1, var13_16));
                    break;
                }
                case 4: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.v(var9_12, var18_6.getInt(var1_1, var13_16));
                    break;
                }
                case 3: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.x(var9_12, var18_6.getLong(var1_1, var13_16));
                    break;
                }
                case 2: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.f(var9_12, var18_6.getLong(var1_1, var13_16));
                    break;
                }
                case 1: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.p(var9_12, S.r(var1_1, var13_16));
                    break;
                }
                case 0: {
                    if ((var7_11 & var3_9) == 0) break;
                    var2_2.E(var9_12, S.o(var1_1, var13_16));
                }
            }
            var6_7 += 3;
        }
        while (var16_17 != null) {
            this.p.j(var2_2, (Map.Entry)var16_17);
            if (var17_4.hasNext()) {
                var16_17 = (Map.Entry)var17_4.next();
                continue;
            }
            var16_17 = null;
        }
        this.C0(this.o, var1_1, var2_2);
    }

    private int y(k0 k02, Object object) {
        return k02.h(k02.g(object));
    }

    private void y0(Object object, r0 r02) {
        t t2;
        Iterator iterator;
        t t3;
        if (this.f && !(t3 = this.p.c(object)).d()) {
            iterator = t3.f();
            t3 = (Map.Entry)iterator.next();
        } else {
            iterator = null;
            t3 = null;
        }
        int n3 = this.a.length;
        int n4 = 0;
        while (true) {
            t2 = t3;
            if (n4 >= n3) break;
            int n5 = this.w0(n4);
            int n6 = this.W(n4);
            while (t3 != null && this.p.a((Map.Entry)t3) <= n6) {
                this.p.j(r02, (Map.Entry)t3);
                if (iterator.hasNext()) {
                    t3 = (Map.Entry)iterator.next();
                    continue;
                }
                t3 = null;
            }
            switch (S.v0(n5)) {
                default: {
                    break;
                }
                case 68: {
                    if (!this.I(object, n6, n4)) break;
                    r02.G(n6, o0.C(object, S.X(n5)), this.u(n4));
                    break;
                }
                case 67: {
                    if (!this.I(object, n6, n4)) break;
                    r02.o(n6, S.c0(object, S.X(n5)));
                    break;
                }
                case 66: {
                    if (!this.I(object, n6, n4)) break;
                    r02.J(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 65: {
                    if (!this.I(object, n6, n4)) break;
                    r02.H(n6, S.c0(object, S.X(n5)));
                    break;
                }
                case 64: {
                    if (!this.I(object, n6, n4)) break;
                    r02.r(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 63: {
                    if (!this.I(object, n6, n4)) break;
                    r02.A(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 62: {
                    if (!this.I(object, n6, n4)) break;
                    r02.k(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 61: {
                    if (!this.I(object, n6, n4)) break;
                    r02.a(n6, (h)o0.C(object, S.X(n5)));
                    break;
                }
                case 60: {
                    if (!this.I(object, n6, n4)) break;
                    r02.M(n6, o0.C(object, S.X(n5)), this.u(n4));
                    break;
                }
                case 59: {
                    if (!this.I(object, n6, n4)) break;
                    this.B0(n6, o0.C(object, S.X(n5)), r02);
                    break;
                }
                case 58: {
                    if (!this.I(object, n6, n4)) break;
                    r02.i(n6, S.Y(object, S.X(n5)));
                    break;
                }
                case 57: {
                    if (!this.I(object, n6, n4)) break;
                    r02.C(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 56: {
                    if (!this.I(object, n6, n4)) break;
                    r02.j(n6, S.c0(object, S.X(n5)));
                    break;
                }
                case 55: {
                    if (!this.I(object, n6, n4)) break;
                    r02.v(n6, S.b0(object, S.X(n5)));
                    break;
                }
                case 54: {
                    if (!this.I(object, n6, n4)) break;
                    r02.x(n6, S.c0(object, S.X(n5)));
                    break;
                }
                case 53: {
                    if (!this.I(object, n6, n4)) break;
                    r02.f(n6, S.c0(object, S.X(n5)));
                    break;
                }
                case 52: {
                    if (!this.I(object, n6, n4)) break;
                    r02.p(n6, S.a0(object, S.X(n5)));
                    break;
                }
                case 51: {
                    if (!this.I(object, n6, n4)) break;
                    r02.E(n6, S.Z(object, S.X(n5)));
                    break;
                }
                case 50: {
                    this.A0(r02, n6, o0.C(object, S.X(n5)), n4);
                    break;
                }
                case 49: {
                    g0.T(this.W(n4), (List)o0.C(object, S.X(n5)), r02, this.u(n4));
                    break;
                }
                case 48: {
                    g0.a0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 47: {
                    g0.Z(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 46: {
                    g0.Y(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 45: {
                    g0.X(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 44: {
                    g0.P(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 43: {
                    g0.c0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 42: {
                    g0.M(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 41: {
                    g0.Q(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 40: {
                    g0.R(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 39: {
                    g0.U(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 38: {
                    g0.d0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 37: {
                    g0.V(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 36: {
                    g0.S(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 35: {
                    g0.O(this.W(n4), (List)o0.C(object, S.X(n5)), r02, true);
                    break;
                }
                case 34: {
                    g0.a0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 33: {
                    g0.Z(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 32: {
                    g0.Y(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 31: {
                    g0.X(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 30: {
                    g0.P(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 29: {
                    g0.c0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 28: {
                    g0.N(this.W(n4), (List)o0.C(object, S.X(n5)), r02);
                    break;
                }
                case 27: {
                    g0.W(this.W(n4), (List)o0.C(object, S.X(n5)), r02, this.u(n4));
                    break;
                }
                case 26: {
                    g0.b0(this.W(n4), (List)o0.C(object, S.X(n5)), r02);
                    break;
                }
                case 25: {
                    g0.M(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 24: {
                    g0.Q(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 23: {
                    g0.R(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 22: {
                    g0.U(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 21: {
                    g0.d0(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 20: {
                    g0.V(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 19: {
                    g0.S(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 18: {
                    g0.O(this.W(n4), (List)o0.C(object, S.X(n5)), r02, false);
                    break;
                }
                case 17: {
                    if (!this.B(object, n4)) break;
                    r02.G(n6, o0.C(object, S.X(n5)), this.u(n4));
                    break;
                }
                case 16: {
                    if (!this.B(object, n4)) break;
                    r02.o(n6, S.L(object, S.X(n5)));
                    break;
                }
                case 15: {
                    if (!this.B(object, n4)) break;
                    r02.J(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 14: {
                    if (!this.B(object, n4)) break;
                    r02.H(n6, S.L(object, S.X(n5)));
                    break;
                }
                case 13: {
                    if (!this.B(object, n4)) break;
                    r02.r(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 12: {
                    if (!this.B(object, n4)) break;
                    r02.A(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 11: {
                    if (!this.B(object, n4)) break;
                    r02.k(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 10: {
                    if (!this.B(object, n4)) break;
                    r02.a(n6, (h)o0.C(object, S.X(n5)));
                    break;
                }
                case 9: {
                    if (!this.B(object, n4)) break;
                    r02.M(n6, o0.C(object, S.X(n5)), this.u(n4));
                    break;
                }
                case 8: {
                    if (!this.B(object, n4)) break;
                    this.B0(n6, o0.C(object, S.X(n5)), r02);
                    break;
                }
                case 7: {
                    if (!this.B(object, n4)) break;
                    r02.i(n6, S.l(object, S.X(n5)));
                    break;
                }
                case 6: {
                    if (!this.B(object, n4)) break;
                    r02.C(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 5: {
                    if (!this.B(object, n4)) break;
                    r02.j(n6, S.L(object, S.X(n5)));
                    break;
                }
                case 4: {
                    if (!this.B(object, n4)) break;
                    r02.v(n6, S.z(object, S.X(n5)));
                    break;
                }
                case 3: {
                    if (!this.B(object, n4)) break;
                    r02.x(n6, S.L(object, S.X(n5)));
                    break;
                }
                case 2: {
                    if (!this.B(object, n4)) break;
                    r02.f(n6, S.L(object, S.X(n5)));
                    break;
                }
                case 1: {
                    if (!this.B(object, n4)) break;
                    r02.p(n6, S.r(object, S.X(n5)));
                    break;
                }
                case 0: {
                    if (!this.B(object, n4)) break;
                    r02.E(n6, S.o(object, S.X(n5)));
                }
            }
            n4 += 3;
        }
        while (t2 != null) {
            this.p.j(r02, (Map.Entry)t2);
            if (iterator.hasNext()) {
                t2 = (Map.Entry)iterator.next();
                continue;
            }
            t2 = null;
        }
        this.C0(this.o, object, r02);
    }

    private static int z(Object object, long l2) {
        return o0.z(object, l2);
    }

    private void z0(Object object, r0 r02) {
        Map.Entry entry;
        Iterator iterator;
        t t2;
        this.C0(this.o, object, r02);
        if (this.f && !(t2 = this.p.c(object)).d()) {
            iterator = t2.a();
            entry = (Map.Entry)iterator.next();
        } else {
            iterator = null;
            entry = null;
        }
        int n3 = this.a.length - 3;
        while (true) {
            t2 = entry;
            if (n3 < 0) break;
            int n4 = this.w0(n3);
            int n5 = this.W(n3);
            while (entry != null && this.p.a(entry) > n5) {
                this.p.j(r02, entry);
                if (iterator.hasNext()) {
                    entry = (Map.Entry)iterator.next();
                    continue;
                }
                entry = null;
            }
            switch (S.v0(n4)) {
                default: {
                    break;
                }
                case 68: {
                    if (!this.I(object, n5, n3)) break;
                    r02.G(n5, o0.C(object, S.X(n4)), this.u(n3));
                    break;
                }
                case 67: {
                    if (!this.I(object, n5, n3)) break;
                    r02.o(n5, S.c0(object, S.X(n4)));
                    break;
                }
                case 66: {
                    if (!this.I(object, n5, n3)) break;
                    r02.J(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 65: {
                    if (!this.I(object, n5, n3)) break;
                    r02.H(n5, S.c0(object, S.X(n4)));
                    break;
                }
                case 64: {
                    if (!this.I(object, n5, n3)) break;
                    r02.r(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 63: {
                    if (!this.I(object, n5, n3)) break;
                    r02.A(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 62: {
                    if (!this.I(object, n5, n3)) break;
                    r02.k(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 61: {
                    if (!this.I(object, n5, n3)) break;
                    r02.a(n5, (h)o0.C(object, S.X(n4)));
                    break;
                }
                case 60: {
                    if (!this.I(object, n5, n3)) break;
                    r02.M(n5, o0.C(object, S.X(n4)), this.u(n3));
                    break;
                }
                case 59: {
                    if (!this.I(object, n5, n3)) break;
                    this.B0(n5, o0.C(object, S.X(n4)), r02);
                    break;
                }
                case 58: {
                    if (!this.I(object, n5, n3)) break;
                    r02.i(n5, S.Y(object, S.X(n4)));
                    break;
                }
                case 57: {
                    if (!this.I(object, n5, n3)) break;
                    r02.C(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 56: {
                    if (!this.I(object, n5, n3)) break;
                    r02.j(n5, S.c0(object, S.X(n4)));
                    break;
                }
                case 55: {
                    if (!this.I(object, n5, n3)) break;
                    r02.v(n5, S.b0(object, S.X(n4)));
                    break;
                }
                case 54: {
                    if (!this.I(object, n5, n3)) break;
                    r02.x(n5, S.c0(object, S.X(n4)));
                    break;
                }
                case 53: {
                    if (!this.I(object, n5, n3)) break;
                    r02.f(n5, S.c0(object, S.X(n4)));
                    break;
                }
                case 52: {
                    if (!this.I(object, n5, n3)) break;
                    r02.p(n5, S.a0(object, S.X(n4)));
                    break;
                }
                case 51: {
                    if (!this.I(object, n5, n3)) break;
                    r02.E(n5, S.Z(object, S.X(n4)));
                    break;
                }
                case 50: {
                    this.A0(r02, n5, o0.C(object, S.X(n4)), n3);
                    break;
                }
                case 49: {
                    g0.T(this.W(n3), (List)o0.C(object, S.X(n4)), r02, this.u(n3));
                    break;
                }
                case 48: {
                    g0.a0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 47: {
                    g0.Z(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 46: {
                    g0.Y(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 45: {
                    g0.X(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 44: {
                    g0.P(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 43: {
                    g0.c0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 42: {
                    g0.M(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 41: {
                    g0.Q(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 40: {
                    g0.R(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 39: {
                    g0.U(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 38: {
                    g0.d0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 37: {
                    g0.V(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 36: {
                    g0.S(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 35: {
                    g0.O(this.W(n3), (List)o0.C(object, S.X(n4)), r02, true);
                    break;
                }
                case 34: {
                    g0.a0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 33: {
                    g0.Z(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 32: {
                    g0.Y(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 31: {
                    g0.X(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 30: {
                    g0.P(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 29: {
                    g0.c0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 28: {
                    g0.N(this.W(n3), (List)o0.C(object, S.X(n4)), r02);
                    break;
                }
                case 27: {
                    g0.W(this.W(n3), (List)o0.C(object, S.X(n4)), r02, this.u(n3));
                    break;
                }
                case 26: {
                    g0.b0(this.W(n3), (List)o0.C(object, S.X(n4)), r02);
                    break;
                }
                case 25: {
                    g0.M(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 24: {
                    g0.Q(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 23: {
                    g0.R(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 22: {
                    g0.U(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 21: {
                    g0.d0(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 20: {
                    g0.V(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 19: {
                    g0.S(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 18: {
                    g0.O(this.W(n3), (List)o0.C(object, S.X(n4)), r02, false);
                    break;
                }
                case 17: {
                    if (!this.B(object, n3)) break;
                    r02.G(n5, o0.C(object, S.X(n4)), this.u(n3));
                    break;
                }
                case 16: {
                    if (!this.B(object, n3)) break;
                    r02.o(n5, S.L(object, S.X(n4)));
                    break;
                }
                case 15: {
                    if (!this.B(object, n3)) break;
                    r02.J(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 14: {
                    if (!this.B(object, n3)) break;
                    r02.H(n5, S.L(object, S.X(n4)));
                    break;
                }
                case 13: {
                    if (!this.B(object, n3)) break;
                    r02.r(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 12: {
                    if (!this.B(object, n3)) break;
                    r02.A(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 11: {
                    if (!this.B(object, n3)) break;
                    r02.k(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 10: {
                    if (!this.B(object, n3)) break;
                    r02.a(n5, (h)o0.C(object, S.X(n4)));
                    break;
                }
                case 9: {
                    if (!this.B(object, n3)) break;
                    r02.M(n5, o0.C(object, S.X(n4)), this.u(n3));
                    break;
                }
                case 8: {
                    if (!this.B(object, n3)) break;
                    this.B0(n5, o0.C(object, S.X(n4)), r02);
                    break;
                }
                case 7: {
                    if (!this.B(object, n3)) break;
                    r02.i(n5, S.l(object, S.X(n4)));
                    break;
                }
                case 6: {
                    if (!this.B(object, n3)) break;
                    r02.C(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 5: {
                    if (!this.B(object, n3)) break;
                    r02.j(n5, S.L(object, S.X(n4)));
                    break;
                }
                case 4: {
                    if (!this.B(object, n3)) break;
                    r02.v(n5, S.z(object, S.X(n4)));
                    break;
                }
                case 3: {
                    if (!this.B(object, n3)) break;
                    r02.x(n5, S.L(object, S.X(n4)));
                    break;
                }
                case 2: {
                    if (!this.B(object, n3)) break;
                    r02.f(n5, S.L(object, S.X(n4)));
                    break;
                }
                case 1: {
                    if (!this.B(object, n3)) break;
                    r02.p(n5, S.r(object, S.X(n4)));
                    break;
                }
                case 0: {
                    if (!this.B(object, n3)) break;
                    r02.E(n5, S.o(object, S.X(n4)));
                }
            }
            n3 -= 3;
        }
        while (t2 != null) {
            this.p.j(r02, (Map.Entry)t2);
            if (iterator.hasNext()) {
                t2 = (Map.Entry)iterator.next();
                continue;
            }
            t2 = null;
        }
    }

    @Override
    public void a(Object object, Object object2) {
        S.m(object);
        object2.getClass();
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            this.Q(object, object2, i2);
        }
        g0.F(this.o, object, object2);
        if (this.f) {
            g0.D(this.p, object, object2);
        }
    }

    @Override
    public final boolean b(Object object) {
        int n3 = 1048575;
        int n4 = 0;
        for (int i2 = 0; i2 < this.k; ++i2) {
            int n5 = this.j[i2];
            int n6 = this.W(n5);
            int n7 = this.w0(n5);
            int n8 = this.a[n5 + 2];
            int n9 = n8 & 0xFFFFF;
            n8 = 1 << (n8 >>> 20);
            if (n9 != n3) {
                if (n9 != 1048575) {
                    n4 = s.getInt(object, (long)n9);
                }
                n3 = n9;
            }
            if (S.J(n7) && !this.C(object, n5, n3, n4, n8)) {
                return false;
            }
            n9 = S.v0(n7);
            if (n9 != 9 && n9 != 17) {
                if (n9 != 27) {
                    if (n9 != 60 && n9 != 68) {
                        if (n9 != 49) {
                            if (n9 != 50 || this.F(object, n7, n5)) continue;
                            return false;
                        }
                    } else {
                        if (!this.I(object, n6, n5) || S.D(object, n7, this.u(n5))) continue;
                        return false;
                    }
                }
                if (this.E(object, n7, n5)) continue;
                return false;
            }
            if (!this.C(object, n5, n3, n4, n8) || S.D(object, n7, this.u(n5))) continue;
            return false;
        }
        return !this.f || this.p.c(object).e();
    }

    @Override
    public boolean c(Object object, Object object2) {
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; i2 += 3) {
            if (this.p(object, object2, i2)) continue;
            return false;
        }
        if (!this.o.g(object).equals(this.o.g(object2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(object).equals(this.p.c(object2));
        }
        return true;
    }

    @Override
    public void d(Object object, byte[] byArray, int n3, int n4, e.a a2) {
        if (this.h) {
            this.g0(object, byArray, n3, n4, a2);
        } else {
            this.f0(object, byArray, n3, n4, 0, a2);
        }
    }

    @Override
    public void e(Object object, r0 r02) {
        if (r02.n() == r0.a.DESCENDING) {
            this.z0(object, r02);
        } else if (this.h) {
            this.y0(object, r02);
        } else {
            this.x0(object, r02);
        }
    }

    @Override
    public int f(Object object) {
        int n3 = this.h ? this.x(object) : this.w(object);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int f0(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, e.a var6_6) {
        block53: {
            block52: {
                block51: {
                    block45: {
                        block46: {
                            block50: {
                                block47: {
                                    block48: {
                                        var20_7 /* !! */  = var2_2 /* !! */ ;
                                        var11_8 = var5_5;
                                        S.m(var1_1);
                                        var20_7 /* !! */  = (byte[])S.s;
                                        var13_9 = -1;
                                        var14_10 = 0;
                                        var9_11 = 0;
                                        var8_12 = 0;
                                        var7_13 = 1048575;
                                        block16: while (true) {
                                            block49: {
                                                var21_20 /* !! */  = var2_2 /* !! */ ;
                                                if (var3_3 >= var4_4) break block45;
                                                var10_14 = var3_3 + 1;
                                                var9_11 = var21_20 /* !! */ [var3_3];
                                                if (var9_11 < 0) {
                                                    var10_14 = com.google.crypto.tink.shaded.protobuf.e.G(var9_11, var21_20 /* !! */ , var10_14, (e.a)var6_6);
                                                    var9_11 = var6_6.a;
                                                }
                                                var12_15 = var9_11 >>> 3;
                                                var15_16 = var9_11 & 7;
                                                var3_3 = var12_15 > var13_9 ? this.j0(var12_15, var14_10 / 3) : this.i0(var12_15);
                                                if (var3_3 == -1) {
                                                    var3_3 = var11_8;
                                                    var11_8 = 0;
                                                    break block46;
                                                }
                                                var16_17 = this.a[var3_3 + 1];
                                                var14_10 = S.v0(var16_17);
                                                var18_19 = S.X(var16_17);
                                                if (var14_10 > 17) break block49;
                                                var11_8 = this.a[var3_3 + 2];
                                                var13_9 = 1 << (var11_8 >>> 20);
                                                if ((var11_8 &= 1048575) != var7_13) {
                                                    if (var7_13 != 1048575) {
                                                        var20_7 /* !! */ .putInt(var1_1, (long)var7_13, var8_12);
                                                    }
                                                    var7_13 = var20_7 /* !! */ .getInt(var1_1, (long)var11_8);
                                                    var8_12 = var11_8;
                                                    var11_8 = var7_13;
                                                } else {
                                                    var11_8 = var8_12;
                                                    var8_12 = var7_13;
                                                }
                                                switch (var14_10) {
                                                    default: {
                                                        break;
                                                    }
                                                    case 17: {
                                                        if (var15_16 != 3) break;
                                                        var21_20 /* !! */  = (byte[])this.R(var1_1, var3_3);
                                                        var10_14 = com.google.crypto.tink.shaded.protobuf.e.M(var21_20 /* !! */ , this.u(var3_3), var2_2 /* !! */ , var10_14, var4_4, var12_15 << 3 | 4, (e.a)var6_6);
                                                        this.t0(var1_1, var3_3, var21_20 /* !! */ );
                                                        var7_13 = var8_12;
                                                        var8_12 = var11_8 |= var13_9;
lbl50:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_8 = var5_5;
                                                            var14_10 = var3_3;
                                                            var21_20 /* !! */  = var2_2 /* !! */ ;
                                                            var3_3 = var10_14;
                                                            var13_9 = var12_15;
                                                            continue block16;
                                                            break;
                                                        }
                                                    }
                                                    case 16: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.K(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putLong(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.i.c(var6_6.b));
lbl61:
                                                        // 2 sources

                                                        while (true) {
                                                            var10_14 = var3_3;
                                                            var10_14 = var7_13;
                                                            var7_13 = var11_8 |= var13_9;
lbl65:
                                                            // 2 sources

                                                            while (true) {
                                                                var14_10 = var3_3;
                                                                var11_8 = var5_5;
                                                                var15_16 = var8_12;
                                                                var21_20 /* !! */  = var2_2 /* !! */ ;
                                                                var3_3 = var10_14;
                                                                var13_9 = var12_15;
                                                                var8_12 = var7_13;
                                                                var7_13 = var15_16;
                                                                continue block16;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    case 15: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.H(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putInt(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.i.b(var6_6.a));
lbl79:
                                                        // 10 sources

                                                        while (true) {
                                                            var10_14 = var3_3;
                                                            var10_14 = var7_13;
                                                            var7_13 = var11_8 |= var13_9;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    case 12: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.H(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var10_14 = var6_6.a;
                                                        this.s(var3_3);
                                                        var20_7 /* !! */ .putInt(var1_1, var18_19, var10_14);
                                                        ** GOTO lbl79
                                                    }
                                                    case 10: {
                                                        if (var15_16 != 2) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.b(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putObject(var1_1, var18_19, var6_6.c);
                                                        ** GOTO lbl79
                                                    }
                                                    case 9: {
                                                        if (var15_16 != 2) break;
                                                        var21_20 /* !! */  = (byte[])this.R(var1_1, var3_3);
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.N(var21_20 /* !! */ , this.u(var3_3), var2_2 /* !! */ , var10_14, var4_4, (e.a)var6_6);
                                                        this.t0(var1_1, var3_3, var21_20 /* !! */ );
                                                        ** GOTO lbl79
                                                    }
                                                    case 8: {
                                                        if (var15_16 != 2) break;
                                                        var7_13 = (0x20000000 & var16_17) == 0 ? com.google.crypto.tink.shaded.protobuf.e.B(var2_2 /* !! */ , var10_14, (e.a)var6_6) : com.google.crypto.tink.shaded.protobuf.e.E(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putObject(var1_1, var18_19, var6_6.c);
                                                        ** GOTO lbl79
                                                    }
                                                    case 7: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.K(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var17_18 = var6_6.b != 0L;
                                                        o0.H(var1_1, var18_19, var17_18);
                                                        ** GOTO lbl79
                                                    }
                                                    case 6: 
                                                    case 13: {
                                                        if (var15_16 != 5) break;
                                                        var20_7 /* !! */ .putInt(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.e.g(var2_2 /* !! */ , var10_14));
lbl117:
                                                        // 2 sources

                                                        while (true) {
                                                            var7_13 = var10_14 + 4;
                                                            ** GOTO lbl79
                                                            break;
                                                        }
                                                    }
                                                    case 5: 
                                                    case 14: {
                                                        if (var15_16 != 1) break;
                                                        var20_7 /* !! */ .putLong(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.e.i(var2_2 /* !! */ , var10_14));
                                                        var7_13 = var10_14 + 8;
                                                        ** GOTO lbl79
                                                    }
                                                    case 4: 
                                                    case 11: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.H(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putInt(var1_1, var18_19, var6_6.a);
                                                        ** GOTO lbl79
                                                    }
                                                    case 2: 
                                                    case 3: {
                                                        if (var15_16 != 0) break;
                                                        var7_13 = com.google.crypto.tink.shaded.protobuf.e.K(var2_2 /* !! */ , var10_14, (e.a)var6_6);
                                                        var20_7 /* !! */ .putLong(var1_1, var18_19, var6_6.b);
                                                        ** continue;
                                                    }
                                                    case 1: {
                                                        if (var15_16 != 5) break;
                                                        o0.O(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.e.k(var2_2 /* !! */ , var10_14));
                                                        ** continue;
                                                    }
                                                    case 0: {
                                                        if (var15_16 != 1) break;
                                                        o0.N(var1_1, var18_19, com.google.crypto.tink.shaded.protobuf.e.d(var2_2 /* !! */ , var10_14));
                                                        var7_13 = var10_14 + 8;
                                                        ** continue;
                                                    }
                                                }
                                                var7_13 = var10_14;
                                                var7_13 = var3_3;
                                                var7_13 = var8_12;
                                                var8_12 = var11_8;
lbl148:
                                                // 2 sources

                                                while (true) {
                                                    var11_8 = var3_3;
                                                    var3_3 = var5_5;
                                                    break block46;
                                                    break;
                                                }
                                            }
                                            if (var14_10 == 27) {
                                                if (var15_16 == 2) {
                                                    var22_21 = (z.d)var20_7 /* !! */ .getObject(var1_1, var18_19);
                                                    var21_20 /* !! */  = (byte[])var22_21;
                                                    if (!var22_21.i()) {
                                                        var11_8 = var22_21.size();
                                                        var11_8 = var11_8 == 0 ? 10 : (var11_8 *= 2);
                                                        var21_20 /* !! */  = (byte[])var22_21.f(var11_8);
                                                        var20_7 /* !! */ .putObject(var1_1, var18_19, (Object)var21_20 /* !! */ );
                                                    }
                                                    var10_14 = com.google.crypto.tink.shaded.protobuf.e.p(this.u(var3_3), var9_11, var2_2 /* !! */ , var10_14, var4_4, (z.d)var21_20 /* !! */ , (e.a)var6_6);
                                                    ** continue;
                                                }
                                                break block47;
                                            }
                                            var11_8 = var7_13;
                                            if (var14_10 > 49) break block48;
                                            var7_13 = var13_9 = this.h0(var1_1, var2_2 /* !! */ , var10_14, var4_4, var9_11, var12_15, var15_16, var3_3, var16_17, var14_10, var18_19, (e.a)var6_6);
                                            if (var13_9 == var10_14) break;
                                            var7_13 = var13_9;
lbl170:
                                            // 3 sources

                                            while (true) {
                                                var10_14 = var5_5;
                                                var13_9 = var9_11;
                                                var13_9 = var11_8;
                                                var11_8 = var12_15;
                                                var11_8 = var10_14;
                                                var10_14 = var13_9;
                                                var14_10 = var3_3;
                                                var3_3 = var7_13;
lbl179:
                                                // 2 sources

                                                while (true) {
                                                    var21_20 /* !! */  = var2_2 /* !! */ ;
                                                    var13_9 = var12_15;
                                                    var7_13 = var10_14;
                                                    continue block16;
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
lbl184:
                                        // 3 sources

                                        while (true) {
                                            var13_9 = var3_3;
                                            var3_3 = var5_5;
                                            var10_14 = var7_13;
                                            var7_13 = var11_8;
                                            var11_8 = var13_9;
                                            break block46;
                                            break;
                                        }
                                    }
                                    if (var14_10 != 50) break block50;
                                    if (var15_16 != 2) break block47;
                                    var7_13 = var13_9 = this.d0(var1_1, var2_2 /* !! */ , var10_14, var4_4, var3_3, var18_19, (e.a)var6_6);
                                    if (var13_9 == var10_14) ** GOTO lbl184
                                    var7_13 = var13_9;
                                    ** GOTO lbl170
                                }
                                var11_8 = var3_3;
                                var11_8 = var10_14;
                                ** while (true)
                            }
                            var7_13 = var13_9 = this.e0(var1_1, var2_2 /* !! */ , var10_14, var4_4, var9_11, var12_15, var15_16, var16_17, var14_10, var18_19, var3_3, (e.a)var6_6);
                            ** while (var13_9 == var10_14)
lbl205:
                            // 1 sources

                            var7_13 = var13_9;
                            ** while (true)
                        }
                        var13_9 = var9_11;
                        if (var13_9 == var3_3 && var3_3 != 0) {
                            var2_2 /* !! */  = (byte[])this;
                            var5_5 = var10_14;
lbl212:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var10_14 = this.f != false && var6_6.d != com.google.crypto.tink.shaded.protobuf.p.b() ? com.google.crypto.tink.shaded.protobuf.e.f(var13_9, var2_2 /* !! */ , var10_14, var4_4, var1_1, this.e, this.o, (e.a)var6_6) : com.google.crypto.tink.shaded.protobuf.e.F(var13_9, var2_2 /* !! */ , var10_14, var4_4, S.v(var1_1), (e.a)var6_6);
                        var14_10 = var11_8;
                        var11_8 = var12_15;
                        var11_8 = var3_3;
                        var3_3 = var10_14;
                        var10_14 = var7_13;
                        ** while (true)
                    }
                    var2_2 /* !! */  = (byte[])this;
                    var5_5 = var3_3;
                    var13_9 = var9_11;
                    var3_3 = var11_8;
                    ** while (true)
                    var6_6 = this;
                    if (var7_13 != 1048575) {
                        var20_7 /* !! */ .putInt(var1_1, (long)var7_13, var8_12);
                    }
                    var2_2 /* !! */  = null;
                    for (var7_13 = var6_6.k; var7_13 < var6_6.l; ++var7_13) {
                        var2_2 /* !! */  = (byte[])((l0)this.q(var1_1, var6_6.j[var7_13], var2_2 /* !! */ , var6_6.o, var1_1));
                    }
                    if (var2_2 /* !! */  != null) {
                        var6_6.o.o(var1_1, var2_2 /* !! */ );
                    }
                    if (var3_3 != 0) break block51;
                    if (var5_5 != var4_4) {
                        throw A.h();
                    }
                    break block52;
                }
                if (var5_5 > var4_4 || var13_9 != var3_3) break block53;
            }
            return var5_5;
        }
        throw A.h();
    }

    @Override
    public Object g() {
        return this.m.a(this.e);
    }

    @Override
    public void h(Object object, d0 d02, p p2) {
        p2.getClass();
        S.m(object);
        this.M(this.o, this.p, object, d02, p2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void i(Object var1_1) {
        if (!S.G(var1_1)) {
            return;
        }
        if (var1_1 instanceof x) {
            var7_2 /* !! */  = (x)var1_1;
            var7_2 /* !! */ .n();
            var7_2 /* !! */ .m();
            var7_2 /* !! */ .F();
        }
        var3_3 = this.a.length;
        block5: for (var2_4 = 0; var2_4 < var3_3; var2_4 += 3) {
            var4_5 = this.w0(var2_4);
            var5_6 = S.X(var4_5);
            if ((var4_5 = S.v0(var4_5)) == 9) ** GOTO lbl-1000
            switch (var4_5) {
                default: {
                    continue block5;
                }
                case 50: {
                    var8_7 = S.s;
                    var7_2 /* !! */  = var8_7.getObject(var1_1, var5_6);
                    if (var7_2 /* !! */  == null) continue block5;
                    var8_7.putObject(var1_1, var5_6, this.q.g(var7_2 /* !! */ ));
                    continue block5;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    this.n.c(var1_1, var5_6);
                    continue block5;
                }
                case 17: lbl-1000:
                // 2 sources

                {
                    if (!this.B(var1_1, var2_4)) continue block5;
                    this.u(var2_4).i(S.s.getObject(var1_1, var5_6));
                }
            }
        }
        this.o.j(var1_1);
        if (this.f) {
            this.p.f(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int j(Object var1_1) {
        var5_2 = this.a.length;
        var3_4 = 0;
        for (var4_3 = 0; var4_3 < var5_2; var4_3 += 3) {
            var2_5 = this.w0(var4_3);
            var6_6 = this.W(var4_3);
            var8_8 = S.X(var2_5);
            var7_7 = S.v0(var2_5);
            var2_5 = 37;
            block0 : switch (var7_7) {
                default: {
                    var2_5 = var3_4;
                    break;
                }
                case 68: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var10_9 = o0.C(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
lbl19:
                    // 36 sources

                    while (true) {
                        var2_5 += var3_4;
                        break block0;
                        break;
                    }
                }
                case 67: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(S.c0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 66: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 65: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(S.c0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 64: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 63: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 62: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 61: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.C(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 60: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var10_9 = o0.C(var1_1, var8_8);
                    var2_5 = var3_4 * 53;
                    var3_4 = var10_9.hashCode();
                    ** GOTO lbl19
                }
                case 59: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)o0.C(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 58: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.c(S.Y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 57: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 56: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(S.c0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 55: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = S.b0(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 54: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(S.c0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 53: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(S.c0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 52: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits((float)S.a0(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 51: {
                    var2_5 = var3_4;
                    if (!this.I(var1_1, var6_6, var4_3)) break;
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(Double.doubleToLongBits((double)S.Z(var1_1, var8_8)));
                    ** GOTO lbl19
                }
                case 50: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.C(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.C(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 17: {
                    var10_9 = o0.C(var1_1, var8_8);
                    if (var10_9 != null) {
                        var2_5 = var10_9.hashCode();
                    }
lbl137:
                    // 5 sources

                    while (true) {
                        var2_5 = var3_4 * 53 + var2_5;
                        break block0;
                        break;
                    }
                }
                case 16: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(o0.A(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 15: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 14: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(o0.A(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 13: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 12: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 11: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 10: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.C(var1_1, var8_8).hashCode();
                    ** GOTO lbl19
                }
                case 9: {
                    var10_9 = o0.C(var1_1, var8_8);
                    if (var10_9 == null) ** GOTO lbl137
                    var2_5 = var10_9.hashCode();
                    ** continue;
                }
                case 8: {
                    var2_5 = var3_4 * 53;
                    var3_4 = ((String)o0.C(var1_1, var8_8)).hashCode();
                    ** GOTO lbl19
                }
                case 7: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.c(o0.r(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 6: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 5: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(o0.A(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 4: {
                    var2_5 = var3_4 * 53;
                    var3_4 = o0.z(var1_1, var8_8);
                    ** GOTO lbl19
                }
                case 3: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(o0.A(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 2: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(o0.A(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 1: {
                    var2_5 = var3_4 * 53;
                    var3_4 = Float.floatToIntBits((float)o0.y(var1_1, var8_8));
                    ** GOTO lbl19
                }
                case 0: {
                    var2_5 = var3_4 * 53;
                    var3_4 = z.f(Double.doubleToLongBits((double)o0.x(var1_1, var8_8)));
                    ** continue;
                }
            }
            var3_4 = var2_5;
        }
        var2_5 = var3_4 = var3_4 * 53 + this.o.g(var1_1).hashCode();
        if (this.f) {
            var2_5 = var3_4 * 53 + this.p.c(var1_1).hashCode();
        }
        return var2_5;
    }
}

