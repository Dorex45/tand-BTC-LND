/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.SigningInfo
 *  java.lang.Object
 */
package c1;

import android.content.pm.PackageInfo;
import android.content.pm.SigningInfo;

public abstract class b {
    public static /* bridge */ /* synthetic */ SigningInfo a(PackageInfo packageInfo) {
        return packageInfo.signingInfo;
    }
}

