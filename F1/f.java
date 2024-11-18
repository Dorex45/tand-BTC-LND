/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Q1.k
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.i
 */
package F1;

import F1.e;
import Q1.k;
import java.io.File;
import kotlin.jvm.internal.i;

abstract class f
extends e {
    public static String d(File object) {
        i.e((Object)object, (String)"<this>");
        object = object.getName();
        i.d((Object)object, (String)"name");
        return k.c0((String)object, (String)".", null, (int)2, null);
    }
}

