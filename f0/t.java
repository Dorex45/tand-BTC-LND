/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package F0;

import F0.D;
import F0.t;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import java.io.InputStream;

public final class t
extends x
implements P {
    private static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    private h encryptedKeyset_ = h.e;
    private D keysetInfo_;

    static {
        t t2;
        DEFAULT_INSTANCE = t2 = new t();
        x.Q(t.class, t2);
    }

    private t() {
    }

    public static b Y() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static t Z(InputStream inputStream, p p2) {
        return (t)x.L(DEFAULT_INSTANCE, inputStream, p2);
    }

    private void a0(h h2) {
        h2.getClass();
        this.encryptedKeyset_ = h2;
    }

    private void b0(D d2) {
        d2.getClass();
        this.keysetInfo_ = d2;
    }

    public h X() {
        return this.encryptedKeyset_;
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
                Class<t> clazz = t.class;
                synchronized (t.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new t();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(h h2) {
            this.l();
            ((t)this.e).a0(h2);
            return this;
        }

        public b s(D d2) {
            this.l();
            ((t)this.e).b0(d2);
            return this;
        }
    }
}

