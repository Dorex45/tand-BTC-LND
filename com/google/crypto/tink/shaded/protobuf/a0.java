/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.G
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.G;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class a0 {
    private static final a0 c = new a0();
    private final f0 a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private a0() {
        this.a = new G();
    }

    public static a0 a() {
        return c;
    }

    public e0 b(Class clazz, e0 e02) {
        z.b(clazz, "messageType");
        z.b(e02, "schema");
        return (e0)this.b.putIfAbsent((Object)clazz, (Object)e02);
    }

    public e0 c(Class object) {
        e0 e02;
        z.b(object, "messageType");
        e0 e03 = e02 = (e0)this.b.get(object);
        if (e02 == null && (object = this.b((Class)object, e03 = this.a.a((Class)object))) != null) {
            e03 = object;
        }
        return e03;
    }

    public e0 d(Object object) {
        return this.c(object.getClass());
    }
}

