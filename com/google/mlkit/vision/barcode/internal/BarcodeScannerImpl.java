/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package com.google.mlkit.vision.barcode.internal;

import T0.f;
import T0.l;
import V.c;
import V0.b;
import Z0.a;
import com.google.mlkit.vision.barcode.internal.b;
import com.google.mlkit.vision.barcode.internal.d;
import com.google.mlkit.vision.barcode.internal.i;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import l0.H8;
import l0.d6;
import l0.f6;
import l0.g6;
import l0.s6;
import l0.s8;
import l0.u6;
import l0.w8;
import q0.k;
import q0.n;

public class BarcodeScannerImpl
extends MobileVisionBase<List<W0.a>>
implements V0.a {
    private static final V0.b p = new b.a().a();
    private final boolean k;
    private final V0.b l;
    final H8 m;
    private int n;
    private boolean o;

    BarcodeScannerImpl(V0.b object, i object2, Executor object3, s8 s82, T0.i i2) {
        boolean bl;
        ((V0.b)object).b();
        super((f)object2, (Executor)object3);
        this.l = object;
        this.k = bl = b.f();
        object2 = new s6();
        ((s6)object2).i(b.c((V0.b)object));
        object3 = ((s6)object2).j();
        object2 = new g6();
        object = bl ? d6.zzc : d6.zzb;
        ((g6)object2).e((d6)object);
        ((g6)object2).g((u6)object3);
        s82.d(w8.f((g6)object2, 1), f6.zzk);
    }

    static /* bridge */ /* synthetic */ V0.b I() {
        return p;
    }

    private final k O(k k2, int n2, int n3) {
        return k2.m(new d(this, n2, n3));
    }

    final /* synthetic */ k B(int n2, int n3, List list) {
        return q0.n.d(list);
    }

    @Override
    public final k J(a a2) {
        return this.O(super.n(a2), a2.k(), a2.g());
    }

    @Override
    public final c[] c() {
        c[] cArray = this.k ? T0.l.a : new c[]{T0.l.b};
        return cArray;
    }

    @Override
    public final void close() {
        BarcodeScannerImpl barcodeScannerImpl = this;
        synchronized (barcodeScannerImpl) {
            super.close();
            return;
        }
    }
}

