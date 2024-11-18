/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  G0.j$a
 *  G0.j$b
 *  G0.j$c
 *  G0.j$d
 *  G0.j$e
 *  G0.j$f
 *  G0.j$g
 *  java.lang.Object
 *  java.lang.String
 *  java.security.Provider
 *  java.security.Security
 *  java.util.ArrayList
 *  java.util.List
 *  x0.b
 */
package G0;

import G0.j;
import G0.q;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import x0.b;

public final class i {
    public static final i b = new i((j)new j.a());
    public static final i c = new i((j)new j.e());
    public static final i d = new i((j)new j.g());
    public static final i e = new i((j)new j.f());
    public static final i f = new i((j)new j.b());
    public static final i g = new i((j)new j.d());
    public static final i h = new i((j)new j.c());
    private final e a;

    public i(j j2) {
        this.a = x0.b.c() ? new /* Unavailable Anonymous Inner Class!! */ : (q.b() ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */);
    }

    public static List b(String ... stringArray) {
        ArrayList arrayList = new ArrayList();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Provider provider = Security.getProvider((String)stringArray[i2]);
            if (provider == null) continue;
            arrayList.add((Object)provider);
        }
        return arrayList;
    }

    public Object a(String string) {
        return this.a.a(string);
    }

    private static interface e {
        public Object a(String var1);
    }
}

