/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 */
package F;

import F.D;
import F.a;
import F.l;
import F.u;
import android.app.Activity;
import android.content.Context;
import l1.a;
import p1.c;
import p1.k;

public final class m
implements l1.a,
m1.a {
    private u a;
    private k b;
    private m1.c c;
    private l d;

    private void a() {
        m1.c c2 = this.c;
        if (c2 != null) {
            c2.d(this.a);
            this.c.a(this.a);
        }
    }

    private void b() {
        m1.c c2 = this.c;
        if (c2 != null) {
            c2.b(this.a);
            this.c.e(this.a);
        }
    }

    private void c(Context object, c c2) {
        this.b = new k(c2, "flutter.baseflow.com/permissions/methods");
        object = new l((Context)object, new a(), this.a, new D());
        this.d = object;
        this.b.e((k.c)object);
    }

    private void d(Activity activity) {
        u u2 = this.a;
        if (u2 != null) {
            u2.j(activity);
        }
    }

    private void e() {
        this.b.e(null);
        this.b = null;
        this.d = null;
    }

    private void f() {
        u u2 = this.a;
        if (u2 != null) {
            u2.j(null);
        }
    }

    @Override
    public void onAttachedToActivity(m1.c c2) {
        this.d(c2.c());
        this.c = c2;
        this.b();
    }

    @Override
    public void onAttachedToEngine(a.b b2) {
        this.a = new u(b2.a());
        this.c(b2.a(), b2.b());
    }

    @Override
    public void onDetachedFromActivity() {
        this.f();
        this.a();
        this.c = null;
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    @Override
    public void onDetachedFromEngine(a.b b2) {
        this.e();
    }

    @Override
    public void onReattachedToActivityForConfigChanges(m1.c c2) {
        this.onAttachedToActivity(c2);
    }
}

