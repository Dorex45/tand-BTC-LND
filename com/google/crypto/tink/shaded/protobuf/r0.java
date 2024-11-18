/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.List;
import java.util.Map;

interface r0 {
    public void A(int var1, int var2);

    public void B(int var1, List var2, boolean var3);

    public void C(int var1, int var2);

    public void D(int var1, List var2, boolean var3);

    public void E(int var1, double var2);

    public void F(int var1, List var2, boolean var3);

    public void G(int var1, Object var2, e0 var3);

    public void H(int var1, long var2);

    public void I(int var1, List var2, boolean var3);

    public void J(int var1, int var2);

    public void K(int var1, List var2);

    public void L(int var1, List var2, boolean var3);

    public void M(int var1, Object var2, e0 var3);

    public void N(int var1, List var2, boolean var3);

    public void O(int var1, List var2, boolean var3);

    public void a(int var1, h var2);

    public void b(int var1, List var2, e0 var3);

    public void c(int var1, List var2, boolean var3);

    public void d(int var1, List var2, boolean var3);

    public void e(int var1, List var2, boolean var3);

    public void f(int var1, long var2);

    public void g(int var1, H.a var2, Map var3);

    public void h(int var1, List var2, boolean var3);

    public void i(int var1, boolean var2);

    public void j(int var1, long var2);

    public void k(int var1, int var2);

    public void l(int var1, List var2, e0 var3);

    public void m(int var1, Object var2);

    public a n();

    public void o(int var1, long var2);

    public void p(int var1, float var2);

    public void q(int var1, List var2);

    public void r(int var1, int var2);

    public void s(int var1);

    public void t(int var1);

    public void u(int var1, String var2);

    public void v(int var1, int var2);

    public void w(int var1, List var2, boolean var3);

    public void x(int var1, long var2);

    public void y(int var1, List var2, boolean var3);

    public void z(int var1, List var2, boolean var3);

    public static final class a
    extends Enum {
        private static final a[] $VALUES;
        public static final /* enum */ a ASCENDING;
        public static final /* enum */ a DESCENDING;

        static {
            a a2;
            a a3;
            ASCENDING = a3 = new a("ASCENDING", 0);
            DESCENDING = a2 = new a("DESCENDING", 1);
            $VALUES = new a[]{a3, a2};
        }

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        private a() {
            void var2_-1;
            void var1_-1;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])$VALUES.clone();
        }
    }
}

