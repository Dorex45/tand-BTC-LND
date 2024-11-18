/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.mlkit.common.internal;

import T0.i;
import Y.p;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class MlKitInitProvider
extends ContentProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        p.l(providerInfo.authority.equals((Object)"com.google.mlkit.common.mlkitinitprovider") ^ true, "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = this.getContext();
        if (context == null) {
            Log.i((String)"MlKitInitProvider", (String)"No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        i.d(context);
        return false;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

