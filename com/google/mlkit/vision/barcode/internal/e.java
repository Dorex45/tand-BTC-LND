/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl
 *  com.google.mlkit.vision.barcode.internal.f
 *  com.google.mlkit.vision.barcode.internal.i
 *  java.lang.Object
 *  java.lang.String
 *  l0.E8
 */
package com.google.mlkit.vision.barcode.internal;

import T0.d;
import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import com.google.mlkit.vision.barcode.internal.b;
import com.google.mlkit.vision.barcode.internal.f;
import com.google.mlkit.vision.barcode.internal.i;
import l0.E8;

public final class e {
    private final f a;
    private final d b;
    private final T0.i c;

    e(f f2, d d2, T0.i i2) {
        this.a = f2;
        this.b = d2;
        this.c = i2;
    }

    public final BarcodeScannerImpl a() {
        return this.b(BarcodeScannerImpl.I());
    }

    public final BarcodeScannerImpl b(V0.b b2) {
        return new BarcodeScannerImpl(b2, (i)this.a.b(b2), this.b.a(b2.c()), E8.b((String)com.google.mlkit.vision.barcode.internal.b.d()), this.c);
    }
}

