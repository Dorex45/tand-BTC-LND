/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.RandomAccess
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.c;
import java.util.Arrays;
import java.util.RandomAccess;

final class b0
extends c
implements RandomAccess {
    private static final b0 g;
    private Object[] e;
    private int f;

    static {
        b0 b02;
        g = b02 = new b0(new Object[0], 0);
        b02.d();
    }

    private b0(Object[] objectArray, int n2) {
        this.e = objectArray;
        this.f = n2;
    }

    private static Object[] k(int n2) {
        return new Object[n2];
    }

    public static b0 l() {
        return g;
    }

    private void m(int n2) {
        if (n2 >= 0 && n2 < this.f) {
            return;
        }
        throw new IndexOutOfBoundsException(this.n(n2));
    }

    private String n(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public void add(int n2, Object object) {
        int n3;
        this.h();
        if (n2 >= 0 && n2 <= (n3 = this.f)) {
            Object[] objectArray = this.e;
            if (n3 < objectArray.length) {
                System.arraycopy((Object)objectArray, (int)n2, (Object)objectArray, (int)(n2 + 1), (int)(n3 - n2));
            } else {
                objectArray = b0.k(n3 * 3 / 2 + 1);
                System.arraycopy((Object)this.e, (int)0, (Object)objectArray, (int)0, (int)n2);
                System.arraycopy((Object)this.e, (int)n2, (Object)objectArray, (int)(n2 + 1), (int)(this.f - n2));
                this.e = objectArray;
            }
            this.e[n2] = object;
            ++this.f;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.n(n2));
    }

    @Override
    public boolean add(Object object) {
        this.h();
        int n2 = this.f;
        Object[] objectArray = this.e;
        if (n2 == objectArray.length) {
            this.e = Arrays.copyOf((Object[])objectArray, (int)(n2 * 3 / 2 + 1));
        }
        objectArray = this.e;
        n2 = this.f;
        this.f = n2 + 1;
        objectArray[n2] = object;
        ++this.modCount;
        return true;
    }

    public Object get(int n2) {
        this.m(n2);
        return this.e[n2];
    }

    public b0 o(int n2) {
        if (n2 >= this.f) {
            return new b0(Arrays.copyOf((Object[])this.e, (int)n2), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Object remove(int n2) {
        this.h();
        this.m(n2);
        Object[] objectArray = this.e;
        Object object = objectArray[n2];
        int n3 = this.f;
        if (n2 < n3 - 1) {
            System.arraycopy((Object)objectArray, (int)(n2 + 1), (Object)objectArray, (int)n2, (int)(n3 - n2 - 1));
        }
        --this.f;
        ++this.modCount;
        return object;
    }

    public Object set(int n2, Object object) {
        this.h();
        this.m(n2);
        Object[] objectArray = this.e;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        ++this.modCount;
        return object2;
    }

    public int size() {
        return this.f;
    }
}

