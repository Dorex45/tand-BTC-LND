/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e1;

public final class b
extends Enum {
    private static final b[] $VALUES;
    public static final /* enum */ b NORMAL;
    public static final /* enum */ b NO_DUPLICATES;
    public static final /* enum */ b UNRESTRICTED;
    private final int intValue;

    static {
        NO_DUPLICATES = new b("NO_DUPLICATES", 0, 0);
        NORMAL = new b("NORMAL", 1, 1);
        UNRESTRICTED = new b("UNRESTRICTED", 2, 2);
        $VALUES = b.a();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.intValue = var3_1;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{NO_DUPLICATES, NORMAL, UNRESTRICTED};
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

