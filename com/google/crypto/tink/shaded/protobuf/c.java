/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.n0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class C
extends c
implements D,
RandomAccess {
    private static final C f;
    public static final D g;
    private final List e;

    static {
        C c2;
        f = c2 = new C();
        c2.d();
        g = c2;
    }

    public C() {
        this(10);
    }

    public C(int n2) {
        this(new ArrayList(n2));
    }

    private C(ArrayList arrayList) {
        this.e = arrayList;
    }

    private static String l(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof h) {
            return ((h)object).D();
        }
        return z.i((byte[])object);
    }

    @Override
    public D a() {
        if (this.i()) {
            return new n0(this);
        }
        return this;
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        this.h();
        Collection collection2 = collection;
        if (collection instanceof D) {
            collection2 = ((D)collection).g();
        }
        boolean bl = this.e.addAll(n2, collection2);
        ++this.modCount;
        return bl;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public void clear() {
        this.h();
        this.e.clear();
        ++this.modCount;
    }

    @Override
    public Object e(int n2) {
        return this.e.get(n2);
    }

    @Override
    public List g() {
        return Collections.unmodifiableList((List)this.e);
    }

    @Override
    public void j(h h2) {
        this.h();
        this.e.add((Object)h2);
        ++this.modCount;
    }

    public void k(int n2, String string) {
        this.h();
        this.e.add(n2, (Object)string);
        ++this.modCount;
    }

    public String m(int n2) {
        Object object = this.e.get(n2);
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof h) {
            object = (h)object;
            String string = ((h)object).D();
            if (((h)object).s()) {
                this.e.set(n2, (Object)string);
            }
            return string;
        }
        object = (byte[])object;
        String string = z.i((byte[])object);
        if (z.g((byte[])object)) {
            this.e.set(n2, (Object)string);
        }
        return string;
    }

    public C n(int n2) {
        if (n2 >= this.size()) {
            ArrayList arrayList = new ArrayList(n2);
            arrayList.addAll((Collection)this.e);
            return new C(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public String o(int n2) {
        this.h();
        Object object = this.e.remove(n2);
        ++this.modCount;
        return C.l(object);
    }

    public String p(int n2, String string) {
        this.h();
        return C.l(this.e.set(n2, (Object)string));
    }

    public int size() {
        return this.e.size();
    }
}

