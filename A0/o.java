/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.security.GeneralSecurityException
 */
package A0;

import A0.q;
import A0.t;
import F0.I;
import F0.y;
import H0.a;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;

public final class o
implements q {
    private final String a;
    private final a b;
    private final h c;
    private final y.c d;
    private final I e;
    private final Integer f;

    private o(String string, h h2, y.c c2, I i2, Integer n2) {
        this.a = string;
        this.b = t.e(string);
        this.c = h2;
        this.d = c2;
        this.e = i2;
        this.f = n2;
    }

    public static o b(String string, h h2, y.c c2, I i2, Integer n2) {
        block7: {
            block6: {
                block5: {
                    if (i2 != I.RAW) break block5;
                    if (n2 != null) {
                        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                    }
                    break block6;
                }
                if (n2 == null) break block7;
            }
            return new o(string, h2, c2, i2, n2);
        }
        throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
    }

    @Override
    public a a() {
        return this.b;
    }

    public Integer c() {
        return this.f;
    }

    public y.c d() {
        return this.d;
    }

    public I e() {
        return this.e;
    }

    public String f() {
        return this.a;
    }

    public h g() {
        return this.c;
    }
}

