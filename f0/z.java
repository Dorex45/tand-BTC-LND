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

public final class z
extends Enum
implements z.a {
    private static final z[] $VALUES;
    public static final /* enum */ z DESTROYED;
    public static final int DESTROYED_VALUE = 3;
    public static final /* enum */ z DISABLED;
    public static final int DISABLED_VALUE = 2;
    public static final /* enum */ z ENABLED;
    public static final int ENABLED_VALUE = 1;
    public static final /* enum */ z UNKNOWN_STATUS;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final /* enum */ z UNRECOGNIZED;
    private static final z.b internalValueMap;
    private final int value;

    static {
        z z2;
        z z3;
        z z4;
        z z5;
        z z6;
        UNKNOWN_STATUS = z6 = new z("UNKNOWN_STATUS", 0, 0);
        ENABLED = z5 = new z("ENABLED", 1, 1);
        DISABLED = z4 = new z("DISABLED", 2, 2);
        DESTROYED = z3 = new z("DESTROYED", 3, 3);
        UNRECOGNIZED = z2 = new z("UNRECOGNIZED", 4, -1);
        $VALUES = new z[]{z6, z5, z4, z3, z2};
        internalValueMap = new z.b(){};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private z() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.value = var3_1;
    }

    public static z a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    public static z valueOf(String string) {
        return (z)Enum.valueOf(z.class, (String)string);
    }

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

