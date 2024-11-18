/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.util.Log
 *  java.io.FileNotFoundException
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 */
package b1;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import b1.b;
import b1.c;
import b1.d;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l1.a;
import p1.j;
import p1.k;

public class e
implements k.c,
l1.a {
    private k a;
    private b1.a b;
    private HandlerThread c;
    private Handler d;

    private String d(j j2) {
        j2 = (Map)j2.b;
        return this.b.a((String)j2.get("key"));
    }

    private String e(j j2) {
        return (String)((Map)j2.b).get((Object)"value");
    }

    public void f(p1.c c2, Context object) {
        try {
            b1.a a2;
            HashMap hashMap = new HashMap();
            this.b = a2 = new b1.a((Context)object, (Map)hashMap);
            object = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.c = object;
            object.start();
            object = new Handler(this.c.getLooper());
            this.d = object;
            object = new k(c2, "plugins.it_nomads.com/flutter_secure_storage");
            this.a = object;
            ((k)object).e(this);
        }
        catch (Exception exception) {
            Log.e((String)"FlutterSecureStoragePl", (String)"Registration failed", (Throwable)exception);
        }
    }

    @Override
    public void onAttachedToEngine(a.b b2) {
        this.f(b2.b(), b2.a());
    }

    @Override
    public void onDetachedFromEngine(a.b b2) {
        if (this.a != null) {
            this.c.quitSafely();
            this.c = null;
            this.a.e(null);
            this.a = null;
        }
        this.b = null;
    }

    @Override
    public void onMethodCall(j j2, k.d d2) {
        d2 = new a(d2);
        this.d.post(new Runnable(this, j2, d2){
            private final j d;
            private final k.d e;
            final e f;
            {
                this.f = e2;
                this.d = j2;
                this.e = d2;
            }

            private void a(Exception exception) {
                StringWriter stringWriter = new StringWriter();
                exception.printStackTrace(new PrintWriter((Writer)stringWriter));
                this.e.b("Exception encountered", this.d.a, stringWriter.toString());
            }

            /*
             * Loose catch block
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                void var4_7;
                FileNotFoundException fileNotFoundException2222;
                block24: {
                    int n3 = 0;
                    try {
                        ((e)this.f).b.e = (Map)((Map)this.d.b).get((Object)"options");
                        this.f.b.h();
                        boolean bl = this.f.b.i();
                        try {
                            String string;
                            block25: {
                                string = this.d.a;
                                switch (string.hashCode()) {
                                    default: {
                                        break;
                                    }
                                    case 1080375339: {
                                        if (!string.equals((Object)"readAll")) break;
                                        n3 = 2;
                                        break block25;
                                    }
                                    case 208013248: {
                                        if (!string.equals((Object)"containsKey")) break;
                                        n3 = 3;
                                        break block25;
                                    }
                                    case 113399775: {
                                        if (!string.equals((Object)"write")) break;
                                        break block25;
                                    }
                                    case 3496342: {
                                        if (!string.equals((Object)"read")) break;
                                        n3 = 1;
                                        break block25;
                                    }
                                    case -358737930: {
                                        if (!string.equals((Object)"deleteAll")) break;
                                        n3 = 5;
                                        break block25;
                                    }
                                    case -1335458389: {
                                        if (!string.equals((Object)"delete")) break;
                                        n3 = 4;
                                        break block25;
                                    }
                                }
                                n3 = -1;
                            }
                            if (n3 != 0) {
                                if (n3 != 1) {
                                    if (n3 == 2) {
                                        this.e.a(this.f.b.o());
                                        return;
                                    }
                                    if (n3 == 3) {
                                        string = this.f.d(this.d);
                                        boolean bl2 = this.f.b.c(string);
                                        this.e.a(bl2);
                                        return;
                                    }
                                    if (n3 == 4) {
                                        string = this.f.d(this.d);
                                        this.f.b.e(string);
                                        this.e.a(null);
                                        return;
                                    }
                                    if (n3 != 5) {
                                        this.e.c();
                                        return;
                                    }
                                    this.f.b.f();
                                    this.e.a(null);
                                    return;
                                }
                                string = this.f.d(this.d);
                                if (this.f.b.c(string)) {
                                    string = this.f.b.n(string);
                                    this.e.a(string);
                                    return;
                                }
                                this.e.a(null);
                                return;
                            }
                            String string2 = this.f.d(this.d);
                            string = this.f.e(this.d);
                            if (string != null) {
                                this.f.b.p(string2, string);
                                this.e.a(null);
                                return;
                            }
                            this.e.b("null", null, null);
                            return;
                        }
                        catch (Exception exception) {}
                        catch (Exception exception) {
                            bl = false;
                        }
                        if (!bl) break block24;
                    }
                    catch (FileNotFoundException fileNotFoundException2222) {}
                    try {
                        this.f.b.f();
                        this.e.a("Data has been reset");
                        return;
                    }
                    catch (Exception exception) {
                        this.a(exception);
                        return;
                    }
                }
                this.a((Exception)var4_7);
                return;
                Log.i((String)"Creating sharedPrefs", (String)fileNotFoundException2222.getLocalizedMessage());
            }
        });
    }

    static class a
    implements k.d {
        private final k.d a;
        private final Handler b = new Handler(Looper.getMainLooper());

        a(k.d d2) {
            this.a = d2;
        }

        public static /* synthetic */ void d(a a2, Object object) {
            a2.g(object);
        }

        public static /* synthetic */ void e(a a2, String string, String string2, Object object) {
            a2.f(string, string2, object);
        }

        private /* synthetic */ void f(String string, String string2, Object object) {
            this.a.b(string, string2, object);
        }

        private /* synthetic */ void g(Object object) {
            this.a.a(object);
        }

        @Override
        public void a(Object object) {
            this.b.post((Runnable)new c(this, object));
        }

        @Override
        public void b(String string, String string2, Object object) {
            this.b.post((Runnable)new d(this, string, string2, object));
        }

        @Override
        public void c() {
            Handler handler = this.b;
            k.d d2 = this.a;
            Objects.requireNonNull((Object)d2);
            handler.post((Runnable)new b(d2));
        }
    }
}

