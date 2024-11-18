/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Image
 *  android.media.Image$Plane
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  kotlin.jvm.internal.i
 */
package f1;

import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;

public final class a {
    private final int a;
    private final ByteBuffer b;

    public a(Image image, ByteBuffer byteBuffer) {
        a a2;
        block3: {
            int n2;
            block2: {
                i.e((Object)image, (String)"image");
                a2 = new a(image);
                n2 = a2.a().c() == 1 ? 35 : 17;
                this.a = n2;
                n2 = image.getWidth() * image.getHeight() * 3 / 2;
                if (byteBuffer == null || byteBuffer.capacity() < n2 || byteBuffer.isReadOnly()) break block2;
                image = byteBuffer;
                if (byteBuffer.isDirect()) break block3;
            }
            image = ByteBuffer.allocateDirect((int)n2);
            i.d((Object)image, (String)"{\n            ByteBuffer.allocateDirect(size) }");
        }
        this.b = image;
        image.rewind();
        this.d(a2);
    }

    private final ByteBuffer a(ByteBuffer byteBuffer, int n2, int n3) {
        byteBuffer = byteBuffer.duplicate();
        byteBuffer.position(n2);
        byteBuffer.limit(n2 + n3);
        byteBuffer = byteBuffer.slice();
        i.d((Object)byteBuffer, (String)"duplicate.slice()");
        return byteBuffer;
    }

    private final void d(a a2) {
        int n2 = a2.c().e() * a2.c().b();
        int n3 = a2.a().e() * a2.a().b();
        if (a2.c().d() > a2.c().e()) {
            this.e(a2.c(), this.b, 0);
        } else {
            this.b.position(0);
            this.b.put(a2.c().a());
        }
        if (this.a == 35) {
            if (a2.a().d() > a2.a().e()) {
                this.e(a2.a(), this.b, n2);
                this.e(a2.b(), this.b, n2 + n3);
            } else {
                this.b.position(n2);
                this.b.put(a2.a().a());
                this.b.position(n2 + n3);
                this.b.put(a2.b().a());
            }
        } else if (a2.a().d() > a2.a().e() * 2) {
            this.f(a2, this.b, n2);
        } else {
            this.b.position(n2);
            ByteBuffer byteBuffer = a2.b().a();
            n3 = a2.b().b() * a2.b().d() - 1;
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer.capacity() > n3) {
                byteBuffer2 = this.a(a2.b().a(), 0, n3);
            }
            this.b.put(byteBuffer2);
            byte by = a2.a().a().get(a2.a().a().capacity() - 1);
            a2 = this.b;
            a2.put(a2.capacity() - 1, by);
        }
        this.b.rewind();
    }

    private final void e(b b2, ByteBuffer byteBuffer, int n2) {
        if (b2.c() == 1) {
            ByteBuffer byteBuffer2 = b2.a();
            int n3 = b2.d();
            byteBuffer.position(n2);
            int n4 = b2.b();
            for (n2 = 0; n2 < n4; ++n2) {
                byteBuffer.put(this.a(byteBuffer2, n2 * n3, b2.e()));
            }
            return;
        }
        throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1".toString());
    }

    private final void f(a a2, ByteBuffer byteBuffer, int n2) {
        if (a2.a().c() == 2) {
            int n3 = a2.a().e();
            int n4 = a2.a().b();
            int n5 = a2.a().d();
            byteBuffer.position(n2);
            --n4;
            for (n2 = 0; n2 < n4; ++n2) {
                byteBuffer.put(this.a(a2.b().a(), n2 * n5, n3 * 2));
            }
            byteBuffer.put(this.a(a2.a().a(), n4 * n5 - 1, n3 * 2));
            return;
        }
        throw new IllegalArgumentException("use removePaddingNotCompact pixelStride == 2".toString());
    }

    public final ByteBuffer b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    private static final class a {
        private final int a;
        private final int b;
        private final b c;
        private final b d;
        private final b e;

        public a(Image object) {
            int n2;
            int n3;
            i.e((Object)object, (String)"image");
            this.a = n3 = object.getWidth();
            this.b = n2 = object.getHeight();
            Object object2 = object.getPlanes()[0];
            i.d((Object)object2, (String)"image.planes[0]");
            object2 = new b(n3, n2, (Image.Plane)object2);
            this.c = object2;
            int n4 = n3 / 2;
            int n5 = n2 / 2;
            Object object3 = object.getPlanes()[1];
            i.d((Object)object3, (String)"image.planes[1]");
            object3 = new b(n4, n5, (Image.Plane)object3);
            this.d = object3;
            n4 = n3 / 2;
            object = object.getPlanes()[2];
            i.d((Object)object, (String)"image.planes[2]");
            object = new b(n4, n2 /= 2, (Image.Plane)object);
            this.e = object;
            if (((b)object2).c() == 1) {
                if (((b)object3).c() == ((b)object).c() && ((b)object3).d() == ((b)object).d()) {
                    if (((b)object3).c() != 1 && ((b)object3).c() != 2) {
                        throw new IllegalArgumentException("Supported pixel strides for U and V planes are 1 and 2".toString());
                    }
                    return;
                }
                object2 = new StringBuilder();
                object2.append("U and V planes must have the same pixel and row strides but got pixel=");
                object2.append(((b)object3).c());
                object2.append(" row=");
                object2.append(((b)object3).d());
                object2.append(" for U and pixel=");
                object2.append(((b)object).c());
                object2.append(" and row=");
                object2.append(((b)object).d());
                object2.append(" for V");
                throw new IllegalArgumentException(object2.toString().toString());
            }
            object = new StringBuilder();
            object.append("Pixel stride for Y plane must be 1 but got ");
            object.append(((b)object2).c());
            object.append(" instead.");
            throw new IllegalArgumentException(object.toString().toString());
        }

        public final b a() {
            return this.d;
        }

        public final b b() {
            return this.e;
        }

        public final b c() {
            return this.c;
        }
    }

    private static final class b {
        private final int a;
        private final int b;
        private final ByteBuffer c;
        private final int d;
        private final int e;

        public b(int n2, int n3, Image.Plane plane) {
            i.e((Object)plane, (String)"plane");
            this.a = n2;
            this.b = n3;
            ByteBuffer byteBuffer = plane.getBuffer();
            i.d((Object)byteBuffer, (String)"plane.buffer");
            this.c = byteBuffer;
            this.d = plane.getRowStride();
            this.e = plane.getPixelStride();
        }

        public final ByteBuffer a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.e;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.a;
        }
    }
}

