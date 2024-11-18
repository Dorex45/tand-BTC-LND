/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.Image$Plane
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.util.Log
 *  com.google.android.gms.dynamite.DynamiteModule
 *  com.google.android.gms.dynamite.DynamiteModule$a
 *  com.google.android.gms.dynamite.DynamiteModule$b
 *  g0.b
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  l0.e6
 *  l0.i
 *  l0.k
 *  l0.m
 *  l0.o
 *  l0.v8
 */
package com.google.mlkit.vision.barcode.internal;

import Y.p;
import Y0.c;
import Z0.a;
import a1.d;
import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.barcode.internal.b;
import com.google.mlkit.vision.barcode.internal.j;
import java.util.ArrayList;
import java.util.List;
import l0.e6;
import l0.i;
import l0.k;
import l0.m;
import l0.o;
import l0.s8;
import l0.v8;

final class l
implements j {
    private boolean a;
    private final Context b;
    private final i c;
    private final s8 d;
    private k e;

    l(Context context, V0.b b2, s8 s82) {
        i i2;
        this.c = i2 = new i();
        this.b = context;
        i2.a = b2.a();
        this.d = s82;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a() {
        if (this.e != null) {
            return false;
        }
        try {
            Object object;
            this.e = object = m.c((IBinder)DynamiteModule.d((Context)this.b, (DynamiteModule.b)DynamiteModule.b, (String)"com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).i(g0.b.q((Object)this.b), this.c);
            if (object == null && !this.a) {
                Log.d((String)"LegacyBarcodeScanner", (String)"Request optional module download.");
                T0.l.c(this.b, "barcode");
                this.a = true;
                com.google.mlkit.vision.barcode.internal.b.e(this.d, e6.zzB);
                object = new P0.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
                throw object;
            }
        }
        catch (DynamiteModule.a a2) {
            throw new P0.a("Failed to load deprecated vision dynamite module.", 13, a2);
        }
        catch (RemoteException remoteException) {
            throw new P0.a("Failed to create legacy barcode detector.", 13, remoteException);
        }
        com.google.mlkit.vision.barcode.internal.b.e(this.d, e6.zza);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List b(a a2) {
        ArrayList arrayList;
        Object object;
        int n3;
        int n4;
        Object object2;
        if (this.e == null) {
            this.a();
        }
        if ((object2 = this.e) == null) throw new P0.a("Error initializing the legacy barcode scanner.", 14);
        Object object3 = (k)p.i(object2);
        object2 = new o(a2.k(), a2.g(), 0, 0L, a1.b.a(a2.j()));
        try {
            block10: {
                block11: {
                    n4 = a2.f();
                    n3 = 0;
                    if (n4 == -1) break block11;
                    if (n4 != 17) {
                        if (n4 != 35) {
                            if (n4 != 842094169) {
                                n3 = a2.f();
                                a2 = new StringBuilder();
                                a2.append("Unsupported image format: ");
                                a2.append(n3);
                                object2 = new P0.a(a2.toString(), 3);
                                throw object2;
                            }
                            object2 = object3.r(g0.b.q((Object)a1.d.d().c(a2, false)), (o)object2);
                            break block10;
                        } else {
                            object = (Image.Plane[])p.i(a2.i());
                            object2.a = object[0].getRowStride();
                            object2 = object3.r(g0.b.q((Object)object[0].getBuffer()), (o)object2);
                        }
                        break block10;
                    } else {
                        object2 = object3.r(g0.b.q((Object)a2.d()), (o)object2);
                    }
                    break block10;
                }
                object2 = object3.s(g0.b.q((Object)a2.c()), (o)object2);
            }
            arrayList = new ArrayList();
            n4 = ((v8[])object2).length;
        }
        catch (RemoteException remoteException) {
            throw new P0.a("Failed to detect with legacy barcode detector", 13, remoteException);
        }
        while (n3 < n4) {
            v8 v82 = object2[n3];
            {
                object = new c(v82);
                object3 = new W0.a((X0.a)object, a2.e());
                arrayList.add(object3);
                ++n3;
            }
        }
        return arrayList;
    }

    @Override
    public final void zzb() {
        k k2 = this.e;
        if (k2 != null) {
            try {
                k2.q();
            }
            catch (RemoteException remoteException) {
                Log.e((String)"LegacyBarcodeScanner", (String)"Failed to release legacy barcode detector.", (Throwable)remoteException);
            }
            this.e = null;
        }
    }
}

