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

public class r
implements H {
    private static final List a = Arrays.asList((Object[])new String[]{"PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320"});

    private static boolean a() {
        for (String string : a) {
            if (!Build.MODEL.toUpperCase(Locale.US).startsWith(string)) continue;
            return true;
        }
        return false;
    }

    static boolean b(E e2) {
        boolean bl;
        block3: {
            block2: {
                if (!r.a()) break block2;
                int n2 = (Integer)e2.a(CameraCharacteristics.LENS_FACING);
                bl = true;
                if (n2 == 1) break block3;
            }
            bl = false;
        }
        return bl;
    }
}

