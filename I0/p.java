/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package I0;

import I0.q;
import java.util.Arrays;
import java.util.List;

public class p
extends q {
    private final List d;

    public p(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString((Object[])list.toArray()));
        super(stringBuilder.toString());
        this.d = list;
    }
}

