/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Z0.a
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.Matrix
 *  android.media.Image
 *  android.media.Image$Plane
 *  android.os.Build$VERSION
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package a1;

import Y.p;
import Z0.a;
import a1.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Build;
import java.nio.ByteBuffer;

public class d {
    private static final d a = new d();

    private d() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] byArray = new byte[byteBuffer.limit()];
        byteBuffer.get(byArray);
        return ByteBuffer.wrap((byte[])byArray);
    }

    public static d d() {
        return a;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, boolean bl) {
        int n2;
        byteBuffer.rewind();
        int n3 = byteBuffer.limit();
        int n4 = n3 / 6;
        ByteBuffer byteBuffer2 = bl ? ByteBuffer.allocate((int)n3) : ByteBuffer.allocateDirect((int)n3);
        int n5 = 0;
        int n6 = 0;
        while (true) {
            n2 = n4 * 4;
            if (n6 >= n2) break;
            byteBuffer2.put(n6, byteBuffer.get(n6));
            ++n6;
        }
        for (n3 = n5; n3 < n4 + n4; ++n3) {
            byteBuffer2.put(n2 + n3, byteBuffer.get(n3 % 2 * n4 + n2 + n3 / 2));
        }
        return byteBuffer2;
    }

    public static Bitmap g(Bitmap bitmap, int n2, int n3, int n4) {
        if (n2 == 0) {
            return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n3, (int)n4);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float)n2);
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n3, (int)n4, (Matrix)matrix, (boolean)true);
    }

    private static final void h(Image.Plane plane, int n2, int n3, byte[] byArray, int n4, int n5) {
        ByteBuffer byteBuffer = plane.getBuffer();
        byteBuffer.rewind();
        int n6 = (byteBuffer.limit() + plane.getRowStride() - 1) / plane.getRowStride();
        if (n6 == 0) {
            return;
        }
        int n7 = n2 / (n3 / n6);
        n2 = 0;
        for (n3 = 0; n3 < n6; ++n3) {
            int n8 = n2;
            for (int i2 = 0; i2 < n7; ++i2) {
                byArray[n4] = byteBuffer.get(n8);
                n4 += n5;
                n8 += plane.getPixelStride();
            }
            n2 += plane.getRowStride();
        }
    }

    public Bitmap b(Image bitmap, int n2) {
        boolean bl = bitmap.getFormat() == 256;
        p.b(bl, "Only JPEG is supported now");
        bitmap = bitmap.getPlanes();
        if (bitmap != null && ((Image.Plane[])bitmap).length == 1) {
            ByteBuffer byteBuffer = bitmap[0].getBuffer();
            byteBuffer.rewind();
            int n3 = byteBuffer.remaining();
            bitmap = (Bitmap)new byte[n3];
            byteBuffer.get((byte[])bitmap);
            bitmap = BitmapFactory.decodeByteArray((byte[])bitmap, (int)0, (int)n3);
            return d.g(bitmap, n2, bitmap.getWidth(), bitmap.getHeight());
        }
        throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
    }

    public ByteBuffer c(a a2, boolean bl) {
        int n2 = a2.f();
        if (n2 != -1) {
            if (n2 != 17) {
                if (n2 != 35) {
                    if (n2 == 842094169) {
                        return d.f((ByteBuffer)p.i(a2.d()), bl);
                    }
                    throw new P0.a("Unsupported image format", 13);
                }
                return this.e((Image.Plane[])p.i(a2.i()), a2.k(), a2.g());
            }
            a2 = bl ? d.a((ByteBuffer)p.i(a2.d())) : (ByteBuffer)p.i(a2.d());
            return a2;
        }
        Object object = (Bitmap)p.i(a2.c());
        a2 = object;
        if (Build.VERSION.SDK_INT >= 26) {
            a2 = object;
            if (object.getConfig() == c.a()) {
                a2 = object.copy(Bitmap.Config.ARGB_8888, object.isMutable());
            }
        }
        int n3 = a2.getWidth();
        int n4 = a2.getHeight();
        Object object2 = n3 * n4;
        object = new int[object2];
        a2.getPixels((int[])object, 0, n3, 0, 0, n3, n4);
        n2 = (int)Math.ceil((double)((double)n4 / 2.0));
        n2 = (n2 + n2) * (int)Math.ceil((double)((double)n3 / 2.0)) + object2;
        a2 = bl ? ByteBuffer.allocate((int)n2) : ByteBuffer.allocateDirect((int)n2);
        int n5 = 0;
        int n6 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            int n7 = 0;
            while (n7 < n3) {
                Object object3 = object[n6];
                int n8 = object3 & 0xFF;
                int n9 = object3 >> 16 & 0xFF;
                int n10 = object3 >> 8 & 0xFF;
                a2.put(n5, (byte)Math.min((int)255, (int)((n9 * 66 + n10 * 129 + n8 * 25 + 128 >> 8) + 16)));
                object3 = object2;
                if (n2 % 2 == 0) {
                    object3 = object2;
                    if (n6 % 2 == 0) {
                        a2.put(object2, (byte)Math.min((int)255, (int)((n9 * 112 - n10 * 94 - n8 * 18 + 128 >> 8) + 128)));
                        object3 = object2 + 2;
                        a2.put(object2 + 1, (byte)Math.min((int)255, (int)((n9 * -38 - n10 * 74 + n8 * 112 + 128 >> 8) + 128)));
                    }
                }
                ++n6;
                ++n7;
                ++n5;
                object2 = object3;
            }
        }
        return a2;
    }

    public ByteBuffer e(Image.Plane[] planeArray, int n2, int n3) {
        int n4 = n2 * n3;
        int n5 = n4 / 4;
        byte[] byArray = new byte[n5 + n5 + n4];
        ByteBuffer byteBuffer = planeArray[1].getBuffer();
        ByteBuffer byteBuffer2 = planeArray[2].getBuffer();
        int n6 = byteBuffer2.position();
        int n7 = byteBuffer.limit();
        byteBuffer2.position(n6 + 1);
        byteBuffer.limit(n7 - 1);
        n5 = byteBuffer2.remaining();
        int n8 = (n4 + n4) / 4;
        n5 = n5 == n8 - 2 && byteBuffer2.compareTo(byteBuffer) == 0 ? 1 : 0;
        byteBuffer2.position(n6);
        byteBuffer.limit(n7);
        if (n5 != 0) {
            planeArray[0].getBuffer().get(byArray, 0, n4);
            byteBuffer = planeArray[1].getBuffer();
            planeArray[2].getBuffer().get(byArray, n4, 1);
            byteBuffer.get(byArray, n4 + 1, n8 - 1);
        } else {
            d.h(planeArray[0], n2, n3, byArray, 0, 1);
            d.h(planeArray[1], n2, n3, byArray, n4 + 1, 2);
            d.h(planeArray[2], n2, n3, byArray, n4, 2);
        }
        return ByteBuffer.wrap((byte[])byArray);
    }
}

