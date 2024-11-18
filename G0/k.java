/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package G0;

public abstract class k {
    public static byte[] a(String string) {
        if (string.length() % 2 == 0) {
            int n2 = string.length() / 2;
            byte[] byArray = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = i2 * 2;
                int n4 = Character.digit((char)string.charAt(n3), (int)16);
                n3 = Character.digit((char)string.charAt(n3 + 1), (int)16);
                if (n4 != -1 && n3 != -1) {
                    byArray[i2] = (byte)(n4 * 16 + n3);
                    continue;
                }
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            return byArray;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String b(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = byArray[i2] & 0xFF;
            stringBuilder.append("0123456789abcdef".charAt(n3 / 16));
            stringBuilder.append("0123456789abcdef".charAt(n3 % 16));
        }
        return stringBuilder.toString();
    }
}

