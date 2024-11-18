/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  androidx.camera.camera2.internal.compat.E
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.Set
 */
package h;

import android.os.Build;
import androidx.camera.camera2.internal.compat.E;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import s.i;

public final class y
implements i {
    private static final Set a = new HashSet((Collection)Arrays.asList((Object[])new String[]{"heroqltevzw", "heroqltetmo", "k61v1_basic_ref"}));

    static boolean a(E e2) {
        return a.contains((Object)Build.DEVICE.toLowerCase(Locale.US));
    }
}

