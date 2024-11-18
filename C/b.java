/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager$AssetInputStream
 *  android.media.MediaDataSource
 *  android.media.MediaMetadataRetriever
 *  android.os.Build$VERSION
 *  android.system.Os
 *  android.system.OsConstants
 *  android.util.Log
 *  android.util.Pair
 *  java.io.BufferedInputStream
 *  java.io.ByteArrayInputStream
 *  java.io.Closeable
 *  java.io.DataInput
 *  java.io.DataInputStream
 *  java.io.EOFException
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.charset.Charset
 *  java.text.SimpleDateFormat
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.regex.Pattern
 *  java.util.zip.CRC32
 */
package C;

import C.a;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class b {
    static final byte[] A;
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    private static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final byte[] R;
    private static final byte[] S;
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    static final String[] V;
    static final int[] W;
    static final byte[] X;
    private static final d[] Y;
    private static final d[] Z;
    private static final d[] a0;
    private static final d[] b0;
    private static final d[] c0;
    private static final d d0;
    private static final d[] e0;
    private static final d[] f0;
    private static final d[] g0;
    private static final d[] h0;
    static final d[][] i0;
    private static final d[] j0;
    private static final d k0;
    private static final d l0;
    private static final HashMap[] m0;
    private static final HashMap[] n0;
    private static final HashSet o0;
    private static final HashMap p0;
    static final Charset q0;
    static final byte[] r0;
    private static final byte[] s0;
    private static final Pattern t0;
    private static final boolean u;
    private static final Pattern u0;
    private static final List v;
    private static final Pattern v0;
    private static final List w;
    private static final Pattern w0;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private boolean e;
    private final HashMap[] f;
    private Set g;
    private ByteOrder h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;

    static {
        Integer n2 = 3;
        u = Log.isLoggable((String)"ExifInterface", (int)3);
        Integer n3 = 1;
        Integer n4 = 8;
        v = Arrays.asList((Object[])new Integer[]{n3, 6, n2, n4});
        Integer n5 = 2;
        Integer n6 = 7;
        Integer n7 = 5;
        w = Arrays.asList((Object[])new Integer[]{n5, n6, 4, n7});
        x = new int[]{8, 8, 8};
        y = new int[]{4};
        z = new int[]{8};
        A = new byte[]{-1, -40, -1};
        B = new byte[]{102, 116, 121, 112};
        C = new byte[]{109, 105, 102, 49};
        D = new byte[]{104, 101, 105, 99};
        E = new byte[]{79, 76, 89, 77, 80, 0};
        F = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        G = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        H = new byte[]{101, 88, 73, 102};
        I = new byte[]{73, 72, 68, 82};
        J = new byte[]{73, 69, 78, 68};
        K = new byte[]{82, 73, 70, 70};
        L = new byte[]{87, 69, 66, 80};
        M = new byte[]{69, 88, 73, 70};
        N = new byte[]{-99, 1, 42};
        O = "VP8X".getBytes(Charset.defaultCharset());
        P = "VP8L".getBytes(Charset.defaultCharset());
        Q = "VP8 ".getBytes(Charset.defaultCharset());
        R = "ANIM".getBytes(Charset.defaultCharset());
        S = "ANMF".getBytes(Charset.defaultCharset());
        V = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        W = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        X = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dArray = new d("NewSubfileType", 254, 4);
        d d2 = new d("SubfileType", 255, 4);
        d d3 = new d("ImageWidth", 256, 3, 4);
        d d4 = new d("ImageLength", 257, 3, 4);
        d d5 = new d("BitsPerSample", 258, 3);
        d d6 = new d("Compression", 259, 3);
        d d7 = new d("PhotometricInterpretation", 262, 3);
        d[] dArray2 = new d("ImageDescription", 270, 2);
        d d8 = new d("Make", 271, 2);
        d[] dArray3 = new d("Model", 272, 2);
        d d9 = new d("StripOffsets", 273, 3, 4);
        d[] dArray4 = new d("Orientation", 274, 3);
        d d10 = new d("SamplesPerPixel", 277, 3);
        d d11 = new d("RowsPerStrip", 278, 3, 4);
        d[] dArray5 = new d("StripByteCounts", 279, 3, 4);
        d d12 = new d("XResolution", 282, 5);
        d[] dArray6 = new d("YResolution", 283, 5);
        d d13 = new d("PlanarConfiguration", 284, 3);
        d d14 = new d("ResolutionUnit", 296, 3);
        d d15 = new d("TransferFunction", 301, 3);
        d d16 = new d("Software", 305, 2);
        d d17 = new d("DateTime", 306, 2);
        d[] dArray7 = new d("Artist", 315, 2);
        d d18 = new d("WhitePoint", 318, 5);
        d d19 = new d("PrimaryChromaticities", 319, 5);
        d d20 = new d("SubIFDPointer", 330, 4);
        d d21 = new d("JPEGInterchangeFormat", 513, 4);
        d[] dArray8 = new d("JPEGInterchangeFormatLength", 514, 4);
        d d22 = new d("YCbCrCoefficients", 529, 5);
        d d23 = new d("YCbCrSubSampling", 530, 3);
        d d24 = new d("YCbCrPositioning", 531, 3);
        d d25 = new d("ReferenceBlackWhite", 532, 5);
        d d26 = new d("Copyright", 33432, 2);
        d d27 = new d("ExifIFDPointer", 34665, 4);
        d d28 = new d("GPSInfoIFDPointer", 34853, 4);
        d d29 = new d("SensorTopBorder", 4, 4);
        d d30 = new d("SensorLeftBorder", 5, 4);
        d d31 = new d("SensorBottomBorder", 6, 4);
        d d32 = new d("SensorRightBorder", 7, 4);
        d d33 = new d("ISO", 23, 3);
        d d34 = new d("JpgFromRaw", 46, 7);
        d[][] dArrayArray = new d("Xmp", 700, 1);
        d[][] dArray9 = new d[]{dArray, d2, d3, d4, d5, d6, d7, dArray2, d8, dArray3, d9, dArray4, d10, d11, dArray5, d12, dArray6, d13, d14, d15, d16, d17, dArray7, d18, d19, d20, d21, dArray8, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, dArrayArray};
        Y = dArray9;
        d d35 = new d("ExposureTime", 33434, 5);
        d3 = new d("FNumber", 33437, 5);
        d29 = new d("ExposureProgram", 34850, 3);
        d28 = new d("SpectralSensitivity", 34852, 2);
        d27 = new d("PhotographicSensitivity", 34855, 3);
        d15 = new d("OECF", 34856, 7);
        d5 = new d("SensitivityType", 34864, 3);
        d d36 = new d("StandardOutputSensitivity", 34865, 4);
        d32 = new d("RecommendedExposureIndex", 34866, 4);
        d30 = new d("ISOSpeed", 34867, 4);
        d d37 = new d("ISOSpeedLatitudeyyy", 34868, 4);
        d6 = new d("ISOSpeedLatitudezzz", 34869, 4);
        dArray6 = new d("ExifVersion", 36864, 2);
        d d38 = new d("DateTimeOriginal", 36867, 2);
        d25 = new d("DateTimeDigitized", 36868, 2);
        d11 = new d("OffsetTime", 36880, 2);
        d d39 = new d("OffsetTimeOriginal", 36881, 2);
        dArray7 = new d("OffsetTimeDigitized", 36882, 2);
        d d40 = new d("ComponentsConfiguration", 37121, 7);
        d d41 = new d("CompressedBitsPerPixel", 37122, 5);
        d17 = new d("ShutterSpeedValue", 37377, 10);
        d d42 = new d("ApertureValue", 37378, 5);
        d d43 = new d("BrightnessValue", 37379, 10);
        d23 = new d("ExposureBiasValue", 37380, 10);
        d d44 = new d("MaxApertureValue", 37381, 5);
        d19 = new d("SubjectDistance", 37382, 5);
        d d45 = new d("MeteringMode", 37383, 3);
        d10 = new d("LightSource", 37384, 3);
        d d46 = new d("Flash", 37385, 3);
        d34 = new d("FocalLength", 37386, 5);
        dArray4 = new d("SubjectArea", 37396, 3);
        d21 = new d("MakerNote", 37500, 7);
        d d47 = new d("UserComment", 37510, 7);
        d14 = new d("SubSecTime", 37520, 2);
        d24 = new d("SubSecTimeOriginal", 37521, 2);
        dArray5 = new d("SubSecTimeDigitized", 37522, 2);
        d d48 = new d("FlashpixVersion", 40960, 7);
        d d49 = new d("ColorSpace", 40961, 3);
        d d50 = new d("PixelXDimension", 40962, 3, 4);
        d d51 = new d("PixelYDimension", 40963, 3, 4);
        d d52 = new d("RelatedSoundFile", 40964, 2);
        dArray2 = new d("InteroperabilityIFDPointer", 40965, 4);
        d18 = new d("FlashEnergy", 41483, 5);
        d13 = new d("SpatialFrequencyResponse", 41484, 7);
        d d53 = new d("FocalPlaneXResolution", 41486, 5);
        d12 = new d("FocalPlaneYResolution", 41487, 5);
        d d54 = new d("FocalPlaneResolutionUnit", 41488, 3);
        d d55 = new d("SubjectLocation", 41492, 3);
        d d56 = new d("ExposureIndex", 41493, 5);
        d33 = new d("SensingMethod", 41495, 3);
        d d57 = new d("FileSource", 41728, 7);
        dArrayArray = new d("SceneType", 41729, 7);
        d d58 = new d("CFAPattern", 41730, 7);
        d26 = new d("CustomRendered", 41985, 3);
        d9 = new d("ExposureMode", 41986, 3);
        d8 = new d("WhiteBalance", 41987, 3);
        d d59 = new d("DigitalZoomRatio", 41988, 5);
        dArray3 = new d("FocalLengthIn35mmFilm", 41989, 3);
        d22 = new d("SceneCaptureType", 41990, 3);
        d d60 = new d("GainControl", 41991, 3);
        d20 = new d("Contrast", 41992, 3);
        d d61 = new d("Saturation", 41993, 3);
        d d62 = new d("Sharpness", 41994, 3);
        d d63 = new d("DeviceSettingDescription", 41995, 7);
        d7 = new d("SubjectDistanceRange", 41996, 3);
        d31 = new d("ImageUniqueID", 42016, 2);
        d d64 = new d("CameraOwnerName", 42032, 2);
        d16 = new d("BodySerialNumber", 42033, 2);
        d d65 = new d("LensSpecification", 42034, 5);
        d2 = new d("LensMake", 42035, 2);
        d d66 = new d("LensModel", 42036, 2);
        d4 = new d("Gamma", 42240, 5);
        d d67 = new d("DNGVersion", 50706, 1);
        dArray8 = new d("DefaultCropSize", 50720, 3, 4);
        dArray = new d[]{d35, d3, d29, d28, d27, d15, d5, d36, d32, d30, d37, d6, dArray6, d38, d25, d11, d39, dArray7, d40, d41, d17, d42, d43, d23, d44, d19, d45, d10, d46, d34, dArray4, d21, d47, d14, d24, dArray5, d48, d49, d50, d51, d52, dArray2, d18, d13, d53, d12, d54, d55, d56, d33, d57, dArrayArray, d58, d26, d9, d8, d59, dArray3, d22, d60, d20, d61, d62, d63, d7, d31, d64, d16, d65, d2, d66, d4, d67, dArray8};
        Z = dArray;
        d14 = new d("GPSVersionID", 0, 1);
        d11 = new d("GPSLatitudeRef", 1, 2);
        d20 = new d("GPSLatitude", 2, 5, 10);
        d9 = new d("GPSLongitudeRef", 3, 2);
        d12 = new d("GPSLongitude", 4, 5, 10);
        d16 = new d("GPSAltitudeRef", 5, 1);
        d28 = new d("GPSAltitude", 6, 5);
        d22 = new d("GPSTimeStamp", 7, 5);
        d31 = new d("GPSSatellites", 8, 2);
        dArrayArray = new d("GPSStatus", 9, 2);
        d13 = new d("GPSMeasureMode", 10, 2);
        d25 = new d("GPSDOP", 11, 5);
        d18 = new d("GPSSpeedRef", 12, 2);
        dArray7 = new d("GPSSpeed", 13, 5);
        dArray2 = new d("GPSTrackRef", 14, 2);
        d33 = new d("GPSTrack", 15, 5);
        d34 = new d("GPSImgDirectionRef", 16, 2);
        d7 = new d("GPSImgDirection", 17, 5);
        dArray8 = new d("GPSMapDatum", 18, 2);
        dArray3 = new d("GPSDestLatitudeRef", 19, 2);
        dArray6 = new d("GPSDestLatitude", 20, 5);
        d29 = new d("GPSDestLongitudeRef", 21, 2);
        d6 = new d("GPSDestLongitude", 22, 5);
        d21 = new d("GPSDestBearingRef", 23, 2);
        d27 = new d("GPSDestBearing", 24, 5);
        dArray5 = new d("GPSDestDistanceRef", 25, 2);
        d26 = new d("GPSDestDistance", 26, 5);
        d17 = new d("GPSProcessingMethod", 27, 7);
        d24 = new d("GPSAreaInformation", 28, 7);
        d19 = new d("GPSDateStamp", 29, 2);
        d4 = new d("GPSDifferential", 30, 3);
        d15 = new d("GPSHPositioningError", 31, 5);
        dArray4 = new d[]{d14, d11, d20, d9, d12, d16, d28, d22, d31, dArrayArray, d13, d25, d18, dArray7, dArray2, d33, d34, d7, dArray8, dArray3, dArray6, d29, d6, d21, d27, dArray5, d26, d17, d24, d19, d4, d15};
        a0 = dArray4;
        dArray7 = new d("InteroperabilityIndex", 1, 2);
        dArray2 = new d[]{dArray7};
        b0 = dArray2;
        dArrayArray = new d("NewSubfileType", 254, 4);
        d4 = new d("SubfileType", 255, 4);
        d13 = new d("ThumbnailImageWidth", 256, 3, 4);
        d24 = new d("ThumbnailImageLength", 257, 3, 4);
        d3 = new d("BitsPerSample", 258, 3);
        d11 = new d("Compression", 259, 3);
        d9 = new d("PhotometricInterpretation", 262, 3);
        d31 = new d("ImageDescription", 270, 2);
        d16 = new d("Make", 271, 2);
        dArray3 = new d("Model", 272, 2);
        d18 = new d("StripOffsets", 273, 3, 4);
        d12 = new d("ThumbnailOrientation", 274, 3);
        d32 = new d("SamplesPerPixel", 277, 3);
        d28 = new d("RowsPerStrip", 278, 3, 4);
        d34 = new d("StripByteCounts", 279, 3, 4);
        d17 = new d("XResolution", 282, 5);
        d29 = new d("YResolution", 283, 5);
        dArray5 = new d("PlanarConfiguration", 284, 3);
        d19 = new d("ResolutionUnit", 296, 3);
        d8 = new d("TransferFunction", 301, 3);
        d20 = new d("Software", 305, 2);
        d2 = new d("DateTime", 306, 2);
        d14 = new d("Artist", 315, 2);
        d15 = new d("WhitePoint", 318, 5);
        d7 = new d("PrimaryChromaticities", 319, 5);
        d6 = new d("SubIFDPointer", 330, 4);
        dArray8 = new d("JPEGInterchangeFormat", 513, 4);
        d33 = new d("JPEGInterchangeFormatLength", 514, 4);
        d21 = new d("YCbCrCoefficients", 529, 5);
        d26 = new d("YCbCrSubSampling", 530, 3);
        d22 = new d("YCbCrPositioning", 531, 3);
        d27 = new d("ReferenceBlackWhite", 532, 5);
        d10 = new d("Copyright", 33432, 2);
        d5 = new d("ExifIFDPointer", 34665, 4);
        d30 = new d("GPSInfoIFDPointer", 34853, 4);
        dArray6 = new d("DNGVersion", 50706, 1);
        d25 = new d("DefaultCropSize", 50720, 3, 4);
        dArray7 = new d[]{dArrayArray, d4, d13, d24, d3, d11, d9, d31, d16, dArray3, d18, d12, d32, d28, d34, d17, d29, dArray5, d19, d8, d20, d2, d14, d15, d7, d6, dArray8, d33, d21, d26, d22, d27, d10, d5, d30, dArray6, d25};
        c0 = dArray7;
        d0 = new d("StripOffsets", 273, 3);
        dArray5 = new d("ThumbnailImage", 256, 7);
        dArray6 = new d("CameraSettingsIFDPointer", 8224, 4);
        dArray3 = new d("ImageProcessingIFDPointer", 8256, 4);
        dArray8 = new d[]{dArray5, dArray6, dArray3};
        e0 = dArray8;
        dArray3 = new d("PreviewImageStart", 257, 4);
        dArray6 = new d("PreviewImageLength", 258, 4);
        dArray5 = new d[]{dArray3, dArray6};
        f0 = dArray5;
        dArray6 = new d("AspectFrame", 4371, 3);
        dArray3 = new d[]{dArray6};
        g0 = dArray3;
        dArrayArray = new d("ColorSpace", 55, 3);
        dArray6 = new d[]{dArrayArray};
        h0 = dArray6;
        dArrayArray = new d[][]{dArray9, dArray, dArray4, dArray2, dArray7, dArray9, dArray8, dArray5, dArray3, dArray6};
        i0 = dArrayArray;
        j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        k0 = new d("JPEGInterchangeFormat", 513, 4);
        l0 = new d("JPEGInterchangeFormatLength", 514, 4);
        m0 = new HashMap[dArrayArray.length];
        n0 = new HashMap[dArrayArray.length];
        o0 = new HashSet((Collection)Arrays.asList((Object[])new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        p0 = new HashMap();
        dArray9 = Charset.forName((String)"US-ASCII");
        q0 = dArray9;
        r0 = "Exif\u0000\u0000".getBytes((Charset)dArray9);
        s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes((Charset)dArray9);
        dArray = Locale.US;
        dArray9 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)dArray);
        T = dArray9;
        dArray9.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        dArray9 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", (Locale)dArray);
        U = dArray9;
        dArray9.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        for (int i2 = 0; i2 < (dArray9 = i0).length; ++i2) {
            C.b.m0[i2] = new HashMap();
            C.b.n0[i2] = new HashMap();
            dArray9 = dArray9[i2];
            int n8 = dArray9.length;
            for (int i3 = 0; i3 < n8; ++i3) {
                dArray = dArray9[i3];
                m0[i2].put((Object)dArray.a, (Object)dArray);
                n0[i2].put((Object)dArray.b, (Object)dArray);
            }
        }
        dArray = p0;
        dArray9 = j0;
        dArray.put((Object)dArray9[0].a, (Object)n7);
        dArray.put((Object)dArray9[1].a, (Object)n3);
        dArray.put((Object)dArray9[2].a, (Object)n5);
        dArray.put((Object)dArray9[3].a, (Object)n2);
        dArray.put((Object)dArray9[4].a, (Object)n6);
        dArray.put((Object)dArray9[5].a, (Object)n4);
        t0 = Pattern.compile((String)".*[1-9].*");
        u0 = Pattern.compile((String)"^(\\d{2}):(\\d{2}):(\\d{2})$");
        v0 = Pattern.compile((String)"^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        w0 = Pattern.compile((String)"^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public b(InputStream inputStream) {
        this(inputStream, 0);
    }

    public b(InputStream inputStream, int n2) {
        FileInputStream fileInputStream = i0;
        this.f = new HashMap[((d[][])fileInputStream).length];
        this.g = new HashSet(((d[][])fileInputStream).length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (n2 == 1) {
                if (!C.b.z((BufferedInputStream)(inputStream = new BufferedInputStream(inputStream, 5000)))) {
                    Log.w((String)"ExifInterface", (String)"Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.e = true;
                this.c = null;
                this.b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream)inputStream;
                this.b = null;
            } else if (inputStream instanceof FileInputStream && C.b.G((fileInputStream = (FileInputStream)inputStream).getFD())) {
                this.c = null;
                this.b = fileInputStream.getFD();
            } else {
                this.c = null;
                this.b = null;
            }
            this.K(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public b(String string) {
        d[][] dArray = i0;
        this.f = new HashMap[dArray.length];
        this.g = new HashSet(dArray.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (string != null) {
            this.y(string);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /*
     * Exception decompiling
     */
    private boolean A(byte[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [9, 8 : 136->148)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:644)
         *     at java.lang.Thread.run(Thread.java:1012)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean B(byte[] byArray) {
        byte[] byArray2;
        for (int i2 = 0; i2 < (byArray2 = A).length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean C(byte[] object) {
        b b2;
        block9: {
            void var1_7;
            b b3;
            block8: {
                boolean bl;
                block10: {
                    bl = false;
                    b b4 = null;
                    Object var5_10 = null;
                    try {
                        b3 = new b((byte[])object);
                    }
                    catch (Throwable throwable) {
                        b3 = var5_10;
                        break block8;
                    }
                    catch (Exception exception) {
                        b2 = b4;
                        break block9;
                    }
                    try {
                        object = this.N(b3);
                        this.h = object;
                        b3.x((ByteOrder)object);
                        short s2 = b3.readShort();
                        if (s2 != 20306 && s2 != 21330) break block10;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        break block8;
                    }
                    catch (Exception exception) {
                        b2 = b3;
                        break block9;
                    }
                }
                b3.close();
                return bl;
            }
            if (b3 != null) {
                b3.close();
            }
            throw var1_7;
        }
        if (b2 != null) {
            b2.close();
        }
        return false;
    }

    private boolean D(byte[] byArray) {
        byte[] byArray2;
        for (int i2 = 0; i2 < (byArray2 = G).length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    private boolean E(byte[] byArray) {
        byte[] byArray2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            if (byArray[i2] == byArray2[i2]) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean F(byte[] object) {
        b b2;
        block9: {
            b b3;
            block8: {
                boolean bl;
                block10: {
                    bl = false;
                    b b4 = null;
                    Object var5_7 = null;
                    try {
                        b3 = new b((byte[])object);
                    }
                    catch (Throwable throwable) {
                        object = var5_7;
                        break block8;
                    }
                    catch (Exception exception) {
                        b2 = b4;
                        break block9;
                    }
                    try {
                        object = this.N(b3);
                        this.h = (ByteOrder)object;
                        b3.x((ByteOrder)object);
                        short s2 = b3.readShort();
                        if (s2 != 85) break block10;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        object = b3;
                        b3 = throwable;
                        break block8;
                    }
                    catch (Exception exception) {
                        b2 = b3;
                        break block9;
                    }
                }
                b3.close();
                return bl;
            }
            if (object != null) {
                object.close();
            }
            throw b3;
        }
        if (b2 != null) {
            b2.close();
        }
        return false;
    }

    private static boolean G(FileDescriptor fileDescriptor) {
        try {
            Os.lseek((FileDescriptor)fileDescriptor, (long)0L, (int)OsConstants.SEEK_CUR);
            return true;
        }
        catch (Exception exception) {
            if (u) {
                Log.d((String)"ExifInterface", (String)"The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    private boolean H(HashMap object) {
        Object object2 = (c)object.get((Object)"BitsPerSample");
        if (object2 != null) {
            int n2;
            int[] nArray = x;
            if (Arrays.equals((int[])nArray, (int[])(object2 = (Object)((int[])((c)object2).o(this.h))))) {
                return true;
            }
            if (this.d == 3 && (object = (c)object.get((Object)"PhotometricInterpretation")) != null && ((n2 = ((c)object).m(this.h)) == 1 && Arrays.equals((int[])object2, (int[])z) || n2 == 6 && Arrays.equals((int[])object2, (int[])nArray))) {
                return true;
            }
        }
        if (u) {
            Log.d((String)"ExifInterface", (String)"Unsupported data type value");
        }
        return false;
    }

    private boolean I(HashMap object) {
        c c2 = (c)object.get((Object)"ImageLength");
        object = (c)object.get((Object)"ImageWidth");
        if (c2 != null && object != null) {
            int n2 = c2.m(this.h);
            int n3 = ((c)object).m(this.h);
            if (n2 <= 512 && n3 <= 512) {
                return true;
            }
        }
        return false;
    }

    private boolean J(byte[] byArray) {
        byte[] byArray2;
        int n2;
        for (n2 = 0; n2 < (byArray2 = K).length; ++n2) {
            if (byArray[n2] == byArray2[n2]) continue;
            return false;
        }
        for (n2 = 0; n2 < (byArray2 = L).length; ++n2) {
            if (byArray[K.length + n2 + 4] == byArray2[n2]) continue;
            return false;
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    private void K(InputStream var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3, 2 : 44->180)] java.lang.Throwable
         *     at kb.g.H1(SourceFile:239)
         *     at ib.f.d(SourceFile:57)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:644)
         *     at java.lang.Thread.run(Thread.java:1012)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void L(b b2, int n2) {
        ByteOrder byteOrder;
        this.h = byteOrder = this.N(b2);
        b2.x(byteOrder);
        int n3 = b2.readUnsignedShort();
        int n4 = this.d;
        if (n4 != 7 && n4 != 10 && n3 != 42) {
            b2 = new StringBuilder();
            b2.append("Invalid start code: ");
            b2.append(Integer.toHexString((int)n3));
            throw new IOException(b2.toString());
        }
        n3 = b2.readInt();
        if (n3 >= 8 && n3 < n2) {
            n2 = n3 - 8;
            if (n2 > 0 && b2.skipBytes(n2) != n2) {
                b2 = new StringBuilder();
                b2.append("Couldn't jump to first Ifd: ");
                b2.append(n2);
                throw new IOException(b2.toString());
            }
            return;
        }
        b2 = new StringBuilder();
        b2.append("Invalid first Ifd offset: ");
        b2.append(n3);
        throw new IOException(b2.toString());
    }

    private void M() {
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The size of tag group[");
            stringBuilder.append(i2);
            stringBuilder.append("]: ");
            stringBuilder.append(this.f[i2].size());
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
            for (Map.Entry entry : this.f[i2].entrySet()) {
                c c2 = (c)entry.getValue();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("tagName: ");
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append(", tagType: ");
                stringBuilder2.append(c2.toString());
                stringBuilder2.append(", tagValue: '");
                stringBuilder2.append(c2.n(this.h));
                stringBuilder2.append("'");
                Log.d((String)"ExifInterface", (String)stringBuilder2.toString());
            }
        }
    }

    private ByteOrder N(b b2) {
        short s2 = b2.readShort();
        if (s2 != 18761) {
            if (s2 == 19789) {
                if (u) {
                    Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            b2 = new StringBuilder();
            b2.append("Invalid byte order: ");
            b2.append(Integer.toHexString((int)s2));
            throw new IOException(b2.toString());
        }
        if (u) {
            Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void O(byte[] byArray, int n2) {
        b b2 = new b(byArray);
        this.L(b2, byArray.length);
        this.P(b2, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void P(b b2, int n2) {
        long l2;
        boolean bl;
        Object object;
        this.g.add((Object)b2.g);
        if (b2.g + 2 > b2.f) {
            return;
        }
        short s2 = b2.readShort();
        if (u) {
            object = new StringBuilder();
            object.append("numberOfDirectoryEntry: ");
            object.append((int)s2);
            Log.d((String)"ExifInterface", (String)object.toString());
        }
        if (b2.g + s2 * 12 > b2.f) return;
        if (s2 <= 0) {
            return;
        }
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            int n3;
            int n4;
            d d2;
            long l3;
            int n5;
            int n6;
            block39: {
                block47: {
                    block46: {
                        block44: {
                            block45: {
                                block40: {
                                    block41: {
                                        block42: {
                                            block43: {
                                                long l4;
                                                int n7;
                                                block37: {
                                                    block38: {
                                                        block33: {
                                                            block34: {
                                                                block36: {
                                                                    block35: {
                                                                        block32: {
                                                                            n7 = b2.readUnsignedShort();
                                                                            n6 = b2.readUnsignedShort();
                                                                            n5 = b2.readInt();
                                                                            l3 = (long)b2.f() + 4L;
                                                                            d2 = (d)m0[n2].get((Object)n7);
                                                                            bl = u;
                                                                            if (bl) {
                                                                                object = d2 != null ? d2.b : null;
                                                                                Log.d((String)"ExifInterface", (String)String.format((String)"ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", (Object[])new Object[]{n2, n7, object, n6, n5}));
                                                                            }
                                                                            if (d2 != null) break block32;
                                                                            if (bl) {
                                                                                object = new StringBuilder();
                                                                                object.append("Skip the tag entry since tag number is not defined: ");
                                                                                object.append(n7);
                                                                                Log.d((String)"ExifInterface", (String)object.toString());
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        if (n6 <= 0 || n6 >= ((StringBuilder)(object = (Object)W)).length) break block34;
                                                                        if (d2.a(n6)) break block35;
                                                                        if (bl) {
                                                                            object = new StringBuilder();
                                                                            object.append("Skip the tag entry since data format (");
                                                                            object.append(V[n6]);
                                                                            object.append(") is unexpected for tag: ");
                                                                            object.append(d2.b);
                                                                            Log.d((String)"ExifInterface", (String)object.toString());
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    n4 = n6;
                                                                    if (n6 == 7) {
                                                                        n4 = d2.c;
                                                                    }
                                                                    if ((l4 = (long)object[n4] * (l2 = (long)n5)) < 0L || l4 > Integer.MAX_VALUE) break block36;
                                                                    n3 = 1;
                                                                    l2 = l4;
                                                                    break block37;
                                                                }
                                                                l2 = l4;
                                                                n6 = n4;
                                                                if (bl) {
                                                                    object = new StringBuilder();
                                                                    object.append("Skip the tag entry since the number of components is invalid: ");
                                                                    object.append(n5);
                                                                    Log.d((String)"ExifInterface", (String)object.toString());
                                                                    n6 = n4;
                                                                    l2 = l4;
                                                                }
                                                                break block38;
                                                            }
                                                            if (bl) {
                                                                object = new StringBuilder();
                                                                object.append("Skip the tag entry since data format is invalid: ");
                                                                object.append(n6);
                                                                Log.d((String)"ExifInterface", (String)object.toString());
                                                            }
                                                        }
                                                        l2 = 0L;
                                                    }
                                                    n3 = 0;
                                                    n4 = n6;
                                                }
                                                if (n3 == 0) {
                                                    b2.u(l3);
                                                    continue;
                                                }
                                                if (l2 > 4L) {
                                                    n6 = b2.readInt();
                                                    if (bl) {
                                                        object = new StringBuilder();
                                                        object.append("seek to data offset: ");
                                                        object.append(n6);
                                                        Log.d((String)"ExifInterface", (String)object.toString());
                                                    }
                                                    if (this.d == 7) {
                                                        if ("MakerNote".equals((Object)d2.b)) {
                                                            this.q = n6;
                                                        } else if (n2 == 6 && "ThumbnailImage".equals((Object)d2.b)) {
                                                            this.r = n6;
                                                            this.s = n5;
                                                            c c2 = C.b$c.j(6, this.h);
                                                            c c3 = C.b$c.f(this.r, this.h);
                                                            object = C.b$c.f(this.s, this.h);
                                                            this.f[4].put((Object)"Compression", (Object)c2);
                                                            this.f[4].put((Object)"JPEGInterchangeFormat", (Object)c3);
                                                            this.f[4].put((Object)"JPEGInterchangeFormatLength", object);
                                                        }
                                                    }
                                                    l4 = n6;
                                                    if (l4 + l2 <= (long)b2.f) {
                                                        b2.u(l4);
                                                    } else {
                                                        if (bl) {
                                                            object = new StringBuilder();
                                                            object.append("Skip the tag entry since data offset is invalid: ");
                                                            object.append(n6);
                                                            Log.d((String)"ExifInterface", (String)object.toString());
                                                        }
                                                        b2.u(l3);
                                                        continue;
                                                    }
                                                }
                                                object = (Integer)p0.get((Object)n7);
                                                if (bl) {
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("nextIfdType: ");
                                                    stringBuilder.append(object);
                                                    stringBuilder.append(" byteCount: ");
                                                    stringBuilder.append(l2);
                                                    Log.d((String)"ExifInterface", (String)stringBuilder.toString());
                                                }
                                                if (object == null) break block39;
                                                if (n4 == 3) break block40;
                                                if (n4 == 4) break block41;
                                                if (n4 == 8) break block42;
                                                if (n4 == 9 || n4 == 13) break block43;
                                                l2 = -1L;
                                                break block44;
                                            }
                                            n4 = b2.readInt();
                                            break block45;
                                        }
                                        n4 = b2.readShort();
                                        break block45;
                                    }
                                    l2 = b2.n();
                                    break block44;
                                }
                                n4 = b2.readUnsignedShort();
                            }
                            l2 = n4;
                        }
                        if (bl) {
                            Log.d((String)"ExifInterface", (String)String.format((String)"Offset: %d, tagName: %s", (Object[])new Object[]{l2, d2.b}));
                        }
                        if (l2 <= 0L || l2 >= (long)b2.f) break block46;
                        if (!this.g.contains((Object)((int)l2))) {
                            b2.u(l2);
                            this.P(b2, object.intValue());
                            break block47;
                        } else if (bl) {
                            d2 = new StringBuilder();
                            d2.append("Skip jump into the IFD since it has already been read: IfdType ");
                            d2.append(object);
                            d2.append(" (at ");
                            d2.append(l2);
                            d2.append(")");
                            Log.d((String)"ExifInterface", (String)d2.toString());
                        }
                        break block47;
                    }
                    if (bl) {
                        object = new StringBuilder();
                        object.append("Skip jump into the IFD since its offset is invalid: ");
                        object.append(l2);
                        Log.d((String)"ExifInterface", (String)object.toString());
                    }
                }
                b2.u(l3);
                continue;
            }
            n6 = b2.f();
            n3 = this.p;
            object = new byte[(int)l2];
            b2.readFully((byte[])object);
            object = new c(n4, n5, n6 + n3, (byte[])object);
            this.f[n2].put((Object)d2.b, object);
            if ("DNGVersion".equals((Object)d2.b)) {
                this.d = 3;
            }
            if (("Make".equals((Object)d2.b) || "Model".equals((Object)d2.b)) && ((c)object).n(this.h).contains((CharSequence)"PENTAX") || "Compression".equals((Object)d2.b) && ((c)object).m(this.h) == 65535) {
                this.d = 8;
            }
            if ((long)b2.f() == l3) continue;
            b2.u(l3);
        }
        if (b2.f() + 4 > b2.f) return;
        n2 = b2.readInt();
        bl = u;
        if (bl) {
            Log.d((String)"ExifInterface", (String)String.format((String)"nextIfdOffset: %d", (Object[])new Object[]{n2}));
        }
        if ((l2 = (long)n2) > 0L && n2 < b2.f) {
            if (this.g.contains((Object)n2)) {
                if (!bl) return;
                b2 = new StringBuilder();
                b2.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                b2.append(n2);
                Log.d((String)"ExifInterface", (String)b2.toString());
                return;
            }
            b2.u(l2);
            if (this.f[4].isEmpty()) {
                this.P(b2, 4);
                return;
            }
            if (!this.f[5].isEmpty()) return;
            this.P(b2, 5);
            return;
        }
        if (!bl) return;
        b2 = new StringBuilder();
        b2.append("Stop reading file since a wrong offset may cause an infinite loop: ");
        b2.append(n2);
        Log.d((String)"ExifInterface", (String)b2.toString());
    }

    private void Q(b b2, int n2) {
        c c2 = (c)this.f[n2].get((Object)"ImageLength");
        Object object = (c)this.f[n2].get((Object)"ImageWidth");
        if (c2 == null || object == null) {
            object = (c)this.f[n2].get((Object)"JPEGInterchangeFormat");
            c2 = (c)this.f[n2].get((Object)"JPEGInterchangeFormatLength");
            if (object != null && c2 != null) {
                int n3 = ((c)object).m(this.h);
                int n4 = ((c)object).m(this.h);
                b2.u(n3);
                object = new byte[n4];
                b2.read((byte[])object);
                this.l(new b((byte[])object), n3, n2);
            }
        }
    }

    private void S(b b2) {
        block4: {
            HashMap hashMap;
            block1: {
                block2: {
                    block3: {
                        int n2;
                        hashMap = this.f[4];
                        c c2 = (c)hashMap.get((Object)"Compression");
                        if (c2 == null) break block1;
                        this.o = n2 = c2.m(this.h);
                        if (n2 == 1) break block2;
                        if (n2 == 6) break block3;
                        if (n2 == 7) break block2;
                        break block4;
                    }
                    this.w(b2, hashMap);
                    break block4;
                }
                if (this.H(hashMap)) {
                    this.x(b2, hashMap);
                }
                break block4;
            }
            this.o = 6;
            this.w(b2, hashMap);
        }
    }

    private static boolean T(byte[] byArray, byte[] byArray2) {
        if (byArray != null && byArray2 != null) {
            if (byArray.length < byArray2.length) {
                return false;
            }
            for (int i2 = 0; i2 < byArray2.length; ++i2) {
                if (byArray[i2] == byArray2[i2]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private void U(int n2, int n3) {
        if (!this.f[n2].isEmpty() && !this.f[n3].isEmpty()) {
            HashMap[] hashMapArray = (HashMap[])this.f[n2].get((Object)"ImageLength");
            c c2 = (c)this.f[n2].get((Object)"ImageWidth");
            c c3 = (c)this.f[n3].get((Object)"ImageLength");
            c c4 = (c)this.f[n3].get((Object)"ImageWidth");
            if (hashMapArray != null && c2 != null) {
                if (c3 != null && c4 != null) {
                    int n4 = hashMapArray.m(this.h);
                    int n5 = c2.m(this.h);
                    int n6 = c3.m(this.h);
                    int n7 = c4.m(this.h);
                    if (n4 < n6 && n5 < n7) {
                        hashMapArray = this.f;
                        c3 = hashMapArray[n2];
                        hashMapArray[n2] = hashMapArray[n3];
                        hashMapArray[n3] = c3;
                    }
                } else if (u) {
                    Log.d((String)"ExifInterface", (String)"Second image does not contain valid size information");
                }
            } else if (u) {
                Log.d((String)"ExifInterface", (String)"First image does not contain valid size information");
            }
            return;
        }
        if (u) {
            Log.d((String)"ExifInterface", (String)"Cannot perform swap since only one image data exists");
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void V(b object, int n2) {
        c c2;
        c c3;
        c c4;
        c c5;
        void var2_8;
        block9: {
            int[] nArray;
            block10: {
                void var1_6;
                block8: {
                    c c6 = (c)this.f[var2_8].get((Object)"DefaultCropSize");
                    c5 = (c)this.f[var2_8].get((Object)"SensorTopBorder");
                    c4 = (c)this.f[var2_8].get((Object)"SensorLeftBorder");
                    c3 = (c)this.f[var2_8].get((Object)"SensorBottomBorder");
                    c2 = (c)this.f[var2_8].get((Object)"SensorRightBorder");
                    if (c6 == null) break block9;
                    if (c6.a == 5) {
                        Object[] objectArray = (e[])c6.o(this.h);
                        if (objectArray != null && objectArray.length == 2) {
                            c2 = C.b$c.h(objectArray[0], this.h);
                            c c7 = C.b$c.h((e)objectArray[1], this.h);
                            break block8;
                        } else {
                            c2 = new StringBuilder();
                            c2.append("Invalid crop size values. cropSize=");
                            c2.append(Arrays.toString((Object[])objectArray));
                            Log.w((String)"ExifInterface", (String)c2.toString());
                            return;
                        }
                    }
                    nArray = (int[])c6.o(this.h);
                    if (nArray == null || nArray.length != 2) break block10;
                    c2 = C.b$c.j(nArray[0], this.h);
                    c c8 = C.b$c.j(nArray[1], this.h);
                }
                this.f[var2_8].put((Object)"ImageWidth", (Object)c2);
                this.f[var2_8].put((Object)"ImageLength", (Object)var1_6);
                return;
            }
            c2 = new StringBuilder();
            c2.append("Invalid crop size values. cropSize=");
            c2.append(Arrays.toString((int[])nArray));
            Log.w((String)"ExifInterface", (String)c2.toString());
            return;
        }
        if (c5 != null && c4 != null && c3 != null && c2 != null) {
            int n3 = c5.m(this.h);
            int n4 = c3.m(this.h);
            int n5 = c2.m(this.h);
            int n6 = c4.m(this.h);
            if (n4 <= n3) return;
            if (n5 <= n6) return;
            c2 = C.b$c.j(n4 - n3, this.h);
            c c9 = C.b$c.j(n5 - n6, this.h);
            this.f[var2_8].put((Object)"ImageLength", (Object)c2);
            this.f[var2_8].put((Object)"ImageWidth", (Object)c9);
            return;
        }
        this.Q((b)((Object)object), (int)var2_8);
    }

    private void W() {
        this.U(0, 5);
        this.U(0, 4);
        this.U(5, 4);
        c c2 = (c)this.f[1].get((Object)"PixelXDimension");
        HashMap[] hashMapArray = (HashMap[])this.f[1].get((Object)"PixelYDimension");
        if (c2 != null && hashMapArray != null) {
            this.f[0].put((Object)"ImageWidth", (Object)c2);
            this.f[0].put((Object)"ImageLength", (Object)hashMapArray);
        }
        if (this.f[4].isEmpty() && this.I(this.f[5])) {
            hashMapArray = this.f;
            hashMapArray[4] = hashMapArray[5];
            hashMapArray[5] = new HashMap();
        }
        if (!this.I(this.f[4])) {
            Log.d((String)"ExifInterface", (String)"No image meets the size requirements of a thumbnail image.");
        }
    }

    private void a() {
        String string = this.g("DateTimeOriginal");
        if (string != null && this.g("DateTime") == null) {
            this.f[0].put((Object)"DateTime", (Object)C.b$c.e(string));
        }
        if (this.g("ImageWidth") == null) {
            this.f[0].put((Object)"ImageWidth", (Object)C.b$c.f(0L, this.h));
        }
        if (this.g("ImageLength") == null) {
            this.f[0].put((Object)"ImageLength", (Object)C.b$c.f(0L, this.h));
        }
        if (this.g("Orientation") == null) {
            this.f[0].put((Object)"Orientation", (Object)C.b$c.f(0L, this.h));
        }
        if (this.g("LightSource") == null) {
            this.f[1].put((Object)"LightSource", (Object)C.b$c.f(0L, this.h));
        }
    }

    private static String b(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            stringBuilder.append(String.format((String)"%02x", (Object[])new Object[]{byArray[i2]}));
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static double d(String object, String string) {
        double d2;
        block4: {
            object = object.split(",", -1);
            String[] stringArray = object[0].split("/", -1);
            double d3 = Double.parseDouble((String)stringArray[0].trim()) / Double.parseDouble((String)stringArray[1].trim());
            stringArray = object[1].split("/", -1);
            d2 = Double.parseDouble((String)stringArray[0].trim()) / Double.parseDouble((String)stringArray[1].trim());
            object = object[2].split("/", -1);
            double d4 = Double.parseDouble((String)object[0].trim()) / Double.parseDouble((String)object[1].trim());
            d2 = d3 + d2 / 60.0 + d4 / 3600.0;
            try {
                if (string.equals((Object)"S") || string.equals((Object)"W")) break block4;
                if (!string.equals((Object)"N") && !string.equals((Object)"E")) {
                    object = new IllegalArgumentException();
                    throw object;
                }
                return d2;
            }
            catch (ArrayIndexOutOfBoundsException | NumberFormatException throwable) {
                throw new IllegalArgumentException();
            }
        }
        return -d2;
    }

    private static long[] e(Object object) {
        if (object instanceof int[]) {
            int[] nArray = (int[])object;
            object = new long[nArray.length];
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                object[i2] = (long)nArray[i2];
            }
            return object;
        }
        if (object instanceof long[]) {
            return (long[])object;
        }
        return null;
    }

    private c j(String object) {
        if (object != null) {
            String string = object;
            if ("ISOSpeedRatings".equals(object)) {
                if (u) {
                    Log.d((String)"ExifInterface", (String)"getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                string = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < i0.length; ++i2) {
                object = (c)this.f[i2].get((Object)string);
                if (object == null) continue;
                return object;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(b object) {
        Throwable throwable2;
        MediaMetadataRetriever mediaMetadataRetriever;
        block21: {
            block24: {
                String string;
                String string2;
                Object object2;
                block22: {
                    int n2;
                    block20: {
                        block23: {
                            block19: {
                                mediaMetadataRetriever = new MediaMetadataRetriever();
                                try {
                                    if (Build.VERSION.SDK_INT < 23) break block19;
                                    object2 = new MediaDataSource(this, (b)((Object)object)){
                                        long d;
                                        final b e;
                                        final b f;
                                        {
                                            this.f = b2;
                                            this.e = b3;
                                        }

                                        public void close() {
                                        }

                                        public long getSize() {
                                            return -1L;
                                        }

                                        /*
                                         * Enabled aggressive block sorting
                                         * Enabled unnecessary exception pruning
                                         * Enabled aggressive exception aggregation
                                         */
                                        public int readAt(long l2, byte[] byArray, int n2, int n3) {
                                            if (n3 == 0) {
                                                return 0;
                                            }
                                            if (l2 < 0L) {
                                                return -1;
                                            }
                                            try {
                                                long l3 = this.d;
                                                if (l3 != l2) {
                                                    if (l3 >= 0L && l2 >= l3 + (long)this.e.available()) {
                                                        return -1;
                                                    }
                                                    this.e.u(l2);
                                                    this.d = l2;
                                                }
                                                int n4 = n3;
                                                if (n3 > this.e.available()) {
                                                    n4 = this.e.available();
                                                }
                                                if ((n2 = this.e.read(byArray, n2, n4)) >= 0) {
                                                    this.d += (long)n2;
                                                    return n2;
                                                }
                                            }
                                            catch (IOException iOException) {}
                                            this.d = -1L;
                                            return -1;
                                        }
                                    };
                                    C.a.a(mediaMetadataRetriever, object2);
                                    break block20;
                                }
                                catch (Throwable throwable2) {
                                    break block21;
                                }
                            }
                            object2 = this.b;
                            if (object2 == null) break block23;
                            mediaMetadataRetriever.setDataSource((FileDescriptor)object2);
                            break block20;
                        }
                        object2 = this.a;
                        if (object2 == null) break block24;
                        mediaMetadataRetriever.setDataSource((String)object2);
                    }
                    Object object3 = mediaMetadataRetriever.extractMetadata(33);
                    String string3 = mediaMetadataRetriever.extractMetadata(34);
                    object2 = mediaMetadataRetriever.extractMetadata(26);
                    string2 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(object2)) {
                        object2 = mediaMetadataRetriever.extractMetadata(29);
                        string2 = mediaMetadataRetriever.extractMetadata(30);
                        string = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals((Object)string2)) {
                        object2 = mediaMetadataRetriever.extractMetadata(18);
                        string2 = mediaMetadataRetriever.extractMetadata(19);
                        string = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        object2 = null;
                        string2 = null;
                        string = null;
                    }
                    if (object2 != null) {
                        this.f[0].put((Object)"ImageWidth", (Object)C.b$c.j(Integer.parseInt((String)object2), this.h));
                    }
                    if (string2 != null) {
                        this.f[0].put((Object)"ImageLength", (Object)C.b$c.j(Integer.parseInt((String)string2), this.h));
                    }
                    if (string != null) {
                        n2 = Integer.parseInt((String)string);
                        n2 = n2 != 90 ? (n2 != 180 ? (n2 != 270 ? 1 : 8) : 3) : 6;
                        this.f[0].put((Object)"Orientation", (Object)C.b$c.j(n2, this.h));
                    }
                    if (object3 != null && string3 != null) {
                        n2 = Integer.parseInt((String)object3);
                        int n3 = Integer.parseInt((String)string3);
                        if (n3 > 6) {
                            object.u(n2);
                            object3 = new byte[6];
                            if (object.read((byte[])object3) == 6) {
                                n3 -= 6;
                                if (!Arrays.equals((byte[])object3, (byte[])r0)) {
                                    object = new IOException("Invalid identifier");
                                    throw object;
                                }
                                object3 = new byte[n3];
                                if (object.read((byte[])object3) != n3) {
                                    object = new IOException("Can't read exif");
                                    throw object;
                                }
                                this.p = n2 + 6;
                                this.O((byte[])object3, 0);
                                break block22;
                            } else {
                                object = new IOException("Can't read identifier");
                                throw object;
                            }
                        }
                        object = new IOException("Invalid exif length");
                        throw object;
                    }
                }
                if (u) {
                    object = new StringBuilder();
                    object.append("Heif meta: ");
                    object.append((String)object2);
                    object.append("x");
                    object.append(string2);
                    object.append(", rotation ");
                    object.append(string);
                    Log.d((String)"ExifInterface", (String)object.toString());
                }
                mediaMetadataRetriever.release();
                return;
            }
            mediaMetadataRetriever.release();
            return;
        }
        mediaMetadataRetriever.release();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(b b2, int n2, int n3) {
        Object object;
        boolean bl = u;
        String string = "ExifInterface";
        if (bl) {
            object = new StringBuilder();
            object.append("getJpegAttributes starting with: ");
            object.append((Object)b2);
            Log.d((String)"ExifInterface", (String)object.toString());
        }
        b2.mark(0);
        b2.x(ByteOrder.BIG_ENDIAN);
        int n4 = b2.readByte();
        if (n4 != -1) {
            b2 = new StringBuilder();
            b2.append("Invalid marker: ");
            b2.append(Integer.toHexString((int)(n4 & 0xFF)));
            throw new IOException(b2.toString());
        }
        if (b2.readByte() != -40) {
            b2 = new StringBuilder();
            b2.append("Invalid marker: ");
            b2.append(Integer.toHexString((int)(n4 & 0xFF)));
            throw new IOException(b2.toString());
        }
        n4 = 2;
        while (true) {
            int n5;
            block31: {
                int n6;
                block32: {
                    block29: {
                        block30: {
                            if ((n5 = b2.readByte()) != -1) {
                                b2 = new StringBuilder();
                                b2.append("Invalid marker:");
                                b2.append(Integer.toHexString((int)(n5 & 0xFF)));
                                throw new IOException(b2.toString());
                            }
                            byte by = b2.readByte();
                            bl = u;
                            if (bl) {
                                object = new StringBuilder();
                                object.append("Found JPEG segment indicator: ");
                                object.append(Integer.toHexString((int)(by & 0xFF)));
                                Log.d((String)string, (String)object.toString());
                            }
                            if (by == -39 || by == -38) break;
                            int n7 = b2.readUnsignedShort();
                            n6 = n7 - 2;
                            n5 = n4 + 4;
                            if (bl) {
                                object = new StringBuilder();
                                object.append("JPEG segment: ");
                                object.append(Integer.toHexString((int)(by & 0xFF)));
                                object.append(" (length: ");
                                object.append(n7);
                                object.append(")");
                                Log.d((String)string, (String)object.toString());
                            }
                            if (n6 < 0) {
                                throw new IOException("Invalid length");
                            }
                            if (by == -31) break block29;
                            if (by == -2) break block30;
                            block0 : switch (by) {
                                default: {
                                    switch (by) {
                                        default: {
                                            switch (by) {
                                                default: {
                                                    switch (by) {
                                                        default: {
                                                            n4 = n6;
                                                            break block0;
                                                        }
                                                        case -51: 
                                                        case -50: 
                                                        case -49: 
                                                    }
                                                }
                                                case -55: 
                                                case -54: 
                                                case -53: 
                                            }
                                        }
                                        case -59: 
                                        case -58: 
                                        case -57: 
                                    }
                                }
                                case -64: 
                                case -63: 
                                case -62: 
                                case -61: {
                                    if (b2.skipBytes(1) != 1) {
                                        throw new IOException("Invalid SOFx");
                                    }
                                    this.f[n3].put((Object)"ImageLength", (Object)C.b$c.f(b2.readUnsignedShort(), this.h));
                                    this.f[n3].put((Object)"ImageWidth", (Object)C.b$c.f(b2.readUnsignedShort(), this.h));
                                    n4 = n7 - 7;
                                    break;
                                }
                            }
                            break block31;
                        }
                        object = new byte[n6];
                        if (b2.read((byte[])object) != n6) {
                            throw new IOException("Invalid exif");
                        }
                        if (this.g("UserComment") == null) {
                            this.f[1].put((Object)"UserComment", (Object)C.b$c.e(new String((byte[])object, q0)));
                        }
                        n4 = n5;
                        break block32;
                    }
                    object = new byte[n6];
                    b2.readFully((byte[])object);
                    byte[] byArray = r0;
                    if (C.b.T((byte[])object, byArray)) {
                        object = Arrays.copyOfRange((byte[])object, (int)byArray.length, (int)n6);
                        this.p = n2 + n5 + byArray.length;
                        this.O((byte[])object, n3);
                        this.S(new b((byte[])object));
                    } else {
                        byArray = s0;
                        if (C.b.T((byte[])object, byArray)) {
                            n4 = byArray.length;
                            object = Arrays.copyOfRange((byte[])object, (int)byArray.length, (int)n6);
                            if (this.g("Xmp") == null) {
                                this.f[0].put((Object)"Xmp", (Object)new c(1, ((StringBuilder)object).length, n5 + n4, (byte[])object));
                                this.t = true;
                            }
                        }
                    }
                    n4 = n5 + n6;
                }
                n6 = 0;
                n5 = n4;
                n4 = n6;
            }
            if (n4 < 0) {
                throw new IOException("Invalid length");
            }
            if (b2.skipBytes(n4) != n4) {
                throw new IOException("Invalid JPEG segment");
            }
            n4 = n5 + n4;
        }
        b2.x(this.h);
    }

    private int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] byArray = new byte[5000];
        bufferedInputStream.read(byArray);
        bufferedInputStream.reset();
        if (C.b.B(byArray)) {
            return 4;
        }
        if (this.E(byArray)) {
            return 9;
        }
        if (this.A(byArray)) {
            return 12;
        }
        if (this.C(byArray)) {
            return 7;
        }
        if (this.F(byArray)) {
            return 10;
        }
        if (this.D(byArray)) {
            return 13;
        }
        if (this.J(byArray)) {
            return 14;
        }
        return 0;
    }

    private void o(b object) {
        this.r((b)((Object)object));
        object = (c)this.f[1].get((Object)"MakerNote");
        if (object != null) {
            b b2 = new b(((c)object).d);
            b2.x(this.h);
            object = E;
            byte[] byArray = new byte[((b)object).length];
            b2.readFully(byArray);
            b2.u(0L);
            byte[] byArray2 = F;
            Object object2 = new byte[byArray2.length];
            b2.readFully((byte[])object2);
            if (Arrays.equals((byte[])byArray, (byte[])object)) {
                b2.u(8L);
            } else if (Arrays.equals((byte[])object2, (byte[])byArray2)) {
                b2.u(12L);
            }
            this.P(b2, 6);
            object = (c)this.f[7].get((Object)"PreviewImageStart");
            object2 = (c)this.f[7].get((Object)"PreviewImageLength");
            if (object != null && object2 != null) {
                this.f[5].put((Object)"JPEGInterchangeFormat", object);
                this.f[5].put((Object)"JPEGInterchangeFormatLength", object2);
            }
            if ((object = (c)this.f[8].get((Object)"AspectFrame")) != null) {
                object2 = (int[])((c)object).o(this.h);
                if (object2 != null && ((byte[])object2).length == 4) {
                    int n2;
                    int n3;
                    int n4 = object2[2];
                    int n5 = object2[0];
                    if (n4 > n5 && (n3 = object2[3]) > (n2 = object2[1])) {
                        n5 = n4 - n5 + 1;
                        n4 = n3 - n2 + 1;
                        n2 = n5;
                        n3 = n4;
                        if (n5 < n4) {
                            n2 = n5 + n4;
                            n3 = n2 - n4;
                            n2 -= n3;
                        }
                        object = C.b$c.j(n2, this.h);
                        object2 = C.b$c.j(n3, this.h);
                        this.f[0].put((Object)"ImageWidth", object);
                        this.f[0].put((Object)"ImageLength", object2);
                    }
                } else {
                    object = new StringBuilder();
                    object.append("Invalid aspect frame values. frame=");
                    object.append(Arrays.toString((int[])object2));
                    Log.w((String)"ExifInterface", (String)object.toString());
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p(b object) {
        if (u) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getPngAttributes starting with: ");
            stringBuilder.append(object);
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
        }
        ((b)((Object)object)).mark(0);
        ((b)((Object)object)).x(ByteOrder.BIG_ENDIAN);
        byte[] byArray = G;
        ((b)((Object)object)).skipBytes(byArray.length);
        int n2 = byArray.length;
        try {
            while (true) {
                int n3 = ((b)((Object)object)).readInt();
                byte[] byArray2 = new byte[4];
                if (object.read(byArray2) != 4) break;
                if ((n2 += 8) == 16 && !Arrays.equals((byte[])byArray2, (byte[])I)) {
                    IOException iOException = new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    throw iOException;
                }
                if (Arrays.equals((byte[])byArray2, (byte[])J)) {
                    return;
                }
                if (Arrays.equals((byte[])byArray2, (byte[])H)) {
                    byte[] byArray3 = new byte[n3];
                    if (object.read(byArray3) != n3) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to read given length for given PNG chunk type: ");
                        stringBuilder.append(C.b.b(byArray2));
                        IOException iOException = new IOException(stringBuilder.toString());
                        throw iOException;
                    }
                    n3 = ((b)((Object)object)).readInt();
                    CRC32 cRC32 = new CRC32();
                    cRC32.update(byArray2);
                    cRC32.update(byArray3);
                    if ((int)cRC32.getValue() == n3) {
                        this.p = n2;
                        this.O(byArray3, 0);
                        this.W();
                        b b2 = new b(byArray3);
                        this.S(b2);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    stringBuilder.append(n3);
                    stringBuilder.append(", calculated CRC value: ");
                    stringBuilder.append(cRC32.getValue());
                    IOException iOException = new IOException(stringBuilder.toString());
                    throw iOException;
                }
                ((b)((Object)object)).skipBytes(n3 += 4);
                n2 += n3;
            }
            IOException iOException = new IOException("Encountered invalid length while parsing PNG chunktype");
            throw iOException;
        }
        catch (EOFException eOFException) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }

    private void q(b object) {
        Object object2;
        boolean bl = u;
        if (bl) {
            object2 = new StringBuilder();
            object2.append("getRafAttributes starting with: ");
            object2.append(object);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        object.mark(0);
        object.skipBytes(84);
        byte[] byArray = new byte[4];
        object2 = new byte[4];
        byte[] byArray2 = new byte[4];
        object.read(byArray);
        object.read((byte[])object2);
        object.read(byArray2);
        int n2 = ByteBuffer.wrap((byte[])byArray).getInt();
        int n3 = ByteBuffer.wrap((byte[])object2).getInt();
        int n4 = ByteBuffer.wrap((byte[])byArray2).getInt();
        object2 = new byte[n3];
        object.u(n2);
        object.read((byte[])object2);
        this.l(new b((byte[])object2), n2, 5);
        object.u(n4);
        object.x(ByteOrder.BIG_ENDIAN);
        n3 = object.readInt();
        if (bl) {
            object2 = new StringBuilder();
            object2.append("numberOfDirectoryEntry: ");
            object2.append(n3);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        for (n2 = 0; n2 < n3; ++n2) {
            int n5 = object.readUnsignedShort();
            n4 = object.readUnsignedShort();
            if (n5 == C.b.d0.a) {
                n3 = object.readShort();
                n2 = object.readShort();
                object = C.b$c.j(n3, this.h);
                object2 = C.b$c.j(n2, this.h);
                this.f[0].put((Object)"ImageLength", object);
                this.f[0].put((Object)"ImageWidth", object2);
                if (u) {
                    object = new StringBuilder();
                    object.append("Updated to length: ");
                    object.append(n3);
                    object.append(", width: ");
                    object.append(n2);
                    Log.d((String)"ExifInterface", (String)object.toString());
                }
                return;
            }
            object.skipBytes(n4);
        }
    }

    private void r(b object) {
        this.L((b)((Object)object), ((b)((Object)object)).available());
        this.P((b)((Object)object), 0);
        this.V((b)((Object)object), 0);
        this.V((b)((Object)object), 5);
        this.V((b)((Object)object), 4);
        this.W();
        if (this.d == 8 && (object = (c)this.f[1].get((Object)"MakerNote")) != null) {
            object = new b(((c)object).d);
            ((b)((Object)object)).x(this.h);
            ((b)((Object)object)).u(6L);
            this.P((b)((Object)object), 9);
            object = (c)this.f[9].get((Object)"ColorSpace");
            if (object != null) {
                this.f[1].put((Object)"ColorSpace", object);
            }
        }
    }

    private void s(b object) {
        Object object2;
        if (u) {
            object2 = new StringBuilder();
            object2.append("getRw2Attributes starting with: ");
            object2.append(object);
            Log.d((String)"ExifInterface", (String)object2.toString());
        }
        this.r((b)((Object)object));
        object = (c)this.f[0].get((Object)"JpgFromRaw");
        if (object != null) {
            this.l(new b(((c)object).d), (int)((c)object).c, 5);
        }
        object = (c)this.f[0].get((Object)"ISO");
        object2 = (c)this.f[1].get((Object)"PhotographicSensitivity");
        if (object != null && object2 == null) {
            this.f[1].put((Object)"PhotographicSensitivity", object);
        }
    }

    private void t(b b2) {
        byte[] byArray = r0;
        b2.skipBytes(byArray.length);
        byte[] byArray2 = new byte[b2.available()];
        b2.readFully(byArray2);
        this.p = byArray.length;
        this.O(byArray2, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u(b object) {
        if (u) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getWebpAttributes starting with: ");
            stringBuilder.append(object);
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
        }
        ((b)((Object)object)).mark(0);
        ((b)((Object)object)).x(ByteOrder.LITTLE_ENDIAN);
        ((b)((Object)object)).skipBytes(K.length);
        int n2 = ((b)((Object)object)).readInt() + 8;
        int n3 = ((b)((Object)object)).skipBytes(L.length) + 8;
        try {
            byte[] byArray;
            while (object.read(byArray = new byte[4]) == 4) {
                int n4 = ((b)((Object)object)).readInt();
                int n5 = n3 + 8;
                if (Arrays.equals((byte[])M, (byte[])byArray)) {
                    byte[] byArray2 = new byte[n4];
                    if (object.read(byArray2) == n4) {
                        this.p = n5;
                        this.O(byArray2, 0);
                        b b2 = new b(byArray2);
                        this.S(b2);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to read given length for given PNG chunk type: ");
                    stringBuilder.append(C.b.b(byArray));
                    IOException iOException = new IOException(stringBuilder.toString());
                    throw iOException;
                }
                n3 = n4;
                if (n4 % 2 == 1) {
                    n3 = n4 + 1;
                }
                if ((n4 = n5 + n3) == n2) {
                    return;
                }
                if (n4 <= n2) {
                    n4 = ((b)((Object)object)).skipBytes(n3);
                    if (n4 != n3) {
                        IOException iOException = new IOException("Encountered WebP file with invalid chunk size");
                        throw iOException;
                    }
                    n3 = n5 + n4;
                    continue;
                }
                IOException iOException = new IOException("Encountered WebP file with invalid chunk size");
                throw iOException;
            }
            IOException iOException = new IOException("Encountered invalid length while parsing WebP chunktype");
            throw iOException;
        }
        catch (EOFException eOFException) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Pair v(String pair) {
        boolean bl = pair.contains((CharSequence)",");
        int n4 = 1;
        Integer n3 = 2;
        Integer n2 = -1;
        if (bl) {
            Pair pair2;
            String[] stringArray = pair.split(",", -1);
            pair = pair2 = C.b.v(stringArray[0]);
            if ((Integer)pair2.first == 2) {
                return pair2;
            }
            while (n4 < stringArray.length) {
                pair2 = C.b.v(stringArray[n4]);
                int n5 = !((Integer)pair2.first).equals(pair.first) && !((Integer)pair2.second).equals(pair.first) ? -1 : (Integer)pair.first;
                int n6 = (Integer)pair.second != -1 && (((Integer)pair2.first).equals(pair.second) || ((Integer)pair2.second).equals(pair.second)) ? (Integer)pair.second : -1;
                if (n5 == -1 && n6 == -1) {
                    return new Pair((Object)n3, (Object)n2);
                }
                if (n5 == -1) {
                    pair = new Pair((Object)n6, (Object)n2);
                } else if (n6 == -1) {
                    pair = new Pair((Object)n5, (Object)n2);
                }
                ++n4;
            }
            return pair;
        }
        if (pair.contains((CharSequence)"/")) {
            if (((String[])(pair = pair.split("/", -1))).length != 2) return new Pair((Object)n3, (Object)n2);
            try {
                long l2 = (long)Double.parseDouble((String)pair[0]);
                long l3 = (long)Double.parseDouble((String)pair[1]);
                if (l2 < 0L) return new Pair((Object)10, (Object)n2);
                if (l3 < 0L) return new Pair((Object)10, (Object)n2);
                if (l2 > Integer.MAX_VALUE) return new Pair((Object)5, (Object)n2);
                if (l3 <= Integer.MAX_VALUE) return new Pair((Object)10, (Object)5);
                return new Pair((Object)5, (Object)n2);
            }
            catch (NumberFormatException numberFormatException) {
                return new Pair((Object)n3, (Object)n2);
            }
        }
        try {
            long l4 = Long.parseLong((String)pair);
            long l2 = l4 - 0L;
            n4 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
            if (n4 >= 0 && l4 <= 65535L) {
                return new Pair((Object)3, (Object)4);
            }
            if (n4 >= 0) return new Pair((Object)4, (Object)n2);
            return new Pair((Object)9, (Object)n2);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                Double.parseDouble((String)pair);
                return new Pair((Object)12, (Object)n2);
            }
            catch (NumberFormatException numberFormatException2) {
                return new Pair((Object)n3, (Object)n2);
            }
        }
    }

    private void w(b b2, HashMap object) {
        c c2 = (c)object.get((Object)"JPEGInterchangeFormat");
        object = (c)object.get((Object)"JPEGInterchangeFormatLength");
        if (c2 != null && object != null) {
            int n2 = c2.m(this.h);
            int n3 = object.m(this.h);
            int n4 = n2;
            if (this.d == 7) {
                n4 = n2 + this.q;
            }
            n2 = Math.min((int)n3, (int)(b2.c() - n4));
            if (n4 > 0 && n2 > 0) {
                this.i = true;
                if (this.a == null && this.c == null && this.b == null) {
                    object = new byte[n2];
                    b2.skip(n4);
                    b2.read((byte[])object);
                    this.n = (byte[])object;
                }
                this.l = n4;
                this.m = n2;
            }
            if (u) {
                b2 = new StringBuilder();
                b2.append("Setting thumbnail attributes with offset: ");
                b2.append(n4);
                b2.append(", length: ");
                b2.append(n2);
                Log.d((String)"ExifInterface", (String)b2.toString());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void x(b b2, HashMap object) {
        int n2;
        long l2;
        int n3;
        long[] lArray;
        Object object2;
        Object object3;
        block11: {
            object3 = (c)object.get((Object)"StripOffsets");
            object2 = (c)object.get((Object)"StripByteCounts");
            if (object3 == null) return;
            if (object2 == null) return;
            lArray = C.b.e(((c)object3).o(this.h));
            object2 = C.b.e(((c)object2).o(this.h));
            if (lArray != null && lArray.length != 0) {
                if (object2 != null && ((Object)object2).length != 0) {
                    if (lArray.length != ((Object)object2).length) {
                        Log.w((String)"ExifInterface", (String)"stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    n3 = ((Object)object2).length;
                    l2 = 0L;
                    for (n2 = 0; n2 < n3; l2 += object2[n2], ++n2) {
                    }
                    break block11;
                } else {
                    Log.w((String)"ExifInterface", (String)"stripByteCounts should not be null or have zero length.");
                    return;
                }
            }
            Log.w((String)"ExifInterface", (String)"stripOffsets should not be null or have zero length.");
            return;
        }
        int n4 = (int)l2;
        byte[] byArray = new byte[n4];
        this.k = true;
        this.j = true;
        this.i = true;
        n3 = 0;
        int n5 = 0;
        n2 = 0;
        while (true) {
            if (n3 >= lArray.length) {
                this.n = byArray;
                if (!this.k) return;
                this.l = (int)lArray[0];
                this.m = n4;
                return;
            }
            int n6 = (int)lArray[n3];
            int n7 = (int)object2[n3];
            if (n3 < lArray.length - 1 && (long)(n6 + n7) != lArray[n3 + 1]) {
                this.k = false;
            }
            if ((n6 -= n5) < 0) {
                Log.d((String)"ExifInterface", (String)"Invalid strip offset value");
                return;
            }
            l2 = n6;
            if (b2.skip(l2) != l2) {
                b2 = new StringBuilder();
                b2.append("Failed to skip ");
                b2.append(n6);
                b2.append(" bytes.");
                Log.d((String)"ExifInterface", (String)b2.toString());
                return;
            }
            object3 = new byte[n7];
            if (b2.read((byte[])object3) != n7) {
                b2 = new StringBuilder();
                b2.append("Failed to read ");
                b2.append(n7);
                b2.append(" bytes.");
                Log.d((String)"ExifInterface", (String)b2.toString());
                return;
            }
            n5 = n5 + n6 + n7;
            System.arraycopy((Object)object3, (int)0, (Object)byArray, (int)n2, (int)n7);
            n2 += n7;
            ++n3;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y(String string) {
        void var1_4;
        FileInputStream fileInputStream;
        block5: {
            FileInputStream fileInputStream2;
            if (string == null) {
                throw new NullPointerException("filename cannot be null");
            }
            fileInputStream = null;
            this.c = null;
            this.a = string;
            try {
                fileInputStream2 = new FileInputStream(string);
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                this.b = C.b.G(fileInputStream2.getFD()) ? fileInputStream2.getFD() : null;
            }
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
                break block5;
            }
            this.K((InputStream)fileInputStream2);
            C.b.c((Closeable)fileInputStream2);
            return;
        }
        C.b.c(fileInputStream);
        throw var1_4;
    }

    private static boolean z(BufferedInputStream object) {
        byte[] byArray = r0;
        object.mark(byArray.length);
        byArray = new byte[byArray.length];
        object.read(byArray);
        object.reset();
        for (int i2 = 0; i2 < ((BufferedInputStream)(object = (Object)r0)).length; ++i2) {
            if (byArray[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public void R(String object, String stringArray) {
        block44: {
            Object object2;
            Object object3;
            block46: {
                block45: {
                    object3 = stringArray;
                    if (object == null) break block44;
                    if ("DateTime".equals(object) || "DateTimeOriginal".equals(object)) break block45;
                    object2 = object3;
                    if (!"DateTimeDigitized".equals(object)) break block46;
                }
                object2 = object3;
                if (object3 != null) {
                    boolean bl = v0.matcher((CharSequence)object3).find();
                    boolean bl2 = w0.matcher((CharSequence)object3).find();
                    if (stringArray.length() == 19 && (bl || bl2)) {
                        object2 = object3;
                        if (bl2) {
                            object2 = object3.replaceAll("-", ":");
                        }
                    } else {
                        stringArray = new StringBuilder();
                        stringArray.append("Invalid value for ");
                        stringArray.append((String)object);
                        stringArray.append(" : ");
                        stringArray.append((String)object3);
                        Log.w((String)"ExifInterface", (String)stringArray.toString());
                        return;
                    }
                }
            }
            stringArray = object;
            if ("ISOSpeedRatings".equals(object)) {
                if (u) {
                    Log.d((String)"ExifInterface", (String)"setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                stringArray = "PhotographicSensitivity";
            }
            object = object2;
            if (object2 != null) {
                object = object2;
                if (o0.contains((Object)stringArray)) {
                    if (stringArray.equals((Object)"GPSTimeStamp")) {
                        object = u0.matcher((CharSequence)object2);
                        if (!object.find()) {
                            object = new StringBuilder();
                            object.append("Invalid value for ");
                            object.append((String)stringArray);
                            object.append(" : ");
                            object.append((String)object2);
                            Log.w((String)"ExifInterface", (String)object.toString());
                            return;
                        }
                        object2 = new StringBuilder();
                        object2.append(Integer.parseInt((String)object.group(1)));
                        object2.append("/1,");
                        object2.append(Integer.parseInt((String)object.group(2)));
                        object2.append("/1,");
                        object2.append(Integer.parseInt((String)object.group(3)));
                        object2.append("/1");
                        object = object2.toString();
                    } else {
                        try {
                            double d2 = Double.parseDouble((String)object2);
                            object = new e(d2);
                            object = ((e)object).toString();
                        }
                        catch (NumberFormatException numberFormatException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid value for ");
                            stringBuilder.append((String)stringArray);
                            stringBuilder.append(" : ");
                            stringBuilder.append((String)object2);
                            Log.w((String)"ExifInterface", (String)stringBuilder.toString());
                            return;
                        }
                    }
                }
            }
            block12: for (int i2 = 0; i2 < i0.length; ++i2) {
                StringBuilder stringBuilder;
                int n2;
                if (i2 == 4 && !this.i || (object2 = (d)n0[i2].get((Object)stringArray)) == null) continue;
                if (object == null) {
                    this.f[i2].remove((Object)stringArray);
                    continue;
                }
                Pair pair = C.b.v((String)object);
                if (object2.c != (Integer)pair.first && object2.c != (Integer)pair.second) {
                    n2 = object2.d;
                    if (n2 != -1 && (n2 == (Integer)pair.first || object2.d == (Integer)pair.second)) {
                        n2 = object2.d;
                    } else {
                        n2 = object2.c;
                        if (n2 != 1 && n2 != 7 && n2 != 2) {
                            if (!u) continue;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Given tag (");
                            stringBuilder.append((String)stringArray);
                            stringBuilder.append(") value didn't match with one of expected formats: ");
                            String[] stringArray2 = V;
                            stringBuilder.append(stringArray2[object2.c]);
                            n2 = object2.d;
                            object3 = "";
                            if (n2 == -1) {
                                object2 = "";
                            } else {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(", ");
                                stringBuilder2.append(stringArray2[object2.d]);
                                object2 = stringBuilder2.toString();
                            }
                            stringBuilder.append((String)object2);
                            stringBuilder.append(" (guess: ");
                            stringBuilder.append(stringArray2[(Integer)pair.first]);
                            if ((Integer)pair.second == -1) {
                                object2 = object3;
                            } else {
                                object2 = new StringBuilder();
                                object2.append(", ");
                                object2.append(stringArray2[(Integer)pair.second]);
                                object2 = object2.toString();
                            }
                            stringBuilder.append((String)object2);
                            stringBuilder.append(")");
                            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
                            continue;
                        }
                    }
                } else {
                    n2 = object2.c;
                }
                switch (n2) {
                    default: {
                        if (!u) continue block12;
                        object2 = new StringBuilder();
                        object2.append("Data format isn't one of expected formats: ");
                        object2.append(n2);
                        Log.d((String)"ExifInterface", (String)object2.toString());
                        continue block12;
                    }
                    case 12: {
                        object3 = object.split(",", -1);
                        object2 = new double[((String[])object3).length];
                        for (n2 = 0; n2 < ((Object[])object3).length; ++n2) {
                            object2[n2] = (StringBuilder)Double.parseDouble((String)object3[n2]);
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.b((double[])object2, this.h));
                        continue block12;
                    }
                    case 10: {
                        object2 = object.split(",", -1);
                        object3 = new e[((StringBuilder)object2).length];
                        for (n2 = 0; n2 < ((StringBuilder)object2).length; ++n2) {
                            stringBuilder = object2[n2].split("/", -1);
                            object3[n2] = new e((long)Double.parseDouble((String)stringBuilder[0]), (long)Double.parseDouble((String)stringBuilder[1]));
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.d((e[])object3, this.h));
                        continue block12;
                    }
                    case 9: {
                        object3 = object.split(",", -1);
                        object2 = new int[((String[])object3).length];
                        for (n2 = 0; n2 < ((Object[])object3).length; ++n2) {
                            object2[n2] = (StringBuilder)Integer.parseInt((String)object3[n2]);
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.c((int[])object2, this.h));
                        continue block12;
                    }
                    case 5: {
                        stringBuilder = object.split(",", -1);
                        object3 = new e[((String[])stringBuilder).length];
                        for (n2 = 0; n2 < ((String[])stringBuilder).length; ++n2) {
                            object2 = stringBuilder[n2].split("/", -1);
                            object3[n2] = new e((long)Double.parseDouble((String)object2[0]), (long)Double.parseDouble((String)object2[1]));
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.i((e[])object3, this.h));
                        continue block12;
                    }
                    case 4: {
                        object3 = object.split(",", -1);
                        object2 = new long[((String[])object3).length];
                        for (n2 = 0; n2 < ((Object[])object3).length; ++n2) {
                            object2[n2] = (StringBuilder)Long.parseLong((String)object3[n2]);
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.g((long[])object2, this.h));
                        continue block12;
                    }
                    case 3: {
                        object3 = object.split(",", -1);
                        object2 = new int[((String[])object3).length];
                        for (n2 = 0; n2 < ((Object[])object3).length; ++n2) {
                            object2[n2] = (StringBuilder)Integer.parseInt((String)object3[n2]);
                        }
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.k((int[])object2, this.h));
                        continue block12;
                    }
                    case 2: 
                    case 7: {
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.e((String)object));
                        continue block12;
                    }
                    case 1: {
                        this.f[i2].put((Object)stringArray, (Object)C.b$c.a((String)object));
                    }
                }
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public double f(double d2) {
        double d3 = this.h("GPSAltitude", -1.0);
        int n2 = -1;
        int n3 = this.i("GPSAltitudeRef", -1);
        if (d3 >= 0.0 && n3 >= 0) {
            if (n3 != 1) {
                n2 = 1;
            }
            return d3 * (double)n2;
        }
        return d2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String g(String stringBuilder) {
        if (stringBuilder == null) throw new NullPointerException("tag shouldn't be null");
        c c2 = this.j((String)stringBuilder);
        if (c2 == null) return null;
        if (!o0.contains((Object)stringBuilder)) {
            return c2.n(this.h);
        }
        if (stringBuilder.equals((Object)"GPSTimeStamp")) {
            int n2 = c2.a;
            if (n2 != 5 && n2 != 10) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("GPS Timestamp format is not rational. format=");
                stringBuilder.append(c2.a);
                Log.w((String)"ExifInterface", (String)stringBuilder.toString());
                return null;
            }
            stringBuilder = (StringBuilder)c2.o(this.h);
            if (stringBuilder != null && ((StringBuilder)stringBuilder).length == 3) {
                c2 = stringBuilder[0];
                int n3 = (int)((float)((e)((Object)c2)).a / (float)((e)((Object)c2)).b);
                c2 = stringBuilder[1];
                n2 = (int)((float)((e)((Object)c2)).a / (float)((e)((Object)c2)).b);
                stringBuilder = stringBuilder[2];
                return String.format((String)"%02d:%02d:%02d", (Object[])new Object[]{n3, n2, (int)((float)stringBuilder.a / (float)stringBuilder.b)});
            }
            c2 = new StringBuilder();
            c2.append("Invalid GPS Timestamp array. array=");
            c2.append(Arrays.toString((Object[])stringBuilder));
            Log.w((String)"ExifInterface", (String)c2.toString());
            return null;
        }
        try {
            return Double.toString((double)c2.l(this.h));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public double h(String object, double d2) {
        if (object != null) {
            if ((object = this.j((String)object)) == null) {
                return d2;
            }
            try {
                double d3 = ((c)object).l(this.h);
                return d3;
            }
            catch (NumberFormatException numberFormatException) {
                return d2;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int i(String object, int n2) {
        if (object != null) {
            if ((object = this.j((String)object)) == null) {
                return n2;
            }
            try {
                int n3 = ((c)object).m(this.h);
                return n3;
            }
            catch (NumberFormatException numberFormatException) {
                return n2;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public double[] m() {
        String string = this.g("GPSLatitude");
        String string2 = this.g("GPSLatitudeRef");
        String string3 = this.g("GPSLongitude");
        String string4 = this.g("GPSLongitudeRef");
        if (string != null && string2 != null && string3 != null && string4 != null) {
            double d2;
            double d3;
            try {
                d3 = C.b.d(string, string2);
                d2 = C.b.d(string3, string4);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Latitude/longitude values are not parsable. ");
                stringBuilder.append(String.format((String)"latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", (Object[])new Object[]{string, string2, string3, string4}));
                Log.w((String)"ExifInterface", (String)stringBuilder.toString());
            }
            return new double[]{d3, d2};
        }
        return null;
    }

    private static class b
    extends InputStream
    implements DataInput {
        private static final ByteOrder h = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder i = ByteOrder.BIG_ENDIAN;
        private DataInputStream d;
        private ByteOrder e = ByteOrder.BIG_ENDIAN;
        final int f;
        int g;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            int n2;
            inputStream = new DataInputStream(inputStream);
            this.d = inputStream;
            this.f = n2 = inputStream.available();
            this.g = 0;
            this.d.mark(n2);
            this.e = byteOrder;
        }

        public b(byte[] byArray) {
            this((InputStream)new ByteArrayInputStream(byArray));
        }

        public int available() {
            return this.d.available();
        }

        public int c() {
            return this.f;
        }

        public int f() {
            return this.g;
        }

        public void mark(int n2) {
            b b2 = this;
            synchronized (b2) {
                this.d.mark(n2);
                return;
            }
        }

        public long n() {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }

        public int read() {
            ++this.g;
            return this.d.read();
        }

        public int read(byte[] byArray, int n2, int n3) {
            n2 = this.d.read(byArray, n2, n3);
            this.g += n2;
            return n2;
        }

        public boolean readBoolean() {
            ++this.g;
            return this.d.readBoolean();
        }

        public byte readByte() {
            int n2;
            this.g = n2 = this.g + 1;
            if (n2 <= this.f) {
                n2 = this.d.read();
                if (n2 >= 0) {
                    return (byte)n2;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.g += 2;
            return this.d.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble((long)this.readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat((int)this.readInt());
        }

        public void readFully(byte[] byArray) {
            int n2;
            this.g = n2 = this.g + byArray.length;
            if (n2 <= this.f) {
                if (this.d.read(byArray, 0, byArray.length) == byArray.length) {
                    return;
                }
                throw new IOException("Couldn't read up to the length of buffer");
            }
            throw new EOFException();
        }

        public void readFully(byte[] byArray, int n2, int n3) {
            int n4;
            this.g = n4 = this.g + n3;
            if (n4 <= this.f) {
                if (this.d.read(byArray, n2, n3) == n3) {
                    return;
                }
                throw new IOException("Couldn't read up to the length of buffer");
            }
            throw new EOFException();
        }

        public int readInt() {
            int n2;
            this.g = n2 = this.g + 4;
            if (n2 <= this.f) {
                int n3;
                int n4;
                int n5 = this.d.read();
                if ((n5 | (n2 = this.d.read()) | (n4 = this.d.read()) | (n3 = this.d.read())) >= 0) {
                    ByteOrder byteOrder = this.e;
                    if (byteOrder == h) {
                        return (n3 << 24) + (n4 << 16) + (n2 << 8) + n5;
                    }
                    if (byteOrder == i) {
                        return (n5 << 24) + (n2 << 16) + (n4 << 8) + n3;
                    }
                    byteOrder = new StringBuilder();
                    byteOrder.append("Invalid byte order: ");
                    byteOrder.append((Object)this.e);
                    throw new IOException(byteOrder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d((String)"ExifInterface", (String)"Currently unsupported");
            return null;
        }

        public long readLong() {
            int n2;
            this.g = n2 = this.g + 8;
            if (n2 <= this.f) {
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9 = this.d.read();
                if ((n9 | (n8 = this.d.read()) | (n7 = this.d.read()) | (n6 = this.d.read()) | (n5 = this.d.read()) | (n4 = this.d.read()) | (n2 = this.d.read()) | (n3 = this.d.read())) >= 0) {
                    ByteOrder byteOrder = this.e;
                    if (byteOrder == h) {
                        return ((long)n3 << 56) + ((long)n2 << 48) + ((long)n4 << 40) + ((long)n5 << 32) + ((long)n6 << 24) + ((long)n7 << 16) + ((long)n8 << 8) + (long)n9;
                    }
                    if (byteOrder == i) {
                        return ((long)n9 << 56) + ((long)n8 << 48) + ((long)n7 << 40) + ((long)n6 << 32) + ((long)n5 << 24) + ((long)n4 << 16) + ((long)n2 << 8) + (long)n3;
                    }
                    byteOrder = new StringBuilder();
                    byteOrder.append("Invalid byte order: ");
                    byteOrder.append((Object)this.e);
                    throw new IOException(byteOrder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int n2;
            this.g = n2 = this.g + 2;
            if (n2 <= this.f) {
                int n3;
                n2 = this.d.read();
                if ((n2 | (n3 = this.d.read())) >= 0) {
                    ByteOrder byteOrder = this.e;
                    if (byteOrder == h) {
                        return (short)((n3 << 8) + n2);
                    }
                    if (byteOrder == i) {
                        return (short)((n2 << 8) + n3);
                    }
                    byteOrder = new StringBuilder();
                    byteOrder.append("Invalid byte order: ");
                    byteOrder.append((Object)this.e);
                    throw new IOException(byteOrder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.g += 2;
            return this.d.readUTF();
        }

        public int readUnsignedByte() {
            ++this.g;
            return this.d.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int n2;
            this.g = n2 = this.g + 2;
            if (n2 <= this.f) {
                int n3 = this.d.read();
                if ((n3 | (n2 = this.d.read())) >= 0) {
                    ByteOrder byteOrder = this.e;
                    if (byteOrder == h) {
                        return (n2 << 8) + n3;
                    }
                    if (byteOrder == i) {
                        return (n3 << 8) + n2;
                    }
                    byteOrder = new StringBuilder();
                    byteOrder.append("Invalid byte order: ");
                    byteOrder.append((Object)this.e);
                    throw new IOException(byteOrder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int n2) {
            int n3 = Math.min((int)n2, (int)(this.f - this.g));
            for (n2 = 0; n2 < n3; n2 += this.d.skipBytes(n3 - n2)) {
            }
            this.g += n2;
            return n2;
        }

        public void u(long l2) {
            int n2 = this.g;
            if ((long)n2 > l2) {
                this.g = 0;
                this.d.reset();
                this.d.mark(this.f);
            } else {
                l2 -= (long)n2;
            }
            n2 = (int)l2;
            if (this.skipBytes(n2) == n2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }

        public void x(ByteOrder byteOrder) {
            this.e = byteOrder;
        }
    }

    private static class c {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        c(int n2, int n3, long l2, byte[] byArray) {
            this.a = n2;
            this.b = n3;
            this.c = l2;
            this.d = byArray;
        }

        c(int n2, int n3, byte[] byArray) {
            this(n2, n3, -1L, byArray);
        }

        public static c a(String object) {
            if (object.length() == 1 && object.charAt(0) >= '0' && object.charAt(0) <= '1') {
                return new c(1, 1, new byte[]{(byte)(object.charAt(0) - 48)});
            }
            object = object.getBytes(q0);
            return new c(1, ((Object)object).length, (byte[])object);
        }

        public static c b(double[] dArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[12] * dArray.length]);
            byteBuffer.order(byteOrder);
            int n2 = dArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byteBuffer.putDouble(dArray[i2]);
            }
            return new c(12, dArray.length, byteBuffer.array());
        }

        public static c c(int[] nArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[9] * nArray.length]);
            byteBuffer.order(byteOrder);
            int n2 = nArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byteBuffer.putInt(nArray[i2]);
            }
            return new c(9, nArray.length, byteBuffer.array());
        }

        public static c d(e[] eArray, ByteOrder object) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[10] * eArray.length]);
            byteBuffer.order(object);
            int n2 = eArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = eArray[i2];
                byteBuffer.putInt((int)object.a);
                byteBuffer.putInt((int)object.b);
            }
            return new c(10, eArray.length, byteBuffer.array());
        }

        public static c e(String object) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append('\u0000');
            object = stringBuilder.toString().getBytes(q0);
            return new c(2, ((Object)object).length, (byte[])object);
        }

        public static c f(long l2, ByteOrder byteOrder) {
            return C.b$c.g(new long[]{l2}, byteOrder);
        }

        public static c g(long[] lArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[4] * lArray.length]);
            byteBuffer.order(byteOrder);
            int n2 = lArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byteBuffer.putInt((int)lArray[i2]);
            }
            return new c(4, lArray.length, byteBuffer.array());
        }

        public static c h(e e2, ByteOrder byteOrder) {
            return C.b$c.i(new e[]{e2}, byteOrder);
        }

        public static c i(e[] eArray, ByteOrder object) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[5] * eArray.length]);
            byteBuffer.order(object);
            int n2 = eArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = eArray[i2];
                byteBuffer.putInt((int)object.a);
                byteBuffer.putInt((int)object.b);
            }
            return new c(5, eArray.length, byteBuffer.array());
        }

        public static c j(int n2, ByteOrder byteOrder) {
            return C.b$c.k(new int[]{n2}, byteOrder);
        }

        public static c k(int[] nArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])new byte[W[3] * nArray.length]);
            byteBuffer.order(byteOrder);
            int n2 = nArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byteBuffer.putShort((short)nArray[i2]);
            }
            return new c(3, nArray.length, byteBuffer.array());
        }

        public double l(ByteOrder eArray) {
            if ((eArray = this.o((ByteOrder)eArray)) != null) {
                if (eArray instanceof String) {
                    return Double.parseDouble((String)((String)eArray));
                }
                if (eArray instanceof long[]) {
                    if ((eArray = (e[])((long[])eArray)).length == 1) {
                        return (double)eArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (eArray instanceof int[]) {
                    if ((eArray = (e[])((int[])eArray)).length == 1) {
                        return (double)eArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (eArray instanceof double[]) {
                    if ((eArray = (e[])((double[])eArray)).length == 1) {
                        return (double)eArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (eArray instanceof e[]) {
                    if ((eArray = (e[])eArray).length == 1) {
                        return eArray[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder object) {
            if ((object = this.o((ByteOrder)object)) != null) {
                if (object instanceof String) {
                    return Integer.parseInt((String)((String)object));
                }
                if (object instanceof long[]) {
                    if (((ByteOrder)(object = (Object)((long[])object))).length == 1) {
                        return (int)object[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (object instanceof int[]) {
                    if (((ByteOrder)(object = (Object)((int[])object))).length == 1) {
                        return (int)object[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder byteOrder) {
            Object object = this.o(byteOrder);
            if (object == null) {
                return null;
            }
            if (object instanceof String) {
                return (String)object;
            }
            byteOrder = new StringBuilder();
            boolean bl = object instanceof long[];
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (bl) {
                object = (long[])object;
                n3 = n5;
                while (n3 < ((Object)object).length) {
                    byteOrder.append((long)object[n3]);
                    n3 = n4 = n3 + 1;
                    if (n4 == ((e[])object).length) continue;
                    byteOrder.append(",");
                    n3 = n4;
                }
                return byteOrder.toString();
            }
            if (object instanceof int[]) {
                object = (int[])object;
                n3 = n2;
                while (n3 < ((Object)object).length) {
                    byteOrder.append((int)object[n3]);
                    n3 = n4 = n3 + 1;
                    if (n4 == ((e[])object).length) continue;
                    byteOrder.append(",");
                    n3 = n4;
                }
                return byteOrder.toString();
            }
            if (object instanceof double[]) {
                object = (double[])object;
                while (n3 < ((Object)object).length) {
                    byteOrder.append((double)object[n3]);
                    n3 = n4 = n3 + 1;
                    if (n4 == ((e[])object).length) continue;
                    byteOrder.append(",");
                    n3 = n4;
                }
                return byteOrder.toString();
            }
            if (object instanceof e[]) {
                object = object;
                n3 = n4;
                while (n3 < ((e[])object).length) {
                    byteOrder.append(object[n3].a);
                    byteOrder.append('/');
                    byteOrder.append(object[n3].b);
                    n3 = n4 = n3 + 1;
                    if (n4 == ((e[])object).length) continue;
                    byteOrder.append(",");
                    n3 = n4;
                }
                return byteOrder.toString();
            }
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        Object o(ByteOrder var1_1) {
            block74: {
                block75: {
                    block76: {
                        var5_5 = 0;
                        var9_6 = 0;
                        var8_7 = 0;
                        var7_8 = 0;
                        var4_9 = 0;
                        var2_10 /* !! */  = 0;
                        var6_11 = 0;
                        var3_12 = 0;
                        var10_13 = 0;
                        var12_14 /* !! */  = null;
                        var13_27 = new b(this.d);
                        var12_14 /* !! */  = var13_27;
                        ** try [egrp 1[TRYBLOCK] [3, 2 : 46->62)] { 
lbl15:
                        // 1 sources

                        break block76;
lbl16:
                        // 1 sources

                        catch (Throwable var13_28) {
                            var1_1 /* !! */  = var12_14 /* !! */ ;
                            break block74;
                        }
lbl19:
                        // 1 sources

                        catch (IOException var12_15) {
                            var1_1 /* !! */  = var13_27;
                            var13_27 = var12_15;
                            break block75;
                        }
                        catch (Throwable var13_29) {
                            var1_1 /* !! */  = var12_14 /* !! */ ;
                            break block74;
                        }
                        catch (IOException var13_30) {
                            var1_1 /* !! */  = null;
                            break block75;
                        }
                    }
                    var13_27.x((ByteOrder)var1_1 /* !! */ );
                    var12_14 /* !! */  = var13_27;
                    var11_32 = this.a;
                    switch (var11_32) {
                        default: {
                            try {
                                var13_27.close();
                                return null;
                            }
                            catch (IOException var1_2) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_2);
                            }
                            return null;
                        }
                        case 12: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new double[this.b];
                                var2_10 /* !! */  = var10_13;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)var13_27.readDouble();
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_16) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_16);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 11: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new double[this.b];
                                var2_10 /* !! */  = var5_5;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)((double)var13_27.readFloat());
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_17) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_17);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 10: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = new e[this.b];
                                var2_10 /* !! */  = var9_6;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = new e(var13_27.readInt(), var13_27.readInt());
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_18) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_18);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 9: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new int[this.b];
                                var2_10 /* !! */  = var8_7;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)var13_27.readInt();
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_19) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_19);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 8: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new int[this.b];
                                var2_10 /* !! */  = var7_8;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)var13_27.readShort();
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_20) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_20);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 5: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = new e[this.b];
                                var2_10 /* !! */  = var4_9;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = new e(var13_27.n(), var13_27.n());
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_21) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_21);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 4: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new long[this.b];
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)var13_27.n();
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_22) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_22);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 3: {
                            var12_14 /* !! */  = var13_27;
                            {
                                var1_1 /* !! */  = (StringBuilder)new int[this.b];
                                var2_10 /* !! */  = var6_11;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */ [var2_10 /* !! */ ] = (StringBuilder)var13_27.readUnsignedShort();
                                    ++var2_10 /* !! */ ;
                                }
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_23) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_23);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 2: 
                        case 7: {
                            var12_14 /* !! */  = var13_27;
                            var2_10 /* !! */  = var3_12;
                            {
                                if (this.b < C.b.X.length) ** GOTO lbl203
                                var2_10 /* !! */  = 0;
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    var1_1 /* !! */  = (StringBuilder)C.b.X;
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= ((StringBuilder)var1_1 /* !! */ ).length) break;
                                    var12_14 /* !! */  = var13_27;
                                    if (this.d[var2_10 /* !! */ ] == var1_1 /* !! */ [var2_10 /* !! */ ]) ** GOTO lbl199
                                    var2_10 /* !! */  = var3_12;
                                    ** GOTO lbl203
lbl199:
                                    // 1 sources

                                    ++var2_10 /* !! */ ;
                                }
                                var12_14 /* !! */  = var13_27;
                            }
                            {
                                var2_10 /* !! */  = ((StringBuilder)var1_1 /* !! */ ).length;
lbl203:
                                // 3 sources

                                var12_14 /* !! */  = var13_27;
                                var12_14 /* !! */  = var13_27;
                                var1_1 /* !! */  = new StringBuilder();
                                while (true) {
                                    var12_14 /* !! */  = var13_27;
                                    if (var2_10 /* !! */  >= this.b) break;
                                    var12_14 /* !! */  = var13_27;
                                    var3_12 = this.d[var2_10 /* !! */ ];
                                    if (var3_12 == 0) break;
                                    if (var3_12 >= 32) {
                                        var12_14 /* !! */  = var13_27;
                                        var1_1 /* !! */ .append((char)var3_12);
                                    } else {
                                        var12_14 /* !! */  = var13_27;
                                        var1_1 /* !! */ .append('?');
                                    }
                                    ++var2_10 /* !! */ ;
                                }
                                var12_14 /* !! */  = var13_27;
                            }
                            {
                                var1_1 /* !! */  = var1_1 /* !! */ .toString();
                            }
                            try {
                                var13_27.close();
                                return var1_1 /* !! */ ;
                            }
                            catch (IOException var12_24) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_24);
                            }
                            return var1_1 /* !! */ ;
                        }
                        case 1: 
                        case 6: 
                    }
                    var12_14 /* !! */  = var13_27;
                    {
                        var1_1 /* !! */  = (StringBuilder)this.d;
                        var12_14 /* !! */  = var13_27;
                    }
                    if (((e[])var1_1 /* !! */ ).length == 1 && (var2_10 /* !! */  = (int)var1_1 /* !! */ [0]) >= 0 && var2_10 /* !! */  <= 1) {
                        var12_14 /* !! */  = var13_27;
                        {
                            var1_1 /* !! */  = new String(new char[]{(char)(var2_10 /* !! */  + 48)});
                        }
                        try {
                            var13_27.close();
                            return var1_1 /* !! */ ;
                        }
                        catch (IOException var12_25) {
                            Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_25);
                        }
                        return var1_1 /* !! */ ;
                    }
                    var12_14 /* !! */  = var13_27;
                    {
                        var1_1 /* !! */  = new String((byte[])var1_1 /* !! */ , C.b.q0);
                    }
                    try {
                        var13_27.close();
                        return var1_1 /* !! */ ;
                    }
                    catch (IOException var12_26) {
                        Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_26);
                    }
                    return var1_1 /* !! */ ;
                }
                var12_14 /* !! */  = var1_1 /* !! */ ;
                {
                    Log.w((String)"ExifInterface", (String)"IOException occurred during reading a value", (Throwable)var13_27);
                    if (var1_1 /* !! */  == null) return null;
                }
                try {
                    var1_1 /* !! */ .close();
                    return null;
                }
                catch (IOException var1_3) {
                    Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_3);
                }
                return null;
            }
            if (var1_1 /* !! */  == null) throw var13_31;
            try {
                var1_1 /* !! */ .close();
                throw var13_31;
            }
            catch (IOException var1_4) {
                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_4);
            }
            throw var13_31;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(V[this.a]);
            stringBuilder.append(", data length:");
            stringBuilder.append(this.d.length);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        d(String string, int n2, int n3) {
            this.b = string;
            this.a = n2;
            this.c = n3;
            this.d = -1;
        }

        d(String string, int n2, int n3, int n4) {
            this.b = string;
            this.a = n2;
            this.c = n3;
            this.d = n4;
        }

        boolean a(int n2) {
            int n3;
            int n4 = this.c;
            if (n4 != 7 && n2 != 7 && n4 != n2 && (n3 = this.d) != n2) {
                if ((n4 == 4 || n3 == 4) && n2 == 3) {
                    return true;
                }
                if ((n4 == 9 || n3 == 9) && n2 == 8) {
                    return true;
                }
                return (n4 == 12 || n3 == 12) && n2 == 11;
            }
            return true;
        }
    }

    private static class e {
        public final long a;
        public final long b;

        e(double d2) {
            this((long)(d2 * 10000.0), 10000L);
        }

        e(long l2, long l3) {
            if (l3 == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = l2;
            this.b = l3;
        }

        public double a() {
            return (double)this.a / (double)this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("/");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }
}

