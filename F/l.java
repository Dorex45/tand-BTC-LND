/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Objects
 */
package F;

import F.D;
import F.a;
import F.c;
import F.d;
import F.e;
import F.f;
import F.g;
import F.h;
import F.i;
import F.j;
import F.k;
import F.u;
import android.content.Context;
import java.util.List;
import java.util.Objects;
import p1.k;

final class l
implements k.c {
    private final Context a;
    private final a b;
    private final u c;
    private final D d;

    l(Context context, a a2, u u2, D d2) {
        this.a = context;
        this.b = a2;
        this.c = u2;
        this.d = d2;
    }

    public static /* synthetic */ void a(k.d d2, String string, String string2) {
        d2.b(string, string2, null);
    }

    public static /* synthetic */ void b(k.d d2, String string, String string2) {
        d2.b(string, string2, null);
    }

    public static /* synthetic */ void c(k.d d2, String string, String string2) {
        d2.b(string, string2, null);
    }

    public static /* synthetic */ void d(k.d d2, String string, String string2) {
        d2.b(string, string2, null);
    }

    @Override
    public void onMethodCall(p1.j object, k.d d2) {
        Object object2 = ((p1.j)object).a;
        object2.hashCode();
        int n2 = -1;
        switch (object2.hashCode()) {
            default: {
                break;
            }
            case 1669188213: {
                if (!object2.equals((Object)"requestPermissions")) break;
                n2 = 4;
                break;
            }
            case 347240634: {
                if (!object2.equals((Object)"openAppSettings")) break;
                n2 = 3;
                break;
            }
            case -576207927: {
                if (!object2.equals((Object)"checkPermissionStatus")) break;
                n2 = 2;
                break;
            }
            case -1017315255: {
                if (!object2.equals((Object)"shouldShowRequestPermissionRationale")) break;
                n2 = 1;
                break;
            }
            case -1544053025: {
                if (!object2.equals((Object)"checkServiceStatus")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                d2.c();
                break;
            }
            case 4: {
                object = (List)((p1.j)object).b();
                object2 = this.c;
                Objects.requireNonNull((Object)d2);
                ((u)object2).i((List)object, new f(d2), new g(d2));
                break;
            }
            case 3: {
                object = this.b;
                object2 = this.a;
                Objects.requireNonNull((Object)d2);
                ((a)object).a((Context)object2, new j(d2), new k(d2));
                break;
            }
            case 2: {
                n2 = Integer.parseInt((String)((p1.j)object).b.toString());
                object = this.c;
                Objects.requireNonNull((Object)d2);
                ((u)object).e(n2, new e(d2));
                break;
            }
            case 1: {
                n2 = Integer.parseInt((String)((p1.j)object).b.toString());
                object = this.c;
                Objects.requireNonNull((Object)d2);
                ((u)object).k(n2, new h(d2), new i(d2));
                break;
            }
            case 0: {
                n2 = Integer.parseInt((String)((p1.j)object).b.toString());
                object = this.d;
                object2 = this.a;
                Objects.requireNonNull((Object)d2);
                ((D)object).a(n2, (Context)object2, new c(d2), new d(d2));
            }
        }
    }
}

