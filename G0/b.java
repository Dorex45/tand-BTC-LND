/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package g0;

import Y.p;
import android.os.IBinder;
import g0.a;
import java.lang.reflect.Field;

public final class b
extends a.a {
    private final Object a;

    private b(Object object) {
        this.a = object;
    }

    public static Object e(a object) {
        int n2;
        if (object instanceof b) {
            return ((b)object).a;
        }
        IBinder iBinder = object.asBinder();
        Field[] fieldArray = iBinder.getClass().getDeclaredFields();
        int n3 = fieldArray.length;
        object = null;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            Field field = fieldArray[i2];
            n2 = n4;
            if (!field.isSynthetic()) {
                n2 = n4 + 1;
                object = field;
            }
            n4 = n2;
        }
        if (n4 == 1) {
            p.i(object);
            if (!object.isAccessible()) {
                object.setAccessible(true);
                try {
                    object = object.get((Object)iBinder);
                    return object;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", (Throwable)illegalAccessException);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", (Throwable)nullPointerException);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        n2 = fieldArray.length;
        object = new StringBuilder();
        object.append("Unexpected number of IObjectWrapper declared fields: ");
        object.append(n2);
        throw new IllegalArgumentException(object.toString());
    }

    public static a q(Object object) {
        return new b(object);
    }
}

