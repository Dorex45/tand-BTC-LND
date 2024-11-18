/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.x
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.E;
import com.google.crypto.tink.shaded.protobuf.L;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.T;
import com.google.crypto.tink.shaded.protobuf.W;
import com.google.crypto.tink.shaded.protobuf.Z;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;

final class G
implements f0 {
    private static final N b = new N(){

        @Override
        public boolean a(Class clazz) {
            return false;
        }

        @Override
        public M b(Class clazz) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final N a;

    public G() {
        this(G.b());
    }

    private G(N n3) {
        this.a = (N)z.b(n3, "messageInfoFactory");
    }

    private static N b() {
        return new b(w.c(), G.c());
    }

    private static N c() {
        try {
            N n3 = (N)Class.forName((String)"com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
            return n3;
        }
        catch (Exception exception) {
            return b;
        }
    }

    private static boolean d(M m2) {
        boolean bl = m2.a() == Z.PROTO2;
        return bl;
    }

    private static e0 e(Class object, M m2) {
        if (x.class.isAssignableFrom(object)) {
            object = G.d(m2) ? S.T(object, m2, W.b(), E.b(), g0.L(), s.b(), L.b()) : S.T(object, m2, W.b(), E.b(), g0.L(), null, L.b());
            return object;
        }
        object = G.d(m2) ? S.T(object, m2, W.a(), E.a(), g0.G(), s.a(), L.a()) : S.T(object, m2, W.a(), E.a(), g0.H(), null, L.a());
        return object;
    }

    @Override
    public e0 a(Class clazz) {
        g0.I(clazz);
        M m2 = this.a.b(clazz);
        if (m2.c()) {
            if (x.class.isAssignableFrom(clazz)) {
                return T.m(g0.L(), s.b(), m2.b());
            }
            return T.m(g0.G(), s.a(), m2.b());
        }
        return G.e(clazz, m2);
    }

    private static class b
    implements N {
        private N[] a;

        b(N ... nArray) {
            this.a = nArray;
        }

        @Override
        public boolean a(Class clazz) {
            N[] nArray = this.a;
            int n3 = nArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (!nArray[i2].a(clazz)) continue;
                return true;
            }
            return false;
        }

        @Override
        public M b(Class clazz) {
            for (N n3 : this.a) {
                if (!n3.a(clazz)) continue;
                return n3.b(clazz);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No factory is available for message type: ");
            stringBuilder.append(clazz.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }
}

