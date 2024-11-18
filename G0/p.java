/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  java.security.SecureRandom
 */
package G0;

import java.security.SecureRandom;

public abstract class p {
    private static final ThreadLocal a = new ThreadLocal(){

        protected SecureRandom a() {
            return p.b();
        }
    };

    private static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int n2) {
        byte[] byArray = new byte[n2];
        ((SecureRandom)a.get()).nextBytes(byArray);
        return byArray;
    }
}

