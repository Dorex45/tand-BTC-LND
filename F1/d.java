/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  kotlin.jvm.internal.i
 */
package F1;

import F1.a;
import F1.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.i;
import x1.t;

abstract class d
extends c {
    public static final void a(File file, byte[] object) {
        i.e((Object)file, (String)"<this>");
        i.e((Object)object, (String)"array");
        file = new FileOutputStream(file);
        try {
            file.write(object);
            object = t.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                a.a((Closeable)file, throwable);
                throw throwable2;
            }
        }
        a.a((Closeable)file, null);
    }

    public static final void b(File file, String object, Charset charset) {
        i.e((Object)file, (String)"<this>");
        i.e((Object)object, (String)"text");
        i.e((Object)charset, (String)"charset");
        object = object.getBytes(charset);
        i.d((Object)object, (String)"this as java.lang.String).getBytes(charset)");
        d.a(file, (byte[])object);
    }

    public static /* synthetic */ void c(File file, String string, Charset charset, int n2, Object object) {
        if ((n2 & 2) != 0) {
            charset = Q1.c.b;
        }
        d.b(file, string, charset);
    }
}

