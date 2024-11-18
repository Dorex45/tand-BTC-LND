/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.camera.camera2.internal.E0
 *  androidx.camera.core.impl.x0
 *  h.g
 *  java.lang.Object
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Set
 */
package i;

import androidx.camera.camera2.internal.E0;
import androidx.camera.core.impl.x0;
import h.g;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class h {
    private final g a;

    public h(x0 x02) {
        this.a = (g)x02.b(g.class);
    }

    private void a(Set set) {
        for (E0 e02 : set) {
            e02.d().q(e02);
        }
    }

    private void b(Set set) {
        for (E0 e02 : set) {
            e02.d().r(e02);
        }
    }

    public void c(E0 e02, List list, List list2, a a2) {
        if (this.d()) {
            E0 e03;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            list = list.iterator();
            while (list.hasNext() && (e03 = (E0)list.next()) != e02) {
                linkedHashSet.add((Object)e03);
            }
            this.b((Set)linkedHashSet);
        }
        a2.a(e02);
        if (this.d()) {
            list = new LinkedHashSet();
            a2 = list2.iterator();
            while (a2.hasNext() && (list2 = (E0)a2.next()) != e02) {
                list.add((Object)list2);
            }
            this.a((Set)list);
        }
    }

    public boolean d() {
        boolean bl = this.a != null;
        return bl;
    }

    public static interface a {
        public void a(E0 var1);
    }
}

