/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.util.Objects
 */
package B0;

import B0.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class d
extends q {
    private final int a;
    private final int b;
    private final c c;

    private d(int n2, int n3, c c2) {
        this.a = n2;
        this.b = n3;
        this.c = c2;
    }

    public static b a() {
        return new Object(){
            private Integer a = null;
            private Integer b = null;
            private c c = B0.d$c.e;

            public d a() {
                Integer n2 = this.a;
                if (n2 != null) {
                    if (this.b != null) {
                        if (this.c != null) {
                            return new d(n2, this.b, this.c);
                        }
                        throw new GeneralSecurityException("variant not set");
                    }
                    throw new GeneralSecurityException("tag size not set");
                }
                throw new GeneralSecurityException("key size not set");
            }

            public b b(int n2) {
                if (n2 != 16 && n2 != 32) {
                    throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size %d; only 128-bit and 256-bit AES keys are supported", (Object[])new Object[]{n2 * 8}));
                }
                this.a = n2;
                return this;
            }

            public b c(int n2) {
                if (n2 >= 10 && 16 >= n2) {
                    this.b = n2;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid tag size for AesCmacParameters: ");
                stringBuilder.append(n2);
                throw new GeneralSecurityException(stringBuilder.toString());
            }

            public b d(c c2) {
                this.c = c2;
                return this;
            }
        };
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d() {
        int n2;
        c c2 = this.c;
        if (c2 == B0.d$c.e) {
            return this.b();
        }
        if (c2 == B0.d$c.b) {
            n2 = this.b();
            return n2 + 5;
        }
        if (c2 == B0.d$c.c) {
            n2 = this.b();
            return n2 + 5;
        }
        if (c2 != B0.d$c.d) throw new IllegalStateException("Unknown variant");
        n2 = this.b();
        return n2 + 5;
    }

    public c e() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof d;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (d)object;
        bl = bl2;
        if (((d)object).c() == this.c()) {
            bl = bl2;
            if (((d)object).d() == this.d()) {
                bl = bl2;
                if (((d)object).e() == this.e()) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public boolean f() {
        boolean bl = this.c != B0.d$c.e;
        return bl;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AES-CMAC Parameters (variant: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("-byte tags, and ");
        stringBuilder.append(this.a);
        stringBuilder.append("-byte key)");
        return stringBuilder.toString();
    }
}

