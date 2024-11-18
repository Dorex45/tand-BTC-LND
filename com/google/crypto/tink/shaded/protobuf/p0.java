/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.p0$e
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.p0;

/*
 * Exception performing whole class analysis ignored.
 */
abstract class p0 {
    private static final b a;

    static {
        Object object = e.e() && !com.google.crypto.tink.shaded.protobuf.d.c() ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */;
        a = object;
    }

    static /* synthetic */ int a(int n2, int n3) {
        return p0.j(n2, n3);
    }

    static /* synthetic */ int b(int n2, int n3, int n4) {
        return p0.k(n2, n3, n4);
    }

    static /* synthetic */ int c(byte[] byArray, int n2, int n3) {
        return p0.l(byArray, n2, n3);
    }

    static /* synthetic */ int d(int n2) {
        return p0.i(n2);
    }

    static String e(byte[] byArray, int n2, int n3) {
        return a.a(byArray, n2, n3);
    }

    static int f(CharSequence charSequence, byte[] byArray, int n2, int n3) {
        return a.b(charSequence, byArray, n2, n3);
    }

    static int g(CharSequence charSequence) {
        int n2;
        int n3;
        block3: {
            int n4;
            n3 = charSequence.length();
            for (n4 = 0; n4 < n3 && charSequence.charAt(n4) < '\u0080'; ++n4) {
            }
            int n5 = n3;
            while (true) {
                n2 = n5;
                if (n4 >= n3) break block3;
                n2 = charSequence.charAt(n4);
                if (n2 >= 2048) break;
                n5 += 127 - n2 >>> 31;
                ++n4;
            }
            n2 = n5 + p0.h(charSequence, n4);
        }
        if (n2 >= n3) {
            return n2;
        }
        charSequence = new StringBuilder();
        charSequence.append("UTF-8 length does not fit in int: ");
        charSequence.append((long)n2 + 0x100000000L);
        throw new IllegalArgumentException(charSequence.toString());
    }

    private static int h(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        int n4 = 0;
        while (n2 < n3) {
            int n5;
            char c2 = charSequence.charAt(n2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
                n5 = n2;
            } else {
                int n6;
                n4 = n6 = n4 + 2;
                n5 = n2;
                if ('\ud800' <= c2) {
                    n4 = n6;
                    n5 = n2;
                    if (c2 <= '\udfff') {
                        if (Character.codePointAt((CharSequence)charSequence, (int)n2) >= 65536) {
                            n5 = n2 + 1;
                            n4 = n6;
                        } else {
                            throw new d(n2, n3);
                        }
                    }
                }
            }
            n2 = n5 + 1;
        }
        return n4;
    }

    private static int i(int n2) {
        int n3 = n2;
        if (n2 > -12) {
            n3 = -1;
        }
        return n3;
    }

    private static int j(int n2, int n3) {
        n2 = n2 <= -12 && n3 <= -65 ? (n2 ^= n3 << 8) : -1;
        return n2;
    }

    private static int k(int n2, int n3, int n4) {
        n2 = n2 <= -12 && n3 <= -65 && n4 <= -65 ? n2 ^ n3 << 8 ^ n4 << 16 : -1;
        return n2;
    }

    private static int l(byte[] byArray, int n2, int n3) {
        byte by = byArray[n2 - 1];
        if ((n3 -= n2) != 0) {
            if (n3 != 1) {
                if (n3 == 2) {
                    return p0.k(by, byArray[n2], byArray[n2 + 1]);
                }
                throw new AssertionError();
            }
            return p0.j(by, byArray[n2]);
        }
        return p0.i(by);
    }

    static boolean m(byte[] byArray) {
        return a.c(byArray, 0, byArray.length);
    }

    static boolean n(byte[] byArray, int n2, int n3) {
        return a.c(byArray, n2, n3);
    }

    private static abstract class a {
        static /* synthetic */ void a(byte by, byte by2, byte by3, byte by4, char[] cArray, int n2) {
            com.google.crypto.tink.shaded.protobuf.p0$a.h(by, by2, by3, by4, cArray, n2);
        }

        static /* synthetic */ boolean b(byte by) {
            return com.google.crypto.tink.shaded.protobuf.p0$a.n(by);
        }

        static /* synthetic */ void c(byte by, char[] cArray, int n2) {
            com.google.crypto.tink.shaded.protobuf.p0$a.i(by, cArray, n2);
        }

        static /* synthetic */ boolean d(byte by) {
            return com.google.crypto.tink.shaded.protobuf.p0$a.p(by);
        }

        static /* synthetic */ void e(byte by, byte by2, char[] cArray, int n2) {
            com.google.crypto.tink.shaded.protobuf.p0$a.k(by, by2, cArray, n2);
        }

        static /* synthetic */ boolean f(byte by) {
            return com.google.crypto.tink.shaded.protobuf.p0$a.o(by);
        }

        static /* synthetic */ void g(byte by, byte by2, byte by3, char[] cArray, int n2) {
            com.google.crypto.tink.shaded.protobuf.p0$a.j(by, by2, by3, cArray, n2);
        }

        private static void h(byte by, byte by2, byte by3, byte by4, char[] cArray, int n2) {
            if (!(com.google.crypto.tink.shaded.protobuf.p0$a.m(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || com.google.crypto.tink.shaded.protobuf.p0$a.m(by3) || com.google.crypto.tink.shaded.protobuf.p0$a.m(by4))) {
                by = (byte)((by & 7) << 18 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by2) << 12 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by3) << 6 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by4));
                cArray[n2] = com.google.crypto.tink.shaded.protobuf.p0$a.l(by);
                cArray[n2 + 1] = com.google.crypto.tink.shaded.protobuf.p0$a.q(by);
                return;
            }
            throw A.d();
        }

        private static void i(byte by, char[] cArray, int n2) {
            cArray[n2] = (char)by;
        }

        private static void j(byte by, byte by2, byte by3, char[] cArray, int n2) {
            if (!(com.google.crypto.tink.shaded.protobuf.p0$a.m(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || com.google.crypto.tink.shaded.protobuf.p0$a.m(by3))) {
                cArray[n2] = (char)((by & 0xF) << 12 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by2) << 6 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by3));
                return;
            }
            throw A.d();
        }

        private static void k(byte by, byte by2, char[] cArray, int n2) {
            if (by >= -62 && !com.google.crypto.tink.shaded.protobuf.p0$a.m(by2)) {
                cArray[n2] = (char)((by & 0x1F) << 6 | com.google.crypto.tink.shaded.protobuf.p0$a.r(by2));
                return;
            }
            throw A.d();
        }

        private static char l(int n2) {
            return (char)((n2 >>> 10) + 55232);
        }

        private static boolean m(byte by) {
            boolean bl = by > -65;
            return bl;
        }

        private static boolean n(byte by) {
            boolean bl = by >= 0;
            return bl;
        }

        private static boolean o(byte by) {
            boolean bl = by < -16;
            return bl;
        }

        private static boolean p(byte by) {
            boolean bl = by < -32;
            return bl;
        }

        private static char q(int n2) {
            return (char)((n2 & 0x3FF) + 56320);
        }

        private static int r(byte by) {
            return by & 0x3F;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] var1, int var2, int var3);

        abstract int b(CharSequence var1, byte[] var2, int var3, int var4);

        final boolean c(byte[] byArray, int n2, int n3) {
            boolean bl = false;
            if (this.d(0, byArray, n2, n3) == 0) {
                bl = true;
            }
            return bl;
        }

        abstract int d(int var1, byte[] var2, int var3, int var4);
    }

    static class d
    extends IllegalArgumentException {
        d(int n2, int n3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(n2);
            stringBuilder.append(" of ");
            stringBuilder.append(n3);
            super(stringBuilder.toString());
        }
    }
}

