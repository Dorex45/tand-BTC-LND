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

import F0.m;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class m
extends x
implements P {
    private static final m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        m m2;
        DEFAULT_INSTANCE = m2 = new m();
        x.Q(m.class, m2);
    }

    private m() {
    }

    public static b X() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static m Y(h h2, p p2) {
        return (m)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void Z(int n2) {
        this.keySize_ = n2;
    }

    public int W() {
        return this.keySize_;
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
                Class<m> clazz = m.class;
                synchronized (m.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new m();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((m)this.e).Z(n2);
            return this;
        }
    }
}

