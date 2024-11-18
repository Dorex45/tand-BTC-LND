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

import F0.v;
import F0.x;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class v
extends com.google.crypto.tink.shaded.protobuf.x
implements P {
    private static final v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.e;
    private x params_;
    private int version_;

    static {
        v v2;
        DEFAULT_INSTANCE = v2 = new v();
        com.google.crypto.tink.shaded.protobuf.x.Q(v.class, v2);
    }

    private v() {
    }

    public static v Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static v d0(h h2, p p2) {
        return (v)com.google.crypto.tink.shaded.protobuf.x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void e0(h h2) {
        h2.getClass();
        this.keyValue_ = h2;
    }

    private void f0(x x2) {
        x2.getClass();
        this.params_ = x2;
    }

    private void g0(int n2) {
        this.version_ = n2;
    }

    public h Z() {
        return this.keyValue_;
    }

    public x a0() {
        x x2;
        x x3 = x2 = this.params_;
        if (x2 == null) {
            x3 = x.X();
        }
        return x3;
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
                Class<v> clazz = v.class;
                synchronized (v.class) {
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
                return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new v();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(h h2) {
            this.l();
            ((v)this.e).e0(h2);
            return this;
        }

        public b s(x x2) {
            this.l();
            ((v)this.e).f0(x2);
            return this;
        }

        public b t(int n2) {
            this.l();
            ((v)this.e).g0(n2);
            return this;
        }
    }
}

