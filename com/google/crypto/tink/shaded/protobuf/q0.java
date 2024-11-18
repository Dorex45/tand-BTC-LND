/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.q0$b$a
 *  com.google.crypto.tink.shaded.protobuf.q0$b$b
 *  com.google.crypto.tink.shaded.protobuf.q0$b$c
 *  com.google.crypto.tink.shaded.protobuf.q0$b$d
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.q0;

public abstract class q0 {
    static final int a = q0.c(1, 3);
    static final int b = q0.c(1, 4);
    static final int c = q0.c(2, 0);
    static final int d = q0.c(3, 2);

    public static int a(int n2) {
        return n2 >>> 3;
    }

    public static int b(int n2) {
        return n2 & 7;
    }

    static int c(int n2, int n3) {
        return n2 << 3 | n3;
    }

    public static class com.google.crypto.tink.shaded.protobuf.q0$b
    extends Enum {
        private static final com.google.crypto.tink.shaded.protobuf.q0$b[] $VALUES;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b BOOL;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b BYTES;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b DOUBLE;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b ENUM;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b FIXED32;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b FIXED64;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b FLOAT;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b GROUP;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b INT32;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b INT64;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b MESSAGE;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b SFIXED32;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b SFIXED64;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b SINT32;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b SINT64;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b STRING;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b UINT32;
        public static final /* enum */ com.google.crypto.tink.shaded.protobuf.q0$b UINT64;
        private final com.google.crypto.tink.shaded.protobuf.q0$c javaType;
        private final int wireType;

        static {
            com.google.crypto.tink.shaded.protobuf.q0$b b2;
            com.google.crypto.tink.shaded.protobuf.q0$b b3;
            com.google.crypto.tink.shaded.protobuf.q0$b b4;
            com.google.crypto.tink.shaded.protobuf.q0$b b5;
            com.google.crypto.tink.shaded.protobuf.q0$b b6;
            com.google.crypto.tink.shaded.protobuf.q0$b b7;
            com.google.crypto.tink.shaded.protobuf.q0$b b8;
            com.google.crypto.tink.shaded.protobuf.q0$b b9;
            com.google.crypto.tink.shaded.protobuf.q0$b b10;
            com.google.crypto.tink.shaded.protobuf.q0$b b11;
            com.google.crypto.tink.shaded.protobuf.q0$b b12;
            DOUBLE = b12 = new com.google.crypto.tink.shaded.protobuf.q0$b("DOUBLE", 0, com.google.crypto.tink.shaded.protobuf.q0$c.DOUBLE, 1);
            FLOAT = b11 = new com.google.crypto.tink.shaded.protobuf.q0$b("FLOAT", 1, com.google.crypto.tink.shaded.protobuf.q0$c.FLOAT, 5);
            Enum enum_ = com.google.crypto.tink.shaded.protobuf.q0$c.LONG;
            INT64 = b10 = new com.google.crypto.tink.shaded.protobuf.q0$b("INT64", 2, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_, 0);
            UINT64 = b9 = new com.google.crypto.tink.shaded.protobuf.q0$b("UINT64", 3, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_, 0);
            Enum enum_2 = com.google.crypto.tink.shaded.protobuf.q0$c.INT;
            INT32 = b8 = new com.google.crypto.tink.shaded.protobuf.q0$b("INT32", 4, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_2, 0);
            FIXED64 = b7 = new com.google.crypto.tink.shaded.protobuf.q0$b("FIXED64", 5, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_, 1);
            FIXED32 = b6 = new com.google.crypto.tink.shaded.protobuf.q0$b("FIXED32", 6, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_2, 5);
            BOOL = b5 = new com.google.crypto.tink.shaded.protobuf.q0$b("BOOL", 7, com.google.crypto.tink.shaded.protobuf.q0$c.BOOLEAN, 0);
            a a2 = new a("STRING", 8, com.google.crypto.tink.shaded.protobuf.q0$c.STRING, 2);
            STRING = a2;
            Enum enum_3 = com.google.crypto.tink.shaded.protobuf.q0$c.MESSAGE;
            b b13 = new b("GROUP", 9, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_3, 3);
            GROUP = b13;
            c c2 = new c("MESSAGE", 10, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_3, 2);
            MESSAGE = c2;
            d d2 = new d("BYTES", 11, com.google.crypto.tink.shaded.protobuf.q0$c.BYTE_STRING, 2);
            BYTES = d2;
            UINT32 = b4 = new com.google.crypto.tink.shaded.protobuf.q0$b("UINT32", 12, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_2, 0);
            ENUM = b3 = new com.google.crypto.tink.shaded.protobuf.q0$b("ENUM", 13, com.google.crypto.tink.shaded.protobuf.q0$c.ENUM, 0);
            SFIXED32 = b2 = new com.google.crypto.tink.shaded.protobuf.q0$b("SFIXED32", 14, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_2, 5);
            SFIXED64 = enum_3 = new com.google.crypto.tink.shaded.protobuf.q0$b("SFIXED64", 15, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_, 1);
            SINT32 = enum_2 = new com.google.crypto.tink.shaded.protobuf.q0$b("SINT32", 16, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_2, 0);
            SINT64 = enum_ = new com.google.crypto.tink.shaded.protobuf.q0$b("SINT64", 17, (com.google.crypto.tink.shaded.protobuf.q0$c)enum_, 0);
            $VALUES = new com.google.crypto.tink.shaded.protobuf.q0$b[]{b12, b11, b10, b9, b8, b7, b6, b5, a2, b13, c2, d2, b4, b3, b2, enum_3, enum_2, enum_};
        }

        /*
         * WARNING - void declaration
         */
        private com.google.crypto.tink.shaded.protobuf.q0$b() {
            void var4_2;
            void var3_1;
            void var2_-1;
            void var1_-1;
            this.javaType = var3_1;
            this.wireType = var4_2;
        }

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        /* synthetic */ com.google.crypto.tink.shaded.protobuf.q0$b(com.google.crypto.tink.shaded.protobuf.q0$c c2, int n2, com.google.crypto.tink.shaded.protobuf.q0$a a2) {
            this((String)var1_-1, n2, (com.google.crypto.tink.shaded.protobuf.q0$c)((Object)a2), (int)var4_3);
            void var4_3;
            void var1_-1;
        }

        public static com.google.crypto.tink.shaded.protobuf.q0$b valueOf(String string) {
            return (com.google.crypto.tink.shaded.protobuf.q0$b)Enum.valueOf(com.google.crypto.tink.shaded.protobuf.q0$b.class, (String)string);
        }

        public static com.google.crypto.tink.shaded.protobuf.q0$b[] values() {
            return (com.google.crypto.tink.shaded.protobuf.q0$b[])$VALUES.clone();
        }
    }

    public static final class c
    extends Enum {
        private static final c[] $VALUES;
        public static final /* enum */ c BOOLEAN;
        public static final /* enum */ c BYTE_STRING;
        public static final /* enum */ c DOUBLE;
        public static final /* enum */ c ENUM;
        public static final /* enum */ c FLOAT;
        public static final /* enum */ c INT;
        public static final /* enum */ c LONG;
        public static final /* enum */ c MESSAGE;
        public static final /* enum */ c STRING;
        private final Object defaultDefault;

        static {
            c c2;
            c c3;
            c c4;
            c c5;
            c c6;
            c c7;
            c c8;
            c c9;
            c c10;
            INT = c10 = new c("INT", 0, (Object)0);
            LONG = c9 = new c("LONG", 1, (Object)0L);
            FLOAT = c8 = new c("FLOAT", 2, (Object)Float.valueOf((float)0.0f));
            DOUBLE = c7 = new c("DOUBLE", 3, (Object)0.0);
            BOOLEAN = c6 = new c("BOOLEAN", 4, (Object)Boolean.FALSE);
            STRING = c5 = new c("STRING", 5, (Object)"");
            BYTE_STRING = c4 = new c("BYTE_STRING", 6, (Object)h.e);
            ENUM = c3 = new c("ENUM", 7, null);
            MESSAGE = c2 = new c("MESSAGE", 8, null);
            $VALUES = new c[]{c10, c9, c8, c7, c6, c5, c4, c3, c2};
        }

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        private c() {
            void var3_1;
            void var2_-1;
            void var1_-1;
            this.defaultDefault = var3_1;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])$VALUES.clone();
        }
    }
}

