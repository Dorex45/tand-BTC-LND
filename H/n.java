/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Range
 *  android.util.Size
 *  androidx.camera.core.impl.G0$b
 *  androidx.camera.core.impl.w0
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 */
package h;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.w0;
import h.n;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class n
implements w0 {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put((Object)"SM-T580", null);
        Integer n3 = 21;
        Integer n4 = 26;
        hashMap.put((Object)"SM-J710MN", (Object)new Range((Comparable)n3, (Comparable)n4));
        hashMap.put((Object)"SM-A320FL", null);
        hashMap.put((Object)"SM-G570M", null);
        hashMap.put((Object)"SM-G610F", null);
        hashMap.put((Object)"SM-G610M", (Object)new Range((Comparable)n3, (Comparable)n4));
    }

    private static boolean b() {
        Locale locale;
        String string;
        Map map;
        if ("samsung".equalsIgnoreCase(Build.BRAND) && (map = a).containsKey((Object)(string = Build.MODEL).toUpperCase(locale = Locale.US))) {
            boolean bl = (string = (Range)map.get((Object)string.toUpperCase(locale))) == null ? true : string.contains((Comparable)Integer.valueOf((int)Build.VERSION.SDK_INT));
            return bl;
        }
        return false;
    }

    static boolean c() {
        return n.b();
    }

    public Size a(G0.b b2) {
        if (n.b()) {
            int n3 = h.n$a.a[b2.ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return null;
                    }
                    return new Size(3264, 1836);
                }
                return new Size(1280, 720);
            }
            return new Size(1920, 1080);
        }
        return null;
    }
}

