/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  android.os.Build
 *  androidx.camera.camera2.internal.compat.E
 *  androidx.camera.core.impl.w0
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
import androidx.camera.core.impl.w0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class s
implements w0 {
    private static final List a = Arrays.asList((Object[])new String[]{"sm-j700f", "sm-j710f"});

    static boolean a(E e2) {
        boolean bl = a.contains((Object)Build.MODEL.toLowerCase(Locale.US)) && (Integer)e2.a(CameraCharacteristics.LENS_FACING) == 0;
        return bl;
    }
}

