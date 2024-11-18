/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CaptureRequest
 *  h.E
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
package i;

import android.hardware.camera2.CaptureRequest;
import h.E;
import h.k;
import java.util.List;

public class q {
    private final boolean a;

    public q() {
        boolean bl = (E)k.a(E.class) != null;
        this.a = bl;
    }

    public boolean a(List list, boolean bl) {
        if (this.a && bl) {
            list = list.iterator();
            while (list.hasNext()) {
                int n2 = (Integer)((CaptureRequest)list.next()).get(CaptureRequest.CONTROL_AE_MODE);
                if (n2 != 2 && n2 != 3) continue;
                return true;
            }
        }
        return false;
    }
}

