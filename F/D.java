/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.camera.core.impl.p0
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package f;

import androidx.camera.core.impl.p0;
import f.b;
import f.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class d
extends p0 {
    public d(b ... bArray) {
        this.a(Arrays.asList((Object[])bArray));
    }

    public static d e() {
        return new d(new b[0]);
    }

    public p0 b() {
        d d2 = d.e();
        d2.a(this.c());
        return d2;
    }

    public a d() {
        return new Object(this.c()){
            private final List a = new ArrayList();
            {
                list = list.iterator();
                while (list.hasNext()) {
                    c.a(list.next());
                    this.a.add(null);
                }
            }

            public void a() {
                Iterator iterator = this.a.iterator();
                if (!iterator.hasNext()) {
                    return;
                }
                c.a(iterator.next());
                throw null;
            }

            public List b() {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.a.iterator();
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                c.a(iterator.next());
                throw null;
            }

            public List c() {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.a.iterator();
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                c.a(iterator.next());
                throw null;
            }

            public List d() {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.a.iterator();
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                c.a(iterator.next());
                throw null;
            }

            public List e() {
                ArrayList arrayList = new ArrayList();
                Iterator iterator = this.a.iterator();
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                c.a(iterator.next());
                throw null;
            }
        };
    }
}

