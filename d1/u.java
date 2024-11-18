/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.net.Uri
 *  android.util.Size
 *  d1.u$a
 *  d1.u$b
 *  d1.u$c
 *  d1.u$d
 *  d1.u$f
 *  d1.u$g
 *  d1.u$h
 *  d1.u$i
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  kotlin.jvm.internal.i
 *  y1.h
 */
package d1;

import H1.l;
import H1.r;
import V0.b;
import android.app.Activity;
import android.net.Uri;
import android.util.Size;
import d1.D;
import d1.E;
import d1.s;
import d1.u;
import d1.y;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l.q;
import p1.j;
import p1.k;
import p1.n;

public final class u
implements k.c {
    private final Activity a;
    private final d1.d b;
    private final y c;
    private final l d;
    private final l e;
    private final l f;
    private k.d g;
    private final r h;
    private final l i;
    private k j;
    private s k;
    private final l l;
    private final l m;

    public u(Activity activity, d1.d d2, p1.c object, y y2, l l2, TextureRegistry textureRegistry) {
        kotlin.jvm.internal.i.e((Object)activity, (String)"activity");
        kotlin.jvm.internal.i.e((Object)d2, (String)"barcodeHandler");
        kotlin.jvm.internal.i.e((Object)object, (String)"binaryMessenger");
        kotlin.jvm.internal.i.e((Object)y2, (String)"permissions");
        kotlin.jvm.internal.i.e((Object)l2, (String)"addPermissionListener");
        kotlin.jvm.internal.i.e((Object)textureRegistry, (String)"textureRegistry");
        this.a = activity;
        this.b = d2;
        this.c = y2;
        this.d = l2;
        this.e = new a(this);
        this.f = new b(this);
        y2 = new c(this);
        this.h = y2;
        d2 = new d(this);
        this.i = d2;
        this.l = new h(this);
        this.m = new i(this);
        this.j = object = new k((p1.c)object, "dev.steenbakker.mobile_scanner/scanner/method");
        kotlin.jvm.internal.i.b((Object)object);
        ((k)object).e(this);
        this.k = new s(activity, textureRegistry, (r)((Object)y2), (l)((Object)d2));
    }

    public static final /* synthetic */ k.d a(u u2) {
        return u2.g;
    }

    public static final /* synthetic */ d1.d b(u u2) {
        return u2.b;
    }

    public static final /* synthetic */ void c(u u2, k.d d2) {
        u2.g = d2;
    }

    private final void d(j object, k.d d2) {
        this.g = d2;
        d2 = Uri.fromFile((File)new File(((j)object).b.toString()));
        object = this.k;
        kotlin.jvm.internal.i.b((Object)object);
        kotlin.jvm.internal.i.d((Object)d2, (String)"uri");
        ((s)object).n((Uri)d2, this.f, this.e);
    }

    private final void f(k.d d2) {
        try {
            s s2 = this.k;
            kotlin.jvm.internal.i.b((Object)s2);
            s2.y();
            d2.a(null);
        }
        catch (E e2) {
            d2.b("MobileScanner", "Called resetScale() while stopped!", null);
        }
    }

    private final void g(j object, k.d d2) {
        try {
            s s2 = this.k;
            kotlin.jvm.internal.i.b((Object)s2);
            object = ((j)object).b;
            kotlin.jvm.internal.i.c((Object)object, (String)"null cannot be cast to non-null type kotlin.Double");
            s2.A((Double)object);
            d2.a(null);
        }
        catch (D d3) {
            d2.b("MobileScanner", "Scale should be within 0 and 1", null);
        }
        catch (E e2) {
            d2.b("MobileScanner", "Called setScale() while stopped!", null);
        }
    }

    private final void h(j object, k.d d2) {
        Object object2 = (Boolean)((j)object).a("torch");
        boolean bl = object2 == null ? false : object2;
        object2 = (Integer)((j)object).a("facing");
        int n3 = object2 == null ? 0 : object2.intValue();
        object2 = (List)((j)object).a("formats");
        Object object3 = (Boolean)((j)object).a("returnImage");
        boolean bl2 = object3 == null ? false : object3;
        object3 = (Integer)((j)object).a("speed");
        int n4 = object3 == null ? 1 : object3.intValue();
        object3 = (Integer)((j)object).a("timeout");
        int n5 = object3 == null ? 250 : object3.intValue();
        object3 = (List)((j)object).a("cameraResolution");
        object = (Boolean)((j)object).a("useNewCameraSelector");
        boolean bl3 = object == null ? false : object.booleanValue();
        object = null;
        object3 = object3 != null ? new Size(((Number)object3.get(0)).intValue(), ((Number)object3.get(1)).intValue()) : null;
        if (object2 != null) {
            int n6;
            object = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                n6 = ((Number)object2.next()).intValue();
                object.add((Object)e1.a.Companion.a(n6).b());
            }
            if (object.size() == 1) {
                object = new b.a().b(((Number)y1.h.q((List)object)).intValue(), new int[0]).a();
            } else {
                object2 = new b.a();
                n6 = ((Number)y1.h.q((List)object)).intValue();
                object = y1.h.E((Collection)((Collection)object.subList(1, object.size())));
                object = object2.b(n6, Arrays.copyOf((int[])object, (int)((Object)object).length)).a();
            }
        }
        q q2 = n3 == 0 ? q.b : q.c;
        kotlin.jvm.internal.i.d((Object)q2, (String)"if (facing == 0) CameraS\u2026ector.DEFAULT_BACK_CAMERA");
        object2 = n4 != 0 ? (n4 != 1 ? e1.b.UNRESTRICTED : e1.b.NORMAL) : e1.b.NO_DUPLICATES;
        s s2 = this.k;
        kotlin.jvm.internal.i.b((Object)s2);
        s2.C((V0.b)object, bl2, q2, bl, (e1.b)((Object)object2), this.l, this.m, (l)new f(d2), (l)new g(d2), n5, (Size)object3, bl3);
    }

    private final void i(k.d d2) {
        try {
            s s2 = this.k;
            kotlin.jvm.internal.i.b((Object)s2);
            s2.I();
            d2.a(null);
        }
        catch (d1.b b2) {
            d2.a(null);
        }
    }

    private final void j(k.d d2) {
        s s2 = this.k;
        if (s2 != null) {
            s2.J();
        }
        d2.a(null);
    }

    private final void k(j j2, k.d d2) {
        s s2 = this.k;
        if (s2 != null) {
            s2.B((List)j2.a("rect"));
        }
        d2.a(null);
    }

    public final void e(m1.c c2) {
        kotlin.jvm.internal.i.e((Object)c2, (String)"activityPluginBinding");
        Object object = this.j;
        if (object != null) {
            ((k)object).e(null);
        }
        this.j = null;
        this.k = null;
        object = this.c.c();
        if (object != null) {
            c2.a((n)object);
        }
    }

    @Override
    public void onMethodCall(j j2, k.d d2) {
        block13: {
            block12: {
                kotlin.jvm.internal.i.e((Object)j2, (String)"call");
                kotlin.jvm.internal.i.e((Object)d2, (String)"result");
                if (this.k == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Called ");
                    stringBuilder.append(j2.a);
                    stringBuilder.append(" before initializing.");
                    d2.b("MobileScanner", stringBuilder.toString(), null);
                    return;
                }
                String string = j2.a;
                if (string == null) break block12;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 2023844470: {
                        if (!string.equals((Object)"updateScanWindow")) break;
                        this.k(j2, d2);
                        break block13;
                    }
                    case 1403963912: {
                        if (!string.equals((Object)"setScale")) break;
                        this.g(j2, d2);
                        break block13;
                    }
                    case 1095692943: {
                        if (!string.equals((Object)"request")) break;
                        this.c.e(this.a, this.d, new y.b(d2){
                            final k.d a;
                            {
                                this.a = d2;
                            }

                            @Override
                            public void a(String string, String string2) {
                                if (string == null) {
                                    this.a.a(Boolean.TRUE);
                                } else if (kotlin.jvm.internal.i.a((Object)string, (Object)"CameraAccessDenied")) {
                                    this.a.a(Boolean.FALSE);
                                } else {
                                    this.a.b(string, string2, null);
                                }
                            }
                        });
                        break block13;
                    }
                    case 109757585: {
                        if (!string.equals((Object)"state")) break;
                        d2.a(this.c.d(this.a));
                        break block13;
                    }
                    case 109757538: {
                        if (!string.equals((Object)"start")) break;
                        this.h(j2, d2);
                        break block13;
                    }
                    case 16698223: {
                        if (!string.equals((Object)"analyzeImage")) break;
                        this.d(j2, d2);
                        break block13;
                    }
                    case 3540994: {
                        if (!string.equals((Object)"stop")) break;
                        this.i(d2);
                        break block13;
                    }
                    case -655811320: {
                        if (!string.equals((Object)"toggleTorch")) break;
                        this.j(d2);
                        break block13;
                    }
                    case -1688013509: {
                        if (!string.equals((Object)"resetScale")) break;
                        this.f(d2);
                        break block13;
                    }
                }
            }
            d2.c();
        }
    }
}

