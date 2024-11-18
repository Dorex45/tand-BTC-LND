/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package a;

import a.c;
import a.d;
import java.util.concurrent.Executor;

public class a
extends d {
    private static volatile a c;
    private static final Executor d;
    private static final Executor e;
    private d a;
    private d b;

    static {
        d = new Executor(){

            public void execute(Runnable runnable) {
                a.a.d().c(runnable);
            }
        };
        e = new Executor(){

            public void execute(Runnable runnable) {
                a.a.d().a(runnable);
            }
        };
    }

    private a() {
        c c2 = new c();
        this.b = c2;
        this.a = c2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a d() {
        if (c != null) {
            return c;
        }
        Class<a> clazz = a.class;
        synchronized (a.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        a a2;
                        if (c != null) break block4;
                        c = a2 = new a();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                // ** MonitorExit[var1] (shouldn't be in output)
                return c;
            }
            // ** MonitorExit[var1] (shouldn't be in output)
            throw throwable2;
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override
    public boolean b() {
        return this.a.b();
    }

    @Override
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}

