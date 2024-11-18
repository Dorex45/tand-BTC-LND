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

import F0.u;
import F0.x;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;

public final class x
extends com.google.crypto.tink.shaded.protobuf.x
implements P {
    private static final x DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        x x2;
        DEFAULT_INSTANCE = x2 = new x();
        com.google.crypto.tink.shaded.protobuf.x.Q(x.class, x2);
    }

    private x() {
    }

    public static x X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    private void b0(u u2) {
        this.hash_ = u2.b();
    }

    private void c0(int n2) {
        this.tagSize_ = n2;
    }

    public u Y() {
        u u2;
        u u3 = u2 = u.a(this.hash_);
        if (u2 == null) {
            u3 = u.UNRECOGNIZED;
        }
        return u3;
    }

    public int Z() {
        return this.tagSize_;
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
                Class<x> clazz = x.class;
                synchronized (x.class) {
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
                return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new x();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(u u2) {
            this.l();
            ((x)this.e).b0(u2);
            return this;
        }

        public b s(int n2) {
            this.l();
            ((x)this.e).c0(n2);
            return this;
        }
    }
}

