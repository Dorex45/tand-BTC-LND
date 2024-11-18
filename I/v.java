/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraDevice
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package i;

import android.hardware.camera2.CameraDevice;
import g.q;
import i.x;
import java.util.List;
import p.a;

public final class v
implements a {
    public final x.b a;
    public final CameraDevice b;
    public final q c;
    public final List d;

    public /* synthetic */ v(x.b b2, CameraDevice cameraDevice, q q2, List list) {
        this.a = b2;
        this.b = cameraDevice;
        this.c = q2;
        this.d = list;
    }

    @Override
    public final r0.a a(Object object) {
        return x.a(this.a, this.b, this.c, this.d, (List)object);
    }
}

