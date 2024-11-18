/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 */
package h;

import android.os.Build;
import androidx.camera.core.impl.w0;

public class g
implements w0 {
    static boolean a() {
        boolean bl = Build.VERSION.SDK_INT < 23;
        return bl;
    }
}

