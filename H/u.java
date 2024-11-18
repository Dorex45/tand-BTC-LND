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
 */
package h;

import android.os.Build;
import androidx.camera.core.impl.w0;
import java.util.Arrays;
import java.util.List;

public class u
implements w0 {
    public static final List a = Arrays.asList((Object[])new String[]{"Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL"});

    static boolean a() {
        boolean bl = a.contains((Object)Build.MODEL) && "Google".equals((Object)Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
        return bl;
    }
}

