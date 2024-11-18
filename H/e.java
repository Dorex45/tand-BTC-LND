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

public class e
implements H {
    public static final List a = Arrays.asList((Object[])new String[]{"SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN"});

    static boolean a(E e2) {
        boolean bl;
        block3: {
            block2: {
                if (!a.contains((Object)Build.MODEL.toUpperCase(Locale.US))) break block2;
                int n2 = (Integer)e2.a(CameraCharacteristics.LENS_FACING);
                bl = true;
                if (n2 == 1) break block3;
            }
            bl = false;
        }
        return bl;
    }
}

