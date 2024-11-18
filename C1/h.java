/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.content.pm.SigningInfo
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.HashMap
 *  kotlin.jvm.internal.i
 *  y1.b
 */
package c1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import c1.b;
import c1.c;
import c1.d;
import c1.e;
import c1.f;
import c1.g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import l1.a;
import p1.j;
import p1.k;

public final class h
implements k.c,
l1.a {
    public static final a c = new Object(null){
        {
            this();
        }
    };
    private Context a;
    private k b;

    private final String a(byte[] byArray) {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        cArray[0] = 48;
        cArray2[1] = 49;
        cArray2[2] = 50;
        cArray2[3] = 51;
        cArray2[4] = 52;
        cArray2[5] = 53;
        cArray2[6] = 54;
        cArray2[7] = 55;
        cArray2[8] = 56;
        cArray2[9] = 57;
        cArray2[10] = 65;
        cArray2[11] = 66;
        cArray2[12] = 67;
        cArray2[13] = 68;
        cArray2[14] = 69;
        cArray2[15] = 70;
        char[] cArray3 = new char[byArray.length * 2];
        int n3 = byArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = byArray[i2];
            int n4 = i2 * 2;
            cArray3[n4] = cArray[(by & 0xFF) >>> 4];
            cArray3[n4 + 1] = cArray[by & 0xF];
        }
        return new String(cArray3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String b(PackageManager object) {
        void var1_14;
        Object var2_17 = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.a;
                i.b((Object)context);
                SigningInfo signingInfo = c1.b.a(object.getPackageInfo(context.getPackageName(), 0x8000000));
                if (signingInfo == null) {
                    return null;
                }
                if (c1.c.a(signingInfo)) {
                    Object[] objectArray = d.a(signingInfo);
                    i.d((Object)objectArray, (String)"signingInfo.apkContentsSigners");
                    byte[] byArray = ((Signature)y1.b.h((Object[])objectArray)).toByteArray();
                    i.d((Object)byArray, (String)"signingInfo.apkContentsS\u2026ers.first().toByteArray()");
                    String string = this.e(byArray);
                    return var1_14;
                }
                Object[] objectArray = e.a(signingInfo);
                i.d((Object)objectArray, (String)"signingInfo.signingCertificateHistory");
                byte[] byArray = ((Signature)y1.b.h((Object[])objectArray)).toByteArray();
                i.d((Object)byArray, (String)"signingInfo.signingCerti\u2026ory.first().toByteArray()");
                String string = this.e(byArray);
                return var1_14;
            }
            Object[] objectArray = this.a;
            i.b((Object)objectArray);
            objectArray = object.getPackageInfo((String)objectArray.getPackageName(), (int)64).signatures;
            Object var1_9 = var2_17;
            if (objectArray == null) return var1_14;
            if (objectArray.length == 0) {
                Object var1_10 = var2_17;
                return var1_14;
            }
            i.d((Object)objectArray, (String)"signatures");
            if (y1.b.h((Object[])objectArray) == null) {
                Object var1_11 = var2_17;
                return var1_14;
            }
            byte[] byArray = ((Signature)y1.b.h((Object[])objectArray)).toByteArray();
            i.d((Object)byArray, (String)"signatures.first().toByteArray()");
            String string = this.e(byArray);
            return var1_14;
        }
        catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException throwable) {
            Object var1_16 = var2_17;
            return var1_14;
        }
    }

    private final String c() {
        Object object = this.a;
        i.b((Object)object);
        object = object.getPackageManager();
        Object object2 = this.a;
        i.b((Object)object2);
        object2 = object2.getPackageName();
        object = Build.VERSION.SDK_INT >= 30 ? g.a(f.a((PackageManager)object, (String)object2)) : object.getInstallerPackageName((String)object2);
        return object;
    }

    private final long d(PackageInfo packageInfo) {
        long l2 = Build.VERSION.SDK_INT >= 28 ? c1.a.a(packageInfo) : (long)packageInfo.versionCode;
        return l2;
    }

    private final String e(byte[] byArray) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA-256");
        messageDigest.update(byArray);
        byArray = messageDigest.digest();
        i.d((Object)byArray, (String)"hashText");
        return this.a(byArray);
    }

    @Override
    public void onAttachedToEngine(a.b object) {
        i.e((Object)object, (String)"binding");
        this.a = ((a.b)object).a();
        this.b = object = new k(((a.b)object).b(), "dev.fluttercommunity.plus/package_info");
        i.b((Object)object);
        ((k)object).e(this);
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        i.e((Object)object, (String)"binding");
        this.a = null;
        object = this.b;
        i.b((Object)object);
        ((k)object).e(null);
        this.b = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onMethodCall(j object, k.d d2) {
        PackageManager.NameNotFoundException nameNotFoundException2;
        block9: {
            HashMap hashMap;
            String string;
            String string2;
            PackageInfo packageInfo;
            Object object2;
            block8: {
                block7: {
                    i.e((Object)object, (String)"call");
                    i.e((Object)d2, (String)"result");
                    try {
                        if (!i.a((Object)((j)object).a, (Object)"getAll")) {
                            d2.c();
                            return;
                        }
                        object = this.a;
                        i.b((Object)object);
                        object = object.getPackageManager();
                        object2 = this.a;
                        i.b((Object)object2);
                        packageInfo = object.getPackageInfo(object2.getPackageName(), 0);
                        i.d((Object)object, (String)"packageManager");
                        string2 = this.b((PackageManager)object);
                        string = this.c();
                        hashMap = new HashMap();
                        Object object3 = packageInfo.applicationInfo;
                        object2 = "";
                        if (object3 == null || (object = object3.loadLabel((PackageManager)object)) == null) break block7;
                        object3 = object.toString();
                        object = object3;
                        if (object3 != null) break block8;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                        break block9;
                    }
                }
                object = "";
            }
            hashMap.put((Object)"appName", object);
            object = this.a;
            i.b((Object)object);
            hashMap.put((Object)"packageName", (Object)object.getPackageName());
            object = packageInfo.versionName;
            if (object == null) {
                object = object2;
            } else {
                i.d((Object)object, (String)"info.versionName ?: \"\"");
            }
            hashMap.put((Object)"version", object);
            i.d((Object)packageInfo, (String)"info");
            hashMap.put((Object)"buildNumber", (Object)String.valueOf((long)this.d(packageInfo)));
            if (string2 != null) {
                hashMap.put((Object)"buildSignature", (Object)string2);
            }
            if (string != null) {
                hashMap.put((Object)"installerStore", (Object)string);
            }
            d2.a(hashMap);
            return;
        }
        d2.b("Name not found", nameNotFoundException2.getMessage(), null);
    }
}

