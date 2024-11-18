/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.camera.core.impl.F0
 *  androidx.camera.core.impl.G0
 *  androidx.camera.core.impl.G0$a
 *  androidx.camera.core.impl.G0$b
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 */
package h;

import android.os.Build;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class p
implements w0 {
    private static final F0 a = p.a();
    private static final F0 b = p.b();
    private static final F0 c = p.c();
    private static final Set d = new HashSet((Collection)Arrays.asList((Object[])new String[]{"SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"}));
    private static final Set e = new HashSet((Collection)Arrays.asList((Object[])new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO"}));

    private static F0 a() {
        F0 f02 = new F0();
        G0.b b2 = G0.b.YUV;
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.VGA));
        f02.a(G0.a((G0.b)G0.b.PRIV, (G0.a)G0.a.PREVIEW));
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.MAXIMUM));
        return f02;
    }

    private static F0 b() {
        F0 f02 = new F0();
        G0.b b2 = G0.b.YUV;
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.VGA));
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.PREVIEW));
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.MAXIMUM));
        return f02;
    }

    private static F0 c() {
        F0 f02 = new F0();
        G0.b b2 = G0.b.PRIV;
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.PREVIEW));
        f02.a(G0.a((G0.b)b2, (G0.a)G0.a.VGA));
        b2 = G0.b.YUV;
        G0.a a2 = G0.a.MAXIMUM;
        f02.a(G0.a((G0.b)b2, (G0.a)a2));
        f02.a(G0.a((G0.b)G0.b.RAW, (G0.a)a2));
        return f02;
    }

    private List e(int n3) {
        ArrayList arrayList = new ArrayList();
        if (n3 == 0) {
            arrayList.add((Object)a);
            arrayList.add((Object)b);
        }
        return arrayList;
    }

    private List f(String string) {
        ArrayList arrayList = new ArrayList();
        if (string.equals((Object)"1")) {
            arrayList.add((Object)a);
        }
        return arrayList;
    }

    private static boolean g() {
        String string = Build.DEVICE;
        boolean bl = "heroqltevzw".equalsIgnoreCase(string) || "heroqltetmo".equalsIgnoreCase(string);
        return bl;
    }

    static boolean h() {
        boolean bl = p.g() || p.i() || p.j();
        return bl;
    }

    private static boolean i() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String string = Build.MODEL.toUpperCase(Locale.US);
        return d.contains((Object)string);
    }

    private static boolean j() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String string = Build.MODEL.toUpperCase(Locale.US);
        return e.contains((Object)string);
    }

    public List d(String string, int n3) {
        if (p.g()) {
            return this.f(string);
        }
        if (p.i()) {
            return this.e(n3);
        }
        if (p.j()) {
            return Collections.singletonList((Object)c);
        }
        return Collections.emptyList();
    }
}

