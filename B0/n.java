/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A0.o
 *  A0.p
 *  B0.i
 *  B0.l
 *  B0.m
 *  F0.I
 *  F0.u
 *  F0.v
 *  com.google.crypto.tink.shaded.protobuf.A
 *  com.google.crypto.tink.shaded.protobuf.h
 *  com.google.crypto.tink.shaded.protobuf.p
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  s0.y
 *  t0.j
 *  t0.k
 *  t0.l
 */
package B0;

import A0.b;
import A0.c;
import A0.j;
import A0.k;
import A0.o;
import A0.t;
import B0.i;
import B0.l;
import B0.m;
import F0.I;
import F0.u;
import F0.v;
import H0.b;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import s0.y;
import t0.j;
import t0.k;

abstract class n {
    private static final H0.a a;
    private static final A0.k b;
    private static final A0.j c;
    private static final c d;
    private static final A0.b e;

    static {
        H0.a a2;
        a = a2 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        b = A0.k.a((k.b)new j(), l.class, A0.p.class);
        c = A0.j.a((j.b)new k(), a2, A0.p.class);
        d = A0.c.a((c.b)new t0.l(), i.class, o.class);
        e = A0.b.a((b.b)new m(), a2, o.class);
    }

    public static /* synthetic */ i a(o o2, y y2) {
        return n.b(o2, y2);
    }

    private static i b(o object, y y2) {
        if (object.f().equals((Object)"type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                v v2 = v.d0((h)object.g(), (p)p.b());
                if (v2.b0() == 0) {
                    l l2 = l.a().c(v2.Z().size()).d(v2.a0().Z()).b(n.e(v2.a0().Y())).e(n.f(object.e())).a();
                    return i.c().e(l2).d(H0.b.a(v2.Z().z(), y.b((y)y2))).c(object.c()).a();
                }
                object = new GeneralSecurityException("Only version 0 keys are accepted");
                throw object;
            }
            catch (A | IllegalArgumentException throwable) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static void c() {
        n.d(A0.i.a());
    }

    public static void d(A0.i i2) {
        i2.h(b);
        i2.g(c);
        i2.f(d);
        i2.e(e);
    }

    private static l.c e(u u2) {
        int n2 = B0.n$a.a[u2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 == 5) {
                            return l.c.f;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to parse HashType: ");
                        stringBuilder.append(u2.b());
                        throw new GeneralSecurityException(stringBuilder.toString());
                    }
                    return l.c.e;
                }
                return l.c.d;
            }
            return l.c.c;
        }
        return l.c.b;
    }

    private static l.d f(I i2) {
        int n2 = B0.n$a.b[i2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 == 4) {
                        return l.d.e;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to parse OutputPrefixType: ");
                    stringBuilder.append(i2.b());
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
                return l.d.d;
            }
            return l.d.c;
        }
        return l.d.b;
    }
}

