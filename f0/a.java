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

import F0.a;
import F0.c;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class a
extends x
implements P {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.e;
    private c params_;
    private int version_;

    static {
        a a2;
        DEFAULT_INSTANCE = a2 = new a();
        x.Q(a.class, a2);
    }

    private a() {
    }

    public static b b0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static a c0(h h2, p p2) {
        return (a)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void d0(h h2) {
        h2.getClass();
        this.keyValue_ = h2;
    }

    private void e0(c c2) {
        c2.getClass();
        this.params_ = c2;
    }

    private void f0(int n2) {
        this.version_ = n2;
    }

    public h Y() {
        return this.keyValue_;
    }

    public c Z() {
        c c2;
        c c3 = c2 = this.params_;
        if (c2 == null) {
            c3 = c.W();
        }
        return c3;
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
                Class<a> clazz = a.class;
                synchronized (a.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new a();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(h h2) {
            this.l();
            ((a)this.e).d0(h2);
            return this;
        }

        public b s(c c2) {
            this.l();
            ((a)this.e).e0(c2);
            return this;
        }

        public b t(int n2) {
            this.l();
            ((a)this.e).f0(n2);
            return this;
        }
    }
}

