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

import F0.b;
import F0.c;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class b
extends x
implements P {
    private static final b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private int keySize_;
    private c params_;

    static {
        b b2;
        DEFAULT_INSTANCE = b2 = new b();
        x.Q(b.class, b2);
    }

    private b() {
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static b a0(h h2, p p2) {
        return (b)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void b0(int n2) {
        this.keySize_ = n2;
    }

    private void c0(c c2) {
        c2.getClass();
        this.params_ = c2;
    }

    public int X() {
        return this.keySize_;
    }

    public c Y() {
        c c2;
        c c3 = c2 = this.params_;
        if (c2 == null) {
            c3 = c.W();
        }
        return c3;
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
                Class<b> clazz = b.class;
                synchronized (b.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new b();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((b)this.e).b0(n2);
            return this;
        }

        public b s(c c2) {
            this.l();
            ((b)this.e).c0(c2);
            return this;
        }
    }
}

