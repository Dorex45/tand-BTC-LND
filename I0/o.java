/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package I0;

import I0.A;

public final class o {
    private final Class a;
    private final int b;
    private final int c;

    private o(Class clazz, int n2, int n3) {
        this.a = (Class)A.c(clazz, "Null dependency anInterface.");
        this.b = n2;
        this.c = n3;
    }

    private static String a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return "deferred";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported injection: ");
                stringBuilder.append(n2);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            return "provider";
        }
        return "direct";
    }

    public static o g(Class clazz) {
        return new o(clazz, 1, 0);
    }

    public static o h(Class clazz) {
        return new o(clazz, 1, 1);
    }

    public static o i(Class clazz) {
        return new o(clazz, 2, 0);
    }

    public Class b() {
        return this.a;
    }

    public boolean c() {
        boolean bl = this.c == 2;
        return bl;
    }

    public boolean d() {
        boolean bl = this.c == 0;
        return bl;
    }

    public boolean e() {
        int n2 = this.b;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof o;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (o)object;
            bl3 = bl;
            if (this.a == ((o)object).a) {
                bl3 = bl;
                if (this.b == ((o)object).b) {
                    bl3 = bl;
                    if (this.c == ((o)object).c) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public boolean f() {
        boolean bl = this.b == 2;
        return bl;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", type=");
        int n2 = this.b;
        String string = n2 == 1 ? "required" : (n2 == 0 ? "optional" : "set");
        stringBuilder.append(string);
        stringBuilder.append(", injection=");
        stringBuilder.append(o.a(this.c));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

