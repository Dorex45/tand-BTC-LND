/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Image
 *  android.media.ImageWriter
 *  android.os.Build$VERSION
 *  android.view.Surface
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.StringBuilder
 */
package r;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import r.b;

public abstract class a {
    public static void a(ImageWriter imageWriter) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 23) {
            b.a(imageWriter);
            return;
        }
        imageWriter = new StringBuilder();
        imageWriter.append("Unable to call close() on API ");
        imageWriter.append(n2);
        imageWriter.append(". Version 23 or higher required.");
        throw new RuntimeException(imageWriter.toString());
    }

    public static Image b(ImageWriter imageWriter) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 23) {
            return b.b(imageWriter);
        }
        imageWriter = new StringBuilder();
        imageWriter.append("Unable to call dequeueInputImage() on API ");
        imageWriter.append(n2);
        imageWriter.append(". Version 23 or higher required.");
        throw new RuntimeException(imageWriter.toString());
    }

    public static ImageWriter c(Surface surface, int n2) {
        int n6 = Build.VERSION.SDK_INT;
        if (n6 >= 23) {
            return b.c(surface, n2);
        }
        surface = new StringBuilder();
        surface.append("Unable to call newInstance(Surface, int) on API ");
        surface.append(n6);
        surface.append(". Version 23 or higher required.");
        throw new RuntimeException(surface.toString());
    }

    public static void d(ImageWriter imageWriter, Image image) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 23) {
            b.d(imageWriter, image);
            return;
        }
        imageWriter = new StringBuilder();
        imageWriter.append("Unable to call queueInputImage() on API ");
        imageWriter.append(n2);
        imageWriter.append(". Version 23 or higher required.");
        throw new RuntimeException(imageWriter.toString());
    }
}

