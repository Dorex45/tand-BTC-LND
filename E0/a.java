/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package e0;

import Y.o;

public abstract class a {
    public static boolean a(int[] nArray, int n2) {
        if (nArray == null) {
            return false;
        }
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean b(Object[] objectArray, Object object) {
        int n2 = objectArray != null ? objectArray.length : 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!o.a(objectArray[i2], object)) continue;
            if (i2 < 0) break;
            return true;
        }
        return false;
    }
}

