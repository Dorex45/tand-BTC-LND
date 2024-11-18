/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 */
package B0;

import B0.l;
import B0.p;
import H0.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class i
extends p {
    private final l a;
    private final H0.b b;
    private final a c;
    private final Integer d;

    private i(l l2, H0.b b2, a a2, Integer n2) {
        this.a = l2;
        this.b = b2;
        this.c = a2;
        this.d = n2;
    }

    public static b c() {
        return new Object(){
            private l a = null;
            private H0.b b = null;
            private Integer c = null;

            private a b() {
                if (this.a.f() == l.d.e) {
                    return H0.a.a(new byte[0]);
                }
                if (this.a.f() != l.d.d && this.a.f() != l.d.c) {
                    if (this.a.f() == l.d.b) {
                        return H0.a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown HmacParameters.Variant: ");
                    stringBuilder.append((Object)this.a.f());
                    throw new IllegalStateException(stringBuilder.toString());
                }
                return H0.a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
            }

            public i a() {
                Object object = this.a;
                if (object != null && this.b != null) {
                    if (((l)object).d() == this.b.b()) {
                        if (this.a.g() && this.c == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.a.g() && this.c != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        object = this.b();
                        return new i(this.a, this.b, (a)object, this.c);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }

            public b c(Integer n2) {
                this.c = n2;
                return this;
            }

            public b d(H0.b b2) {
                this.b = b2;
                return this;
            }

            public b e(l l2) {
                this.a = l2;
                return this;
            }
        };
    }

    @Override
    public a a() {
        return this.c;
    }

    public l d() {
        return this.a;
    }
}

