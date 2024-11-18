/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.util.Arrays
 *  javax.crypto.Mac
 */
package G0;

import E0.a;
import G0.i;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import x0.b;

public final class n
implements a {
    public static final b.b e = b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final ThreadLocal a;
    private final String b;
    private final Key c;
    private final int d;

    public n(String string, Key key) {
        ThreadLocal threadLocal;
        this.a = threadLocal = new ThreadLocal(this){
            final n a;
            {
                this.a = n2;
            }

            protected Mac a() {
                try {
                    Mac mac = (Mac)i.c.a(n.b(this.a));
                    mac.init(n.c(this.a));
                    return mac;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new IllegalStateException((Throwable)generalSecurityException);
                }
            }
        };
        if (e.a()) {
            this.b = string;
            this.c = key;
            if (key.getEncoded().length >= 16) {
                string.hashCode();
                int n2 = -1;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
                    case 392317873: {
                        if (!string.equals((Object)"HMACSHA512")) break;
                        n2 = 4;
                        break;
                    }
                    case 392316170: {
                        if (!string.equals((Object)"HMACSHA384")) break;
                        n2 = 3;
                        break;
                    }
                    case 392315118: {
                        if (!string.equals((Object)"HMACSHA256")) break;
                        n2 = 2;
                        break;
                    }
                    case 392315023: {
                        if (!string.equals((Object)"HMACSHA224")) break;
                        n2 = 1;
                        break;
                    }
                    case -1823053428: {
                        if (!string.equals((Object)"HMACSHA1")) break;
                        n2 = 0;
                    }
                }
                switch (n2) {
                    default: {
                        key = new StringBuilder();
                        key.append("unknown Hmac algorithm: ");
                        key.append(string);
                        throw new NoSuchAlgorithmException(key.toString());
                    }
                    case 4: {
                        this.d = 64;
                        break;
                    }
                    case 3: {
                        this.d = 48;
                        break;
                    }
                    case 2: {
                        this.d = 32;
                        break;
                    }
                    case 1: {
                        this.d = 28;
                        break;
                    }
                    case 0: {
                        this.d = 20;
                    }
                }
                threadLocal.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    static /* synthetic */ String b(n n2) {
        return n2.b;
    }

    static /* synthetic */ Key c(n n2) {
        return n2.c;
    }

    @Override
    public byte[] a(byte[] byArray, int n2) {
        if (n2 <= this.d) {
            ((Mac)this.a.get()).update(byArray);
            return Arrays.copyOf((byte[])((Mac)this.a.get()).doFinal(), (int)n2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}

