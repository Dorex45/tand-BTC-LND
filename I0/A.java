/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Set
 */
package I0;

import I0.d;
import java.util.Set;

abstract class a
implements d {
    a() {
    }

    @Override
    public Object a(Class object) {
        if ((object = this.b((Class)object)) == null) {
            return null;
        }
        return object.get();
    }

    @Override
    public Set c(Class clazz) {
        return (Set)this.d(clazz).get();
    }
}

