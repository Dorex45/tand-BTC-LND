/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Pair
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.Set
 */
package h;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.w0;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class q
implements w0 {
    private static final Set a = new HashSet();

    static {
        q.a("sprd", "lemp");
        q.a("sprd", "DM20C");
    }

    private static void a(String string, String string2) {
        Set set = a;
        Locale locale = Locale.US;
        set.add((Object)new Pair((Object)string.toLowerCase(locale), (Object)string2.toLowerCase(locale)));
    }

    static boolean b() {
        Set set = a;
        String string = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains((Object)new Pair((Object)string.toLowerCase(locale), (Object)Build.MODEL.toLowerCase(locale)));
    }
}

