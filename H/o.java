/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Size
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 */
package h;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.w0;

public class o
implements w0 {
    private Size[] b() {
        return new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
    }

    private static boolean c() {
        boolean bl = "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
        return bl;
    }

    static boolean d() {
        return o.c();
    }

    public Size[] a(int n3) {
        if (n3 == 34 && o.c()) {
            return this.b();
        }
        return new Size[0];
    }
}

