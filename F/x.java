/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$PackageInfoFlags
 *  java.lang.Object
 *  java.lang.String
 */
package F;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public abstract class x {
    public static /* bridge */ /* synthetic */ PackageInfo a(PackageManager packageManager, String string, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(string, packageInfoFlags);
    }
}

