/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.camera.core.impl.U
 *  androidx.camera.core.impl.x0
 *  h.A
 *  h.F
 *  h.i
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  l.Q
 */
package i;

import androidx.camera.core.impl.U;
import androidx.camera.core.impl.x0;
import h.A;
import h.F;
import java.util.List;
import l.Q;

public class i {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public i(x0 x02, x0 x03) {
        this.a = x03.a(F.class);
        this.b = x02.a(A.class);
        this.c = x02.a(h.i.class);
    }

    public void a(List list) {
        if (this.b() && list != null) {
            list = list.iterator();
            while (list.hasNext()) {
                ((U)list.next()).d();
            }
            Q.a((String)"ForceCloseDeferrableSurface", (String)"deferrableSurface closed");
        }
    }

    public boolean b() {
        boolean bl = this.a || this.b || this.c;
        return bl;
    }
}

