/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;

abstract class k0 {
    k0() {
    }

    abstract void a(Object var1, int var2, int var3);

    abstract void b(Object var1, int var2, long var3);

    abstract void c(Object var1, int var2, Object var3);

    abstract void d(Object var1, int var2, h var3);

    abstract void e(Object var1, int var2, long var3);

    abstract Object f(Object var1);

    abstract Object g(Object var1);

    abstract int h(Object var1);

    abstract int i(Object var1);

    abstract void j(Object var1);

    abstract Object k(Object var1, Object var2);

    final void l(Object object, d0 d02) {
        while (d02.K() != Integer.MAX_VALUE && this.m(object, d02)) {
        }
    }

    final boolean m(Object object, d0 d02) {
        int n2 = d02.j();
        int n3 = q0.a(n2);
        if ((n2 = q0.b(n2)) != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                this.a(object, n3, d02.F());
                                return true;
                            }
                            throw A.e();
                        }
                        return false;
                    }
                    Object object2 = this.n();
                    n2 = q0.c(n3, 4);
                    this.l(object2, d02);
                    if (n2 == d02.j()) {
                        this.c(object, n3, this.r(object2));
                        return true;
                    }
                    throw A.b();
                }
                this.d(object, n3, d02.c());
                return true;
            }
            this.b(object, n3, d02.m());
            return true;
        }
        this.e(object, n3, d02.D());
        return true;
    }

    abstract Object n();

    abstract void o(Object var1, Object var2);

    abstract void p(Object var1, Object var2);

    abstract boolean q(d0 var1);

    abstract Object r(Object var1);

    abstract void s(Object var1, r0 var2);

    abstract void t(Object var1, r0 var2);
}

