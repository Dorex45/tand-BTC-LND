/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.camera.core.impl.w0
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 */
package h;

import android.os.Build;
import androidx.camera.core.impl.w0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class j
implements w0 {
    static final List a = Arrays.asList((Object[])new String[]{"SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X"});

    static boolean a() {
        return a.contains((Object)Build.MODEL.toUpperCase(Locale.US));
    }
}

