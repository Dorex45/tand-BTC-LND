/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.x
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.x;

class w
implements N {
    private static final w a = new w();

    private w() {
    }

    public static w c() {
        return a;
    }

    @Override
    public boolean a(Class clazz) {
        return x.class.isAssignableFrom(clazz);
    }

    @Override
    public M b(Class clazz) {
        if (x.class.isAssignableFrom(clazz)) {
            try {
                M m2 = (M)x.v((Class)clazz.asSubclass(x.class)).k();
                return m2;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to get message info for ");
                stringBuilder.append(clazz.getName());
                throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported message type: ");
        stringBuilder.append(clazz.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

