/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  H1.l
 *  H1.r
 *  J1.a
 *  V0.a
 *  Z0.a
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.SurfaceTexture
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.media.Image
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Size
 *  android.view.Display
 *  android.view.Surface
 *  android.view.WindowManager
 *  androidx.camera.core.f$a
 *  androidx.camera.core.f$c
 *  androidx.camera.core.o
 *  androidx.camera.core.s
 *  androidx.camera.core.s$a
 *  androidx.camera.core.s$c
 *  androidx.camera.core.w
 *  androidx.camera.lifecycle.e
 *  androidx.core.content.a
 *  androidx.core.util.a
 *  androidx.lifecycle.j
 *  androidx.lifecycle.p
 *  d1.g
 *  d1.h
 *  d1.i
 *  d1.j
 *  d1.k
 *  d1.l
 *  d1.m
 *  d1.o
 *  d1.p
 *  d1.r
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Executor
 *  kotlin.jvm.internal.i
 *  l.i
 *  l.k0
 *  l.k0$g
 *  l.m0
 *  l.q
 *  q0.e
 *  q0.f
 *  q0.g
 *  q0.k
 *  r0.a
 *  w.c$a
 *  w.d
 *  y1.h
 */
package d1;

import V0.c;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.camera.core.f;
import androidx.camera.core.s;
import androidx.camera.core.w;
import d1.B;
import d1.C;
import d1.D;
import d1.E;
import d1.a;
import d1.b;
import d1.e;
import d1.f;
import d1.g;
import d1.h;
import d1.i;
import d1.j;
import d1.k;
import d1.l;
import d1.m;
import d1.n;
import d1.o;
import d1.p;
import d1.q;
import d1.r;
import io.flutter.view.TextureRegistry;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import l.k0;
import l.m0;
import w.c;
import w.d;

public final class s {
    private final Activity a;
    private final TextureRegistry b;
    private final H1.r c;
    private final H1.l d;
    private androidx.camera.lifecycle.e e;
    private l.i f;
    private androidx.camera.core.s g;
    private TextureRegistry.SurfaceTextureEntry h;
    private V0.a i;
    private List j;
    private boolean k;
    private DisplayManager.DisplayListener l;
    private List m;
    private e1.b n;
    private long o;
    private boolean p;
    private final f.a q;

    public s(Activity activity, TextureRegistry textureRegistry, H1.r r2, H1.l l2) {
        kotlin.jvm.internal.i.e((Object)activity, (String)"activity");
        kotlin.jvm.internal.i.e((Object)textureRegistry, (String)"textureRegistry");
        kotlin.jvm.internal.i.e((Object)r2, (String)"mobileScannerCallback");
        kotlin.jvm.internal.i.e((Object)l2, (String)"mobileScannerErrorCallback");
        this.a = activity;
        this.b = textureRegistry;
        this.c = r2;
        this.d = l2;
        activity = V0.c.a();
        kotlin.jvm.internal.i.d((Object)activity, (String)"getClient()");
        this.i = activity;
        this.n = e1.b.NO_DUPLICATES;
        this.o = 250L;
        this.q = new j(this);
    }

    private static final void D(s s2, r0.a object, H1.l l2, Size object2, boolean bl, l.q q2, H1.l l3, Executor executor, boolean bl2, H1.l l4, H1.l l5) {
        androidx.camera.lifecycle.e e2;
        int n2;
        block18: {
            block17: {
                Object var21_13;
                block16: {
                    n2 = 1;
                    kotlin.jvm.internal.i.e((Object)s2, (String)"this$0");
                    kotlin.jvm.internal.i.e((Object)object, (String)"$cameraProviderFuture");
                    kotlin.jvm.internal.i.e((Object)l2, (String)"$mobileScannerErrorCallback");
                    kotlin.jvm.internal.i.e((Object)q2, (String)"$cameraPosition");
                    kotlin.jvm.internal.i.e((Object)l3, (String)"$mobileScannerStartedCallback");
                    kotlin.jvm.internal.i.e((Object)l4, (String)"$torchStateCallback");
                    kotlin.jvm.internal.i.e((Object)l5, (String)"$zoomScaleStateCallback");
                    object = (androidx.camera.lifecycle.e)object.get();
                    s2.e = object;
                    var21_13 = null;
                    object = object != null && (object = object.f()) != null ? Integer.valueOf((int)object.size()) : null;
                    e2 = s2.e;
                    if (e2 == null) {
                        l2.invoke((Object)new e());
                        return;
                    }
                    if (e2 != null) {
                        e2.p();
                    }
                    s2.h = s2.b.a();
                    e2 = new r(s2, executor);
                    Object object3 = new s.a().c();
                    object3.h0((s.c)e2);
                    s2.g = object3;
                    e2 = new f.c().f(0);
                    kotlin.jvm.internal.i.d((Object)e2, (String)"Builder()\n              \u2026TRATEGY_KEEP_ONLY_LATEST)");
                    object3 = s2.a.getApplicationContext().getSystemService("display");
                    kotlin.jvm.internal.i.c((Object)object3, (String)"null cannot be cast to non-null type android.hardware.display.DisplayManager");
                    object3 = (DisplayManager)object3;
                    if (object2 != null) {
                        if (bl) {
                            c.a a2 = new c.a();
                            a2.f(new d(object2, 1));
                            e2.j(a2.a()).c();
                        } else {
                            e2.o(s2.v((Size)object2));
                        }
                        if (s2.l == null) {
                            object2 = new DisplayManager.DisplayListener(bl, (Size)object2, (f.c)e2, s2){
                                final boolean a;
                                final Size b;
                                final f.c c;
                                final s d;
                                {
                                    this.a = bl;
                                    this.b = size;
                                    this.c = c2;
                                    this.d = s2;
                                }

                                public void onDisplayAdded(int n2) {
                                }

                                public void onDisplayChanged(int n2) {
                                    if (this.a) {
                                        c.a a2 = new c.a();
                                        a2.f(new d(this.b, 1));
                                        this.c.j(a2.a()).c();
                                    } else {
                                        this.c.o(this.d.v(this.b));
                                    }
                                }

                                public void onDisplayRemoved(int n2) {
                                }
                            };
                            s2.l = object2;
                            object3.registerDisplayListener((DisplayManager.DisplayListener)object2, null);
                        }
                    }
                    e2 = e2.c();
                    e2.n0(executor, s2.q);
                    kotlin.jvm.internal.i.d((Object)e2, (String)"analysisBuilder.build().\u2026xecutor, captureOutput) }");
                    try {
                        object2 = s2.e;
                        if (object2 == null) break block16;
                    }
                    catch (Exception exception) {
                        l2.invoke((Object)new C());
                        return;
                    }
                    executor = s2.a;
                    kotlin.jvm.internal.i.c((Object)executor, (String)"null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    object2 = object2.e((androidx.lifecycle.j)executor, q2, new w[]{s2.g, e2});
                    break block17;
                }
                object2 = var21_13;
            }
            s2.f = object2;
            if (object2 == null) break block18;
            l2 = object2.a().g();
            q2 = s2.a;
            kotlin.jvm.internal.i.c((Object)q2, (String)"null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            l2.g((androidx.lifecycle.j)q2, (androidx.lifecycle.p)new g(l4));
            object2.a().h().g((androidx.lifecycle.j)s2.a, (androidx.lifecycle.p)new h(l5));
            if (object2.a().j()) {
                object2.i().h(bl2);
            }
        }
        l2 = e2.g0();
        kotlin.jvm.internal.i.b((Object)l2);
        l2 = l2.a();
        kotlin.jvm.internal.i.d((Object)l2, (String)"analysis.resolutionInfo!!.resolution");
        double d2 = l2.getWidth();
        double d3 = l2.getHeight();
        l2 = s2.f;
        int n3 = l2 != null && (l2 = l2.a()) != null ? l2.a() : 0;
        if (n3 % 180 != 0) {
            n2 = 0;
        }
        l2 = s2.f;
        n3 = -1;
        if (l2 != null && (l2 = l2.a()) != null) {
            if (l2.j() && (l2 = (Integer)l2.g().d()) != null) {
                kotlin.jvm.internal.i.d((Object)l2, (String)"it.torchState.value ?: -1");
                n3 = l2.intValue();
            }
        } else {
            n3 = -1;
        }
        double d4 = n2 != 0 ? d2 : d3;
        if (n2 != 0) {
            d2 = d3;
        }
        s2 = s2.h;
        kotlin.jvm.internal.i.b((Object)s2);
        long l6 = s2.id();
        n2 = object != null ? object.intValue() : 0;
        l3.invoke((Object)new e1.c(d4, d2, n3, l6, n2));
    }

    private static final void E(H1.l l2, Integer n2) {
        kotlin.jvm.internal.i.e((Object)l2, (String)"$torchStateCallback");
        kotlin.jvm.internal.i.d((Object)n2, (String)"state");
        l2.invoke((Object)n2);
    }

    private static final void F(H1.l l2, m0 m02) {
        kotlin.jvm.internal.i.e((Object)l2, (String)"$zoomScaleStateCallback");
        l2.invoke((Object)m02.c());
    }

    private static final void G(s s2, Executor executor, k0 k02) {
        kotlin.jvm.internal.i.e((Object)s2, (String)"this$0");
        kotlin.jvm.internal.i.e((Object)k02, (String)"request");
        if (s2.x()) {
            return;
        }
        s2 = s2.h;
        kotlin.jvm.internal.i.b((Object)s2);
        s2 = s2.surfaceTexture();
        kotlin.jvm.internal.i.d((Object)s2, (String)"textureEntry!!.surfaceTexture()");
        s2.setDefaultBufferSize(k02.k().getWidth(), k02.k().getHeight());
        k02.v(new Surface((SurfaceTexture)s2), executor, (androidx.core.util.a)new i());
    }

    private static final void H(k0.g g2) {
    }

    public static /* synthetic */ void a(H1.l l2, m0 m02) {
        s.F(l2, m02);
    }

    public static /* synthetic */ void b(s s2, Exception exception) {
        s.s(s2, exception);
    }

    public static /* synthetic */ void c(s s2, androidx.camera.core.o o2, Image image, List list) {
        s.r(s2, o2, image, list);
    }

    public static /* synthetic */ void d(s s2, androidx.camera.core.o o2) {
        s.q(s2, o2);
    }

    public static /* synthetic */ void e(H1.l l2, Integer n2) {
        s.E(l2, n2);
    }

    public static /* synthetic */ void f(s s2, r0.a a2, H1.l l2, Size size, boolean bl, l.q q2, H1.l l3, Executor executor, boolean bl2, H1.l l4, H1.l l5) {
        s.D(s2, a2, l2, size, bl, q2, l3, executor, bl2, l4, l5);
    }

    public static /* synthetic */ void g(s s2) {
        s.u(s2);
    }

    public static /* synthetic */ void h(H1.l l2, Exception exception) {
        s.p(l2, exception);
    }

    public static /* synthetic */ void i(H1.l l2, List list) {
        s.o(l2, list);
    }

    public static /* synthetic */ void j(androidx.camera.core.o o2, q0.k k2) {
        s.t(o2, k2);
    }

    public static /* synthetic */ void k(s s2, Executor executor, k0 k02) {
        s.G(s2, executor, k02);
    }

    public static /* synthetic */ void l(k0.g g2) {
        s.H(g2);
    }

    private static final void o(H1.l l2, List list) {
        kotlin.jvm.internal.i.e((Object)l2, (String)"$onSuccess");
        kotlin.jvm.internal.i.d((Object)list, (String)"barcodes");
        Object object2 = (Iterable)list;
        list = new ArrayList(y1.h.h((Iterable)object2, (int)10));
        for (Object object2 : object2) {
            kotlin.jvm.internal.i.d((Object)object2, (String)"barcode");
            list.add((Object)B.l((W0.a)object2));
        }
        if (list.isEmpty() ^ true) {
            l2.invoke((Object)list);
        } else {
            l2.invoke(null);
        }
    }

    private static final void p(H1.l l2, Exception exception) {
        String string;
        kotlin.jvm.internal.i.e((Object)l2, (String)"$onError");
        kotlin.jvm.internal.i.e((Object)((Object)exception), (String)"e");
        String string2 = string = exception.getLocalizedMessage();
        if (string == null) {
            string2 = exception.toString();
        }
        l2.invoke((Object)string2);
    }

    private static final void q(s s2, androidx.camera.core.o o2) {
        kotlin.jvm.internal.i.e((Object)s2, (String)"this$0");
        kotlin.jvm.internal.i.e((Object)o2, (String)"imageProxy");
        Image image = o2.e0();
        if (image == null) {
            return;
        }
        Z0.a a2 = Z0.a.b((Image)image, (int)o2.C().d());
        kotlin.jvm.internal.i.d((Object)a2, (String)"fromMediaImage(mediaImag\u2026mageInfo.rotationDegrees)");
        e1.b b2 = s2.n;
        e1.b b3 = e1.b.NORMAL;
        if (b2 == b3 && s2.k) {
            o2.close();
            return;
        }
        if (b2 == b3) {
            s2.k = true;
        }
        s2.i.J(a2).g((q0.g)new k(s2, o2, image)).e((q0.f)new l(s2)).c((q0.e)new m(o2));
        if (s2.n == b3) {
            new Handler(Looper.getMainLooper()).postDelayed((Runnable)new n(s2), s2.o);
        }
    }

    private static final void r(s s2, androidx.camera.core.o o2, Image object, List object22) {
        ArrayList arrayList;
        Object object3;
        kotlin.jvm.internal.i.e((Object)s2, (String)"this$0");
        kotlin.jvm.internal.i.e((Object)o2, (String)"$imageProxy");
        kotlin.jvm.internal.i.e((Object)object, (String)"$mediaImage");
        if (s2.n == e1.b.NO_DUPLICATES) {
            kotlin.jvm.internal.i.d((Object)object22, (String)"barcodes");
            object3 = (Iterable)object22;
            arrayList = new ArrayList();
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                object3 = ((W0.a)iterator.next()).l();
                if (object3 == null) continue;
                arrayList.add(object3);
            }
            if (kotlin.jvm.internal.i.a((Object)(arrayList = y1.h.B((Iterable)arrayList)), (Object)s2.j)) {
                return;
            }
            if (((Collection)arrayList).isEmpty() ^ true) {
                s2.j = arrayList;
            }
        }
        arrayList = new ArrayList();
        for (Object object22 : object22) {
            object3 = s2.m;
            if (object3 != null) {
                kotlin.jvm.internal.i.b((Object)object3);
                kotlin.jvm.internal.i.d((Object)object22, (String)"barcode");
                if (!s2.w((List)object3, (W0.a)object22, o2)) continue;
                arrayList.add((Object)B.l((W0.a)object22));
                continue;
            }
            kotlin.jvm.internal.i.d((Object)object22, (String)"barcode");
            arrayList.add((Object)B.l((W0.a)object22));
        }
        if (arrayList.isEmpty() ^ true) {
            if (s2.p) {
                o2 = Bitmap.createBitmap((int)object.getWidth(), (int)object.getHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.i.d((Object)o2, (String)"createBitmap(mediaImage.\u2026 Bitmap.Config.ARGB_8888)");
                object22 = s2.a.getApplicationContext();
                kotlin.jvm.internal.i.d((Object)object22, (String)"activity.applicationContext");
                new f1.b((Context)object22).b((Image)object, (Bitmap)o2);
                object = s2.f;
                float f2 = object != null && (object = object.a()) != null ? (float)object.a() : 90.0f;
                o2 = s2.z((Bitmap)o2, f2);
                object = new ByteArrayOutputStream();
                o2.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)object);
                object = object.toByteArray();
                int n2 = o2.getWidth();
                int n3 = o2.getHeight();
                o2.recycle();
                s2.c.e((Object)arrayList, object, (Object)n2, (Object)n3);
            } else {
                s2.c.e((Object)arrayList, null, null, null);
            }
        }
    }

    private static final void s(s object, Exception exception) {
        kotlin.jvm.internal.i.e((Object)object, (String)"this$0");
        kotlin.jvm.internal.i.e((Object)((Object)exception), (String)"e");
        H1.l l2 = ((s)object).d;
        String string = exception.getLocalizedMessage();
        object = string;
        if (string == null) {
            object = exception.toString();
        }
        l2.invoke(object);
    }

    private static final void t(androidx.camera.core.o o2, q0.k k2) {
        kotlin.jvm.internal.i.e((Object)o2, (String)"$imageProxy");
        kotlin.jvm.internal.i.e((Object)k2, (String)"it");
        o2.close();
    }

    private static final void u(s s2) {
        kotlin.jvm.internal.i.e((Object)s2, (String)"this$0");
        s2.k = false;
    }

    private final Size v(Size size) {
        int n2;
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = d1.f.a(this.a);
            kotlin.jvm.internal.i.b((Object)display);
            n2 = display.getRotation();
        } else {
            Object object = this.a.getApplicationContext().getSystemService("window");
            kotlin.jvm.internal.i.c((Object)object, (String)"null cannot be cast to non-null type android.view.WindowManager");
            n2 = ((WindowManager)object).getDefaultDisplay().getRotation();
        }
        int n3 = size.getWidth();
        int n4 = size.getHeight();
        size = n2 != 0 && n2 != 2 ? new Size(n4, n3) : new Size(n3, n4);
        return size;
    }

    private final boolean w(List list, W0.a a2, androidx.camera.core.o o2) {
        if ((a2 = a2.a()) == null) {
            return false;
        }
        int n2 = o2.getHeight();
        int n3 = o2.getWidth();
        float f2 = ((Number)list.get(0)).floatValue();
        float f3 = n2;
        n2 = J1.a.a((float)(f2 * f3));
        float f4 = ((Number)list.get(1)).floatValue();
        f2 = n3;
        return new Rect(n2, J1.a.a((float)(f4 * f2)), J1.a.a((float)(((Number)list.get(2)).floatValue() * f3)), J1.a.a((float)(((Number)list.get(3)).floatValue() * f2))).contains((Rect)a2);
    }

    private final boolean x() {
        boolean bl = this.f == null && this.g == null;
        return bl;
    }

    private final Bitmap z(Bitmap bitmap, float f2) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true);
        kotlin.jvm.internal.i.d((Object)bitmap, (String)"createBitmap(bitmap, 0, \u2026map.height, matrix, true)");
        return bitmap;
    }

    public final void A(double d2) {
        if (!(d2 > 1.0) && !(d2 < 0.0)) {
            l.i i2 = this.f;
            if (i2 != null) {
                if (i2 != null && (i2 = i2.i()) != null) {
                    i2.g((float)d2);
                }
                return;
            }
            throw new E();
        }
        throw new D();
    }

    public final void B(List list) {
        this.m = list;
    }

    public final void C(V0.b b2, boolean bl, l.q q2, boolean bl2, e1.b b3, H1.l l2, H1.l l3, H1.l l4, H1.l l5, long l6, Size size, boolean bl3) {
        kotlin.jvm.internal.i.e((Object)q2, (String)"cameraPosition");
        kotlin.jvm.internal.i.e((Object)((Object)b3), (String)"detectionSpeed");
        kotlin.jvm.internal.i.e((Object)l2, (String)"torchStateCallback");
        kotlin.jvm.internal.i.e((Object)l3, (String)"zoomScaleStateCallback");
        kotlin.jvm.internal.i.e((Object)l4, (String)"mobileScannerStartedCallback");
        kotlin.jvm.internal.i.e((Object)l5, (String)"mobileScannerErrorCallback");
        this.n = b3;
        this.o = l6;
        this.p = bl;
        b3 = this.f;
        b3 = b3 != null ? b3.a() : null;
        if (b3 != null && this.g != null && this.h != null) {
            l5.invoke((Object)new a());
            return;
        }
        this.j = null;
        if (b2 != null) {
            b2 = V0.c.b(b2);
            kotlin.jvm.internal.i.d((Object)b2, (String)"{\n            BarcodeSca\u2026ScannerOptions)\n        }");
        } else {
            b2 = V0.c.a();
            kotlin.jvm.internal.i.d((Object)b2, (String)"{\n            BarcodeSca\u2026ing.getClient()\n        }");
        }
        this.i = b2;
        b2 = androidx.camera.lifecycle.e.h((Context)this.a);
        kotlin.jvm.internal.i.d((Object)b2, (String)"getInstance(activity)");
        b3 = androidx.core.content.a.b((Context)this.a);
        b2.a(new q(this, (r0.a)b2, l5, size, bl3, q2, l4, (Executor)b3, bl2, l2, l3), (Executor)b3);
    }

    public final void I() {
        if (!this.x()) {
            Object object;
            if (this.l != null) {
                object = this.a.getApplicationContext().getSystemService("display");
                kotlin.jvm.internal.i.c((Object)object, (String)"null cannot be cast to non-null type android.hardware.display.DisplayManager");
                ((DisplayManager)object).unregisterDisplayListener(this.l);
                this.l = null;
            }
            object = this.a;
            kotlin.jvm.internal.i.c((Object)object, (String)"null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            object = (androidx.lifecycle.j)object;
            l.i i2 = this.f;
            if (i2 != null && (i2 = i2.a()) != null && (i2 = i2.g()) != null) {
                i2.m((androidx.lifecycle.j)object);
            }
            if ((object = this.e) != null) {
                object.p();
            }
            if ((object = this.h) != null) {
                object.release();
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.e = null;
            return;
        }
        throw new b();
    }

    public final void J() {
        l.i i2 = this.f;
        if (i2 != null && i2.a().j()) {
            Integer n2 = (Integer)i2.a().g().d();
            if (n2 != null && n2 == 0) {
                i2.i().h(true);
            } else if (n2 != null && n2 == 1) {
                i2.i().h(false);
            }
        }
    }

    public final void n(Uri uri, H1.l l2, H1.l l3) {
        kotlin.jvm.internal.i.e((Object)uri, (String)"image");
        kotlin.jvm.internal.i.e((Object)l2, (String)"onSuccess");
        kotlin.jvm.internal.i.e((Object)l3, (String)"onError");
        uri = Z0.a.a((Context)this.a, (Uri)uri);
        kotlin.jvm.internal.i.d((Object)uri, (String)"fromFilePath(activity, image)");
        this.i.J((Z0.a)uri).g((q0.g)new o(l2)).e((q0.f)new p(l3));
    }

    public final void y() {
        l.i i2 = this.f;
        if (i2 != null) {
            if (i2 != null && (i2 = i2.i()) != null) {
                i2.c(1.0f);
            }
            return;
        }
        throw new E();
    }
}

