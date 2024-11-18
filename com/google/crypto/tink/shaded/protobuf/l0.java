/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.k
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Arrays;

public final class l0 {
    private static final l0 f = new l0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private l0() {
        this(0, new int[8], new Object[8], true);
    }

    private l0(int n2, int[] nArray, Object[] objectArray, boolean bl) {
        this.a = n2;
        this.b = nArray;
        this.c = objectArray;
        this.e = bl;
    }

    private void b(int n2) {
        int[] nArray = this.b;
        if (n2 > nArray.length) {
            int n3 = this.a;
            if ((n3 += n3 / 2) >= n2) {
                n2 = n3;
            }
            n3 = n2;
            if (n2 < 8) {
                n3 = 8;
            }
            this.b = Arrays.copyOf((int[])nArray, (int)n3);
            this.c = Arrays.copyOf((Object[])this.c, (int)n3);
        }
    }

    public static l0 c() {
        return f;
    }

    private static int f(int[] nArray, int n2) {
        int n3 = 17;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + nArray[i2];
        }
        return n3;
    }

    private static int g(Object[] objectArray, int n2) {
        int n3 = 17;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + objectArray[i2].hashCode();
        }
        return n3;
    }

    static l0 j(l0 l02, l0 l03) {
        int n2 = l02.a + l03.a;
        int[] nArray = Arrays.copyOf((int[])l02.b, (int)n2);
        System.arraycopy((Object)l03.b, (int)0, (Object)nArray, (int)l02.a, (int)l03.a);
        Object[] objectArray = Arrays.copyOf((Object[])l02.c, (int)n2);
        System.arraycopy((Object)l03.c, (int)0, (Object)objectArray, (int)l02.a, (int)l03.a);
        return new l0(n2, nArray, objectArray, true);
    }

    static l0 k() {
        return new l0();
    }

    private static boolean l(Object[] objectArray, Object[] objectArray2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (objectArray[i2].equals(objectArray2[i2])) continue;
            return false;
        }
        return true;
    }

    private static boolean o(int[] nArray, int[] nArray2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (nArray[i2] == nArray2[i2]) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void q(int n2, Object object, r0 r02) {
        int n3 = q0.a(n2);
        if ((n2 = q0.b(n2)) != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 5) throw new RuntimeException((Throwable)A.e());
                        r02.C(n3, (Integer)object);
                        return;
                    } else if (r02.n() == r0.a.ASCENDING) {
                        r02.s(n3);
                        ((l0)object).r(r02);
                        r02.t(n3);
                        return;
                    } else {
                        r02.t(n3);
                        ((l0)object).r(r02);
                        r02.s(n3);
                    }
                    return;
                } else {
                    r02.a(n3, (h)object);
                }
                return;
            } else {
                r02.j(n3, (Long)object);
            }
            return;
        } else {
            r02.f(n3, (Long)object);
        }
    }

    void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        int n2 = this.d;
        if (n2 != -1) {
            return n2;
        }
        int n3 = 0;
        int n4 = 0;
        while (true) {
            block8: {
                block9: {
                    block10: {
                        if (n3 >= this.a) {
                            this.d = n4;
                            return n4;
                        }
                        int n5 = this.b[n3];
                        n2 = q0.a(n5);
                        if ((n5 = q0.b(n5)) == 0) break block9;
                        if (n5 == 1) break block10;
                        if (n5 != 2) {
                            if (n5 != 3) {
                                if (n5 != 5) {
                                    throw new IllegalStateException((Throwable)A.e());
                                }
                                n2 = k.l((int)n2, (int)((Integer)this.c[n3]));
                                break block8;
                            } else {
                                n2 = k.L((int)n2) * 2 + ((l0)this.c[n3]).d();
                            }
                            break block8;
                        } else {
                            n2 = k.f((int)n2, (h)((h)this.c[n3]));
                        }
                        break block8;
                    }
                    n2 = k.n((int)n2, (long)((Long)this.c[n3]));
                    break block8;
                }
                n2 = k.O((int)n2, (long)((Long)this.c[n3]));
            }
            n4 += n2;
            ++n3;
        }
    }

    public int e() {
        int n2 = this.d;
        if (n2 != -1) {
            return n2;
        }
        int n3 = 0;
        for (n2 = 0; n2 < this.a; ++n2) {
            n3 += k.A((int)q0.a(this.b[n2]), (h)((h)this.c[n2]));
        }
        this.d = n3;
        return n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof l0)) {
            return false;
        }
        object = (l0)object;
        int n2 = this.a;
        return n2 == ((l0)object).a && l0.o(this.b, ((l0)object).b, n2) && l0.l(this.c, ((l0)object).c, this.a);
        {
        }
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int n2 = this.a;
        return ((527 + n2) * 31 + l0.f(this.b, n2)) * 31 + l0.g(this.c, this.a);
    }

    l0 i(l0 l02) {
        if (l02.equals(l0.c())) {
            return this;
        }
        this.a();
        int n2 = this.a + l02.a;
        this.b(n2);
        System.arraycopy((Object)l02.b, (int)0, (Object)this.b, (int)this.a, (int)l02.a);
        System.arraycopy((Object)l02.c, (int)0, (Object)this.c, (int)this.a, (int)l02.a);
        this.a = n2;
        return this;
    }

    final void m(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            Q.d(stringBuilder, n2, String.valueOf((int)q0.a(this.b[i2])), this.c[i2]);
        }
    }

    void n(int n2, Object object) {
        this.a();
        this.b(this.a + 1);
        int[] nArray = this.b;
        int n3 = this.a;
        nArray[n3] = n2;
        this.c[n3] = object;
        this.a = n3 + 1;
    }

    void p(r0 r02) {
        if (r02.n() == r0.a.DESCENDING) {
            for (int i2 = this.a - 1; i2 >= 0; --i2) {
                r02.m(q0.a(this.b[i2]), this.c[i2]);
            }
        } else {
            for (int i3 = 0; i3 < this.a; ++i3) {
                r02.m(q0.a(this.b[i3]), this.c[i3]);
            }
        }
    }

    public void r(r0 r02) {
        if (this.a == 0) {
            return;
        }
        if (r02.n() == r0.a.ASCENDING) {
            for (int i2 = 0; i2 < this.a; ++i2) {
                l0.q(this.b[i2], this.c[i2], r02);
            }
        } else {
            for (int i3 = this.a - 1; i3 >= 0; --i3) {
                l0.q(this.b[i3], this.c[i3], r02);
            }
        }
    }
}

