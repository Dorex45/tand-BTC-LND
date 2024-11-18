/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Image
 *  android.media.ImageWriter
 *  android.view.Surface
 *  java.lang.Object
 */
package r;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

abstract class b {
    static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static ImageWriter c(Surface surface, int n2) {
        return ImageWriter.newInstance((Surface)surface, (int)n2);
    }

    static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}

