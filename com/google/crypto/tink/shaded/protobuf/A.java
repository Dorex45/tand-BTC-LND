/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.IOException;

public abstract class a
implements O {
    protected int memoizedHashCode = 0;

    private String i(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(string);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    @Override
    public byte[] a() {
        try {
            byte[] byArray = new byte[this.c()];
            k k2 = k.U(byArray);
            this.b(k2);
            k2.c();
            return byArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.i("byte array"), (Throwable)iOException);
        }
    }

    @Override
    public h f() {
        try {
            Object object = h.u(this.c());
            this.b(((h.h)object).b());
            object = ((h.h)object).a();
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.i("ByteString"), (Throwable)iOException);
        }
    }

    abstract int g(e0 var1);

    j0 j() {
        return new j0(this);
    }

    public static abstract class a
    implements O.a {
        protected static j0 g(O o2) {
            return new j0(o2);
        }
    }
}

