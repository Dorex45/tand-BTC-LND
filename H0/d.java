/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.ThreadGroup
 *  java.lang.Throwable
 *  java.lang.Void
 */
package h0;

import android.os.Looper;
import android.util.Log;
import h0.c;

public abstract class d {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ClassLoader a() {
        Class<d> clazz = d.class;
        synchronized (d.class) {
            try {
                if (a != null) return a;
                a = d.b();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static ClassLoader b() {
        Throwable throwable22;
        block11: {
            Thread thread;
            Thread thread2;
            Thread thread3;
            block10: {
                Class<d> clazz = d.class;
                // MONITORENTER : h0.d.class
                thread3 = b;
                thread2 = null;
                if (thread3 != null || (thread3 = (b = d.c())) != null) break block10;
                return null;
            }
            Thread thread4 = thread = b;
            // MONITORENTER : thread4
            try {
                thread3 = b.getContextClassLoader();
                return thread3;
            }
            catch (Throwable throwable22) {
                break block11;
            }
            catch (SecurityException securityException) {
                String string = securityException.getMessage();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get thread context classloader ");
                stringBuilder.append(string);
                Log.w((String)"DynamiteLoaderV2CL", (String)stringBuilder.toString());
            }
            // MONITOREXIT : thread4
            // MONITOREXIT : clazz
            return thread2;
        }
        // MONITOREXIT : thread4
        throw throwable22;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Thread c() {
        var7 = d.class;
        synchronized (d.class) {
            var6_1 /* !! */  = Looper.getMainLooper().getThread().getThreadGroup();
            if (var6_1 /* !! */  == null) {
                // ** MonitorExit[var7] (shouldn't be in output)
                return null;
            }
            var8_2 = Void.class;
            synchronized (Void.class) {
                try {
                    block20: {
                        var2_3 = var6_1 /* !! */ .activeGroupCount();
                        var5_4 = new ThreadGroup[var2_3];
                        var6_1 /* !! */ .enumerate((ThreadGroup[])var5_4);
                        var1_9 = 0;
                        for (var0_10 = 0; var0_10 < var2_3; ++var0_10) {
                            var4_11 = var5_4[var0_10];
                            if (!"dynamiteLoader".equals((Object)var4_11.getName())) {
                                continue;
                            }
                            break block20;
                        }
                        var4_11 = null;
                    }
                    var5_4 = var4_11;
                    if (var4_11 == null) {
                        var5_4 = new ThreadGroup(var6_1 /* !! */ , "dynamiteLoader");
                    }
                    var2_3 = var5_4.activeCount();
                    var6_1 /* !! */  = new Thread[var2_3];
                    var5_4.enumerate((Thread[])var6_1 /* !! */ );
                    ** GOTO lbl36
                }
                catch (Throwable var4_12) {}
                {
                    block22: {
                        block21: {
                            // ** MonitorExit[var8_2] (shouldn't be in output)
                            throw var4_12;
                            catch (SecurityException var5_5) {}
                            var4_11 = null;
                            break block22;
lbl36:
                            // 2 sources

                            for (var0_10 = var1_9; var0_10 < var2_3; ++var0_10) {
                                var4_11 = var6_1 /* !! */ [var0_10];
                                var3_13 = "GmsDynamite".equals((Object)var4_11.getName());
                                if (!var3_13) {
                                    continue;
                                }
                                break block21;
                            }
                            var4_11 = null;
                        }
                        var6_1 /* !! */  = var4_11;
                        if (var4_11 != null) return var6_1 /* !! */ ;
                        try {
                            var6_1 /* !! */  = new c(var5_4, "GmsDynamite");
                        }
                        catch (SecurityException var5_7) {}
                        try {
                            var6_1 /* !! */ .setContextClassLoader(null);
                            var6_1 /* !! */ .start();
                            var4_11 = var6_1 /* !! */ ;
                            return var4_11;
                        }
                        catch (SecurityException var5_6) {
                            var4_11 = var6_1 /* !! */ ;
                        }
                    }
                    var5_8 = var5_8.getMessage();
                    var6_1 /* !! */  = new StringBuilder();
                    var6_1 /* !! */ .append("Failed to enumerate thread/threadgroup ");
                    var6_1 /* !! */ .append(var5_8);
                    Log.w((String)"DynamiteLoaderV2CL", (String)var6_1 /* !! */ .toString());
                    return var4_11;
                }
            }
        }
    }
}

