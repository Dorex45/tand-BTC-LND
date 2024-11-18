/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  B0.i
 *  F0.v
 *  F0.w
 *  F0.x
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.Key
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  javax.crypto.spec.SecretKeySpec
 */
package B0;

import A0.d;
import A0.l;
import A0.m;
import B0.g;
import B0.i;
import B0.j;
import B0.k;
import B0.n;
import F0.u;
import F0.v;
import F0.w;
import F0.x;
import F0.y;
import G0.o;
import G0.r;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import s0.l;
import s0.t;
import x0.b;

public final class k
extends d {
    private static final l d = l.b(new j(), i.class, g.class);

    public k() {
        super(v.class, new m(t.class){

            public t c(v v2) {
                u u2 = v2.a0().Y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(v2.Z().z(), "HMAC");
                int n2 = v2.a0().Z();
                int n3 = c.a[u2.ordinal()];
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                if (n3 == 5) {
                                    return new o(new G0.n("HMACSHA512", (Key)secretKeySpec), n2);
                                }
                                throw new GeneralSecurityException("unknown hash");
                            }
                            return new o(new G0.n("HMACSHA384", (Key)secretKeySpec), n2);
                        }
                        return new o(new G0.n("HMACSHA256", (Key)secretKeySpec), n2);
                    }
                    return new o(new G0.n("HMACSHA224", (Key)secretKeySpec), n2);
                }
                return new o(new G0.n("HMACSHA1", (Key)secretKeySpec), n2);
            }
        });
    }

    private static d.a.a m(int n2, int n3, u u2, l.b b2) {
        return new d.a.a((w)w.a0().s((x)x.a0().r(u2).s(n3).i()).r(n2).i(), b2);
    }

    public static void p(boolean bl) {
        s0.x.l(new k(), bl);
        n.c();
        A0.h.c().d(d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void r(x x2) {
        if (x2.Z() < 10) throw new GeneralSecurityException("tag size too small");
        int n2 = c.a[x2.Y().ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) throw new GeneralSecurityException("unknown hash type");
                        if (x2.Z() <= 64) return;
                        throw new GeneralSecurityException("tag size too big");
                    }
                    if (x2.Z() <= 48) return;
                    throw new GeneralSecurityException("tag size too big");
                }
                if (x2.Z() <= 32) return;
                throw new GeneralSecurityException("tag size too big");
            }
            if (x2.Z() <= 28) return;
            throw new GeneralSecurityException("tag size too big");
        }
        if (x2.Z() > 20) throw new GeneralSecurityException("tag size too big");
    }

    @Override
    public b.b a() {
        return b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override
    public d.a f() {
        return new d.a(this, w.class){
            final k b;
            {
                this.b = k2;
                super(clazz);
            }

            @Override
            public Map c() {
                HashMap hashMap = new HashMap();
                u u2 = u.SHA256;
                l.b b2 = l.b.TINK;
                hashMap.put((Object)"HMAC_SHA256_128BITTAG", (Object)k.m(32, 16, u2, b2));
                l.b b3 = l.b.RAW;
                hashMap.put((Object)"HMAC_SHA256_128BITTAG_RAW", (Object)k.m(32, 16, u2, b3));
                hashMap.put((Object)"HMAC_SHA256_256BITTAG", (Object)k.m(32, 32, u2, b2));
                hashMap.put((Object)"HMAC_SHA256_256BITTAG_RAW", (Object)k.m(32, 32, u2, b3));
                u2 = u.SHA512;
                hashMap.put((Object)"HMAC_SHA512_128BITTAG", (Object)k.m(64, 16, u2, b2));
                hashMap.put((Object)"HMAC_SHA512_128BITTAG_RAW", (Object)k.m(64, 16, u2, b3));
                hashMap.put((Object)"HMAC_SHA512_256BITTAG", (Object)k.m(64, 32, u2, b2));
                hashMap.put((Object)"HMAC_SHA512_256BITTAG_RAW", (Object)k.m(64, 32, u2, b3));
                hashMap.put((Object)"HMAC_SHA512_512BITTAG", (Object)k.m(64, 64, u2, b2));
                hashMap.put((Object)"HMAC_SHA512_512BITTAG_RAW", (Object)k.m(64, 64, u2, b3));
                return Collections.unmodifiableMap((Map)hashMap);
            }

            public v f(w w2) {
                return (v)v.c0().t(this.b.n()).s(w2.Z()).r(h.n(G0.p.c(w2.Y()))).i();
            }

            public w g(h h2) {
                return w.b0((h)h2, (p)p.b());
            }

            public void h(w w2) {
                if (w2.Y() >= 16) {
                    k.r(w2.Z());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            }
        };
    }

    @Override
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    public v o(h h2) {
        return v.d0((h)h2, (p)p.b());
    }

    public void q(v v2) {
        r.c(v2.b0(), this.n());
        if (v2.Z().size() >= 16) {
            k.r(v2.a0());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}

