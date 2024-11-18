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

import F0.g;
import F0.h;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class g
extends x
implements P {
    private static final g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int keySize_;
    private h params_;

    static {
        g g2;
        DEFAULT_INSTANCE = g2 = new g();
        x.Q(g.class, g2);
    }

    private g() {
    }

    public static g X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static g b0(com.google.crypto.tink.shaded.protobuf.h h2, p p2) {
        return (g)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void c0(int n2) {
        this.keySize_ = n2;
    }

    private void d0(h h2) {
        h2.getClass();
        this.params_ = h2;
    }

    public int Y() {
        return this.keySize_;
    }

    public h Z() {
        h h2;
        h h3 = h2 = this.params_;
        if (h2 == null) {
            h3 = h.W();
        }
        return h3;
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
                Class<g> clazz = g.class;
                synchronized (g.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new g();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((g)this.e).c0(n2);
            return this;
        }

        public b s(h h2) {
            this.l();
            ((g)this.e).d0(h2);
            return this;
        }
    }
}

