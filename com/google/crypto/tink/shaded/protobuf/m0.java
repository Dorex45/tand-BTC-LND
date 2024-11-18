/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.x
 *  java.lang.Object
 *  java.lang.Override
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.x;

class m0
extends k0 {
    m0() {
    }

    l0 A(Object object) {
        return ((x)object).unknownFields;
    }

    int B(l0 l02) {
        return l02.d();
    }

    int C(l0 l02) {
        return l02.e();
    }

    l0 D(l0 l02, l0 l03) {
        if (l0.c().equals(l03)) {
            return l02;
        }
        if (l0.c().equals(l02)) {
            return l0.j(l02, l03);
        }
        return l02.i(l03);
    }

    l0 E() {
        return l0.k();
    }

    void F(Object object, l0 l02) {
        this.G(object, l02);
    }

    void G(Object object, l0 l02) {
        ((x)object).unknownFields = l02;
    }

    l0 H(l0 l02) {
        l02.h();
        return l02;
    }

    void I(l0 l02, r0 r02) {
        l02.p(r02);
    }

    void J(l0 l02, r0 r02) {
        l02.r(r02);
    }

    @Override
    void j(Object object) {
        this.A(object).h();
    }

    @Override
    boolean q(d0 d02) {
        return false;
    }

    void u(l0 l02, int n3, int n4) {
        l02.n(q0.c(n3, 5), n4);
    }

    void v(l0 l02, int n3, long l2) {
        l02.n(q0.c(n3, 1), l2);
    }

    void w(l0 l02, int n3, l0 l03) {
        l02.n(q0.c(n3, 3), l03);
    }

    void x(l0 l02, int n3, h h2) {
        l02.n(q0.c(n3, 2), h2);
    }

    void y(l0 l02, int n3, long l2) {
        l02.n(q0.c(n3, 0), l2);
    }

    l0 z(Object object) {
        l0 l02;
        l0 l03 = l02 = this.A(object);
        if (l02 == l0.c()) {
            l03 = l0.k();
            this.G(object, l03);
        }
        return l03;
    }
}

