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

import F0.w;
import F0.x;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class w
extends com.google.crypto.tink.shaded.protobuf.x
implements P {
    private static final w DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private x params_;
    private int version_;

    static {
        w w2;
        DEFAULT_INSTANCE = w2 = new w();
        com.google.crypto.tink.shaded.protobuf.x.Q(w.class, w2);
    }

    private w() {
    }

    public static w X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static w b0(h h2, p p2) {
        return (w)com.google.crypto.tink.shaded.protobuf.x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void c0(int n2) {
        this.keySize_ = n2;
    }

    private void d0(x x2) {
        x2.getClass();
        this.params_ = x2;
    }

    public int Y() {
        return this.keySize_;
    }

    public x Z() {
        x x2;
        x x3 = x2 = this.params_;
        if (x2 == null) {
            x3 = x.X();
        }
        return x3;
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
                Class<w> clazz = w.class;
                synchronized (w.class) {
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
                return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new w();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((w)this.e).c0(n2);
            return this;
        }

        public b s(x x2) {
            this.l();
            ((w)this.e).d0(x2);
            return this;
        }
    }
}

