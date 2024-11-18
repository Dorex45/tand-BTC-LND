/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.f$b
 *  androidx.lifecycle.i
 *  androidx.lifecycle.q
 *  java.io.Closeable
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.google.mlkit.vision.common.internal;

import T0.h;
import Y.p;
import Z0.a;
import a1.f;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import com.google.mlkit.vision.common.internal.b;
import com.google.mlkit.vision.common.internal.c;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.k5;
import q0.k;
import q0.n;

public class MobileVisionBase<DetectionResultT>
implements Closeable,
i {
    private static final Y.i i = new Y.i("MobileVisionBase", "");
    public static final int j = 0;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final T0.f e;
    private final q0.b f;
    private final Executor g;
    private final k h;

    public MobileVisionBase(T0.f f2, Executor executor) {
        q0.b b2;
        this.e = f2;
        this.f = b2 = new q0.b();
        this.g = executor;
        f2.c();
        this.h = f2.a(executor, a1.f.a, b2.b()).e(c.a);
    }

    static /* synthetic */ void x(Exception exception) {
        i.d("MobileVisionBase", "Error preloading model resource", exception);
    }

    @q(value=f.b.ON_DESTROY)
    public void close() {
        MobileVisionBase mobileVisionBase = this;
        synchronized (mobileVisionBase) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.d.getAndSet(true)) {
                        this.f.a();
                        this.e.e(this.g);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public k n(a object) {
        MobileVisionBase mobileVisionBase = this;
        synchronized (mobileVisionBase) {
            Throwable throwable2;
            block5: {
                try {
                    p.j(object, "InputImage can not be null");
                    if (this.d.get()) {
                        object = new P0.a("This detector is already closed!", 14);
                        return n.c((Exception)((Object)object));
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (object.k() >= 32 && object.g() >= 32) {
                    T0.f f2 = this.e;
                    Executor executor = this.g;
                    b b2 = new b(this, (a)object);
                    return f2.a(executor, b2, this.f.b());
                }
                object = new P0.a("InputImage width and height should be at least 32!", 3);
                return n.c((Exception)((Object)object));
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final /* synthetic */ Object u(a object) {
        k5 k52 = k5.x("detectorTaskWithResource#run");
        k52.f();
        try {
            object = this.e.i((h)object);
        }
        catch (Throwable throwable) {
            try {
                k52.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke((Object)throwable, new Object[]{throwable2});
                }
                catch (Exception exception) {
                    throw throwable;
                }
                throw throwable;
            }
        }
        k52.close();
        return object;
    }
}

