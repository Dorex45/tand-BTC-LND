/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I0.p
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package I0;

import I0.o;
import I0.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

abstract class n {
    static void a(List list) {
        Set set = n.c(list);
        Set set2 = n.b(set);
        int n2 = 0;
        block0: while (!set2.isEmpty()) {
            b b2 = (b)set2.iterator().next();
            set2.remove((Object)b2);
            int n3 = n2 + 1;
            Iterator iterator = b2.d().iterator();
            while (true) {
                n2 = n3;
                if (!iterator.hasNext()) continue block0;
                b b3 = (b)iterator.next();
                b3.g(b2);
                if (!b3.f()) continue;
                set2.add((Object)b3);
            }
        }
        if (n2 == list.size()) {
            return;
        }
        list = new ArrayList();
        for (b b3 : set) {
            if (b3.f() || b3.e()) continue;
            list.add((Object)b3.c());
        }
        throw new p(list);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        for (b b2 : set) {
            if (!b2.f()) continue;
            hashSet.add((Object)b2);
        }
        return hashSet;
    }

    private static Set c(List list) {
        Iterator iterator2;
        HashMap hashMap = new HashMap(list.size());
        for (I0.c c2 : list) {
            b b2 = new b(c2);
            for (Iterator iterator2 : c2.e()) {
                Object object;
                Object object2 = new c((Class)iterator2, c2.j() ^ true);
                if (!hashMap.containsKey(object2)) {
                    hashMap.put(object2, (Object)new HashSet());
                }
                if (!(object = (Set)hashMap.get(object2)).isEmpty() && !((c)object2).b) {
                    throw new IllegalArgumentException(String.format((String)"Multiple components provide %s.", (Object[])new Object[]{iterator2}));
                }
                object.add((Object)b2);
            }
        }
        iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            for (Object object2 : (Set)iterator2.next()) {
                for (Object object : ((b)object2).c().c()) {
                    if (!((o)object).d() || (object = (Set)hashMap.get((Object)new c(((o)object).b(), ((o)object).f()))) == null) continue;
                    Iterator iterator3 = object.iterator();
                    while (iterator3.hasNext()) {
                        object = (b)iterator3.next();
                        ((b)object2).a((b)object);
                        ((b)object).b((b)object2);
                    }
                }
            }
        }
        list = new HashSet();
        hashMap = hashMap.values().iterator();
        while (hashMap.hasNext()) {
            list.addAll((Collection)((Set)hashMap.next()));
        }
        return list;
    }

    private static class b {
        private final I0.c a;
        private final Set b = new HashSet();
        private final Set c = new HashSet();

        b(I0.c c2) {
            this.a = c2;
        }

        void a(b b2) {
            this.b.add((Object)b2);
        }

        void b(b b2) {
            this.c.add((Object)b2);
        }

        I0.c c() {
            return this.a;
        }

        Set d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b b2) {
            this.c.remove((Object)b2);
        }
    }

    private static class c {
        private final Class a;
        private final boolean b;

        private c(Class clazz, boolean bl) {
            this.a = clazz;
            this.b = bl;
        }

        public boolean equals(Object object) {
            boolean bl;
            boolean bl2 = object instanceof c;
            boolean bl3 = bl = false;
            if (bl2) {
                object = (c)object;
                bl3 = bl;
                if (((c)object).a.equals((Object)this.a)) {
                    bl3 = bl;
                    if (((c)object).b == this.b) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }

        public int hashCode() {
            return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf((boolean)this.b).hashCode();
        }
    }
}

