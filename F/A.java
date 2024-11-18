/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCaptureSession$CaptureCallback
 *  android.hardware.camera2.CameraCaptureSession$StateCallback
 *  android.hardware.camera2.CameraDevice$StateCallback
 *  android.hardware.camera2.CaptureRequest$Key
 *  androidx.camera.core.impl.P
 *  androidx.camera.core.impl.P$a
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.P;
import f.d;
import k.j;

public final class a
extends j {
    public static final P.a H = P.a.a((String)"camera2.captureRequest.templateType", (Class)Integer.TYPE);
    public static final P.a I = P.a.a((String)"camera2.cameraCaptureSession.streamUseCase", (Class)Long.TYPE);
    public static final P.a J = P.a.a((String)"camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final P.a K = P.a.a((String)"camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final P.a L = P.a.a((String)"camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final P.a M = P.a.a((String)"camera2.cameraEvent.callback", d.class);
    public static final P.a N = P.a.a((String)"camera2.captureRequest.tag", Object.class);
    public static final P.a O = P.a.a((String)"camera2.cameraCaptureSession.physicalCameraId", String.class);

    public a(P p2) {
        super(p2);
    }

    public static P.a R(CaptureRequest.Key key) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("camera2.captureRequest.option.");
        stringBuilder.append(key.getName());
        return P.a.b((String)stringBuilder.toString(), Object.class, (Object)key);
    }

    public d S(d d2) {
        return (d)((Object)this.I().b(M, (Object)d2));
    }

    public j T() {
        return j.a.e(this.I()).d();
    }

    public Object U(Object object) {
        return this.I().b(N, object);
    }

    public int V(int n2) {
        return (Integer)this.I().b(H, (Object)n2);
    }

    public CameraDevice.StateCallback W(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback)this.I().b(J, (Object)stateCallback);
    }

    public String X(String string) {
        return (String)this.I().b(O, (Object)string);
    }

    public CameraCaptureSession.CaptureCallback Y(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback)this.I().b(L, (Object)captureCallback);
    }

    public CameraCaptureSession.StateCallback Z(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback)this.I().b(K, (Object)stateCallback);
    }

    public long a0(long l2) {
        return (Long)this.I().b(I, (Object)l2);
    }
}

