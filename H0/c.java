/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.ThreadGroup
 *  java.lang.Throwable
 */
package h0;

import android.os.Process;

final class c
extends Thread {
    c(ThreadGroup threadGroup, String string) {
        super(threadGroup, "GmsDynamite");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Process.setThreadPriority((int)19);
        c c2 = this;
        synchronized (c2) {
            try {
                try {
                    while (true) {
                        this.wait();
                    }
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

