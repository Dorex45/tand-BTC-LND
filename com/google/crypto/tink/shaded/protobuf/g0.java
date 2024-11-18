/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.F
 *  com.google.crypto.tink.shaded.protobuf.O
 *  com.google.crypto.tink.shaded.protobuf.k
 *  com.google.crypto.tink.shaded.protobuf.m0
 *  com.google.crypto.tink.shaded.protobuf.x
 *  com.google.crypto.tink.shaded.protobuf.y
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.m0;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import java.util.RandomAccess;

abstract class g0 {
    private static final Class a = g0.A();
    private static final k0 b = g0.B(false);
    private static final k0 c = g0.B(true);
    private static final k0 d = new m0();

    private static Class A() {
        try {
            Class clazz = Class.forName((String)"com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
            return clazz;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static k0 B(boolean bl) {
        Object object;
        block3: {
            try {
                object = g0.C();
                if (object != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        object = (k0)object.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{bl});
        return object;
    }

    private static Class C() {
        try {
            Class clazz = Class.forName((String)"com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            return clazz;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static void D(q q2, Object object, Object object2) {
        if (!((t)(object2 = q2.c(object2))).d()) {
            q2.d(object).h((t)object2);
        }
    }

    static void E(J j2, Object object, Object object2, long l2) {
        o0.R(object, l2, j2.a(o0.C(object, l2), o0.C(object2, l2)));
    }

    static void F(k0 k02, Object object, Object object2) {
        k02.p(object, k02.k(k02.g(object), k02.g(object2)));
    }

    public static k0 G() {
        return b;
    }

    public static k0 H() {
        return c;
    }

    public static void I(Class clazz) {
        Class clazz2;
        if (!x.class.isAssignableFrom(clazz) && (clazz2 = a) != null && !clazz2.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean J(Object object, Object object2) {
        boolean bl = object == object2 || object != null && object.equals(object2);
        return bl;
    }

    static Object K(Object object, int n2, int n3, Object object2, k0 k02) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = k02.f(object);
        }
        k02.e(object3, n2, n3);
        return object3;
    }

    public static k0 L() {
        return d;
    }

    public static void M(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.O(n2, list, bl);
        }
    }

    public static void N(int n2, List list, r0 r02) {
        if (list != null && !list.isEmpty()) {
            r02.K(n2, list);
        }
    }

    public static void O(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.F(n2, list, bl);
        }
    }

    public static void P(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.D(n2, list, bl);
        }
    }

    public static void Q(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.L(n2, list, bl);
        }
    }

    public static void R(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.y(n2, list, bl);
        }
    }

    public static void S(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.d(n2, list, bl);
        }
    }

    public static void T(int n2, List list, r0 r02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            r02.b(n2, list, e02);
        }
    }

    public static void U(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.c(n2, list, bl);
        }
    }

    public static void V(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.B(n2, list, bl);
        }
    }

    public static void W(int n2, List list, r0 r02, e0 e02) {
        if (list != null && !list.isEmpty()) {
            r02.l(n2, list, e02);
        }
    }

    public static void X(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.z(n2, list, bl);
        }
    }

    public static void Y(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.I(n2, list, bl);
        }
    }

    public static void Z(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.w(n2, list, bl);
        }
    }

    static int a(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        if (bl) {
            return k.L((int)n2) + k.x((int)n3);
        }
        return n3 * k.d((int)n2, (boolean)true);
    }

    public static void a0(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.h(n2, list, bl);
        }
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int n2, List list, r0 r02) {
        if (list != null && !list.isEmpty()) {
            r02.q(n2, list);
        }
    }

    static int c(int n2, List list) {
        int n3 = list.size();
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        n3 *= k.L((int)n2);
        n2 = n4;
        n4 = n3;
        while (n2 < list.size()) {
            n4 += k.g((h)((h)list.get(n2)));
            ++n2;
        }
        return n4;
    }

    public static void c0(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.e(n2, list, bl);
        }
    }

    static int d(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.e(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    public static void d0(int n2, List list, r0 r02, boolean bl) {
        if (list != null && !list.isEmpty()) {
            r02.N(n2, list, bl);
        }
    }

    static int e(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n5 = 0;
            n3 = n4;
            while (true) {
                n4 = n5;
                if (n3 < n2) {
                    n5 += k.k((int)list.l(n3));
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            while (true) {
                n4 = n6;
                if (n3 >= n2) break;
                n6 += k.k((int)((Integer)list.get(n3)));
                ++n3;
            }
        }
        return n4;
    }

    static int f(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        if (bl) {
            return k.L((int)n2) + k.x((int)(n3 * 4));
        }
        return n3 * k.l((int)n2, (int)0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        if (bl) {
            return k.L((int)n2) + k.x((int)(n3 * 8));
        }
        return n3 * k.n((int)n2, (long)0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int n2, List list, e0 e02) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            n4 += k.r((int)n2, (O)((O)list.get(i2)), (e0)e02);
        }
        return n4;
    }

    static int k(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.l(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    static int l(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += k.u((int)list.l(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += k.u((int)((Integer)list.get(n4)));
                ++n4;
            }
        }
        return n3;
    }

    static int m(int n2, List list, boolean bl) {
        if (list.size() == 0) {
            return 0;
        }
        int n3 = g0.n(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n3);
        }
        return n3 + list.size() * k.L((int)n2);
    }

    static int n(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += k.w((long)list.l(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += k.w((long)((Long)list.get(n4)));
                ++n4;
            }
        }
        return n3;
    }

    static int o(int n2, Object object, e0 e02) {
        return k.y((int)n2, (O)((O)object), (e0)e02);
    }

    static int p(int n2, List list, e0 e02) {
        int n3 = list.size();
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        int n5 = k.L((int)n2) * n3;
        for (n2 = n4; n2 < n3; ++n2) {
            n5 += k.z((O)((O)list.get(n2)), (e0)e02);
        }
        return n5;
    }

    static int q(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.r(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    static int r(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n5 = 0;
            n3 = n4;
            while (true) {
                n4 = n5;
                if (n3 < n2) {
                    n5 += k.G((int)list.l(n3));
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            while (true) {
                n4 = n6;
                if (n3 >= n2) break;
                n6 += k.G((int)((Integer)list.get(n3)));
                ++n3;
            }
        }
        return n4;
    }

    static int s(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.t(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    static int t(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += k.I((long)list.l(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += k.I((long)((Long)list.get(n4)));
                ++n4;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static int u(int n2, List list) {
        int n3;
        int n4 = list.size();
        int n5 = 0;
        int n6 = 0;
        if (n4 == 0) {
            return 0;
        }
        n2 = n3 = k.L((int)n2) * n4;
        if (list instanceof D) {
            list = (D)list;
            n2 = n3;
            n5 = n6;
            while (true) {
                n3 = n2;
                if (n5 >= n4) return n3;
                Object object = list.e(n5);
                n3 = object instanceof h ? k.g((h)((h)object)) : k.K((String)((String)object));
                n2 += n3;
                ++n5;
            }
        } else {
            while (true) {
                n3 = n2;
                if (n5 >= n4) return n3;
                Object object = list.get(n5);
                n3 = object instanceof h ? k.g((h)((h)object)) : k.K((String)((String)object));
                n2 += n3;
                ++n5;
            }
        }
    }

    static int v(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.w(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    static int w(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof y) {
            list = (y)list;
            int n5 = 0;
            n3 = n4;
            while (true) {
                n4 = n5;
                if (n3 < n2) {
                    n5 += k.N((int)list.l(n3));
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            while (true) {
                n4 = n6;
                if (n3 >= n2) break;
                n6 += k.N((int)((Integer)list.get(n3)));
                ++n3;
            }
        }
        return n4;
    }

    static int x(int n2, List list, boolean bl) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        int n4 = g0.y(list);
        if (bl) {
            return k.L((int)n2) + k.x((int)n4);
        }
        return n4 + n3 * k.L((int)n2);
    }

    static int y(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof F) {
            list = (F)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += k.P((long)list.l(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += k.P((long)((Long)list.get(n4)));
                ++n4;
            }
        }
        return n3;
    }

    static Object z(Object object, int n2, List list, z.c c2, Object object2, k0 k02) {
        Object object3;
        if (c2 == null) {
            return object2;
        }
        if (list instanceof RandomAccess) {
            int n3 = list.size();
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                object3 = (Integer)list.get(i2);
                int n5 = object3.intValue();
                if (c2.a(n5)) {
                    if (i2 != n4) {
                        list.set(n4, object3);
                    }
                    ++n4;
                    continue;
                }
                object2 = g0.K(object, n2, n5, object2, k02);
            }
            object3 = object2;
            if (n4 != n3) {
                list.subList(n4, n3).clear();
                object3 = object2;
            }
        } else {
            list = list.iterator();
            while (true) {
                object3 = object2;
                if (!list.hasNext()) break;
                int n6 = (Integer)list.next();
                if (c2.a(n6)) continue;
                object2 = g0.K(object, n2, n6, object2, k02);
                list.remove();
            }
        }
        return object3;
    }
}

