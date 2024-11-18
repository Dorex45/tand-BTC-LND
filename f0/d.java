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

import F0.d;
import F0.f;
import F0.v;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class d
extends x
implements P {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    static {
        d d2;
        DEFAULT_INSTANCE = d2 = new d();
        x.Q(d.class, d2);
    }

    private d() {
    }

    public static b b0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static d c0(h h2, p p2) {
        return (d)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void d0(f f2) {
        f2.getClass();
        this.aesCtrKey_ = f2;
    }

    private void e0(v v2) {
        v2.getClass();
        this.hmacKey_ = v2;
    }

    private void f0(int n2) {
        this.version_ = n2;
    }

    public f Y() {
        f f2;
        f f3 = f2 = this.aesCtrKey_;
        if (f2 == null) {
            f3 = f.Y();
        }
        return f3;
    }

    public v Z() {
        v v2;
        v v3 = v2 = this.hmacKey_;
        if (v2 == null) {
            v3 = v.Y();
        }
        return v3;
    }

    public int a0() {
        return this.version_;
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
                Class<d> clazz = d.class;
                synchronized (d.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new d();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(f f2) {
            this.l();
            ((d)this.e).d0(f2);
            return this;
        }

        public b s(v v2) {
            this.l();
            ((d)this.e).e0(v2);
            return this;
        }

        public b t(int n2) {
            this.l();
            ((d)this.e).f0(n2);
            return this;
        }
    }
}

