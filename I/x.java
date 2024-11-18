/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCaptureSession
 *  android.hardware.camera2.CameraCaptureSession$CaptureCallback
 *  android.hardware.camera2.CameraDevice
 *  android.hardware.camera2.CaptureRequest
 *  androidx.camera.camera2.internal.E0
 *  androidx.camera.camera2.internal.O
 *  androidx.camera.core.impl.x0
 *  androidx.concurrent.futures.c
 *  androidx.concurrent.futures.c$a
 *  androidx.concurrent.futures.c$c
 *  h.h
 *  i.v
 *  i.w
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  o.a
 *  p.a
 *  p.d
 *  p.f
 *  r0.a
 */
package i;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.E0;
import androidx.camera.camera2.internal.O;
import androidx.camera.core.impl.x0;
import androidx.concurrent.futures.c;
import g.q;
import h.h;
import i.v;
import i.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.a;
import p.d;
import p.f;

public class x {
    private final boolean a;
    private final Object b = new Object();
    private final r0.a c;
    c.a d;
    private boolean e;
    private final CameraCaptureSession.CaptureCallback f = new CameraCaptureSession.CaptureCallback(this){
        final x a;
        {
            this.a = x2;
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int n2) {
            cameraCaptureSession = this.a.d;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.d();
                this.a.d = null;
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long l2, long l3) {
            cameraCaptureSession = this.a.d;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.c(null);
                this.a.d = null;
            }
        }
    };

    public x(x0 x02) {
        this.a = x02.a(h.class);
        this.c = this.i() ? androidx.concurrent.futures.c.a((c.c)new w(this)) : p.f.g(null);
    }

    public static /* synthetic */ r0.a a(b b2, CameraDevice cameraDevice, q q2, List list, List list2) {
        return b2.a(cameraDevice, q2, list);
    }

    public static /* synthetic */ Object b(x x2, c.a a2) {
        return x2.d(a2);
    }

    private /* synthetic */ Object d(c.a a2) {
        this.d = a2;
        a2 = new StringBuilder();
        a2.append("WaitForRepeatingRequestStart[");
        a2.append((Object)this);
        a2.append("]");
        return a2.toString();
    }

    public r0.a c() {
        return p.f.i((r0.a)this.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.i() || this.e) break block3;
                        this.c.cancel(true);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public r0.a g(CameraDevice cameraDevice, q q2, List list, List list2, b b2) {
        ArrayList arrayList = new ArrayList();
        list2 = list2.iterator();
        while (list2.hasNext()) {
            arrayList.add((Object)((E0)list2.next()).f());
        }
        return p.d.b((r0.a)p.f.m((Collection)arrayList)).e((p.a)new v(b2, cameraDevice, q2, list), o.a.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c c2) {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            CameraCaptureSession.CaptureCallback captureCallback2 = captureCallback;
            try {
                if (!this.i()) return c2.a(captureRequest, captureCallback2);
                captureCallback2 = O.b((CameraCaptureSession.CaptureCallback[])new CameraCaptureSession.CaptureCallback[]{this.f, captureCallback});
                this.e = true;
                return c2.a(captureRequest, captureCallback2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean i() {
        return this.a;
    }

    public static interface b {
        public r0.a a(CameraDevice var1, q var2, List var3);
    }

    public static interface c {
        public int a(CaptureRequest var1, CameraCaptureSession.CaptureCallback var2);
    }
}

