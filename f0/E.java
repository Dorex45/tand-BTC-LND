/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package F0;

import F0.e;
import F0.g;
import F0.w;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class e
extends x
implements P {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    static {
        e e2;
        DEFAULT_INSTANCE = e2 = new e();
        x.Q(e.class, e2);
    }

    private e() {
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static e a0(h h2, p p2) {
        return (e)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void b0(g g2) {
        g2.getClass();
        this.aesCtrKeyFormat_ = g2;
    }

    private void c0(w w2) {
        w2.getClass();
        this.hmacKeyFormat_ = w2;
    }

    public g X() {
        g g2;
        g g3 = g2 = this.aesCtrKeyFormat_;
        if (g2 == null) {
            g3 = g.X();
        }
        return g3;
    }

    public w Y() {
        w w2;
        w w3 = w2 = this.hmacKeyFormat_;
        if (w2 == null) {
            w3 = w.X();
        }
        return w3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(x.d object, Object object2, Object object3) {
        switch (a.a[object.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                object2 = PARSER;
                object = object2;
                if (object2 != null) return object;
                Class<e> clazz = e.class;
                synchronized (e.class) {
                    try {
                        object2 = PARSER;
                        object = object2;
                        if (object2 != null) return object;
                        object = new x.b(DEFAULT_INSTANCE);
                        PARSER = object;
                        // ** MonitorExit[var4_5] (shouldn't be in output)
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new e();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(g g2) {
            this.l();
            ((e)this.e).b0(g2);
            return this;
        }

        public b s(w w2) {
            this.l();
            ((e)this.e).c0(w2);
            return this;
        }
    }
}

