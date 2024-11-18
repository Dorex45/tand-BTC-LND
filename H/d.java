/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  androidx.camera.camera2.internal.compat.E
 *  androidx.camera.camera2.internal.compat.Y
 *  androidx.camera.core.impl.w0
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
package h;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.E;
import androidx.camera.camera2.internal.compat.Y;
import androidx.camera.core.impl.w0;
import java.util.List;

public class d
implements w0 {
    private final Y a;
    private List b = null;

    public d(E e2) {
        this.a = e2.b();
    }

    static boolean a(E e2) {
        boolean bl = (e2 = (Integer)e2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && e2.intValue() == 2;
        return bl;
    }
}

