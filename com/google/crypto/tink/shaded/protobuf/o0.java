/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.o0$b
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.nio.Buffer
 *  java.nio.ByteOrder
 *  java.security.AccessController
 *  java.security.PrivilegedExceptionAction
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  sun.misc.Unsafe
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.o0;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class o0 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final boolean d;
    private static final e e;
    private static final boolean f;
    private static final boolean g;
    static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;

    static {
        long l2;
        a = o0.D();
        b = com.google.crypto.tink.shaded.protobuf.d.b();
        c = o0.o(Long.TYPE);
        d = o0.o(Integer.TYPE);
        e = o0.B();
        f = o0.T();
        g = o0.S();
        h = l2 = (long)o0.l(byte[].class);
        i = o0.l(boolean[].class);
        j = o0.m(boolean[].class);
        k = o0.l(int[].class);
        l = o0.m(int[].class);
        m = o0.l(long[].class);
        n = o0.m(long[].class);
        o = o0.l(float[].class);
        p = o0.m(float[].class);
        q = o0.l(double[].class);
        r = o0.m(double[].class);
        s = o0.l(Object[].class);
        t = o0.m(Object[].class);
        u = o0.q(o0.n());
        v = (int)(l2 & 7L);
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        w = bl;
    }

    static long A(Object object, long l2) {
        return e.h(object, l2);
    }

    private static e B() {
        Unsafe unsafe = a;
        b b2 = null;
        if (unsafe == null) {
            return null;
        }
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            if (c) {
                return new /* Unavailable Anonymous Inner Class!! */;
            }
            if (d) {
                b2 = new /* Unavailable Anonymous Inner Class!! */;
            }
            return b2;
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    static Object C(Object object, long l2) {
        return e.i(object, l2);
    }

    static Unsafe D() {
        PrivilegedExceptionAction privilegedExceptionAction;
        try {
            privilegedExceptionAction = new PrivilegedExceptionAction(){

                public Unsafe a() {
                    for (Object object : Unsafe.class.getDeclaredFields()) {
                        object.setAccessible(true);
                        object = object.get(null);
                        if (!Unsafe.class.isInstance(object)) continue;
                        return (Unsafe)Unsafe.class.cast(object);
                    }
                    return null;
                }
            };
            privilegedExceptionAction = (Unsafe)AccessController.doPrivileged((PrivilegedExceptionAction)privilegedExceptionAction);
        }
        catch (Throwable throwable) {
            privilegedExceptionAction = null;
        }
        return privilegedExceptionAction;
    }

    static boolean E() {
        return g;
    }

    static boolean F() {
        return f;
    }

    private static void G(Throwable throwable) {
        Logger logger = Logger.getLogger((String)o0.class.getName());
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append((Object)throwable);
        logger.log(level, stringBuilder.toString());
    }

    static void H(Object object, long l2, boolean bl) {
        e.k(object, l2, bl);
    }

    private static void I(Object object, long l2, boolean bl) {
        o0.L(object, l2, (byte)(bl ? 1 : 0));
    }

    private static void J(Object object, long l2, boolean bl) {
        o0.M(object, l2, (byte)(bl ? 1 : 0));
    }

    static void K(byte[] byArray, long l2, byte by) {
        e.l(byArray, h + l2, by);
    }

    private static void L(Object object, long l2, byte by) {
        long l3 = 0xFFFFFFFFFFFFFFFCL & l2;
        int n2 = o0.z(object, l3);
        int n3 = (~((int)l2) & 3) << 3;
        o0.P(object, l3, (0xFF & by) << n3 | n2 & ~(255 << n3));
    }

    private static void M(Object object, long l2, byte by) {
        long l3 = 0xFFFFFFFFFFFFFFFCL & l2;
        int n2 = o0.z(object, l3);
        int n3 = ((int)l2 & 3) << 3;
        o0.P(object, l3, (0xFF & by) << n3 | n2 & ~(255 << n3));
    }

    static void N(Object object, long l2, double d2) {
        e.m(object, l2, d2);
    }

    static void O(Object object, long l2, float f2) {
        e.n(object, l2, f2);
    }

    static void P(Object object, long l2, int n2) {
        e.o(object, l2, n2);
    }

    static void Q(Object object, long l2, long l3) {
        e.p(object, l2, l3);
    }

    static void R(Object object, long l2, Object object2) {
        e.q(object, l2, object2);
    }

    private static boolean S() {
        e e2 = e;
        if (e2 == null) {
            return false;
        }
        return e2.r();
    }

    private static boolean T() {
        e e2 = e;
        if (e2 == null) {
            return false;
        }
        return e2.s();
    }

    static /* synthetic */ byte c(Object object, long l2) {
        return o0.v(object, l2);
    }

    static /* synthetic */ byte d(Object object, long l2) {
        return o0.w(object, l2);
    }

    static /* synthetic */ void e(Object object, long l2, byte by) {
        o0.L(object, l2, by);
    }

    static /* synthetic */ void f(Object object, long l2, byte by) {
        o0.M(object, l2, by);
    }

    static /* synthetic */ boolean g(Object object, long l2) {
        return o0.s(object, l2);
    }

    static /* synthetic */ boolean h(Object object, long l2) {
        return o0.t(object, l2);
    }

    static /* synthetic */ void i(Object object, long l2, boolean bl) {
        o0.I(object, l2, bl);
    }

    static /* synthetic */ void j(Object object, long l2, boolean bl) {
        o0.J(object, l2, bl);
    }

    static Object k(Class object) {
        try {
            object = a.allocateInstance(object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException((Throwable)instantiationException);
        }
    }

    private static int l(Class clazz) {
        int n2 = g ? e.a(clazz) : -1;
        return n2;
    }

    private static int m(Class clazz) {
        int n2 = g ? e.b(clazz) : -1;
        return n2;
    }

    private static Field n() {
        Field field;
        if (com.google.crypto.tink.shaded.protobuf.d.c() && (field = o0.p(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = o0.p(Buffer.class, "address");
        if (field == null || field.getType() != Long.TYPE) {
            field = null;
        }
        return field;
    }

    static boolean o(Class clazz) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class clazz2 = b;
            Class clazz3 = Boolean.TYPE;
            clazz2.getMethod("peekLong", new Class[]{clazz, clazz3});
            clazz2.getMethod("pokeLong", new Class[]{clazz, Long.TYPE, clazz3});
            Class clazz4 = Integer.TYPE;
            clazz2.getMethod("pokeInt", new Class[]{clazz, clazz4, clazz3});
            clazz2.getMethod("peekInt", new Class[]{clazz, clazz3});
            clazz2.getMethod("pokeByte", new Class[]{clazz, Byte.TYPE});
            clazz2.getMethod("peekByte", new Class[]{clazz});
            clazz2.getMethod("pokeByteArray", new Class[]{clazz, byte[].class, clazz4, clazz4});
            clazz2.getMethod("peekByteArray", new Class[]{clazz, byte[].class, clazz4, clazz4});
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private static Field p(Class clazz, String string) {
        try {
            clazz = clazz.getDeclaredField(string);
        }
        catch (Throwable throwable) {
            clazz = null;
        }
        return clazz;
    }

    private static long q(Field field) {
        e e2;
        long l2 = field != null && (e2 = e) != null ? e2.j(field) : -1L;
        return l2;
    }

    static boolean r(Object object, long l2) {
        return e.c(object, l2);
    }

    private static boolean s(Object object, long l2) {
        boolean bl = o0.v(object, l2) != 0;
        return bl;
    }

    private static boolean t(Object object, long l2) {
        boolean bl = o0.w(object, l2) != 0;
        return bl;
    }

    static byte u(byte[] byArray, long l2) {
        return e.d(byArray, h + l2);
    }

    private static byte v(Object object, long l2) {
        return (byte)(o0.z(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)(((l2 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF);
    }

    private static byte w(Object object, long l2) {
        return (byte)(o0.z(object, 0xFFFFFFFFFFFFFFFCL & l2) >>> (int)((l2 & 3L) << 3) & 0xFF);
    }

    static double x(Object object, long l2) {
        return e.e(object, l2);
    }

    static float y(Object object, long l2) {
        return e.f(object, l2);
    }

    static int z(Object object, long l2) {
        return e.g(object, l2);
    }

    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class clazz) {
            return this.a.arrayBaseOffset(clazz);
        }

        public final int b(Class clazz) {
            return this.a.arrayIndexScale(clazz);
        }

        public abstract boolean c(Object var1, long var2);

        public abstract byte d(Object var1, long var2);

        public abstract double e(Object var1, long var2);

        public abstract float f(Object var1, long var2);

        public final int g(Object object, long l2) {
            return this.a.getInt(object, l2);
        }

        public final long h(Object object, long l2) {
            return this.a.getLong(object, l2);
        }

        public final Object i(Object object, long l2) {
            return this.a.getObject(object, l2);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object var1, long var2, boolean var4);

        public abstract void l(Object var1, long var2, byte var4);

        public abstract void m(Object var1, long var2, double var4);

        public abstract void n(Object var1, long var2, float var4);

        public final void o(Object object, long l2, int n2) {
            this.a.putInt(object, l2, n2);
        }

        public final void p(Object object, long l2, long l3) {
            this.a.putLong(object, l2, l3);
        }

        public final void q(Object object, long l2, Object object2) {
            this.a.putObject(object, l2, object2);
        }

        public boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("arrayBaseOffset", new Class[]{Class.class});
                unsafe.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class clazz = Long.TYPE;
                unsafe.getMethod("getInt", new Class[]{Object.class, clazz});
                unsafe.getMethod("putInt", new Class[]{Object.class, clazz, Integer.TYPE});
                unsafe.getMethod("getLong", new Class[]{Object.class, clazz});
                unsafe.getMethod("putLong", new Class[]{Object.class, clazz, clazz});
                unsafe.getMethod("getObject", new Class[]{Object.class, clazz});
                unsafe.getMethod("putObject", new Class[]{Object.class, clazz, Object.class});
                return true;
            }
            catch (Throwable throwable) {
                o0.G(throwable);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                unsafe = unsafe.getClass();
                unsafe.getMethod("objectFieldOffset", new Class[]{Field.class});
                unsafe.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                unsafe = o0.n();
                return unsafe != null;
            }
            catch (Throwable throwable) {
                o0.G(throwable);
                return false;
            }
        }
    }
}

