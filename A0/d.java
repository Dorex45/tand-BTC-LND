/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a0.c
 *  android.content.Context
 *  com.google.android.gms.common.api.internal.d
 *  com.google.android.gms.common.api.internal.d$a
 *  java.lang.Object
 *  java.lang.Override
 */
package a0;

import W.a;
import W.d;
import X.i;
import Y.s;
import Y.u;
import Y.v;
import a0.b;
import a0.c;
import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import q0.k;

public final class d
extends W.d
implements u {
    private static final a.g k;
    private static final a.a l;
    private static final a m;
    public static final int n = 0;

    static {
        a.c c2 = new a.c(){};
        k = c2;
        c c3 = new c();
        l = c3;
        m = new a("ClientTelemetry.API", c3, c2);
    }

    public d(Context context, v v2) {
        super(context, m, v2, d.a.c);
    }

    @Override
    public final k a(s s2) {
        d.a a2 = com.google.android.gms.common.api.internal.d.a();
        a2.d(new V.c[]{i0.d.a});
        a2.c(false);
        a2.b((i)new b(s2));
        return this.e(a2.a());
    }
}

