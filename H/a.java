/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.camera2.CameraCharacteristics
 *  android.util.Range
 *  androidx.camera.camera2.internal.compat.E
 *  androidx.camera.core.impl.w0
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 */
package h;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.internal.compat.E;
import androidx.camera.core.impl.w0;

public class a
implements w0 {
    private final Range a;

    public a(E e2) {
        this.a = this.d((Range[])e2.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range a(Range range) {
        int n3 = (Integer)range.getUpper();
        int n4 = (Integer)range.getLower();
        if ((Integer)range.getUpper() >= 1000) {
            n3 = (Integer)range.getUpper() / 1000;
        }
        if ((Integer)range.getLower() >= 1000) {
            n4 = (Integer)range.getLower() / 1000;
        }
        return new Range((Comparable)Integer.valueOf((int)n4), (Comparable)Integer.valueOf((int)n3));
    }

    static boolean c(E e2) {
        boolean bl = (e2 = (Integer)e2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && e2.intValue() == 2;
        return bl;
    }

    private Range d(Range[] rangeArray) {
        Range range;
        block3: {
            Range range2;
            Range range3;
            block4: {
                range3 = null;
                range2 = null;
                range = range3;
                if (rangeArray == null) break block3;
                if (rangeArray.length != 0) break block4;
                range = range3;
                break block3;
            }
            int n3 = rangeArray.length;
            int n4 = 0;
            range3 = range2;
            while (true) {
                block6: {
                    block7: {
                        block5: {
                            range = range3;
                            if (n4 >= n3) break;
                            range2 = this.a(rangeArray[n4]);
                            if ((Integer)range2.getUpper() == 30) break block5;
                            range = range3;
                            break block6;
                        }
                        if (range3 == null) break block7;
                        range = range3;
                        if ((Integer)range2.getLower() >= (Integer)range3.getLower()) break block6;
                    }
                    range = range2;
                }
                ++n4;
                range3 = range;
            }
        }
        return range;
    }

    public Range b() {
        return this.a;
    }
}

