/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  H1.l
 *  android.app.Activity
 *  android.content.Context
 *  androidx.core.app.a
 *  androidx.core.content.a
 *  d1.y$c
 *  d1.z
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.e
 *  kotlin.jvm.internal.i
 *  p1.n
 */
package d1;

import H1.l;
import android.app.Activity;
import android.content.Context;
import d1.y;
import d1.z;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p1.n;

public final class y {
    public static final a c = new a(null);
    private n a;
    private boolean b;

    public static final /* synthetic */ void a(y y2, n n2) {
        y2.a = n2;
    }

    public static final /* synthetic */ void b(y y2, boolean bl) {
        y2.b = bl;
    }

    public final n c() {
        return this.a;
    }

    public final int d(Activity activity) {
        i.e((Object)activity, (String)"activity");
        int n2 = androidx.core.content.a.a((Context)activity, (String)"android.permission.CAMERA") == 0 ? 1 : 2;
        return n2;
    }

    public final void e(Activity activity, l l2, b b2) {
        i.e((Object)activity, (String)"activity");
        i.e((Object)l2, (String)"addPermissionListener");
        i.e((Object)b2, (String)"callback");
        if (this.b) {
            b2.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
            return;
        }
        if (this.d(activity) == 1) {
            b2.a(null, null);
            return;
        }
        if (this.a == null) {
            b2 = new z((b)new c(this, b2));
            this.a = b2;
            l2.invoke((Object)b2);
        }
        this.b = true;
        androidx.core.app.a.g((Activity)activity, (String[])new String[]{"android.permission.CAMERA"}, (int)1926);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e e2) {
            this();
        }
    }

    public static interface b {
        public void a(String var1, String var2);
    }
}

