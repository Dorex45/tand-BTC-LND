/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.util.Locale
 *  java.util.regex.Pattern
 */
package G0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

public abstract class r {
    private static final Pattern a = Pattern.compile((String)String.format((String)"^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", (Object[])new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), (int)2);
    private static final Pattern b = Pattern.compile((String)String.format((String)"^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", (Object[])new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), (int)2);

    public static void a(int n2) {
        if (n2 != 16 && n2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format((String)"invalid key size %d; only 128-bit and 256-bit AES keys are supported", (Object[])new Object[]{n2 * 8}));
        }
    }

    public static String b(String string, String string2) {
        if (string2.toLowerCase(Locale.US).startsWith(string)) {
            return string2.substring(string.length());
        }
        throw new IllegalArgumentException(String.format((String)"key URI must start with %s", (Object[])new Object[]{string}));
    }

    public static void c(int n2, int n3) {
        if (n2 >= 0 && n2 <= n3) {
            return;
        }
        throw new GeneralSecurityException(String.format((String)"key has version %d; only keys with version in range [0..%d] are supported", (Object[])new Object[]{n2, n3}));
    }
}

