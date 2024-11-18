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

import F0.f;
import F0.h;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class f
extends x
implements P {
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.e;
    private h params_;
    private int version_;

    static {
        f f2;
        DEFAULT_INSTANCE = f2 = new f();
        x.Q(f.class, f2);
    }

    private f() {
    }

    public static f Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static f d0(com.google.crypto.tink.shaded.protobuf.h h2, p p2) {
        return (f)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void e0(com.google.crypto.tink.shaded.protobuf.h h2) {
        h2.getClass();
        this.keyValue_ = h2;
    }

    private void f0(h h2) {
        h2.getClass();
        this.params_ = h2;
    }

    private void g0(int n2) {
        this.version_ = n2;
    }

    public com.google.crypto.tink.shaded.protobuf.h Z() {
        return this.keyValue_;
    }

    public h a0() {
        h h2;
        h h3 = h2 = this.params_;
        if (h2 == null) {
            h3 = h.W();
        }
        return h3;
    }

    public int b0() {
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
                Class<f> clazz = f.class;
                synchronized (f.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new f();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(com.google.crypto.tink.shaded.protobuf.h h2) {
            this.l();
            ((f)this.e).e0(h2);
            return this;
        }

        public b s(h h2) {
            this.l();
            ((f)this.e).f0(h2);
            return this;
        }

        public b t(int n2) {
            this.l();
            ((f)this.e).g0(n2);
            return this;
        }
    }
}

