/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package I;

import I.i;
import K.b;
import K.d;
import java.util.concurrent.Executor;

public final class j
implements b {
    public static j a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor)d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor c() {
        return j.b();
    }
}

