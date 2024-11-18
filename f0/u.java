/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package F0;

import com.google.crypto.tink.shaded.protobuf.z;

public final class u
extends Enum
implements z.a {
    private static final u[] $VALUES;
    public static final /* enum */ u SHA1;
    public static final int SHA1_VALUE = 1;
    public static final /* enum */ u SHA224;
    public static final int SHA224_VALUE = 5;
    public static final /* enum */ u SHA256;
    public static final int SHA256_VALUE = 3;
    public static final /* enum */ u SHA384;
    public static final int SHA384_VALUE = 2;
    public static final /* enum */ u SHA512;
    public static final int SHA512_VALUE = 4;
    public static final /* enum */ u UNKNOWN_HASH;
    public static final int UNKNOWN_HASH_VALUE = 0;
    public static final /* enum */ u UNRECOGNIZED;
    private static final z.b internalValueMap;
    private final int value;

    static {
        u u2;
        u u3;
        u u4;
        u u5;
        u u6;
        u u7;
        u u8;
        UNKNOWN_HASH = u8 = new u("UNKNOWN_HASH", 0, 0);
        SHA1 = u7 = new u("SHA1", 1, 1);
        SHA384 = u6 = new u("SHA384", 2, 2);
        SHA256 = u5 = new u("SHA256", 3, 3);
        SHA512 = u4 = new u("SHA512", 4, 4);
        SHA224 = u3 = new u("SHA224", 5, 5);
        UNRECOGNIZED = u2 = new u("UNRECOGNIZED", 6, -1);
        $VALUES = new u[]{u8, u7, u6, u5, u4, u3, u2};
        internalValueMap = new z.b(){};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private u() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.value = var3_1;
    }

    public static u a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return null;
                            }
                            return SHA224;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    public static u valueOf(String string) {
        return (u)Enum.valueOf(u.class, (String)string);
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

