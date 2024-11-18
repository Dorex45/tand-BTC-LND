/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
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

public class z
implements w0 {
    private static final List a = Arrays.asList((Object[])new String[]{"NEXUS 4"});

    static boolean b() {
        boolean bl = "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && a.contains((Object)Build.MODEL.toUpperCase(Locale.US));
        return bl;
    }

    public int a() {
        return 2;
    }
}

