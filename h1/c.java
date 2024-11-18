/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.WeakHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package h1;

import g1.a;
import h1.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.c;

class c
implements p1.c,
h1.f {
    private final FlutterJNI a;
    private final Map b = new HashMap();
    private Map c = new HashMap();
    private final Object d = new Object();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final Map f = new HashMap();
    private int g = 1;
    private final d h = new h1.g();
    private WeakHashMap i = new WeakHashMap();
    private i j;

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i i2) {
        this.a = flutterJNI;
        this.j = i2;
    }

    public static /* synthetic */ void i(c c2, String string, int n3, f f2, ByteBuffer byteBuffer, long l2) {
        c2.m(string, n3, f2, byteBuffer, l2);
    }

    private void j(String object, f object2, ByteBuffer byteBuffer, int n3, long l2) {
        d d2 = object2 != null ? object2.b : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlatformChannel ScheduleHandler on ");
        stringBuilder.append((String)object);
        v1.f.f(stringBuilder.toString(), n3);
        object2 = new b(this, (String)object, n3, object2, byteBuffer, l2);
        object = d2;
        if (d2 == null) {
            object = this.h;
        }
        object.a((Runnable)object2);
    }

    private static void k(Error error) {
        Thread thread = Thread.currentThread();
        if (thread.getUncaughtExceptionHandler() != null) {
            thread.getUncaughtExceptionHandler().uncaughtException(thread, (Throwable)error);
            return;
        }
        throw error;
    }

    private void l(f object, ByteBuffer byteBuffer, int n3) {
        block3: {
            block5: {
                Exception exception2;
                block4: {
                    if (object == null) break block5;
                    try {
                        g1.b.f("DartMessenger", "Deferring to registered handler to process message.");
                        object = object.a;
                        g g2 = new g(this.a, n3);
                        object.a(byteBuffer, g2);
                        break block3;
                    }
                    catch (Error error) {
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                    h1.c.k(error);
                    break block3;
                }
                g1.b.c("DartMessenger", "Uncaught exception in binary message listener", exception2);
                this.a.invokePlatformMessageEmptyResponseCallback(n3);
                break block3;
            }
            g1.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.a.invokePlatformMessageEmptyResponseCallback(n3);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void m(String object, int n3, f f2, ByteBuffer byteBuffer, long l2) {
        Throwable throwable322222;
        Throwable throwable2222222;
        block10: {
            block9: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PlatformChannel ScheduleHandler on ");
                stringBuilder.append((String)object);
                v1.f.x(stringBuilder.toString(), n3);
                stringBuilder = new StringBuilder();
                stringBuilder.append("DartMessenger#handleMessageFromDart on ");
                stringBuilder.append((String)object);
                object = v1.f.B(stringBuilder.toString());
                {
                    catch (Throwable throwable2222222) {}
                }
                try {
                    this.l(f2, byteBuffer, n3);
                    if (byteBuffer == null || !byteBuffer.isDirect()) break block9;
                    byteBuffer.limit(0);
                }
                catch (Throwable throwable322222) {
                    break block10;
                }
            }
            if (object != null) {
                ((v1.f)object).close();
            }
            this.a.cleanupMessageData(l2);
            return;
        }
        if (object == null) throw throwable322222;
        try {
            ((v1.f)object).close();
            throw throwable322222;
        }
        catch (Throwable throwable4) {
            throwable322222.addSuppressed(throwable4);
            throw throwable322222;
        }
        this.a.cleanupMessageData(l2);
        throw throwable2222222;
    }

    @Override
    public c.c a(c.d object) {
        d d2 = this.j.a((c.d)object);
        object = new j();
        this.i.put(object, (Object)d2);
        return object;
    }

    @Override
    public void b(String string, ByteBuffer byteBuffer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message over channel '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        g1.b.f("DartMessenger", stringBuilder.toString());
        this.c(string, byteBuffer, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(String string, ByteBuffer byteBuffer, c.b b2) {
        Throwable throwable2;
        Object object;
        block7: {
            int n3;
            block6: {
                object = new StringBuilder();
                object.append("DartMessenger#send on ");
                object.append(string);
                object = v1.f.B(object.toString());
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Sending message with callback over channel '");
                    stringBuilder.append(string);
                    stringBuilder.append("'");
                    g1.b.f("DartMessenger", stringBuilder.toString());
                    n3 = this.g;
                    this.g = n3 + 1;
                    if (b2 == null) break block6;
                    this.f.put((Object)n3, (Object)b2);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            if (byteBuffer == null) {
                this.a.dispatchEmptyPlatformMessage(string, n3);
            } else {
                this.a.dispatchPlatformMessage(string, byteBuffer, byteBuffer.position(), n3);
            }
            if (object == null) return;
            ((v1.f)object).close();
            return;
        }
        if (object == null) throw throwable2;
        try {
            ((v1.f)object).close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    @Override
    public void d(int n3, ByteBuffer byteBuffer) {
        block6: {
            g1.b.f("DartMessenger", "Received message reply from Dart.");
            c.b b2 = (c.b)this.f.remove((Object)n3);
            if (b2 != null) {
                Exception exception2;
                block8: {
                    g1.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                    b2.a(byteBuffer);
                    if (byteBuffer == null) break block6;
                    try {
                        if (byteBuffer.isDirect()) {
                            byteBuffer.limit(0);
                        }
                        break block6;
                    }
                    catch (Error error) {
                    }
                    catch (Exception exception2) {
                        break block8;
                    }
                    h1.c.k(error);
                    break block6;
                }
                g1.b.c("DartMessenger", "Uncaught exception in binary message reply handler", exception2);
            }
        }
    }

    @Override
    public /* synthetic */ c.c e() {
        return p1.b.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void f(String string, c.a object, c.c object2) {
        if (object == null) {
            object = new StringBuilder();
            object.append("Removing handler for channel '");
            object.append(string);
            object.append("'");
            g1.b.f("DartMessenger", object.toString());
            Object object3 = object = this.d;
            // MONITORENTER : object3
            this.b.remove((Object)string);
            // MONITOREXIT : object3
            return;
        }
        if (object2 != null) {
            if ((object2 = this.i.get(object2)) == null) throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        } else {
            object2 = null;
        }
        Object object4 = new StringBuilder();
        object4.append("Setting handler for channel '");
        object4.append(string);
        object4.append("'");
        g1.b.f("DartMessenger", object4.toString());
        Object object5 = object4 = this.d;
        // MONITORENTER : object5
        Map map = this.b;
        Object object6 = new Object((c.a)object, object2){
            public final c.a a;
            public final d b;
            {
                this.a = a2;
                this.b = d2;
            }
        };
        map.put((Object)string, object6);
        object = (List)this.c.remove((Object)string);
        if (object == null) {
            // MONITOREXIT : object5
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            object2 = object.next();
            this.j(string, this.b.get((Object)string), object2.a, object2.b, object2.c);
        }
    }

    @Override
    public void g(String string, c.a a2) {
        this.f(string, a2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void h(String string, ByteBuffer byteBuffer, int n3, long l2) {
        boolean bl;
        f f2;
        block5: {
            Object object3;
            Map map;
            Object object = new StringBuilder();
            object.append("Received message from Dart over channel '");
            object.append(string);
            object.append("'");
            g1.b.f("DartMessenger", object.toString());
            Object object2 = object = this.d;
            // MONITORENTER : object2
            f2 = this.b.get((Object)string);
            bl = this.e.get() && f2 == null;
            if (!bl) break block5;
            if (!this.c.containsKey((Object)string)) {
                map = this.c;
                object3 = new LinkedList();
                map.put((Object)string, object3);
            }
            map = (List)this.c.get((Object)string);
            object3 = new Object(byteBuffer, n3, l2){
                public final ByteBuffer a;
                int b;
                long c;
                {
                    this.a = byteBuffer;
                    this.b = n3;
                    this.c = l2;
                }
            };
            map.add(object3);
        }
        // MONITOREXIT : object2
        if (bl) return;
        this.j(string, f2, byteBuffer, n3, l2);
    }

    static class c
    implements d {
        private final ExecutorService a;

        c(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override
        public void a(Runnable runnable) {
            this.a.execute(runnable);
        }
    }

    private static class e
    implements i {
        ExecutorService a = g1.a.e().b();

        e() {
        }

        @Override
        public d a(c.d d2) {
            if (d2.a()) {
                return new h(this.a);
            }
            return new c(this.a);
        }
    }

    static class g
    implements c.b {
        private final FlutterJNI a;
        private final int b;
        private final AtomicBoolean c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int n3) {
            this.a = flutterJNI;
            this.b = n3;
        }

        @Override
        public void a(ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.a.invokePlatformMessageEmptyResponseCallback(this.b);
                } else {
                    this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
                }
                return;
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

    static class h
    implements d {
        private final ExecutorService a;
        private final ConcurrentLinkedQueue b;
        private final AtomicBoolean c;

        h(ExecutorService executorService) {
            this.a = executorService;
            this.b = new ConcurrentLinkedQueue();
            this.c = new AtomicBoolean(false);
        }

        public static /* synthetic */ void b(h h2) {
            h2.e();
        }

        public static /* synthetic */ void c(h h2) {
            h2.f();
        }

        private void d() {
            block8: {
                if (this.c.compareAndSet(false, true)) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            Runnable runnable;
                            try {
                                runnable = (Runnable)this.b.poll();
                                if (runnable == null) break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            runnable.run();
                        }
                        this.c.set(false);
                        if (!this.b.isEmpty()) {
                            this.a.execute((Runnable)new h1.e(this));
                        }
                        break block8;
                    }
                    this.c.set(false);
                    if (!this.b.isEmpty()) {
                        this.a.execute((Runnable)new h1.e(this));
                    }
                    throw throwable2;
                }
            }
        }

        private /* synthetic */ void e() {
            this.d();
        }

        private /* synthetic */ void f() {
            this.d();
        }

        @Override
        public void a(Runnable runnable) {
            this.b.add((Object)runnable);
            this.a.execute((Runnable)new h1.d(this));
        }
    }

    private static class j
    implements c.c {
        private j() {
        }
    }
}

