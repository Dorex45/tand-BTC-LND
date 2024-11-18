/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import java.util.Map;

final class l
implements r0 {
    private final k a;

    private l(k k2) {
        this.a = k2 = (k)z.b(k2, "output");
        k2.a = this;
    }

    public static l P(k k2) {
        l l2 = k2.a;
        if (l2 != null) {
            return l2;
        }
        return new l(k2);
    }

    private void Q(int n3, H.a object, Map map) {
        object = com.google.crypto.tink.shaded.protobuf.l$a.a;
        throw null;
    }

    private void R(int n3, Object object) {
        if (object instanceof String) {
            this.a.C0(n3, (String)object);
        } else {
            this.a.a0(n3, (h)object);
        }
    }

    @Override
    public void A(int n3, int n4) {
        this.a.d0(n3, n4);
    }

    @Override
    public void B(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.w((Long)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.q0((Long)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.p0(n3, (Long)list.get(n4));
            }
        }
    }

    @Override
    public void C(int n3, int n4) {
        this.a.f0(n3, n4);
    }

    @Override
    public void D(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.k((Integer)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.e0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.d0(n3, (Integer)list.get(n4));
            }
        }
    }

    @Override
    public void E(int n3, double d2) {
        this.a.b0(n3, d2);
    }

    @Override
    public void F(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.i((Double)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.c0((Double)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.b0(n3, (Double)list.get(n4));
            }
        }
    }

    @Override
    public void G(int n3, Object object, e0 e02) {
        this.a.l0(n3, (O)object, e02);
    }

    @Override
    public void H(int n3, long l2) {
        this.a.w0(n3, l2);
    }

    @Override
    public void I(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.E((Long)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.x0((Long)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.w0(n3, (Long)list.get(n4));
            }
        }
    }

    @Override
    public void J(int n3, int n4) {
        this.a.y0(n3, n4);
    }

    @Override
    public void K(int n3, List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a.a0(n3, (h)list.get(i2));
        }
    }

    @Override
    public void L(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.m((Integer)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.g0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.f0(n3, (Integer)list.get(n4));
            }
        }
    }

    @Override
    public void M(int n3, Object object, e0 e02) {
        this.a.r0(n3, (O)object, e02);
    }

    @Override
    public void N(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.P((Long)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.H0((Long)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.G0(n3, (Long)list.get(n4));
            }
        }
    }

    @Override
    public void O(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.e((Boolean)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.Z((Boolean)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.Y(n3, (Boolean)list.get(n4));
            }
        }
    }

    @Override
    public void a(int n3, h h2) {
        this.a.a0(n3, h2);
    }

    @Override
    public void b(int n3, List list, e0 e02) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.G(n3, list.get(i2), e02);
        }
    }

    @Override
    public void c(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.u((Integer)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.o0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.n0(n3, (Integer)list.get(n4));
            }
        }
    }

    @Override
    public void d(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.q(((Float)list.get(n4)).floatValue());
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.k0(((Float)list.get(n3)).floatValue());
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.j0(n3, ((Float)list.get(n4)).floatValue());
            }
        }
    }

    @Override
    public void e(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.N((Integer)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.F0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.E0(n3, (Integer)list.get(n4));
            }
        }
    }

    @Override
    public void f(int n3, long l2) {
        this.a.p0(n3, l2);
    }

    @Override
    public void g(int n3, H.a a2, Map map2) {
        if (this.a.T()) {
            this.Q(n3, a2, map2);
            return;
        }
        for (Map map2 : map2.entrySet()) {
            this.a.D0(n3, 2);
            this.a.F0(H.a(a2, map2.getKey(), map2.getValue()));
            H.b(this.a, a2, map2.getKey(), map2.getValue());
        }
    }

    @Override
    public void h(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.I((Long)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.B0((Long)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.A0(n3, (Long)list.get(n4));
            }
        }
    }

    @Override
    public void i(int n3, boolean bl) {
        this.a.Y(n3, bl);
    }

    @Override
    public void j(int n3, long l2) {
        this.a.h0(n3, l2);
    }

    @Override
    public void k(int n3, int n4) {
        this.a.E0(n3, n4);
    }

    @Override
    public void l(int n3, List list, e0 e02) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.M(n3, list.get(i2), e02);
        }
    }

    @Override
    public final void m(int n3, Object object) {
        if (object instanceof h) {
            this.a.t0(n3, (h)object);
        } else {
            this.a.s0(n3, (O)object);
        }
    }

    @Override
    public r0.a n() {
        return r0.a.ASCENDING;
    }

    @Override
    public void o(int n3, long l2) {
        this.a.A0(n3, l2);
    }

    @Override
    public void p(int n3, float f2) {
        this.a.j0(n3, f2);
    }

    @Override
    public void q(int n3, List list) {
        int n4;
        boolean bl = list instanceof D;
        int n5 = 0;
        if (bl) {
            D d2 = (D)list;
            for (n4 = n5; n4 < list.size(); ++n4) {
                this.R(n3, d2.e(n4));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.C0(n3, (String)list.get(n4));
            }
        }
    }

    @Override
    public void r(int n3, int n4) {
        this.a.u0(n3, n4);
    }

    @Override
    public void s(int n3) {
        this.a.D0(n3, 3);
    }

    @Override
    public void t(int n3) {
        this.a.D0(n3, 4);
    }

    @Override
    public void u(int n3, String string) {
        this.a.C0(n3, string);
    }

    @Override
    public void v(int n3, int n4) {
        this.a.n0(n3, n4);
    }

    @Override
    public void w(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n4 = 0;
            for (n3 = 0; n3 < list.size(); ++n3) {
                n4 += k.G((Integer)list.get(n3));
            }
            this.a.F0(n4);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.z0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.y0(n3, (Integer)list.get(n4));
            }
        }
    }

    @Override
    public void x(int n3, long l2) {
        this.a.G0(n3, l2);
    }

    @Override
    public void y(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.o((Long)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.i0((Long)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.h0(n3, (Long)list.get(n4));
            }
        }
    }

    @Override
    public void z(int n3, List list, boolean bl) {
        int n4;
        int n5 = 0;
        if (bl) {
            this.a.D0(n3, 2);
            n3 = 0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                n3 += k.C((Integer)list.get(n4));
            }
            this.a.F0(n3);
            for (n3 = n5; n3 < list.size(); ++n3) {
                this.a.v0((Integer)list.get(n3));
            }
        } else {
            for (n4 = 0; n4 < list.size(); ++n4) {
                this.a.u0(n3, (Integer)list.get(n4));
            }
        }
    }
}

