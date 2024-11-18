/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  j1.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package g1;

import io.flutter.embedding.engine.FlutterJNI;
import j1.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {
    private static a d;
    private static boolean e;
    private d a;
    private FlutterJNI.c b;
    private ExecutorService c;

    private a(d d2, i1.a a2, FlutterJNI.c c2, ExecutorService executorService) {
        this.a = d2;
        this.b = c2;
        this.c = executorService;
    }

    public static a e() {
        e = true;
        if (d == null) {
            d = new b().a();
        }
        return d;
    }

    public i1.a a() {
        return null;
    }

    public ExecutorService b() {
        return this.c;
    }

    public d c() {
        return this.a;
    }

    public FlutterJNI.c d() {
        return this.b;
    }

    public static final class b {
        private d a;
        private FlutterJNI.c b;
        private ExecutorService c;

        private void b() {
            if (this.b == null) {
                this.b = new FlutterJNI.c();
            }
            if (this.c == null) {
                this.c = Executors.newCachedThreadPool((ThreadFactory)new a(this));
            }
            if (this.a == null) {
                this.a = new d(this.b.a(), this.c);
            }
        }

        public g1.a a() {
            this.b();
            return new g1.a(this.a, null, this.b, this.c);
        }

        private class a
        implements ThreadFactory {
            private int a;
            final b b;

            private a(b b2) {
                this.b = b2;
                this.a = 0;
            }

            public Thread newThread(Runnable runnable) {
                runnable = new Thread(runnable);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("flutter-worker-");
                int n2 = this.a;
                this.a = n2 + 1;
                stringBuilder.append(n2);
                runnable.setName(stringBuilder.toString());
                return runnable;
            }
        }
    }
}

