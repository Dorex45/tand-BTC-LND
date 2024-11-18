/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  android.os.Build
 *  androidx.camera.camera2.internal.compat.E
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 */
package h;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.E;
import h.H;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class t
implements H {
    private static final List a = Arrays.asList((Object[])new String[]{"itel w6004"});
    private static final List b = Arrays.asList((Object[])new String[]{"sm-j700f", "sm-j710f"});

    static boolean a(E e2) {
        List list = b;
        String string = Build.MODEL;
        Locale locale = Locale.US;
        boolean bl = list.contains((Object)string.toLowerCase(locale));
        boolean bl2 = false;
        boolean bl3 = bl && (Integer)e2.a(CameraCharacteristics.LENS_FACING) == 0;
        bl = a.contains((Object)string.toLowerCase(locale));
        if (bl3 || bl) {
            bl2 = true;
        }
        return bl2;
    }
}

