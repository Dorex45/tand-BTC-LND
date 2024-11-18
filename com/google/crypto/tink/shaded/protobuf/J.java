/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.F
 *  com.google.crypto.tink.shaded.protobuf.f
 *  com.google.crypto.tink.shaded.protobuf.m
 *  com.google.crypto.tink.shaded.protobuf.v
 *  com.google.crypto.tink.shaded.protobuf.y
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import java.util.Map;

final class j
implements d0 {
    private final i a;
    private int b;
    private int c;
    private int d = 0;

    private j(i i2) {
        this.a = i2 = (i)z.b(i2, "input");
        i2.d = this;
    }

    public static j O(i i2) {
        j j2 = i2.d;
        if (j2 != null) {
            return j2;
        }
        return new j(i2);
    }

    private void P(Object object, e0 e02, p p2) {
        block3: {
            int n3 = this.c;
            this.c = q0.c(q0.a(this.b), 4);
            try {
                e02.h(object, this, p2);
                int n4 = this.b;
                int n5 = this.c;
                if (n4 != n5) break block3;
                this.c = n3;
                return;
            }
            catch (Throwable throwable) {
                this.c = n3;
                throw throwable;
            }
        }
        throw A.h();
    }

    private void Q(Object object, e0 e02, p p2) {
        int n3 = this.a.C();
        i i2 = this.a;
        if (i2.a < i2.b) {
            n3 = i2.l(n3);
            i2 = this.a;
            ++i2.a;
            e02.h(object, this, p2);
            this.a.a(0);
            object = this.a;
            --((i)object).a;
            ((i)object).k(n3);
            return;
        }
        throw A.i();
    }

    private Object R(e0 e02, p p2) {
        Object object = e02.g();
        this.P(object, e02, p2);
        e02.i(object);
        return object;
    }

    private Object S(e0 e02, p p2) {
        Object object = e02.g();
        this.Q(object, e02, p2);
        e02.i(object);
        return object;
    }

    private void U(int n3) {
        if (this.a.d() == n3) {
            return;
        }
        throw A.m();
    }

    private void V(int n3) {
        if (q0.b(this.b) == n3) {
            return;
        }
        throw A.e();
    }

    private void W(int n3) {
        if ((n3 & 3) == 0) {
            return;
        }
        throw A.h();
    }

    private void X(int n3) {
        if ((n3 & 7) == 0) {
            return;
        }
        throw A.h();
    }

    @Override
    public String A() {
        this.V(2);
        return this.a.z();
    }

    @Override
    public void B(List list, e0 e02, p p2) {
        if (q0.b(this.b) == 3) {
            block2: {
                int n3;
                int n4 = this.b;
                do {
                    list.add(this.R(e02, p2));
                    if (this.a.e() || this.d != 0) break block2;
                } while ((n3 = this.a.B()) == n4);
                this.d = n3;
            }
            return;
        }
        throw A.e();
    }

    @Override
    public void C(List list, e0 e02, p p2) {
        if (q0.b(this.b) == 2) {
            block2: {
                int n3;
                int n4 = this.b;
                do {
                    list.add(this.S(e02, p2));
                    if (this.a.e() || this.d != 0) break block2;
                } while ((n3 = this.a.B()) == n4);
                this.d = n3;
            }
            return;
        }
        throw A.e();
    }

    @Override
    public long D() {
        this.V(0);
        return this.a.u();
    }

    @Override
    public String E() {
        this.V(2);
        return this.a.A();
    }

    @Override
    public int F() {
        this.V(5);
        return this.a.q();
    }

    @Override
    public void G(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n4 = q0.b(this.b);
                                if (n4 == 1) break block7;
                                if (n4 != 2) break block8;
                                int n5 = this.a.C();
                                this.X(n5);
                                n4 = this.a.d();
                                do {
                                    list.k(this.a.r());
                                } while (this.a.d() < n4 + n5);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.r());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 1) break block10;
                    if (n3 != 2) break block11;
                    int n6 = this.a.C();
                    this.X(n6);
                    n3 = this.a.d();
                    do {
                        list.add((Object)this.a.r());
                    } while (this.a.d() < n3 + n6);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.r());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void H(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.t());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.t());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.t());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.t());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public boolean I() {
        this.V(0);
        return this.a.m();
    }

    @Override
    public void J(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.p());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.p());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.p());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.p());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public int K() {
        int n3 = this.d;
        if (n3 != 0) {
            this.b = n3;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        n3 = this.b;
        if (n3 != 0 && n3 != this.c) {
            return q0.a(n3);
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public void L(Object object, e0 e02, p p2) {
        this.V(3);
        this.P(object, e02, p2);
    }

    @Override
    public void M(List list) {
        this.T(list, false);
    }

    @Override
    public long N() {
        this.V(1);
        return this.a.w();
    }

    public void T(List list, boolean bl) {
        if (q0.b(this.b) == 2) {
            int n3;
            if (list instanceof D && !bl) {
                int n4;
                list = (D)list;
                do {
                    list.j(this.c());
                    if (!this.a.e()) continue;
                    return;
                } while ((n4 = this.a.B()) == this.b);
                this.d = n4;
                return;
            }
            do {
                String string = bl ? this.E() : this.A();
                list.add((Object)string);
                if (!this.a.e()) continue;
                return;
            } while ((n3 = this.a.B()) == this.b);
            this.d = n3;
            return;
        }
        throw A.e();
    }

    @Override
    public void a(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.D());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.D());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.D());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.D());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void b(List list) {
        this.T(list, true);
    }

    @Override
    public h c() {
        this.V(2);
        return this.a.n();
    }

    @Override
    public void d(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.x());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.x());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.x());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.x());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public int e() {
        this.V(0);
        return this.a.p();
    }

    @Override
    public void f(List list) {
        if (list instanceof v) {
            list = (v)list;
            int n3 = q0.b(this.b);
            if (n3 != 2) {
                if (n3 == 5) {
                    do {
                        list.k(this.a.s());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n3 = this.a.B()) == this.b);
                    this.d = n3;
                    return;
                }
                throw A.e();
            }
            n3 = this.a.C();
            this.W(n3);
            int n4 = this.a.d();
            do {
                list.k(this.a.s());
            } while (this.a.d() < n4 + n3);
        } else {
            int n5 = q0.b(this.b);
            if (n5 != 2) {
                if (n5 == 5) {
                    do {
                        list.add((Object)Float.valueOf((float)this.a.s()));
                        if (!this.a.e()) continue;
                        return;
                    } while ((n5 = this.a.B()) == this.b);
                    this.d = n5;
                    return;
                }
                throw A.e();
            }
            int n6 = this.a.C();
            this.W(n6);
            n5 = this.a.d();
            do {
                list.add((Object)Float.valueOf((float)this.a.s()));
            } while (this.a.d() < n5 + n6);
        }
    }

    @Override
    public int g() {
        this.V(0);
        return this.a.C();
    }

    @Override
    public int h() {
        this.V(0);
        return this.a.t();
    }

    @Override
    public void i(Object object, e0 e02, p p2) {
        this.V(2);
        this.Q(object, e02, p2);
    }

    @Override
    public int j() {
        return this.b;
    }

    @Override
    public long k() {
        this.V(0);
        return this.a.D();
    }

    @Override
    public void l(List list) {
        if (list instanceof y) {
            list = (y)list;
            int n3 = q0.b(this.b);
            if (n3 != 2) {
                if (n3 == 5) {
                    do {
                        list.k(this.a.q());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n3 = this.a.B()) == this.b);
                    this.d = n3;
                    return;
                }
                throw A.e();
            }
            int n4 = this.a.C();
            this.W(n4);
            n3 = this.a.d();
            do {
                list.k(this.a.q());
            } while (this.a.d() < n3 + n4);
        } else {
            int n5 = q0.b(this.b);
            if (n5 != 2) {
                if (n5 == 5) {
                    do {
                        list.add((Object)this.a.q());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n5 = this.a.B()) == this.b);
                    this.d = n5;
                    return;
                }
                throw A.e();
            }
            n5 = this.a.C();
            this.W(n5);
            int n6 = this.a.d();
            do {
                list.add((Object)this.a.q());
            } while (this.a.d() < n6 + n5);
        }
    }

    @Override
    public long m() {
        this.V(1);
        return this.a.r();
    }

    @Override
    public void n(List list) {
        if (list instanceof y) {
            list = (y)list;
            int n3 = q0.b(this.b);
            if (n3 != 2) {
                if (n3 == 5) {
                    do {
                        list.k(this.a.v());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n3 = this.a.B()) == this.b);
                    this.d = n3;
                    return;
                }
                throw A.e();
            }
            int n4 = this.a.C();
            this.W(n4);
            n3 = this.a.d();
            do {
                list.k(this.a.v());
            } while (this.a.d() < n3 + n4);
        } else {
            int n5 = q0.b(this.b);
            if (n5 != 2) {
                if (n5 == 5) {
                    do {
                        list.add((Object)this.a.v());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n5 = this.a.B()) == this.b);
                    this.d = n5;
                    return;
                }
                throw A.e();
            }
            int n6 = this.a.C();
            this.W(n6);
            n5 = this.a.d();
            do {
                list.add((Object)this.a.v());
            } while (this.a.d() < n5 + n6);
        }
    }

    @Override
    public boolean o() {
        int n3;
        if (!this.a.e() && (n3 = this.b) != this.c) {
            return this.a.E(n3);
        }
        return false;
    }

    @Override
    public int p() {
        this.V(0);
        return this.a.x();
    }

    @Override
    public void q(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.y());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.y());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.y());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.y());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public long r() {
        this.V(0);
        return this.a.y();
    }

    @Override
    public double readDouble() {
        this.V(1);
        return this.a.o();
    }

    @Override
    public float readFloat() {
        this.V(5);
        return this.a.s();
    }

    @Override
    public int s() {
        this.V(5);
        return this.a.v();
    }

    @Override
    public void t(List list) {
        if (q0.b(this.b) == 2) {
            int n3;
            do {
                list.add((Object)this.c());
                if (!this.a.e()) continue;
                return;
            } while ((n3 = this.a.B()) == this.b);
            this.d = n3;
            return;
        }
        throw A.e();
    }

    @Override
    public void u(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.C());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.C());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.C());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.C());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void v(Map map, H.a a2, p p2) {
        this.V(2);
        int n3 = this.a.C();
        this.a.l(n3);
        throw null;
    }

    @Override
    public void w(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof m)) break block6;
                                list = (m)list;
                                n4 = q0.b(this.b);
                                if (n4 == 1) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                this.X(n4);
                                int n5 = this.a.d();
                                do {
                                    list.k(this.a.o());
                                } while (this.a.d() < n5 + n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.o());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 1) break block10;
                    if (n3 != 2) break block11;
                    int n6 = this.a.C();
                    this.X(n6);
                    n3 = this.a.d();
                    do {
                        list.add((Object)this.a.o());
                    } while (this.a.d() < n3 + n6);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.o());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void x(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.u());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.u());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.u());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.u());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void y(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof f)) break block6;
                                list = (f)list;
                                n4 = q0.b(this.b);
                                if (n4 == 0) break block7;
                                if (n4 != 2) break block8;
                                n4 = this.a.C();
                                n4 = this.a.d() + n4;
                                do {
                                    list.k(this.a.m());
                                } while (this.a.d() < n4);
                                this.U(n4);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.m());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 0) break block10;
                    if (n3 != 2) break block11;
                    n3 = this.a.C();
                    n3 = this.a.d() + n3;
                    do {
                        list.add((Object)this.a.m());
                    } while (this.a.d() < n3);
                    this.U(n3);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.m());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }

    @Override
    public void z(List list) {
        int n3;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n4;
                        block7: {
                            block8: {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n4 = q0.b(this.b);
                                if (n4 == 1) break block7;
                                if (n4 != 2) break block8;
                                int n5 = this.a.C();
                                this.X(n5);
                                n4 = this.a.d();
                                do {
                                    list.k(this.a.w());
                                } while (this.a.d() < n4 + n5);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.k(this.a.w());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n4 = this.a.B()) == this.b);
                        this.d = n4;
                        return;
                    }
                    n3 = q0.b(this.b);
                    if (n3 == 1) break block10;
                    if (n3 != 2) break block11;
                    int n6 = this.a.C();
                    this.X(n6);
                    n3 = this.a.d();
                    do {
                        list.add((Object)this.a.w());
                    } while (this.a.d() < n3 + n6);
                }
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.w());
            if (!this.a.e()) continue;
            return;
        } while ((n3 = this.a.B()) == this.b);
        this.d = n3;
    }
}

