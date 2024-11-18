/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.List
 */
package com.google.mlkit.vision.barcode.internal;

import T0.f;
import Y.p;
import Z0.a;
import a1.e;
import android.os.SystemClock;
import com.google.mlkit.vision.barcode.internal.b;
import com.google.mlkit.vision.barcode.internal.g;
import com.google.mlkit.vision.barcode.internal.h;
import com.google.mlkit.vision.barcode.internal.j;
import java.util.List;
import l0.F5;
import l0.J5;
import l0.K5;
import l0.Q5;
import l0.d6;
import l0.e1;
import l0.e6;
import l0.f1;
import l0.f6;
import l0.g6;
import l0.h1;
import l0.h8;
import l0.i0;
import l0.p8;
import l0.r8;
import l0.s6;
import l0.s8;
import l0.u8;
import l0.w8;

public final class i
extends f {
    private static final e j = a1.e.b();
    static boolean k = true;
    private final V0.b d;
    private final j e;
    private final s8 f;
    private final u8 g;
    private final a1.a h = new a1.a();
    private boolean i;

    public i(T0.i i2, V0.b b2, j j2, s8 s82) {
        p.j(i2, "MlKitContext can not be null");
        p.j(b2, "BarcodeScannerOptions can not be null");
        this.d = b2;
        this.e = j2;
        this.f = s82;
        this.g = u8.a(i2.b());
    }

    private final void m(e6 e62, long l2, a object, List object2) {
        Object object3 = new i0();
        Object object4 = new i0();
        if (object2 != null) {
            for (W0.a a2 : object2) {
                ((i0)object3).e(b.a(a2.h()));
                ((i0)object4).e(b.b(a2.o()));
            }
        }
        long l3 = SystemClock.elapsedRealtime() - l2;
        object = new g(this, l3, e62, (i0)object3, (i0)object4, (a)object);
        this.f.f((r8)object, f6.zzj);
        object = new f1();
        ((f1)object).e(e62);
        ((f1)object).f(k);
        ((f1)object).g(b.c(this.d));
        ((f1)object).c(((i0)object3).g());
        ((f1)object).d(((i0)object4).g());
        object3 = ((f1)object).h();
        object4 = new h(this);
        object = this.f;
        object2 = f6.zzbe;
        T0.g.d().execute((Runnable)new p8((s8)object, (f6)object2, object3, l3, (h)object4));
        l2 = System.currentTimeMillis();
        boolean bl = this.i;
        object = this.g;
        int n2 = true != bl ? 24301 : 24302;
        ((u8)object).c(n2, e62.zza(), l2 - l3, l2);
    }

    @Override
    public final void b() {
        i i2 = this;
        synchronized (i2) {
            this.i = this.e.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        i i2 = this;
        synchronized (i2) {
            Throwable throwable2;
            block3: {
                Object object;
                g6 g62;
                s8 s82;
                try {
                    this.e.zzb();
                    k = true;
                    s82 = this.f;
                    g62 = new g6();
                    object = this.i ? d6.zzc : d6.zzb;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                g62.e((d6)object);
                object = new s6();
                ((s6)object).i(b.c(this.d));
                g62.g(((s6)object).j());
                s82.d(w8.e(g62), f6.zzl);
                return;
            }
            throw throwable2;
        }
    }

    final /* synthetic */ h8 j(long l2, e6 enum_, i0 object, i0 i02, a a2) {
        s6 s62 = new s6();
        Q5 q5 = new Q5();
        q5.c(l2);
        q5.d((e6)enum_);
        q5.e(k);
        enum_ = Boolean.TRUE;
        q5.a((Boolean)enum_);
        q5.b((Boolean)enum_);
        s62.h(q5.f());
        s62.i(b.c(this.d));
        s62.e(((i0)object).g());
        s62.f(i02.g());
        int n2 = a2.f();
        int n3 = j.c(a2);
        object = new J5();
        enum_ = n2 != -1 ? (n2 != 35 ? (n2 != 842094169 ? (n2 != 16 ? (n2 != 17 ? K5.zza : K5.zzc) : K5.zzb) : K5.zzd) : K5.zze) : K5.zzg;
        ((J5)object).a((K5)enum_);
        ((J5)object).b(n3);
        s62.g(((J5)object).d());
        object = new g6();
        enum_ = this.i ? d6.zzc : d6.zzb;
        ((g6)object).e((d6)enum_);
        ((g6)object).g(s62.j());
        return w8.e((g6)object);
    }

    final /* synthetic */ h8 k(h1 h12, int n2, F5 f5) {
        g6 g62 = new g6();
        Object object = this.i ? d6.zzc : d6.zzb;
        g62.e((d6)object);
        object = new e1();
        ((e1)object).a(n2);
        ((e1)object).c(h12);
        ((e1)object).b(f5);
        g62.d(((e1)object).e());
        return w8.e(g62);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List l(a a2) {
        i i2 = this;
        synchronized (i2) {
            try {
                long l2 = SystemClock.elapsedRealtime();
                this.h.a(a2);
                try {
                    List list = this.e.b(a2);
                    this.m(e6.zza, l2, a2, list);
                    k = false;
                    return list;
                }
                catch (P0.a a3) {
                    e6 e62 = a3.a() == 14 ? e6.zzk : e6.zzX;
                    this.m(e62, l2, a2, null);
                    throw a3;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

