/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 *  kotlin.jvm.internal.i
 */
package F1;

import P1.b;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

final class g
implements b {
    private final BufferedReader a;

    public g(BufferedReader bufferedReader) {
        i.e((Object)bufferedReader, (String)"reader");
        this.a = bufferedReader;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(this){
            private String d;
            private boolean e;
            final g f;
            {
                this.f = g2;
            }

            public String b() {
                if (this.hasNext()) {
                    String string = this.d;
                    this.d = null;
                    i.b((Object)string);
                    return string;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                String string = this.d;
                boolean bl = true;
                if (string == null && !this.e) {
                    this.d = string = this.f.a.readLine();
                    if (string == null) {
                        this.e = true;
                    }
                }
                if (this.d == null) {
                    bl = false;
                }
                return bl;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

