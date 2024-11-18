/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  B0.i
 *  java.lang.Object
 *  java.security.GeneralSecurityException
 */
package C0;

import B0.g;
import B0.i;
import java.security.GeneralSecurityException;
import x0.b;

public final class c
implements g {
    private static final b.b b = b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final i a;

    public c(i i2) {
        if (b.a()) {
            this.a = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

