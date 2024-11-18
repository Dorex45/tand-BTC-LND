/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  android.os.Build
 *  android.os.Build$VERSION
 *  h.q
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.BufferUnderflowException
 *  l.Q
 */
package i;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import h.k;
import h.q;
import i.c;
import java.nio.BufferUnderflowException;
import l.Q;

public abstract class g {
    public static boolean a(c c2) {
        return g.b(false, c2);
    }

    public static boolean b(boolean bl, c c2) {
        BufferUnderflowException bufferUnderflowException2;
        block6: {
            boolean bl2 = false;
            try {
                c2 = (Boolean)c2.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            }
            catch (BufferUnderflowException bufferUnderflowException2) {
                if (k.a(q.class) != null) {
                    int n2 = Build.VERSION.SDK_INT;
                    Q.a((String)"FlashAvailability", (String)String.format((String)"Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", (Object[])new Object[]{Build.MANUFACTURER, Build.MODEL, n2}));
                } else {
                    int n3 = Build.VERSION.SDK_INT;
                    Q.d((String)"FlashAvailability", (String)String.format((String)"Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", (Object[])new Object[]{Build.MANUFACTURER, Build.MODEL, n3}), (Throwable)bufferUnderflowException2);
                }
                if (bl) break block6;
                c2 = Boolean.FALSE;
            }
            if (c2 == null) {
                Q.k((String)"FlashAvailability", (String)"Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
            bl = bl2;
            if (c2 != null) {
                bl = c2.booleanValue();
            }
            return bl;
        }
        throw bufferUnderflowException2;
    }
}

