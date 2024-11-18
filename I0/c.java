/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package i0;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class c {
    private static final ClassLoader a = c.class.getClassLoader();

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int n2 = parcel.dataAvail();
        if (n2 <= 0) {
            return;
        }
        parcel = new StringBuilder();
        parcel.append("Parcel data not fully consumed, unread size: ");
        parcel.append(n2);
        throw new BadParcelableException(parcel.toString());
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
            return;
        }
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}

