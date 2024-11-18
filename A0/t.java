/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.security.SecureRandom
 *  java.util.Objects
 */
package A0;

import A0.a;
import A0.s;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

public abstract class t {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static Integer a() {
        if (!t.b()) {
            return null;
        }
        return A0.a.a();
    }

    public static boolean b() {
        return Objects.equals((Object)System.getProperty((String)"java.vendor"), (Object)"The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] byArray = new byte[4];
        int n2 = 0;
        while (n2 == 0) {
            secureRandom.nextBytes(byArray);
            n2 = (byArray[0] & 0x7F) << 24 | (byArray[1] & 0xFF) << 16 | (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF;
        }
        return n2;
    }

    private static final byte d(char c2) {
        if (c2 >= '!' && c2 <= '~') {
            return (byte)c2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a printable ASCII character: ");
        stringBuilder.append(c2);
        throw new s(stringBuilder.toString());
    }

    public static final H0.a e(String string) {
        byte[] byArray = new byte[string.length()];
        for (int i2 = 0; i2 < string.length(); ++i2) {
            byArray[i2] = t.d(string.charAt(i2));
        }
        return H0.a.a(byArray);
    }
}

