/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Size
 *  androidx.camera.core.impl.G0$b
 *  h.n
 *  java.lang.Object
 */
package i;

import android.util.Size;
import androidx.camera.core.impl.G0;
import h.k;
import h.n;

public class l {
    private final n a;

    public l() {
        this((n)k.a(n.class));
    }

    l(n n2) {
        this.a = n2;
    }

    public Size a(Size size) {
        n n2 = this.a;
        if (n2 == null) {
            return size;
        }
        Size size2 = n2.a(G0.b.PRIV);
        if (size2 == null) {
            return size;
        }
        n2 = size;
        if (size2.getWidth() * size2.getHeight() > size.getWidth() * size.getHeight()) {
            n2 = size2;
        }
        return n2;
    }
}

