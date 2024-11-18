/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.logging.Logger
 */
package B0;

import A0.g;
import B0.p;
import D0.b;
import D0.c;
import F0.I;
import G0.f;
import H0.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import s0.t;
import s0.v;
import s0.w;
import s0.x;

class r
implements w {
    private static final Logger a = Logger.getLogger((String)r.class.getName());
    private static final byte[] b = new byte[]{0};
    private static final r c = new r();

    r() {
    }

    public static void f() {
        x.n(c);
    }

    private void g(v object) {
        Iterator iterator = ((v)object).c().iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = ((List)iterator.next()).iterator();
            while (iterator2.hasNext()) {
                Object object2 = (v.c)iterator2.next();
                if (!(((v.c)object2).c() instanceof p)) continue;
                object = (p)((v.c)object2).c();
                if (((a)(object2 = H0.a.a(((v.c)object2).b()))).equals(((p)object).a())) continue;
                iterator2 = new StringBuilder();
                iterator2.append("Mac Key with parameters ");
                iterator2.append((Object)((p)object).b());
                iterator2.append(" has wrong output prefix (");
                iterator2.append((Object)((p)object).a());
                iterator2.append(") instead of (");
                iterator2.append(object2);
                iterator2.append(")");
                throw new GeneralSecurityException(iterator2.toString());
            }
        }
    }

    @Override
    public Class a() {
        return t.class;
    }

    @Override
    public Class c() {
        return t.class;
    }

    public t h(v v2) {
        this.g(v2);
        return new b(v2);
    }

    private static class b
    implements t {
        private final v a;
        private final b.a b;
        private final b.a c;

        private b(v object) {
            this.a = object;
            if (((v)object).i()) {
                D0.b b2 = g.b().a();
                object = A0.f.a((v)object);
                this.b = b2.a((c)object, "mac", "compute");
                this.c = b2.a((c)object, "mac", "verify");
            } else {
                this.b = object = A0.f.a;
                this.c = object;
            }
        }

        @Override
        public void a(byte[] byArray, byte[] byArray2) {
            if (byArray.length > 5) {
                Object object = Arrays.copyOf((byte[])byArray, (int)5);
                Object object2 = Arrays.copyOfRange((byte[])byArray, (int)5, (int)byArray.length);
                for (v.c c2 : this.a.f((byte[])object)) {
                    object = c2.f().equals(I.LEGACY) ? f.a(byArray2, b) : byArray2;
                    try {
                        ((t)c2.g()).a((byte[])object2, (byte[])object);
                        this.c.b(c2.d(), ((byte[])object).length);
                        return;
                    }
                    catch (GeneralSecurityException generalSecurityException) {
                        Logger logger = a;
                        object = new StringBuilder();
                        object.append("tag prefix matches a key, but cannot verify: ");
                        object.append((Object)generalSecurityException);
                        logger.info(object.toString());
                    }
                }
                object = this.a.h().iterator();
                while (object.hasNext()) {
                    object2 = (v.c)object.next();
                    try {
                        ((t)((v.c)object2).g()).a(byArray, byArray2);
                        this.c.b(((v.c)object2).d(), byArray2.length);
                        return;
                    }
                    catch (GeneralSecurityException generalSecurityException) {
                    }
                }
                this.c.a();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.c.a();
            throw new GeneralSecurityException("tag too short");
        }

        @Override
        public byte[] b(byte[] byArray) {
            byte[] byArray2 = byArray;
            if (this.a.e().f().equals(I.LEGACY)) {
                byArray2 = f.a(byArray, b);
            }
            try {
                byArray = f.a(this.a.e().b(), ((t)this.a.e().g()).b(byArray2));
                this.b.b(this.a.e().d(), byArray2.length);
                return byArray;
            }
            catch (GeneralSecurityException generalSecurityException) {
                this.b.a();
                throw generalSecurityException;
            }
        }
    }
}

