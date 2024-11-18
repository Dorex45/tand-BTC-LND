/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class z {
    static final Charset a = Charset.forName((String)"US-ASCII");
    static final Charset b = Charset.forName((String)"UTF-8");
    static final Charset c = Charset.forName((String)"ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final i f;

    static {
        byte[] byArray = new byte[]{};
        d = byArray;
        e = ByteBuffer.wrap((byte[])byArray);
        f = i.h(byArray);
    }

    static Object a(Object object) {
        object.getClass();
        return object;
    }

    static Object b(Object object, String string) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string);
    }

    public static int c(boolean bl) {
        int n2 = bl ? 1231 : 1237;
        return n2;
    }

    public static int d(byte[] byArray) {
        return z.e(byArray, 0, byArray.length);
    }

    static int e(byte[] byArray, int n2, int n3) {
        n2 = n3 = z.h(n3, byArray, n2, n3);
        if (n3 == 0) {
            n2 = 1;
        }
        return n2;
    }

    public static int f(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static boolean g(byte[] byArray) {
        return p0.m(byArray);
    }

    static int h(int n2, byte[] byArray, int n3, int n4) {
        int n5 = n3;
        int n6 = n2;
        for (n2 = n5; n2 < n3 + n4; ++n2) {
            n6 = n6 * 31 + byArray[n2];
        }
        return n6;
    }

    public static String i(byte[] byArray) {
        return new String(byArray, b);
    }

    public static interface a {
    }

    public static interface b {
    }

    public static interface c {
        public boolean a(int var1);
    }

    public static interface d
    extends List,
    RandomAccess {
        public void d();

        public d f(int var1);

        public boolean i();
    }
}

