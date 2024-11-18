/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 *  kotlin.jvm.internal.i
 */
package d1;

import android.os.Handler;
import android.os.Looper;
import d1.c;
import java.util.Map;
import kotlin.jvm.internal.i;
import p1.d;

public final class d
implements d.d {
    private d.b a;
    private final p1.d b;

    public d(p1.c object) {
        i.e((Object)object, (String)"binaryMessenger");
        this.b = object = new p1.d((p1.c)object, "dev.steenbakker.mobile_scanner/scanner/event");
        ((p1.d)object).d(this);
    }

    public static /* synthetic */ void c(d d2, Map map) {
        d.e(d2, map);
    }

    private static final void e(d object, Map map) {
        i.e((Object)object, (String)"this$0");
        i.e((Object)map, (String)"$event");
        object = ((d)object).a;
        if (object != null) {
            object.a(map);
        }
    }

    @Override
    public void a(Object object) {
        this.a = null;
    }

    @Override
    public void b(Object object, d.b b2) {
        this.a = b2;
    }

    public final void d(Map map) {
        i.e((Object)map, (String)"event");
        new Handler(Looper.getMainLooper()).post((Runnable)new c(this, map));
    }
}

