/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Size
 *  androidx.camera.core.impl.w0
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package h;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.Q;

public class m
implements w0 {
    private List b(String string, int n3, Class clazz) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0") && (n3 == 34 || n3 == 35 || clazz != null)) {
            arrayList.add((Object)new Size(720, 720));
            arrayList.add((Object)new Size(400, 400));
        }
        return arrayList;
    }

    private List c(String string, int n3) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0") && n3 == 256) {
            arrayList.add((Object)new Size(4160, 3120));
            arrayList.add((Object)new Size(4000, 3000));
        }
        return arrayList;
    }

    private List d(String string, int n3) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0") && n3 == 256) {
            arrayList.add((Object)new Size(4160, 3120));
            arrayList.add((Object)new Size(4000, 3000));
        }
        return arrayList;
    }

    private List e(String string, int n3) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0") && n3 == 256) {
            arrayList.add((Object)new Size(9280, 6944));
        }
        return arrayList;
    }

    private List f(String string, int n3, Class clazz) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0")) {
            if (n3 != 34 && clazz == null) {
                if (n3 == 35) {
                    arrayList.add((Object)new Size(2048, 1536));
                    arrayList.add((Object)new Size(2048, 1152));
                    arrayList.add((Object)new Size(1920, 1080));
                }
            } else {
                arrayList.add((Object)new Size(4128, 3096));
                arrayList.add((Object)new Size(4128, 2322));
                arrayList.add((Object)new Size(3088, 3088));
                arrayList.add((Object)new Size(3264, 2448));
                arrayList.add((Object)new Size(3264, 1836));
                arrayList.add((Object)new Size(2048, 1536));
                arrayList.add((Object)new Size(2048, 1152));
                arrayList.add((Object)new Size(1920, 1080));
            }
        } else if (string.equals((Object)"1") && (n3 == 34 || n3 == 35 || clazz != null)) {
            arrayList.add((Object)new Size(2576, 1932));
            arrayList.add((Object)new Size(2560, 1440));
            arrayList.add((Object)new Size(1920, 1920));
            arrayList.add((Object)new Size(2048, 1536));
            arrayList.add((Object)new Size(2048, 1152));
            arrayList.add((Object)new Size(1920, 1080));
        }
        return arrayList;
    }

    private List g(String string, int n3, Class clazz) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"0")) {
            if (n3 != 34 && clazz == null) {
                if (n3 == 35) {
                    arrayList.add((Object)new Size(4128, 2322));
                    arrayList.add((Object)new Size(3088, 3088));
                    arrayList.add((Object)new Size(3264, 2448));
                    arrayList.add((Object)new Size(3264, 1836));
                    arrayList.add((Object)new Size(2048, 1536));
                    arrayList.add((Object)new Size(2048, 1152));
                    arrayList.add((Object)new Size(1920, 1080));
                }
            } else {
                arrayList.add((Object)new Size(4128, 3096));
                arrayList.add((Object)new Size(4128, 2322));
                arrayList.add((Object)new Size(3088, 3088));
                arrayList.add((Object)new Size(3264, 2448));
                arrayList.add((Object)new Size(3264, 1836));
                arrayList.add((Object)new Size(2048, 1536));
                arrayList.add((Object)new Size(2048, 1152));
                arrayList.add((Object)new Size(1920, 1080));
            }
        } else if (string.equals((Object)"1") && (n3 == 34 || n3 == 35 || clazz != null)) {
            arrayList.add((Object)new Size(3264, 2448));
            arrayList.add((Object)new Size(3264, 1836));
            arrayList.add((Object)new Size(2448, 2448));
            arrayList.add((Object)new Size(1920, 1920));
            arrayList.add((Object)new Size(2048, 1536));
            arrayList.add((Object)new Size(2048, 1152));
            arrayList.add((Object)new Size(1920, 1080));
        }
        return arrayList;
    }

    private static boolean h() {
        boolean bl = "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
        return bl;
    }

    private static boolean i() {
        boolean bl = "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
        return bl;
    }

    private static boolean j() {
        boolean bl = "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
        return bl;
    }

    private static boolean k() {
        boolean bl = "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
        return bl;
    }

    private static boolean l() {
        boolean bl = "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
        return bl;
    }

    private static boolean m() {
        boolean bl = "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
        return bl;
    }

    static boolean n() {
        boolean bl = m.i() || m.j() || m.h() || m.m() || m.l() || m.k();
        return bl;
    }

    public List a(String string, int n3) {
        if (m.i()) {
            return this.c(string, n3);
        }
        if (m.j()) {
            return this.d(string, n3);
        }
        if (m.h()) {
            return this.b(string, n3, null);
        }
        if (m.m()) {
            return this.g(string, n3, null);
        }
        if (m.l()) {
            return this.f(string, n3, null);
        }
        if (m.k()) {
            return this.e(string, n3);
        }
        Q.k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}

