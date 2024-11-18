/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package I0;

import I0.a;
import I0.c;
import I0.d;
import I0.o;
import I0.q;
import O0.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class B
extends a {
    private final Set a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final d g;

    B(c c2, d d2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (o o2 : c2.c()) {
            if (o2.d()) {
                if (o2.f()) {
                    hashSet4.add((Object)o2.b());
                    continue;
                }
                hashSet.add((Object)o2.b());
                continue;
            }
            if (o2.c()) {
                hashSet3.add((Object)o2.b());
                continue;
            }
            if (o2.f()) {
                hashSet5.add((Object)o2.b());
                continue;
            }
            hashSet2.add((Object)o2.b());
        }
        if (!c2.f().isEmpty()) {
            hashSet.add(N0.b.class);
        }
        this.a = Collections.unmodifiableSet((Set)hashSet);
        this.b = Collections.unmodifiableSet((Set)hashSet2);
        this.c = Collections.unmodifiableSet((Set)hashSet3);
        this.d = Collections.unmodifiableSet((Set)hashSet4);
        this.e = Collections.unmodifiableSet((Set)hashSet5);
        this.f = c2.f();
        this.g = d2;
    }

    @Override
    public Object a(Class clazz) {
        if (this.a.contains((Object)clazz)) {
            Object object = this.g.a(clazz);
            if (!clazz.equals(N0.b.class)) {
                return object;
            }
            return new N0.b(this.f, (N0.b)object){
                private final Set a;
                private final N0.b b;
                {
                    this.a = set;
                    this.b = b2;
                }
            };
        }
        throw new q(String.format((String)"Attempting to request an undeclared dependency %s.", (Object[])new Object[]{clazz}));
    }

    @Override
    public b b(Class clazz) {
        if (this.b.contains((Object)clazz)) {
            return this.g.b(clazz);
        }
        throw new q(String.format((String)"Attempting to request an undeclared dependency Provider<%s>.", (Object[])new Object[]{clazz}));
    }

    @Override
    public Set c(Class clazz) {
        if (this.d.contains((Object)clazz)) {
            return this.g.c(clazz);
        }
        throw new q(String.format((String)"Attempting to request an undeclared dependency Set<%s>.", (Object[])new Object[]{clazz}));
    }

    @Override
    public b d(Class clazz) {
        if (this.e.contains((Object)clazz)) {
            return this.g.d(clazz);
        }
        throw new q(String.format((String)"Attempting to request an undeclared dependency Provider<Set<%s>>.", (Object[])new Object[]{clazz}));
    }
}

