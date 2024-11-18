/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.h;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class n0
extends AbstractList
implements D,
RandomAccess {
    private final D d;

    public n0(D d2) {
        this.d = d2;
    }

    static /* synthetic */ D h(n0 n02) {
        return n02.d;
    }

    @Override
    public D a() {
        return this;
    }

    @Override
    public Object e(int n3) {
        return this.d.e(n3);
    }

    @Override
    public List g() {
        return this.d.g();
    }

    public Iterator iterator() {
        return new Iterator(this){
            Iterator d;
            final n0 e;
            {
                this.e = n02;
                this.d = n0.h(n02).iterator();
            }

            public String b() {
                return (String)this.d.next();
            }

            public boolean hasNext() {
                return this.d.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public void j(h h2) {
        throw new UnsupportedOperationException();
    }

    public String k(int n3) {
        return (String)this.d.get(n3);
    }

    public ListIterator listIterator(int n3) {
        return new ListIterator(this, n3){
            ListIterator d;
            final int e;
            final n0 f;
            {
                this.f = n02;
                this.e = n3;
                this.d = n0.h(n02).listIterator(n3);
            }

            public void b(String string) {
                throw new UnsupportedOperationException();
            }

            public String c() {
                return (String)this.d.next();
            }

            public String d() {
                return (String)this.d.previous();
            }

            public void e(String string) {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                return this.d.hasNext();
            }

            public boolean hasPrevious() {
                return this.d.hasPrevious();
            }

            public int nextIndex() {
                return this.d.nextIndex();
            }

            public int previousIndex() {
                return this.d.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return this.d.size();
    }
}

