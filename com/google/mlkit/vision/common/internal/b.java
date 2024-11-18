/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Z0.a
 *  com.google.mlkit.vision.common.internal.MobileVisionBase
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package com.google.mlkit.vision.common.internal;

import Z0.a;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Callable;

public final class b
implements Callable {
    public final MobileVisionBase a;
    public final a b;

    public /* synthetic */ b(MobileVisionBase mobileVisionBase, a a2) {
        this.a = mobileVisionBase;
        this.b = a2;
    }

    public final Object call() {
        return this.a.u(this.b);
    }
}

