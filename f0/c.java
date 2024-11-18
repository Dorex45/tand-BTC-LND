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

import F0.c;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;

public final class c
extends x
implements P {
    private static final c DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        c c2;
        DEFAULT_INSTANCE = c2 = new c();
        x.Q(c.class, c2);
    }

    private c() {
    }

    public static c W() {
        return DEFAULT_INSTANCE;
    }

    public static b Y() {
        return (b)DEFAULT_INSTANCE.q();
    }

    private void Z(int n2) {
        this.tagSize_ = n2;
    }

    public int X() {
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
                Class<c> clazz = c.class;
                synchronized (c.class) {
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
                return x.I(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            }
            case 2: {
                return new b();
            }
            case 1: 
        }
        return new c();
    }

    public static final class b
    extends x.a
    implements P {
        private b() {
            super(DEFAULT_INSTANCE);
        }

        public b r(int n2) {
            this.l();
            ((c)this.e).Z(n2);
            return this;
        }
    }
}

