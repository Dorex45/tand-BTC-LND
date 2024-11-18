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

public final class l
extends q {
    private final int a;
    private final int b;
    private final d c;
    private final c d;

    private l(int n2, int n3, d d2, c c2) {
        this.a = n2;
        this.b = n3;
        this.c = d2;
        this.d = c2;
    }

    public static b a() {
        return new Object(){
            private Integer a = null;
            private Integer b = null;
            private c c = null;
            private d d = B0.l$d.e;

            private static void f(int n2, c c2) {
                if (n2 >= 10) {
                    if (c2 == B0.l$c.b) {
                        if (n2 <= 20) {
                            return;
                        }
                        throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", (Object[])new Object[]{n2}));
                    }
                    if (c2 == B0.l$c.c) {
                        if (n2 <= 28) {
                            return;
                        }
                        throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", (Object[])new Object[]{n2}));
                    }
                    if (c2 == B0.l$c.d) {
                        if (n2 <= 32) {
                            return;
                        }
                        throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", (Object[])new Object[]{n2}));
                    }
                    if (c2 == B0.l$c.e) {
                        if (n2 <= 48) {
                            return;
                        }
                        throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", (Object[])new Object[]{n2}));
                    }
                    if (c2 == B0.l$c.f) {
                        if (n2 <= 64) {
                            return;
                        }
                        throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", (Object[])new Object[]{n2}));
                    }
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; must be at least 10 bytes", (Object[])new Object[]{n2}));
            }

            public l a() {
                Integer n2 = this.a;
                if (n2 != null) {
                    if (this.b != null) {
                        if (this.c != null) {
                            if (this.d != null) {
                                if (n2 >= 16) {
                                    B0.l$b.f(this.b, this.c);
                                    return new l(this.a, this.b, this.d, this.c);
                                }
                                throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size in bytes %d; must be at least 16 bytes", (Object[])new Object[]{this.a}));
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("key size is not set");
            }

            public b b(c c2) {
                this.c = c2;
                return this;
            }

            public b c(int n2) {
                this.a = n2;
                return this;
            }

            public b d(int n2) {
                this.b = n2;
                return this;
            }

            public b e(d d2) {
                this.d = d2;
                return this;
            }
        };
    }

    public int b() {
        return this.b;
    }

    public c c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int e() {
        int n2;
        d d2 = this.c;
        if (d2 == B0.l$d.e) {
            return this.b();
        }
        if (d2 == B0.l$d.b) {
            n2 = this.b();
            return n2 + 5;
        }
        if (d2 == B0.l$d.c) {
            n2 = this.b();
            return n2 + 5;
        }
        if (d2 != B0.l$d.d) throw new IllegalStateException("Unknown variant");
        n2 = this.b();
        return n2 + 5;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof l;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (l)object;
        bl = bl2;
        if (((l)object).d() == this.d()) {
            bl = bl2;
            if (((l)object).e() == this.e()) {
                bl = bl2;
                if (((l)object).f() == this.f()) {
                    bl = bl2;
                    if (((l)object).c() == this.c()) {
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    public d f() {
        return this.c;
    }

    public boolean g() {
        boolean bl = this.c != B0.l$d.e;
        return bl;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HMAC Parameters (variant: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", hashType: ");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("-byte tags, and ");
        stringBuilder.append(this.a);
        stringBuilder.append("-byte key)");
        return stringBuilder.toString();
    }
}

