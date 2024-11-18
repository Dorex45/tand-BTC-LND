/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicReference
 */
package I0;

import I0.A;
import I0.B;
import I0.a;
import I0.c;
import I0.h;
import I0.i;
import I0.j;
import I0.k;
import I0.l;
import I0.n;
import I0.o;
import I0.s;
import I0.t;
import I0.u;
import I0.v;
import I0.w;
import I0.z;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class m
extends a
implements J0.a {
    private static final O0.b g = l.a();
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final List d;
    private final s e;
    private final AtomicReference f = new AtomicReference();

    private m(Executor executor, Iterable iterable, Collection collection) {
        Object object2 = new s(executor);
        this.e = object2;
        executor = new ArrayList();
        executor.add((Object)I0.c.l(object2, s.class, N0.c.class, N0.b.class));
        executor.add((Object)I0.c.l(this, J0.a.class, new Class[0]));
        for (Object object2 : collection) {
            if (object2 == null) continue;
            executor.add(object2);
        }
        this.d = m.i(iterable);
        this.f((List)executor);
    }

    public static b e(Executor executor) {
        return new Object(executor){
            private final Executor a;
            private final List b = new ArrayList();
            private final List c = new ArrayList();
            {
                this.a = executor;
            }

            public b a(c c2) {
                this.c.add((Object)c2);
                return this;
            }

            public b b(Collection collection) {
                this.b.addAll(collection);
                return this;
            }

            public m c() {
                return new m(this.a, (Iterable)this.b, (Collection)this.c);
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void f(List list) {
        ArrayList arrayList = new ArrayList();
        m m2 = this;
        // MONITORENTER : m2
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            Object object = (O0.b)iterator.next();
            try {
                if ((object = (h)object.get()) == null) continue;
                list.addAll((Collection)object.a());
                iterator.remove();
            }
            catch (t t2) {
                iterator.remove();
                Log.w((String)"ComponentDiscovery", (String)"Invalid component registrar.", (Throwable)t2);
            }
        }
        if (this.a.isEmpty()) {
            n.a(list);
        } else {
            iterator = new ArrayList((Collection)this.a.keySet());
            iterator.addAll((Collection)list);
            n.a((List)iterator);
        }
        for (Object object : list) {
            u u2 = new u(i.a(this, (c)object));
            this.a.put(object, (Object)u2);
        }
        arrayList.addAll((Collection)this.o(list));
        arrayList.addAll((Collection)this.p());
        this.n();
        // MONITOREXIT : m2
        list = arrayList.iterator();
        while (true) {
            if (!list.hasNext()) {
                this.m();
                return;
            }
            ((Runnable)list.next()).run();
        }
    }

    private void g(Map object, boolean bl) {
        for (Object object2 : object.entrySet()) {
            object = (c)object2.getKey();
            object2 = (O0.b)object2.getValue();
            if (!((c)object).h() && (!((c)object).i() || !bl)) continue;
            object2.get();
        }
        this.e.a();
    }

    private static List i(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            arrayList.add(iterable.next());
        }
        return arrayList;
    }

    static /* synthetic */ Object j(m m2, c c2) {
        return c2.d().a(new B(c2, m2));
    }

    static /* synthetic */ void k(z z2, O0.b b2) {
        z2.d(b2);
    }

    static /* synthetic */ void l(v v2, O0.b b2) {
        v2.a(b2);
    }

    private void m() {
        Boolean bl = (Boolean)this.f.get();
        if (bl != null) {
            this.g(this.a, bl);
        }
    }

    private void n() {
        for (c c2 : this.a.keySet()) {
            for (o o2 : c2.c()) {
                if (o2.f() && !this.c.containsKey((Object)o2.b())) {
                    this.c.put((Object)o2.b(), (Object)v.b((Collection)Collections.emptySet()));
                    continue;
                }
                if (this.b.containsKey((Object)o2.b())) continue;
                if (!o2.e()) {
                    if (o2.f()) continue;
                    this.b.put((Object)o2.b(), (Object)z.a());
                    continue;
                }
                throw new w(String.format((String)"Unsatisfied dependency for component %s: %s", (Object[])new Object[]{c2, o2.b()}));
            }
        }
    }

    private List o(List object) {
        ArrayList arrayList = new ArrayList();
        for (c c22 : object) {
            if (!c22.j()) continue;
            object = (O0.b)this.a.get((Object)c22);
            for (c c22 : c22.e()) {
                if (!this.b.containsKey((Object)c22)) {
                    this.b.put((Object)c22, object);
                    continue;
                }
                arrayList.add((Object)j.a((z)((O0.b)this.b.get((Object)c22)), (O0.b)object));
            }
        }
        return arrayList;
    }

    private List p() {
        ArrayList arrayList = new ArrayList();
        Object object = new HashMap();
        for (Object object2 : this.a.entrySet()) {
            c c22 = (c)object2.getKey();
            if (c22.j()) continue;
            object2 = (O0.b)object2.getValue();
            for (c c22 : c22.e()) {
                if (!object.containsKey((Object)c22)) {
                    object.put((Object)c22, (Object)new HashSet());
                }
                ((Set)object.get((Object)c22)).add(object2);
            }
        }
        for (Object object2 : object.entrySet()) {
            if (!this.c.containsKey(object2.getKey())) {
                this.c.put((Object)((Class)object2.getKey()), (Object)v.b((Collection)object2.getValue()));
                continue;
            }
            object = (v)this.c.get(object2.getKey());
            object2 = ((Set)object2.getValue()).iterator();
            while (object2.hasNext()) {
                arrayList.add((Object)k.a((v)object, (O0.b)object2.next()));
            }
        }
        return arrayList;
    }

    @Override
    public O0.b b(Class object) {
        m m2 = this;
        synchronized (m2) {
            A.c(object, "Null interface requested.");
            object = (O0.b)this.b.get(object);
            return object;
        }
    }

    @Override
    public O0.b d(Class object) {
        m m2 = this;
        synchronized (m2) {
            block4: {
                object = (v)this.c.get(object);
                if (object == null) break block4;
                return object;
            }
            object = g;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(boolean bl) {
        HashMap hashMap;
        if (!X.z.a(this.f, null, bl)) {
            return;
        }
        m m2 = this;
        synchronized (m2) {
            hashMap = new HashMap(this.a);
        }
        this.g((Map)hashMap, bl);
    }
}

