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

import F0.j;
import F0.k;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;

public final class j
extends x
implements P {
    private static final j DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int keySize_;
    private k params_;

    static {
        j j2;
        DEFAULT_INSTANCE = j2 = new j();
        x.Q(j.class, j2);
    }

    private j() {
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static j a0(h h2, p p2) {
        return (j)x.K(DEFAULT_INSTANCE, h2, p2);
    }

    private void b0(int n2) {
        this.keySize_ = n2;
    }

    private void c0(k k2) {
        k2.getClass();
        this.params_ = k2;
    }

    public int X() {
        return this.keySize_;
    }

    public k Y() {
        k k2;
        k k3 = k2 = this.params_;
        if (k2 == null) {
            k3 = k.W();
        }
        return k3;
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
                Class<j> clazz = j.class;
                synchronized (j.class) {
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
        return new j();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((j)this.e).b0(n2);
            return this;
        }

        public b s(k k2) {
            this.l();
            ((j)this.e).c0(k2);
            return this;
        }
    }
}

