/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.j
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.InputStream;

public abstract class i {
    private static volatile int f = 100;
    int a;
    int b = f;
    int c = Integer.MAX_VALUE;
    j d;
    private boolean e = false;

    private i() {
    }

    public static int b(int n2) {
        return -(n2 & 1) ^ n2 >>> 1;
    }

    public static long c(long l2) {
        return -(l2 & 1L) ^ l2 >>> 1;
    }

    public static i f(InputStream inputStream) {
        return i.g(inputStream, 4096);
    }

    public static i g(InputStream inputStream, int n2) {
        if (n2 > 0) {
            if (inputStream == null) {
                return i.h(z.d);
            }
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] byArray) {
        return i.i(byArray, 0, byArray.length);
    }

    public static i i(byte[] byArray, int n2, int n3) {
        return i.j(byArray, n2, n3, false);
    }

    static i j(byte[] object, int n2, int n3, boolean bl) {
        object = new /* Unavailable Anonymous Inner Class!! */;
        try {
            object.l(n3);
            return object;
        }
        catch (A a2) {
            throw new IllegalArgumentException((Throwable)a2);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int var1);

    public abstract void a(int var1);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int var1);

    public abstract int l(int var1);

    public abstract boolean m();

    public abstract h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}

