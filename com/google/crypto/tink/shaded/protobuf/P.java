/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.O
 *  com.google.crypto.tink.shaded.protobuf.x$c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.x;
import f.c;
import java.util.Collections;
import java.util.Map;

public class p {
    private static boolean b = true;
    private static volatile p c;
    static final p d;
    private final Map a = Collections.emptyMap();

    static {
        d = new p(true);
    }

    p(boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p b() {
        p p2;
        p p3 = p2 = c;
        if (p2 != null) return p3;
        Class<p> clazz = p.class;
        synchronized (p.class) {
            Throwable throwable2;
            block3: {
                try {
                    p3 = p2 = c;
                    if (p2 != null) return p3;
                    p3 = b ? o.a() : d;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                c = p3;
                // ** MonitorExit[var2_3] (shouldn't be in output)
                return p3;
            }
            // ** MonitorExit[var2_3] (shouldn't be in output)
            throw throwable2;
        }
    }

    public x.c a(O o2, int n2) {
        f.c.a(this.a.get((Object)new a(o2, n2)));
        return null;
    }

    private static final class a {
        private final Object a;
        private final int b;

        a(Object object, int n2) {
            this.a = object;
            this.b = n2;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof a;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (a)object;
            bl = bl2;
            if (this.a == ((a)object).a) {
                bl = bl2;
                if (this.b == ((a)object).b) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return System.identityHashCode((Object)this.a) * 65535 + this.b;
        }
    }
}

