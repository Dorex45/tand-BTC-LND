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

import F0.l;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class l
extends x
implements P {
    private static final l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.e;
    private int version_;

    static {
        l l2;
        DEFAULT_INSTANCE = l2 = new l();
        x.Q(l.class, l2);
    }

    private l() {
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static l a0(h h2, p p2) {
        return (l)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void b0(h h2) {
        h2.getClass();
        this.keyValue_ = h2;
    }

    private void c0(int n2) {
        this.version_ = n2;
    }

    public h X() {
        return this.keyValue_;
    }

    public int Y() {
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
                Class<l> clazz = l.class;
                synchronized (l.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new l();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(h h2) {
            this.l();
            ((l)this.e).b0(h2);
            return this;
        }

        public b s(int n2) {
            this.l();
            ((l)this.e).c0(n2);
            return this;
        }
    }
}

