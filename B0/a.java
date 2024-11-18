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

import B0.d;
import B0.p;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class a
extends p {
    private final d a;
    private final H0.b b;
    private final H0.a c;
    private final Integer d;

    private a(d d2, H0.b b2, H0.a a2, Integer n2) {
        this.a = d2;
        this.b = b2;
        this.c = a2;
        this.d = n2;
    }

    public static b c() {
        return new Object(){
            private d a = null;
            private H0.b b = null;
            private Integer c = null;

            private H0.a b() {
                if (this.a.e() == d.c.e) {
                    return H0.a.a(new byte[0]);
                }
                if (this.a.e() != d.c.d && this.a.e() != d.c.c) {
                    if (this.a.e() == d.c.b) {
                        return H0.a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown AesCmacParametersParameters.Variant: ");
                    stringBuilder.append((Object)this.a.e());
                    throw new IllegalStateException(stringBuilder.toString());
                }
                return H0.a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
            }

            public a a() {
                Object object = this.a;
                if (object != null && this.b != null) {
                    if (((d)object).c() == this.b.b()) {
                        if (this.a.f() && this.c == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.a.f() && this.c != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        object = this.b();
                        return new a(this.a, this.b, (H0.a)object, this.c);
                    }
                    throw new GeneralSecurityException("Key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }

            public b c(H0.b b2) {
                this.b = b2;
                return this;
            }

            public b d(Integer n2) {
                this.c = n2;
                return this;
            }

            public b e(d d2) {
                this.a = d2;
                return this;
            }
        };
    }

    @Override
    public H0.a a() {
        return this.c;
    }

    public d d() {
        return this.a;
    }
}

