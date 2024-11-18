/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.google.mlkit.vision.barcode.internal;

import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import java.util.List;
import q0.j;
import q0.k;

public final class d
implements j {
    public final BarcodeScannerImpl a;
    public final int b;
    public final int c;

    public /* synthetic */ d(BarcodeScannerImpl barcodeScannerImpl, int n3, int n4) {
        this.a = barcodeScannerImpl;
        this.b = n3;
        this.c = n4;
    }

    @Override
    public final k a(Object object) {
        return this.a.B(this.b, this.c, (List)object);
    }
}

