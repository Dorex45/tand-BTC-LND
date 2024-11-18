/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.List
 *  p1.q
 */
package h1;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import p1.c;
import p1.q;
import v1.f;

public class a
implements p1.c {
    private final FlutterJNI a;
    private final AssetManager b;
    private final h1.c c;
    private final p1.c d;
    private boolean e = false;
    private String f;
    private final c.a g;

    public a(FlutterJNI flutterJNI, AssetManager object) {
        c.a a2;
        this.g = a2 = new c.a(this){
            final a a;
            {
                this.a = a2;
            }

            @Override
            public void a(ByteBuffer byteBuffer, c.b b2) {
                h1.a.d(this.a, q.b.c(byteBuffer));
                h1.a.h(this.a);
            }
        };
        this.a = flutterJNI;
        this.b = object;
        object = new h1.c(flutterJNI);
        this.c = object;
        ((h1.c)object).g("flutter/isolate", a2);
        this.d = new c((h1.c)object);
        if (flutterJNI.isAttached()) {
            this.e = true;
        }
    }

    static /* synthetic */ String d(a a2, String string) {
        a2.f = string;
        return string;
    }

    static /* synthetic */ d h(a a2) {
        a2.getClass();
        return null;
    }

    @Override
    public c.c a(c.d d2) {
        return this.d.a(d2);
    }

    @Override
    public void b(String string, ByteBuffer byteBuffer) {
        this.d.b(string, byteBuffer);
    }

    @Override
    public void c(String string, ByteBuffer byteBuffer, c.b b2) {
        this.d.c(string, byteBuffer, b2);
    }

    @Override
    public /* synthetic */ c.c e() {
        return p1.b.a(this);
    }

    @Override
    public void f(String string, c.a a2, c.c c2) {
        this.d.f(string, a2, c2);
    }

    @Override
    public void g(String string, c.a a2) {
        this.d.g(string, a2);
    }

    public void i(b b2, List list) {
        if (this.e) {
            g1.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        f f2 = v1.f.B("DartExecutor#executeDartEntrypoint");
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Executing Dart entrypoint: ");
            stringBuilder.append((Object)b2);
            g1.b.f("DartExecutor", stringBuilder.toString());
            this.a.runBundleAndSnapshotFromLibrary(b2.a, b2.c, b2.b, this.b, (List<String>)list);
            this.e = true;
            return;
        }
        finally {
            if (f2 != null) {
                f2.close();
            }
        }
    }

    public boolean j() {
        return this.e;
    }

    public void k() {
        if (this.a.isAttached()) {
            this.a.notifyLowMemoryWarning();
        }
    }

    public void l() {
        g1.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(this.c);
    }

    public void m() {
        g1.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(null);
    }

    private static class c
    implements p1.c {
        private final h1.c a;

        private c(h1.c c2) {
            this.a = c2;
        }

        @Override
        public c.c a(c.d d2) {
            return this.a.a(d2);
        }

        @Override
        public void b(String string, ByteBuffer byteBuffer) {
            this.a.c(string, byteBuffer, null);
        }

        @Override
        public void c(String string, ByteBuffer byteBuffer, c.b b2) {
            this.a.c(string, byteBuffer, b2);
        }

        @Override
        public /* synthetic */ c.c e() {
            return p1.b.a(this);
        }

        @Override
        public void f(String string, c.a a2, c.c c2) {
            this.a.f(string, a2, c2);
        }

        @Override
        public void g(String string, c.a a2) {
            this.a.g(string, a2);
        }
    }
}

