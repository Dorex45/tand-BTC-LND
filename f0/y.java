/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package F0;

import F0.y;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;

public final class y
extends x
implements P {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private h value_ = h.e;

    static {
        y y2;
        DEFAULT_INSTANCE = y2 = new y();
        x.Q(y.class, y2);
    }

    private y() {
    }

    public static y Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    private void d0(c c2) {
        this.keyMaterialType_ = c2.b();
    }

    private void e0(String string) {
        string.getClass();
        this.typeUrl_ = string;
    }

    private void f0(h h2) {
        h2.getClass();
        this.value_ = h2;
    }

    public c Z() {
        c c2;
        c c3 = c2 = c.a(this.keyMaterialType_);
        if (c2 == null) {
            c3 = c.UNRECOGNIZED;
        }
        return c3;
    }

    public String a0() {
        return this.typeUrl_;
    }

    public h b0() {
        return this.value_;
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
                Class<y> clazz = y.class;
                synchronized (y.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new y();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(c c2) {
            this.l();
            ((y)this.e).d0(c2);
            return this;
        }

        public b s(String string) {
            this.l();
            ((y)this.e).e0(string);
            return this;
        }

        public b t(h h2) {
            this.l();
            ((y)this.e).f0(h2);
            return this;
        }
    }
}

