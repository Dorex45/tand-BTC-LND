/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  com.google.mlkit.vision.barcode.internal.a
 *  com.google.mlkit.vision.barcode.internal.k
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.atomic.AtomicReference
 *  l0.Z7
 *  l0.a8
 *  l0.c8
 *  l0.e6
 *  l0.f6
 *  l0.i0
 *  l0.q6
 *  l0.r6
 *  l0.r8
 *  l0.s8
 */
package com.google.mlkit.vision.barcode.internal;

import T0.i;
import android.content.Context;
import android.util.SparseArray;
import com.google.mlkit.vision.barcode.internal.a;
import com.google.mlkit.vision.barcode.internal.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l0.Z7;
import l0.a8;
import l0.c8;
import l0.e6;
import l0.f6;
import l0.i0;
import l0.q6;
import l0.r6;
import l0.r8;
import l0.s8;

public abstract class b {
    private static final SparseArray a;
    private static final SparseArray b;
    static final AtomicReference c;
    private static final Map d;

    static {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        a = sparseArray2 = new SparseArray();
        b = sparseArray = new SparseArray();
        c = new AtomicReference();
        sparseArray2.put(-1, (Object)q6.zza);
        sparseArray2.put(1, (Object)q6.zzb);
        sparseArray2.put(2, (Object)q6.zzc);
        sparseArray2.put(4, (Object)q6.zzd);
        sparseArray2.put(8, (Object)q6.zze);
        sparseArray2.put(16, (Object)q6.zzf);
        sparseArray2.put(32, (Object)q6.zzg);
        sparseArray2.put(64, (Object)q6.zzh);
        sparseArray2.put(128, (Object)q6.zzi);
        sparseArray2.put(256, (Object)q6.zzj);
        sparseArray2.put(512, (Object)q6.zzk);
        sparseArray2.put(1024, (Object)q6.zzl);
        sparseArray2.put(2048, (Object)q6.zzm);
        sparseArray2.put(4096, (Object)q6.zzn);
        sparseArray.put(0, (Object)r6.zza);
        sparseArray.put(1, (Object)r6.zzb);
        sparseArray.put(2, (Object)r6.zzc);
        sparseArray.put(3, (Object)r6.zzd);
        sparseArray.put(4, (Object)r6.zze);
        sparseArray.put(5, (Object)r6.zzf);
        sparseArray.put(6, (Object)r6.zzg);
        sparseArray.put(7, (Object)r6.zzh);
        sparseArray.put(8, (Object)r6.zzi);
        sparseArray.put(9, (Object)r6.zzj);
        sparseArray.put(10, (Object)r6.zzk);
        sparseArray.put(11, (Object)r6.zzl);
        sparseArray.put(12, (Object)r6.zzm);
        sparseArray = new HashMap();
        d = sparseArray;
        sparseArray.put((Object)1, (Object)Z7.zzb);
        sparseArray.put((Object)2, (Object)Z7.zzc);
        sparseArray.put((Object)4, (Object)Z7.zzd);
        sparseArray.put((Object)8, (Object)Z7.zze);
        sparseArray.put((Object)16, (Object)Z7.zzf);
        sparseArray.put((Object)32, (Object)Z7.zzg);
        sparseArray.put((Object)64, (Object)Z7.zzh);
        sparseArray.put((Object)128, (Object)Z7.zzi);
        sparseArray.put((Object)256, (Object)Z7.zzj);
        sparseArray.put((Object)512, (Object)Z7.zzk);
        sparseArray.put((Object)1024, (Object)Z7.zzl);
        sparseArray.put((Object)2048, (Object)Z7.zzm);
        sparseArray.put((Object)4096, (Object)Z7.zzn);
    }

    public static q6 a(int n2) {
        q6 q62;
        q6 q63 = q62 = (q6)a.get(n2);
        if (q62 == null) {
            q63 = q6.zza;
        }
        return q63;
    }

    public static r6 b(int n2) {
        r6 r62;
        r6 r63 = r62 = (r6)b.get(n2);
        if (r62 == null) {
            r63 = r6.zza;
        }
        return r63;
    }

    public static c8 c(V0.b b2) {
        int n2 = b2.a();
        b2 = new i0();
        if (n2 == 0) {
            b2.f((Iterable)d.values());
        } else {
            for (Map.Entry entry : d.entrySet()) {
                if (((Integer)entry.getKey() & n2) == 0) continue;
                b2.e((Z7)entry.getValue());
            }
        }
        Iterator iterator = new a8();
        iterator.b(b2.g());
        return iterator.c();
    }

    public static String d() {
        if (!com.google.mlkit.vision.barcode.internal.b.f()) {
            return "play-services-mlkit-barcode-scanning";
        }
        return "barcode-scanning";
    }

    static void e(s8 s82, e6 e62) {
        s82.f((r8)new a(e62), f6.zzm);
    }

    static boolean f() {
        AtomicReference atomicReference = c;
        if (atomicReference.get() != null) {
            return (Boolean)atomicReference.get();
        }
        boolean bl = k.c((Context)i.c().b());
        atomicReference.set((Object)bl);
        return bl;
    }
}

