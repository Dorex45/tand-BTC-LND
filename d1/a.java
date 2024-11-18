/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  d1.A$a
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package d1;

import H1.l;
import android.app.Activity;
import d1.A;
import d1.d;
import d1.u;
import d1.y;
import io.flutter.view.TextureRegistry;
import kotlin.jvm.internal.i;
import l1.a;
import p1.c;

public final class A
implements l1.a,
m1.a {
    private m1.c a;
    private a.b b;
    private u c;

    @Override
    public void onAttachedToActivity(m1.c c2) {
        i.e((Object)c2, (String)"activityPluginBinding");
        Object object = this.b;
        i.b((Object)object);
        c c3 = ((a.b)object).b();
        i.d((Object)c3, (String)"this.flutterPluginBinding!!.binaryMessenger");
        Activity activity = c2.c();
        i.d((Object)activity, (String)"activityPluginBinding.activity");
        d d2 = new d(c3);
        object = new y();
        a a2 = new a((Object)c2);
        Object object2 = this.b;
        i.b((Object)object2);
        object2 = ((a.b)object2).c();
        i.d((Object)object2, (String)"this.flutterPluginBinding!!.textureRegistry");
        this.c = new u(activity, d2, c3, (y)object, (l)a2, (TextureRegistry)object2);
        this.a = c2;
    }

    @Override
    public void onAttachedToEngine(a.b b2) {
        i.e((Object)b2, (String)"binding");
        this.b = b2;
    }

    @Override
    public void onDetachedFromActivity() {
        u u2 = this.c;
        if (u2 != null) {
            m1.c c2 = this.a;
            i.b((Object)c2);
            u2.e(c2);
        }
        this.c = null;
        this.a = null;
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    @Override
    public void onDetachedFromEngine(a.b b2) {
        i.e((Object)b2, (String)"binding");
        this.b = null;
    }

    @Override
    public void onReattachedToActivityForConfigChanges(m1.c c2) {
        i.e((Object)c2, (String)"binding");
        this.onAttachedToActivity(c2);
    }
}

