/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
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

public class c
implements w0 {
    static boolean b(E e2) {
        boolean bl = (e2 = (Integer)e2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && e2.intValue() == 2 && Build.VERSION.SDK_INT == 21;
        return bl;
    }

    public int a() {
        return 2;
    }
}

