/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package a;

import a.b;
import a.d;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c
extends d {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool((int)4, (ThreadFactory)new ThreadFactory(this){
        private final AtomicInteger a;
        final c b;
        {
            this.b = c2;
            this.a = new AtomicInteger(0);
        }

        public Thread newThread(Runnable runnable) {
            runnable = new Thread(runnable);
            runnable.setName(String.format((String)"arch_disk_io_%d", (Object[])new Object[]{this.a.getAndIncrement()}));
            return runnable;
        }
    });
    private volatile Handler c;

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b.a(looper);
        }
        try {
            Handler handler = (Handler)Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            return handler;
        }
        catch (InvocationTargetException invocationTargetException) {
            return new Handler(looper);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException throwable) {
            return new Handler(looper);
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override
    public boolean b() {
        boolean bl = Looper.getMainLooper().getThread() == Thread.currentThread();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Runnable runnable) {
        block6: {
            if (this.c == null) {
                Object object;
                Object object2 = object = this.a;
                synchronized (object2) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (this.c != null) break block4;
                                this.c = a.c.d(Looper.getMainLooper());
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        this.c.post(runnable);
    }
}

