/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.Image$Plane
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.util.Log
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$a
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  g0.b
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  l0.X8
 *  l0.Z8
 *  l0.e6
 *  l0.h9
 *  l0.j9
 *  l0.l0
 *  l0.r9
 */
package com.google.mlkit.vision.barcode.internal;

import T0.l;
import Y.p;
import Z0.a;
import a1.e;
import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.barcode.internal.b;
import com.google.mlkit.vision.barcode.internal.j;
import java.util.ArrayList;
import java.util.List;
import l0.X8;
import l0.Z8;
import l0.e6;
import l0.h9;
import l0.j9;
import l0.l0;
import l0.r9;
import l0.s8;

final class k
implements j {
    private static final l0 h = l0.p((Object)"com.google.android.gms.vision.barcode", (Object)"com.google.android.gms.tflite_dynamite");
    private boolean a;
    private boolean b;
    private boolean c;
    private final Context d;
    private final V0.b e;
    private final s8 f;
    private h9 g;

    k(Context context, V0.b b2, s8 s82) {
        this.d = context;
        this.e = b2;
        this.f = s82;
    }

    static boolean c(Context context) {
        return DynamiteModule.a((Context)context, (String)"com.google.mlkit.dynamite.barcode") > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final boolean a() {
        void var1_5;
        block10: {
            if (this.g != null) {
                return this.b;
            }
            if (k.c(this.d)) {
                DynamiteModule.a a22;
                block11: {
                    this.b = true;
                    try {
                        this.g = this.d(DynamiteModule.c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
                        break block10;
                    }
                    catch (RemoteException remoteException) {
                    }
                    catch (DynamiteModule.a a22) {
                        break block11;
                    }
                    throw new P0.a("Failed to create thick barcode scanner.", 13, remoteException);
                }
                throw new P0.a("Failed to load the bundled barcode module.", 13, a22);
            }
            this.b = false;
            if (!l.a(this.d, (List)h)) {
                if (!this.c) {
                    l.d(this.d, (List)l0.p((Object)"barcode", (Object)"tflite_dynamite"));
                    this.c = true;
                }
                com.google.mlkit.vision.barcode.internal.b.e(this.f, e6.zzB);
                throw new P0.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = this.d(DynamiteModule.b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            }
            catch (RemoteException remoteException) {
            }
            catch (DynamiteModule.a a3) {
                // empty catch block
            }
        }
        com.google.mlkit.vision.barcode.internal.b.e(this.f, e6.zza);
        return this.b;
        com.google.mlkit.vision.barcode.internal.b.e(this.f, e6.zzC);
        throw new P0.a("Failed to create thin barcode scanner.", 13, (Throwable)var1_5);
    }

    @Override
    public final List b(a a2) {
        if (this.g == null) {
            this.a();
        }
        h9 h92 = (h9)p.i(this.g);
        if (!this.a) {
            try {
                h92.r();
                this.a = true;
            }
            catch (RemoteException remoteException) {
                throw new P0.a("Failed to init barcode scanner.", 13, remoteException);
            }
        }
        int n3 = a2.k();
        if (a2.f() == 35) {
            n3 = ((Image.Plane[])p.i(a2.i()))[0].getRowStride();
        }
        r9 r92 = new r9(a2.f(), n3, a2.g(), a1.b.a(a2.j()), SystemClock.elapsedRealtime());
        g0.a a3 = a1.e.b().a(a2);
        try {
            h92 = h92.q(a3, r92);
        }
        catch (RemoteException remoteException) {
            throw new P0.a("Failed to run barcode scanner.", 13, remoteException);
        }
        r92 = new ArrayList();
        h92 = h92.iterator();
        while (h92.hasNext()) {
            r92.add((Object)new W0.a(new Y0.b((X8)h92.next()), a2.e()));
        }
        return r92;
    }

    final h9 d(DynamiteModule.b object, String object2, String string) {
        boolean bl;
        object = j9.c((IBinder)DynamiteModule.d((Context)this.d, (DynamiteModule.b)object, (String)object2).c(string));
        object2 = g0.b.q((Object)this.d);
        int n3 = this.e.a();
        if (!this.e.d()) {
            this.e.b();
            bl = false;
        } else {
            bl = true;
        }
        return object.o((g0.a)object2, new Z8(n3, bl));
    }

    @Override
    public final void zzb() {
        h9 h92 = this.g;
        if (h92 != null) {
            try {
                h92.s();
            }
            catch (RemoteException remoteException) {
                Log.e((String)"DecoupledBarcodeScanner", (String)"Failed to release barcode scanner.", (Throwable)remoteException);
            }
            this.g = null;
            this.a = false;
        }
    }
}

