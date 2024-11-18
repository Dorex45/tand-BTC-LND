/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 */
package h;

import android.os.Build;
import androidx.camera.core.impl.w0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class x
implements w0 {
    static final List a = Arrays.asList((Object[])new String[]{"pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro"});

    private static boolean a() {
        boolean bl = x.f() || x.e();
        return bl;
    }

    private static boolean b() {
        boolean bl = x.c() && x.a();
        return bl;
    }

    private static boolean c() {
        return a.contains((Object)Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean d() {
        boolean bl = "samsung".equalsIgnoreCase(Build.BRAND) && x.f();
        return bl;
    }

    private static boolean e() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    private static boolean f() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    static boolean g() {
        boolean bl = x.d() || x.b();
        return bl;
    }
}

