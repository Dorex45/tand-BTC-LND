/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.Z;

final class c0
implements M {
    private final O a;
    private final String b;
    private final Object[] c;
    private final int d;

    c0(O o2, String string, Object[] objectArray) {
        this.a = o2;
        this.b = string;
        this.c = objectArray;
        int n3 = string.charAt(0);
        if (n3 < 55296) {
            this.d = n3;
        } else {
            char c2;
            int n4 = n3 & 0x1FFF;
            int n5 = 13;
            n3 = 1;
            while ((c2 = string.charAt(n3)) >= '\ud800') {
                n4 |= (c2 & 0x1FFF) << n5;
                n5 += 13;
                ++n3;
            }
            this.d = n4 | c2 << n5;
        }
    }

    @Override
    public Z a() {
        Z z2 = (this.d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
        return z2;
    }

    @Override
    public O b() {
        return this.a;
    }

    @Override
    public boolean c() {
        boolean bl = (this.d & 2) == 2;
        return bl;
    }

    Object[] d() {
        return this.c;
    }

    String e() {
        return this.b;
    }
}

