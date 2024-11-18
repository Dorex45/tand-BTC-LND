/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.InstallSourceInfo
 *  android.content.pm.PackageManager
 *  java.lang.Object
 *  java.lang.String
 */
package c1;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;

public abstract class f {
    public static /* bridge */ /* synthetic */ InstallSourceInfo a(PackageManager packageManager, String string) {
        return packageManager.getInstallSourceInfo(string);
    }
}

