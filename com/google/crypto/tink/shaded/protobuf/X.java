/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x
extends com.google.crypto.tink.shaded.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l0 unknownFields = l0.c();

    static Object A(Method object, Object object2, Object ... objectArray) {
        try {
            object = object.invoke(object2, objectArray);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", (Throwable)illegalAccessException);
        }
    }

    protected static final boolean C(x x2, boolean bl) {
        byte by = (Byte)x2.r(d.GET_MEMOIZED_IS_INITIALIZED);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl2 = a0.a().d(x2).b(x2);
        if (bl) {
            d d2 = d.SET_MEMOIZED_IS_INITIALIZED;
            x x3 = bl2 ? x2 : null;
            x2.s(d2, x3);
        }
        return bl2;
    }

    protected static z.d G(z.d d2) {
        int n2 = d2.size();
        n2 = n2 == 0 ? 10 : (n2 *= 2);
        return d2.f(n2);
    }

    protected static Object I(O o2, String string, Object[] objectArray) {
        return new c0(o2, string, objectArray);
    }

    protected static x K(x x2, h h2, p p2) {
        return x.l(x.N(x2, h2, p2));
    }

    protected static x L(x x2, InputStream inputStream, p p2) {
        return x.l(x.O(x2, i.f(inputStream), p2));
    }

    protected static x M(x x2, byte[] byArray, p p2) {
        return x.l(x.P(x2, byArray, 0, byArray.length, p2));
    }

    private static x N(x x2, h object, p p2) {
        object = ((h)object).v();
        x2 = x.O(x2, (i)object, p2);
        try {
            ((i)object).a(0);
            return x2;
        }
        catch (A a2) {
            throw a2.k(x2);
        }
    }

    static x O(x object, i i2, p p2) {
        A a22;
        x x2;
        block10: {
            j0 j022;
            block9: {
                IOException iOException2;
                block8: {
                    x2 = ((x)object).J();
                    try {
                        object = a0.a().d(x2);
                        object.h(x2, j.O(i2), p2);
                        object.i(x2);
                        return x2;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                    catch (j0 j022) {
                        break block9;
                    }
                    catch (A a22) {
                        break block10;
                    }
                    if (runtimeException.getCause() instanceof A) {
                        throw (A)runtimeException.getCause();
                    }
                    throw runtimeException;
                }
                if (iOException2.getCause() instanceof A) {
                    throw (A)iOException2.getCause();
                }
                throw new A(iOException2).k(x2);
            }
            throw j022.a().k(x2);
        }
        object = a22;
        if (a22.a()) {
            object = new A(a22);
        }
        throw ((A)((Object)object)).k(x2);
    }

    private static x P(x object, byte[] byArray, int n2, int n3, p p2) {
        A a22;
        x x2;
        block8: {
            j0 j022;
            block7: {
                x2 = object.J();
                try {
                    e0 e02 = a0.a().d(x2);
                    object = new e.a(p2);
                    e02.d(x2, byArray, n2, n2 + n3, (e.a)object);
                    e02.i(x2);
                    return x2;
                }
                catch (IOException iOException) {
                }
                catch (j0 j022) {
                    break block7;
                }
                catch (A a22) {
                    break block8;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw A.m().k(x2);
                }
                if (iOException.getCause() instanceof A) {
                    throw (A)iOException.getCause();
                }
                throw new A(iOException).k(x2);
            }
            throw j022.a().k(x2);
        }
        object = a22;
        if (a22.a()) {
            object = new A(a22);
        }
        throw ((A)((Object)object)).k(x2);
    }

    protected static void Q(Class clazz, x x2) {
        x2.F();
        defaultInstanceMap.put((Object)clazz, (Object)x2);
    }

    private static x l(x x2) {
        if (x2 != null && !x2.B()) {
            throw x2.j().a().k(x2);
        }
        return x2;
    }

    private int p(e0 e02) {
        if (e02 == null) {
            return a0.a().d(this).f(this);
        }
        return e02.f(this);
    }

    protected static z.d u() {
        return b0.l();
    }

    static x v(Class clazz) {
        x x2;
        x x3 = x2 = (x)defaultInstanceMap.get((Object)clazz);
        if (x2 == null) {
            try {
                Class.forName((String)clazz.getName(), (boolean)true, (ClassLoader)clazz.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            x3 = (x)defaultInstanceMap.get((Object)clazz);
        }
        x2 = x3;
        if (x3 == null) {
            x2 = ((x)o0.k(clazz)).w();
            if (x2 != null) {
                defaultInstanceMap.put((Object)clazz, (Object)x2);
            } else {
                throw new IllegalStateException();
            }
        }
        return x2;
    }

    public final boolean B() {
        return x.C(this, true);
    }

    boolean D() {
        boolean bl = (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
        return bl;
    }

    protected void E() {
        a0.a().d(this).i(this);
        this.F();
    }

    void F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a H() {
        return (a)this.r(d.NEW_BUILDER);
    }

    x J() {
        return (x)this.r(d.NEW_MUTABLE_INSTANCE);
    }

    void R(int n2) {
        this.memoizedHashCode = n2;
    }

    void S(int n2) {
        if (n2 >= 0) {
            this.memoizedSerializedSize = n2 & Integer.MAX_VALUE | this.memoizedSerializedSize & Integer.MIN_VALUE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("serialized size must be non-negative, was ");
        stringBuilder.append(n2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final a T() {
        return ((a)this.r(d.NEW_BUILDER)).o(this);
    }

    @Override
    public void b(k k2) {
        a0.a().d(this).e(this, l.P(k2));
    }

    @Override
    public int c() {
        return this.g(null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return a0.a().d(this).c(this, (x)object);
    }

    @Override
    int g(e0 e02) {
        if (this.D()) {
            int n2 = this.p(e02);
            if (n2 >= 0) {
                return n2;
            }
            e02 = new StringBuilder();
            e02.append("serialized size must be non-negative, was ");
            e02.append(n2);
            throw new IllegalStateException(e02.toString());
        }
        if (this.y() != Integer.MAX_VALUE) {
            return this.y();
        }
        int n3 = this.p(e02);
        this.S(n3);
        return n3;
    }

    public int hashCode() {
        if (this.D()) {
            return this.o();
        }
        if (this.z()) {
            this.R(this.o());
        }
        return this.x();
    }

    Object k() {
        return this.r(d.BUILD_MESSAGE_INFO);
    }

    void m() {
        this.memoizedHashCode = 0;
    }

    void n() {
        this.S(Integer.MAX_VALUE);
    }

    int o() {
        return a0.a().d(this).j(this);
    }

    protected final a q() {
        return (a)this.r(d.NEW_BUILDER);
    }

    protected Object r(d d2) {
        return this.t(d2, null, null);
    }

    protected Object s(d d2, Object object) {
        return this.t(d2, object, null);
    }

    protected abstract Object t(d var1, Object var2, Object var3);

    public String toString() {
        return Q.f(this, super.toString());
    }

    public final x w() {
        return (x)this.r(d.GET_DEFAULT_INSTANCE);
    }

    int x() {
        return this.memoizedHashCode;
    }

    int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    boolean z() {
        boolean bl = this.x() == 0;
        return bl;
    }

    public static abstract class a
    extends a.a {
        private final x d;
        protected x e;

        protected a(x x2) {
            this.d = x2;
            if (!x2.D()) {
                this.e = this.q();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void p(Object object, Object object2) {
            a0.a().d(object).a(object, object2);
        }

        private x q() {
            return this.d.J();
        }

        public final x i() {
            x x2 = this.j();
            if (x2.B()) {
                return x2;
            }
            throw a.a.g(x2);
        }

        public x j() {
            if (!this.e.D()) {
                return this.e;
            }
            this.e.E();
            return this.e;
        }

        public a k() {
            a a2 = this.n().H();
            a2.e = this.j();
            return a2;
        }

        protected final void l() {
            if (!this.e.D()) {
                this.m();
            }
        }

        protected void m() {
            x x2 = this.q();
            a.p(x2, this.e);
            this.e = x2;
        }

        public x n() {
            return this.d;
        }

        public a o(x x2) {
            if (this.n().equals(x2)) {
                return this;
            }
            this.l();
            a.p(this.e, x2);
            return this;
        }
    }

    protected static class b
    extends com.google.crypto.tink.shaded.protobuf.b {
        private final x b;

        public b(x x2) {
            this.b = x2;
        }
    }
}

