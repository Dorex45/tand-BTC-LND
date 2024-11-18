/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.camera.camera2.internal.compat.E
 *  androidx.camera.core.impl.w0
 *  java.lang.Integer
 *  java.lang.Object
 */
package h;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.E;
import androidx.camera.core.impl.w0;

public class b
implements w0 {
    static boolean a(E e2) {
        boolean bl = Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && (Integer)e2.a(CameraCharacteristics.LENS_FACING) == 0;
        return bl;
    }
}

