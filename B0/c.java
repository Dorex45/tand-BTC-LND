/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  B0.a
 *  F0.a
 *  F0.b
 *  F0.c
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package B0;

import A0.d;
import A0.l;
import B0.a;
import B0.b;
import B0.f;
import B0.g;
import F0.y;
import G0.m;
import G0.o;
import G0.r;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s0.l;
import s0.t;
import s0.x;

public final class c
extends d {
    private static final l d = l.b(new b(), a.class, g.class);

    c() {
        super(F0.a.class, new A0.m(t.class){

            public t c(F0.a a2) {
                return new o(new m(a2.Y().z()), a2.Z().X());
            }
        });
    }

    public static void o(boolean bl) {
        x.l(new c(), bl);
        f.c();
        A0.h.c().d(d);
    }

    private static void q(F0.c c2) {
        if (c2.X() >= 10) {
            if (c2.X() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    private static void r(int n2) {
        if (n2 == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override
    public d.a f() {
        return new d.a(this, F0.b.class){
            final c b;
            {
                this.b = c2;
                super(clazz);
            }

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                F0.b b2 = (F0.b)F0.b.Z().r(32).s((F0.c)F0.c.Y().r(16).i()).i();
                l.b b3 = l.b.TINK;
                hashMap.put((Object)"AES_CMAC", (Object)new d.a.a(b2, b3));
                hashMap.put((Object)"AES256_CMAC", (Object)new d.a.a((F0.b)F0.b.Z().r(32).s((F0.c)F0.c.Y().r(16).i()).i(), b3));
                hashMap.put((Object)"AES256_CMAC_RAW", (Object)new d.a.a((F0.b)F0.b.Z().r(32).s((F0.c)F0.c.Y().r(16).i()).i(), l.b.RAW));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public F0.a f(F0.b b2) {
                return (F0.a)F0.a.b0().t(0).r(h.n(G0.p.c(b2.X()))).s(b2.Y()).i();
            }

            public F0.b g(h h2) {
                return F0.b.a0((h)h2, (p)p.b());
            }

            public void h(F0.b b2) {
                c.q(b2.Y());
                c.r(b2.X());
            }
        };
    }

    @Override
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    public F0.a n(h h2) {
        return F0.a.c0((h)h2, (p)p.b());
    }

    public void p(F0.a a2) {
        r.c(a2.a0(), this.m());
        c.r(a2.Y().size());
        c.q(a2.Z());
    }
}

