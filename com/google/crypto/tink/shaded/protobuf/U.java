/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.B;
import java.lang.reflect.Type;

public final class u
extends Enum {
    private static final u[] $VALUES;
    public static final /* enum */ u BOOL;
    public static final /* enum */ u BOOL_LIST;
    public static final /* enum */ u BOOL_LIST_PACKED;
    public static final /* enum */ u BYTES;
    public static final /* enum */ u BYTES_LIST;
    public static final /* enum */ u DOUBLE;
    public static final /* enum */ u DOUBLE_LIST;
    public static final /* enum */ u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final /* enum */ u ENUM;
    public static final /* enum */ u ENUM_LIST;
    public static final /* enum */ u ENUM_LIST_PACKED;
    public static final /* enum */ u FIXED32;
    public static final /* enum */ u FIXED32_LIST;
    public static final /* enum */ u FIXED32_LIST_PACKED;
    public static final /* enum */ u FIXED64;
    public static final /* enum */ u FIXED64_LIST;
    public static final /* enum */ u FIXED64_LIST_PACKED;
    public static final /* enum */ u FLOAT;
    public static final /* enum */ u FLOAT_LIST;
    public static final /* enum */ u FLOAT_LIST_PACKED;
    public static final /* enum */ u GROUP;
    public static final /* enum */ u GROUP_LIST;
    public static final /* enum */ u INT32;
    public static final /* enum */ u INT32_LIST;
    public static final /* enum */ u INT32_LIST_PACKED;
    public static final /* enum */ u INT64;
    public static final /* enum */ u INT64_LIST;
    public static final /* enum */ u INT64_LIST_PACKED;
    public static final /* enum */ u MAP;
    public static final /* enum */ u MESSAGE;
    public static final /* enum */ u MESSAGE_LIST;
    public static final /* enum */ u SFIXED32;
    public static final /* enum */ u SFIXED32_LIST;
    public static final /* enum */ u SFIXED32_LIST_PACKED;
    public static final /* enum */ u SFIXED64;
    public static final /* enum */ u SFIXED64_LIST;
    public static final /* enum */ u SFIXED64_LIST_PACKED;
    public static final /* enum */ u SINT32;
    public static final /* enum */ u SINT32_LIST;
    public static final /* enum */ u SINT32_LIST_PACKED;
    public static final /* enum */ u SINT64;
    public static final /* enum */ u SINT64_LIST;
    public static final /* enum */ u SINT64_LIST_PACKED;
    public static final /* enum */ u STRING;
    public static final /* enum */ u STRING_LIST;
    public static final /* enum */ u UINT32;
    public static final /* enum */ u UINT32_LIST;
    public static final /* enum */ u UINT32_LIST_PACKED;
    public static final /* enum */ u UINT64;
    public static final /* enum */ u UINT64_LIST;
    public static final /* enum */ u UINT64_LIST_PACKED;
    private static final u[] VALUES;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final B javaType;
    private final boolean primitiveScalar;

    static {
        u u2;
        u u3;
        u u4;
        u u5;
        u u6;
        u u7;
        u u8;
        u u9;
        u u10;
        u u11;
        u u12;
        u u13;
        u u14;
        u u15;
        u u16;
        u u17;
        u u18;
        u u19;
        u u20;
        u u21;
        u u22;
        u u23;
        u u24;
        u u25;
        u u26;
        u u27;
        u u28;
        u u29;
        u u30;
        u u31;
        u u32;
        u u33;
        u u34;
        u u35;
        u u36;
        u u37;
        u u38;
        u u39;
        u u40;
        Enum enum_ = b.SCALAR;
        Enum enum_2 = B.DOUBLE;
        DOUBLE = u40 = new u("DOUBLE", 0, 0, (b)enum_, (B)enum_2);
        Enum enum_3 = B.FLOAT;
        FLOAT = u39 = new u("FLOAT", 1, 1, (b)enum_, (B)enum_3);
        Enum enum_4 = B.LONG;
        INT64 = u38 = new u("INT64", 2, 2, (b)enum_, (B)enum_4);
        UINT64 = u37 = new u("UINT64", 3, 3, (b)enum_, (B)enum_4);
        Enum enum_5 = B.INT;
        INT32 = u36 = new u("INT32", 4, 4, (b)enum_, (B)enum_5);
        FIXED64 = u35 = new u("FIXED64", 5, 5, (b)enum_, (B)enum_4);
        FIXED32 = u34 = new u("FIXED32", 6, 6, (b)enum_, (B)enum_5);
        Enum enum_6 = B.BOOLEAN;
        BOOL = u33 = new u("BOOL", 7, 7, (b)enum_, (B)enum_6);
        Enum enum_7 = B.STRING;
        STRING = u32 = new u("STRING", 8, 8, (b)enum_, (B)enum_7);
        Enum enum_8 = B.MESSAGE;
        MESSAGE = u31 = new u("MESSAGE", 9, 9, (b)enum_, (B)enum_8);
        Enum enum_9 = B.BYTE_STRING;
        BYTES = u30 = new u("BYTES", 10, 10, (b)enum_, (B)enum_9);
        u[] uArray = new u("UINT32", 11, 11, (b)enum_, (B)enum_5);
        UINT32 = uArray;
        Enum enum_10 = B.ENUM;
        ENUM = u29 = new u("ENUM", 12, 12, (b)enum_, (B)enum_10);
        SFIXED32 = u28 = new u("SFIXED32", 13, 13, (b)enum_, (B)enum_5);
        SFIXED64 = u27 = new u("SFIXED64", 14, 14, (b)enum_, (B)enum_4);
        SINT32 = u26 = new u("SINT32", 15, 15, (b)enum_, (B)enum_5);
        SINT64 = u25 = new u("SINT64", 16, 16, (b)enum_, (B)enum_4);
        GROUP = u24 = new u("GROUP", 17, 17, (b)enum_, (B)enum_8);
        Enum enum_11 = b.VECTOR;
        DOUBLE_LIST = u23 = new u("DOUBLE_LIST", 18, 18, (b)enum_11, (B)enum_2);
        FLOAT_LIST = enum_ = new u("FLOAT_LIST", 19, 19, (b)enum_11, (B)enum_3);
        INT64_LIST = u22 = new u("INT64_LIST", 20, 20, (b)enum_11, (B)enum_4);
        UINT64_LIST = u21 = new u("UINT64_LIST", 21, 21, (b)enum_11, (B)enum_4);
        INT32_LIST = u20 = new u("INT32_LIST", 22, 22, (b)enum_11, (B)enum_5);
        FIXED64_LIST = u19 = new u("FIXED64_LIST", 23, 23, (b)enum_11, (B)enum_4);
        FIXED32_LIST = u18 = new u("FIXED32_LIST", 24, 24, (b)enum_11, (B)enum_5);
        BOOL_LIST = u17 = new u("BOOL_LIST", 25, 25, (b)enum_11, (B)enum_6);
        STRING_LIST = enum_7 = new u("STRING_LIST", 26, 26, (b)enum_11, (B)enum_7);
        MESSAGE_LIST = u16 = new u("MESSAGE_LIST", 27, 27, (b)enum_11, (B)enum_8);
        BYTES_LIST = u15 = new u("BYTES_LIST", 28, 28, (b)enum_11, (B)enum_9);
        UINT32_LIST = u14 = new u("UINT32_LIST", 29, 29, (b)enum_11, (B)enum_5);
        ENUM_LIST = u13 = new u("ENUM_LIST", 30, 30, (b)enum_11, (B)enum_10);
        SFIXED32_LIST = u12 = new u("SFIXED32_LIST", 31, 31, (b)enum_11, (B)enum_5);
        SFIXED64_LIST = u11 = new u("SFIXED64_LIST", 32, 32, (b)enum_11, (B)enum_4);
        SINT32_LIST = enum_9 = new u("SINT32_LIST", 33, 33, (b)enum_11, (B)enum_5);
        SINT64_LIST = u10 = new u("SINT64_LIST", 34, 34, (b)enum_11, (B)enum_4);
        b b2 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = enum_2 = new u("DOUBLE_LIST_PACKED", 35, 35, b2, (B)enum_2);
        FLOAT_LIST_PACKED = enum_3 = new u("FLOAT_LIST_PACKED", 36, 36, b2, (B)enum_3);
        INT64_LIST_PACKED = u9 = new u("INT64_LIST_PACKED", 37, 37, b2, (B)enum_4);
        UINT64_LIST_PACKED = u8 = new u("UINT64_LIST_PACKED", 38, 38, b2, (B)enum_4);
        INT32_LIST_PACKED = u7 = new u("INT32_LIST_PACKED", 39, 39, b2, (B)enum_5);
        FIXED64_LIST_PACKED = u6 = new u("FIXED64_LIST_PACKED", 40, 40, b2, (B)enum_4);
        FIXED32_LIST_PACKED = u5 = new u("FIXED32_LIST_PACKED", 41, 41, b2, (B)enum_5);
        BOOL_LIST_PACKED = enum_6 = new u("BOOL_LIST_PACKED", 42, 42, b2, (B)enum_6);
        UINT32_LIST_PACKED = u4 = new u("UINT32_LIST_PACKED", 43, 43, b2, (B)enum_5);
        ENUM_LIST_PACKED = u3 = new u("ENUM_LIST_PACKED", 44, 44, b2, (B)enum_10);
        SFIXED32_LIST_PACKED = enum_10 = new u("SFIXED32_LIST_PACKED", 45, 45, b2, (B)enum_5);
        SFIXED64_LIST_PACKED = u2 = new u("SFIXED64_LIST_PACKED", 46, 46, b2, (B)enum_4);
        SINT32_LIST_PACKED = enum_5 = new u("SINT32_LIST_PACKED", 47, 47, b2, (B)enum_5);
        SINT64_LIST_PACKED = enum_4 = new u("SINT64_LIST_PACKED", 48, 48, b2, (B)enum_4);
        GROUP_LIST = enum_8 = new u("GROUP_LIST", 49, 49, (b)enum_11, (B)enum_8);
        MAP = enum_11 = new u("MAP", 50, 50, b.MAP, B.VOID);
        $VALUES = new u[]{u40, u39, u38, u37, u36, u35, u34, u33, u32, u31, u30, uArray, u29, u28, u27, u26, u25, u24, u23, enum_, u22, u21, u20, u19, u18, u17, enum_7, u16, u15, u14, u13, u12, u11, enum_9, u10, enum_2, enum_3, u9, u8, u7, u6, u5, enum_6, u4, u3, enum_10, u2, enum_5, enum_4, enum_8, enum_11};
        EMPTY_TYPES = new Type[0];
        uArray = u.values();
        VALUES = new u[uArray.length];
        int n2 = uArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            u.VALUES[u35.id] = u35 = uArray[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private u(B b2) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.id = (int)b2;
        this.collection = var4_2;
        this.javaType = var5_3;
        int n3 = a.a[var4_2.ordinal()];
        boolean bl = true;
        this.elementType = n3 != 1 ? (n3 != 2 ? null : var5_3.a()) : var5_3.a();
        if (var4_2 != b.SCALAR || (n3 = a.b[var5_3.ordinal()]) == 1 || n3 == 2 || n3 == 3) {
            bl = false;
        }
        this.primitiveScalar = bl;
    }

    public static u valueOf(String string) {
        return (u)Enum.valueOf(u.class, (String)string);
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    public int a() {
        return this.id;
    }

    static final class b
    extends Enum {
        private static final b[] $VALUES;
        public static final /* enum */ b MAP;
        public static final /* enum */ b PACKED_VECTOR;
        public static final /* enum */ b SCALAR;
        public static final /* enum */ b VECTOR;
        private final boolean isList;

        static {
            b b2;
            b b3;
            b b4;
            b b5;
            SCALAR = b5 = new b("SCALAR", 0, false);
            VECTOR = b4 = new b("VECTOR", 1, true);
            PACKED_VECTOR = b3 = new b("PACKED_VECTOR", 2, true);
            MAP = b2 = new b("MAP", 3, false);
            $VALUES = new b[]{b5, b4, b3, b2};
        }

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        private b() {
            void var3_1;
            void var2_-1;
            void var1_-1;
            this.isList = var3_1;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])$VALUES.clone();
        }
    }
}

