/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package d1;

import d1.y;
import kotlin.jvm.internal.i;
import p1.n;

public final class z
implements n {
    private final y.b a;
    private boolean b;

    public z(y.b b2) {
        i.e((Object)b2, (String)"resultCallback");
        this.a = b2;
    }

    @Override
    public boolean b(int n3, String[] stringArray, int[] nArray) {
        i.e((Object)stringArray, (String)"permissions");
        i.e((Object)nArray, (String)"grantResults");
        if (!this.b && n3 == 1926) {
            this.b = true;
            if (nArray.length == 0 || nArray[0] != 0) {
                this.a.a("CameraAccessDenied", "Camera access permission was denied.");
            } else {
                this.a.a(null, null);
            }
            return true;
        }
        return false;
    }
}

