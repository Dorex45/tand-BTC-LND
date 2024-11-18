/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PowerManager
 *  java.lang.Object
 *  java.lang.String
 */
package F;

import android.os.PowerManager;

public abstract class n {
    public static /* bridge */ /* synthetic */ boolean a(PowerManager powerManager, String string) {
        return powerManager.isIgnoringBatteryOptimizations(string);
    }
}

