/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  B0.c
 *  B0.h
 *  B0.k
 *  B0.r
 *  F0.J
 *  java.lang.ExceptionInInitializerError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  w0.a
 */
package B0;

import B0.c;
import B0.h;
import B0.k;
import B0.r;
import F0.J;
import java.security.GeneralSecurityException;
import w0.a;

public abstract class o {
    public static final String a;
    public static final J b;
    public static final J c;
    public static final J d;

    static {
        J j2;
        a = new k().d();
        b = j2 = J.V();
        c = j2;
        d = j2;
        try {
            o.a();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new ExceptionInInitializerError((Throwable)generalSecurityException);
        }
    }

    public static void a() {
        o.b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p((boolean)true);
        if (w0.a.a()) {
            return;
        }
        B0.c.o((boolean)true);
    }
}

