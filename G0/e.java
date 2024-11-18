/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  G0.e$c
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.charset.Charset
 */
package G0;

import G0.e;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class e {
    private static final Charset a = Charset.forName((String)"UTF-8");

    public static byte[] a(String string, int n2) {
        return e.b(string.getBytes(a), n2);
    }

    public static byte[] b(byte[] byArray, int n2) {
        return e.c(byArray, 0, byArray.length, n2);
    }

    public static byte[] c(byte[] byArray, int n2, int n3, int n4) {
        Object object = new /* Unavailable Anonymous Inner Class!! */;
        if (object.a(byArray, n2, n3, true)) {
            n2 = object.b;
            byArray = object.a;
            if (n2 == byArray.length) {
                return byArray;
            }
            object = new byte[n2];
            System.arraycopy((Object)byArray, (int)0, (Object)object, (int)0, (int)n2);
            return object;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String d(byte[] byArray) {
        return e.g(byArray, 2);
    }

    public static byte[] e(byte[] byArray, int n2) {
        return e.f(byArray, 0, byArray.length, n2);
    }

    public static byte[] f(byte[] byArray, int n2, int n3, int n4) {
        c c2 = new /* Unavailable Anonymous Inner Class!! */;
        int n5 = n3 / 3 * 4;
        boolean bl = c2.f;
        int n6 = 2;
        if (bl) {
            n4 = n5;
            if (n3 % 3 > 0) {
                n4 = n5 + 4;
            }
        } else {
            n4 = n3 % 3;
            n4 = n4 != 1 ? (n4 != 2 ? n5 : n5 + 3) : n5 + 2;
        }
        n5 = n4;
        if (c2.g) {
            n5 = n4;
            if (n3 > 0) {
                int n7 = (n3 - 1) / 57;
                n5 = c2.h ? n6 : 1;
                n5 = n4 + (n7 + 1) * n5;
            }
        }
        c2.a = new byte[n5];
        c2.a(byArray, n2, n3, true);
        return c2.a;
    }

    public static String g(byte[] object, int n2) {
        try {
            object = new String(e.e(object, n2), "US-ASCII");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    static abstract class a {
        public byte[] a;
        public int b;

        a() {
        }
    }
}

