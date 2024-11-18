/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.provider.Settings
 *  java.lang.Object
 */
package F;

import android.content.Context;
import android.provider.Settings;

public abstract class p {
    public static /* bridge */ /* synthetic */ boolean a(Context context) {
        return Settings.canDrawOverlays((Context)context);
    }
}

