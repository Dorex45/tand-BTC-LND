/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  c0.k
 *  com.google.android.gms.common.api.internal.d
 *  com.google.android.gms.common.api.internal.d$a
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Arrays
 */
package c0;

import V.c;
import W.a;
import W.d;
import Y.p;
import android.content.Context;
import b0.b;
import b0.d;
import b0.f;
import b0.g;
import c0.a;
import c0.i;
import c0.j;
import c0.k;
import com.google.android.gms.common.api.internal.d;
import java.util.Arrays;

public final class n
extends W.d
implements d {
    private static final a.g k;
    private static final a.a l;
    private static final W.a m;

    static {
        a.c c2 = new a.c(){};
        k = c2;
        k k2 = new k();
        l = k2;
        m = new W.a("ModuleInstall.API", k2, c2);
    }

    public n(Context context) {
        super(context, m, a.d.a, d.a.c);
    }

    static final a m(boolean bl, W.f ... fArray) {
        p.j(fArray, "Requested APIs must not be null.");
        int n3 = fArray.length;
        boolean bl2 = n3 > 0;
        p.b(bl2, "Please provide at least one OptionalModuleApi.");
        for (int i2 = 0; i2 < n3; ++i2) {
            p.j(fArray[i2], "Requested API must not be null.");
        }
        return a.c(Arrays.asList((Object[])fArray), bl);
    }

    @Override
    public final q0.k b(f object) {
        a a2 = a.a((f)object);
        ((f)object).b();
        ((f)object).c();
        boolean bl = ((f)object).e();
        if (a2.b().isEmpty()) {
            object = q0.n.d(new g(0));
        } else {
            object = com.google.android.gms.common.api.internal.d.a();
            object.d(new c[]{i0.j.a});
            object.c(bl);
            object.e(27304);
            object.b((X.i)new i(this, a2));
            object = this.f(object.a());
        }
        return object;
    }

    @Override
    public final q0.k c(W.f ... object) {
        if (((a)(object = n.m(false, (W.f[])object))).b().isEmpty()) {
            return q0.n.d(new b(true, 0));
        }
        d.a a2 = com.google.android.gms.common.api.internal.d.a();
        a2.d(new c[]{i0.j.a});
        a2.e(27301);
        a2.c(false);
        a2.b((X.i)new j(this, (a)object));
        return this.f(a2.a());
    }
}

