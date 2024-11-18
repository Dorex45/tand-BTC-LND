/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F0.z
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.List
 *  s0.k
 *  s0.v
 *  s0.v$c
 */
package A0;

import D0.b;
import D0.c;
import F0.z;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import s0.k;
import s0.v;

public abstract class f {
    public static final b.a a = new /* Unavailable Anonymous Inner Class!! */;

    public static c a(v object) {
        c.b b2 = c.a();
        b2.d(object.d());
        Iterator iterator = object.c().iterator();
        while (iterator.hasNext()) {
            for (v.c c2 : (List)iterator.next()) {
                b2.a(f.c(c2.h()), c2.d(), f.b(c2.e()), c2.f().name());
            }
        }
        if (object.e() != null) {
            b2.e(object.e().d());
        }
        try {
            object = b2.b();
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new IllegalStateException((Throwable)generalSecurityException);
        }
    }

    private static String b(String string) {
        if (!string.startsWith("type.googleapis.com/google.crypto.")) {
            return string;
        }
        return string.substring(34);
    }

    private static k c(z z2) {
        int n2 = A0.f$a.a[z2.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return k.d;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return k.c;
        }
        return k.b;
    }
}

