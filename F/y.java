/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build$VERSION
 *  android.util.Log
 *  androidx.core.app.a
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 */
package F;

import F.v;
import F.w;
import F.x;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public abstract class y {
    private static String a(Context context, String string) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 31 && y.e(context, null, string)) {
            return string;
        }
        if (n2 < 29) {
            if (y.e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (y.e(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        }
        if (y.e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        return null;
    }

    static int b(Activity activity, String string) {
        if (activity == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        boolean bl = y.l((Context)activity, string);
        boolean bl2 = y.f(activity, string);
        boolean bl3 = true;
        boolean bl4 = bl2 ^ true;
        if (bl) {
            if (bl4) {
                bl3 = false;
            }
        } else {
            bl3 = bl4;
        }
        if (!bl && bl3) {
            y.h((Context)activity, string);
        }
        if (bl && bl3) {
            return 4;
        }
        return 0;
    }

    static List c(Context object, int n2) {
        ArrayList arrayList = new ArrayList();
        switch (n2) {
            default: {
                break;
            }
            case 36: {
                if (!y.e(object, arrayList, "android.permission.WRITE_CALENDAR")) break;
                arrayList.add((Object)"android.permission.WRITE_CALENDAR");
                break;
            }
            case 35: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) break;
                arrayList.add((Object)"android.permission.BODY_SENSORS_BACKGROUND");
                break;
            }
            case 34: {
                if (!y.e(object, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) break;
                arrayList.add((Object)"android.permission.SCHEDULE_EXACT_ALARM");
                break;
            }
            case 33: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.READ_MEDIA_AUDIO")) break;
                arrayList.add((Object)"android.permission.READ_MEDIA_AUDIO");
                break;
            }
            case 32: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.READ_MEDIA_VIDEO")) break;
                arrayList.add((Object)"android.permission.READ_MEDIA_VIDEO");
                break;
            }
            case 31: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) break;
                arrayList.add((Object)"android.permission.NEARBY_WIFI_DEVICES");
                break;
            }
            case 30: {
                if (Build.VERSION.SDK_INT < 31 || (object = y.a(object, "android.permission.BLUETOOTH_CONNECT")) == null) break;
                arrayList.add(object);
                break;
            }
            case 29: {
                if (Build.VERSION.SDK_INT < 31 || (object = y.a(object, "android.permission.BLUETOOTH_ADVERTISE")) == null) break;
                arrayList.add(object);
                break;
            }
            case 28: {
                if (Build.VERSION.SDK_INT < 31 || (object = y.a(object, "android.permission.BLUETOOTH_SCAN")) == null) break;
                arrayList.add(object);
                break;
            }
            case 27: {
                if (Build.VERSION.SDK_INT < 23 || !y.e(object, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) break;
                arrayList.add((Object)"android.permission.ACCESS_NOTIFICATION_POLICY");
                break;
            }
            case 24: {
                if (Build.VERSION.SDK_INT < 23 || !y.e(object, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) break;
                arrayList.add((Object)"android.permission.REQUEST_INSTALL_PACKAGES");
                break;
            }
            case 23: {
                if (!y.e(object, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) break;
                arrayList.add((Object)"android.permission.SYSTEM_ALERT_WINDOW");
                break;
            }
            case 22: {
                if (Build.VERSION.SDK_INT < 30 || !y.e(object, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) break;
                arrayList.add((Object)"android.permission.MANAGE_EXTERNAL_STORAGE");
                break;
            }
            case 21: {
                if (!y.e(object, arrayList, "android.permission.BLUETOOTH")) break;
                arrayList.add((Object)"android.permission.BLUETOOTH");
                break;
            }
            case 19: {
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (!y.e(object, arrayList, "android.permission.ACTIVITY_RECOGNITION")) break;
                arrayList.add((Object)"android.permission.ACTIVITY_RECOGNITION");
                break;
            }
            case 18: {
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (!y.e(object, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) break;
                arrayList.add((Object)"android.permission.ACCESS_MEDIA_LOCATION");
                break;
            }
            case 17: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.POST_NOTIFICATIONS")) break;
                arrayList.add((Object)"android.permission.POST_NOTIFICATIONS");
                break;
            }
            case 16: {
                if (Build.VERSION.SDK_INT < 23 || !y.e(object, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) break;
                arrayList.add((Object)"android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                break;
            }
            case 15: {
                if (y.e(object, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add((Object)"android.permission.READ_EXTERNAL_STORAGE");
                }
                if ((n2 = Build.VERSION.SDK_INT) >= 29 && (n2 != 29 || !v.a()) || !y.e(object, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) break;
                arrayList.add((Object)"android.permission.WRITE_EXTERNAL_STORAGE");
                break;
            }
            case 13: {
                if (y.e(object, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add((Object)"android.permission.SEND_SMS");
                }
                if (y.e(object, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add((Object)"android.permission.RECEIVE_SMS");
                }
                if (y.e(object, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add((Object)"android.permission.READ_SMS");
                }
                if (y.e(object, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add((Object)"android.permission.RECEIVE_WAP_PUSH");
                }
                if (!y.e(object, arrayList, "android.permission.RECEIVE_MMS")) break;
                arrayList.add((Object)"android.permission.RECEIVE_MMS");
                break;
            }
            case 12: {
                if (!y.e(object, arrayList, "android.permission.BODY_SENSORS")) break;
                arrayList.add((Object)"android.permission.BODY_SENSORS");
                break;
            }
            case 9: {
                if (Build.VERSION.SDK_INT < 33 || !y.e(object, arrayList, "android.permission.READ_MEDIA_IMAGES")) break;
                arrayList.add((Object)"android.permission.READ_MEDIA_IMAGES");
                break;
            }
            case 8: {
                if (y.e(object, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add((Object)"android.permission.READ_PHONE_STATE");
                }
                if ((n2 = Build.VERSION.SDK_INT) > 29 && y.e(object, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add((Object)"android.permission.READ_PHONE_NUMBERS");
                }
                if (y.e(object, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add((Object)"android.permission.CALL_PHONE");
                }
                if (y.e(object, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add((Object)"android.permission.READ_CALL_LOG");
                }
                if (y.e(object, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add((Object)"android.permission.WRITE_CALL_LOG");
                }
                if (y.e(object, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add((Object)"com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (y.e(object, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add((Object)"android.permission.USE_SIP");
                }
                if (n2 < 26 || !y.e(object, arrayList, "android.permission.ANSWER_PHONE_CALLS")) break;
                arrayList.add((Object)"android.permission.ANSWER_PHONE_CALLS");
                break;
            }
            case 7: 
            case 14: {
                if (!y.e(object, arrayList, "android.permission.RECORD_AUDIO")) break;
                arrayList.add((Object)"android.permission.RECORD_AUDIO");
                break;
            }
            case 6: 
            case 11: 
            case 20: {
                return null;
            }
            case 3: 
            case 4: 
            case 5: {
                if (n2 == 4 && Build.VERSION.SDK_INT >= 29) {
                    if (!y.e(object, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) break;
                    arrayList.add((Object)"android.permission.ACCESS_BACKGROUND_LOCATION");
                    break;
                }
                if (y.e(object, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                    arrayList.add((Object)"android.permission.ACCESS_COARSE_LOCATION");
                }
                if (!y.e(object, arrayList, "android.permission.ACCESS_FINE_LOCATION")) break;
                arrayList.add((Object)"android.permission.ACCESS_FINE_LOCATION");
                break;
            }
            case 2: {
                if (y.e(object, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add((Object)"android.permission.READ_CONTACTS");
                }
                if (y.e(object, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add((Object)"android.permission.WRITE_CONTACTS");
                }
                if (!y.e(object, arrayList, "android.permission.GET_ACCOUNTS")) break;
                arrayList.add((Object)"android.permission.GET_ACCOUNTS");
                break;
            }
            case 1: {
                if (!y.e(object, arrayList, "android.permission.CAMERA")) break;
                arrayList.add((Object)"android.permission.CAMERA");
                break;
            }
            case 0: 
            case 37: {
                if (y.e(object, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add((Object)"android.permission.WRITE_CALENDAR");
                }
                if (!y.e(object, arrayList, "android.permission.READ_CALENDAR")) break;
                arrayList.add((Object)"android.permission.READ_CALENDAR");
            }
        }
        return arrayList;
    }

    private static PackageInfo d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return x.a(packageManager, context.getPackageName(), w.a(4096L));
        }
        return packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean e(Context context, ArrayList arrayList, String string) {
        Exception exception2;
        block7: {
            if (arrayList != null) {
                try {
                    arrayList = arrayList.iterator();
                    while (arrayList.hasNext()) {
                        if (!((String)arrayList.next()).equals((Object)string)) continue;
                        return true;
                    }
                }
                catch (Exception exception2) {
                    break block7;
                }
            }
            if (context == null) {
                Log.d((String)"permissions_handler", (String)"Unable to detect current Activity or App Context.");
                return false;
            }
            if ((context = y.d(context)) == null) {
                Log.d((String)"permissions_handler", (String)"Unable to get Package info, will not be able to determine permissions to request.");
                return false;
            }
            arrayList = new ArrayList((Collection)Arrays.asList((Object[])context.requestedPermissions));
            context = arrayList.iterator();
            while (context.hasNext()) {
                boolean bl = ((String)context.next()).equals((Object)string);
                if (!bl) continue;
                return true;
            }
            return false;
        }
        Log.d((String)"permissions_handler", (String)"Unable to check manifest for permission: ", (Throwable)exception2);
        return false;
    }

    static boolean f(Activity activity, String string) {
        return a.h((Activity)activity, (String)string) ^ true;
    }

    static int g(String string) {
        string.hashCode();
        int n2 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 2133799037: {
                if (!string.equals((Object)"com.android.voicemail.permission.ADD_VOICEMAIL")) break;
                n2 = 40;
                break;
            }
            case 2114579147: {
                if (!string.equals((Object)"android.permission.ACCESS_MEDIA_LOCATION")) break;
                n2 = 39;
                break;
            }
            case 2062356686: {
                if (!string.equals((Object)"android.permission.BLUETOOTH_SCAN")) break;
                n2 = 38;
                break;
            }
            case 2024715147: {
                if (!string.equals((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) break;
                n2 = 37;
                break;
            }
            case 1977429404: {
                if (!string.equals((Object)"android.permission.READ_CONTACTS")) break;
                n2 = 36;
                break;
            }
            case 1831139720: {
                if (!string.equals((Object)"android.permission.RECORD_AUDIO")) break;
                n2 = 35;
                break;
            }
            case 1780337063: {
                if (!string.equals((Object)"android.permission.ACTIVITY_RECOGNITION")) break;
                n2 = 34;
                break;
            }
            case 1777263169: {
                if (!string.equals((Object)"android.permission.REQUEST_INSTALL_PACKAGES")) break;
                n2 = 33;
                break;
            }
            case 1365911975: {
                if (!string.equals((Object)"android.permission.WRITE_EXTERNAL_STORAGE")) break;
                n2 = 32;
                break;
            }
            case 1271781903: {
                if (!string.equals((Object)"android.permission.GET_ACCOUNTS")) break;
                n2 = 31;
                break;
            }
            case 1166454870: {
                if (!string.equals((Object)"android.permission.BLUETOOTH_ADVERTISE")) break;
                n2 = 30;
                break;
            }
            case 970694249: {
                if (!string.equals((Object)"android.permission.SCHEDULE_EXACT_ALARM")) break;
                n2 = 29;
                break;
            }
            case 784519842: {
                if (!string.equals((Object)"android.permission.USE_SIP")) break;
                n2 = 28;
                break;
            }
            case 710297143: {
                if (!string.equals((Object)"android.permission.READ_MEDIA_VIDEO")) break;
                n2 = 27;
                break;
            }
            case 691260818: {
                if (!string.equals((Object)"android.permission.READ_MEDIA_AUDIO")) break;
                n2 = 26;
                break;
            }
            case 610633091: {
                if (!string.equals((Object)"android.permission.WRITE_CALL_LOG")) break;
                n2 = 25;
                break;
            }
            case 603653886: {
                if (!string.equals((Object)"android.permission.WRITE_CALENDAR")) break;
                n2 = 24;
                break;
            }
            case 463403621: {
                if (!string.equals((Object)"android.permission.CAMERA")) break;
                n2 = 23;
                break;
            }
            case 361658321: {
                if (!string.equals((Object)"android.permission.BODY_SENSORS_BACKGROUND")) break;
                n2 = 22;
                break;
            }
            case 214526995: {
                if (!string.equals((Object)"android.permission.WRITE_CONTACTS")) break;
                n2 = 21;
                break;
            }
            case 175802396: {
                if (!string.equals((Object)"android.permission.READ_MEDIA_IMAGES")) break;
                n2 = 20;
                break;
            }
            case 112197485: {
                if (!string.equals((Object)"android.permission.CALL_PHONE")) break;
                n2 = 19;
                break;
            }
            case 52602690: {
                if (!string.equals((Object)"android.permission.SEND_SMS")) break;
                n2 = 18;
                break;
            }
            case -5573545: {
                if (!string.equals((Object)"android.permission.READ_PHONE_STATE")) break;
                n2 = 17;
                break;
            }
            case -63024214: {
                if (!string.equals((Object)"android.permission.ACCESS_COARSE_LOCATION")) break;
                n2 = 16;
                break;
            }
            case -406040016: {
                if (!string.equals((Object)"android.permission.READ_EXTERNAL_STORAGE")) break;
                n2 = 15;
                break;
            }
            case -798669607: {
                if (!string.equals((Object)"android.permission.BLUETOOTH_CONNECT")) break;
                n2 = 14;
                break;
            }
            case -895673731: {
                if (!string.equals((Object)"android.permission.RECEIVE_SMS")) break;
                n2 = 13;
                break;
            }
            case -895679497: {
                if (!string.equals((Object)"android.permission.RECEIVE_MMS")) break;
                n2 = 12;
                break;
            }
            case -909527021: {
                if (!string.equals((Object)"android.permission.NEARBY_WIFI_DEVICES")) break;
                n2 = 11;
                break;
            }
            case -1164582768: {
                if (!string.equals((Object)"android.permission.READ_PHONE_NUMBERS")) break;
                n2 = 10;
                break;
            }
            case -1238066820: {
                if (!string.equals((Object)"android.permission.BODY_SENSORS")) break;
                n2 = 9;
                break;
            }
            case -1479758289: {
                if (!string.equals((Object)"android.permission.RECEIVE_WAP_PUSH")) break;
                n2 = 8;
                break;
            }
            case -1561629405: {
                if (!string.equals((Object)"android.permission.SYSTEM_ALERT_WINDOW")) break;
                n2 = 7;
                break;
            }
            case -1783097621: {
                if (!string.equals((Object)"android.permission.ACCESS_NOTIFICATION_POLICY")) break;
                n2 = 6;
                break;
            }
            case -1813079487: {
                if (!string.equals((Object)"android.permission.MANAGE_EXTERNAL_STORAGE")) break;
                n2 = 5;
                break;
            }
            case -1888586689: {
                if (!string.equals((Object)"android.permission.ACCESS_FINE_LOCATION")) break;
                n2 = 4;
                break;
            }
            case -1921431796: {
                if (!string.equals((Object)"android.permission.READ_CALL_LOG")) break;
                n2 = 3;
                break;
            }
            case -1925850455: {
                if (!string.equals((Object)"android.permission.POST_NOTIFICATIONS")) break;
                n2 = 2;
                break;
            }
            case -1928411001: {
                if (!string.equals((Object)"android.permission.READ_CALENDAR")) break;
                n2 = 1;
                break;
            }
            case -2062386608: {
                if (!string.equals((Object)"android.permission.READ_SMS")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                return 20;
            }
            case 39: {
                return 18;
            }
            case 38: {
                return 28;
            }
            case 37: {
                return 4;
            }
            case 35: {
                return 7;
            }
            case 34: {
                return 19;
            }
            case 33: {
                return 24;
            }
            case 30: {
                return 29;
            }
            case 29: {
                return 34;
            }
            case 27: {
                return 32;
            }
            case 26: {
                return 33;
            }
            case 23: {
                return 1;
            }
            case 22: {
                return 35;
            }
            case 21: 
            case 31: 
            case 36: {
                return 2;
            }
            case 20: {
                return 9;
            }
            case 15: 
            case 32: {
                return 15;
            }
            case 14: {
                return 30;
            }
            case 11: {
                return 31;
            }
            case 9: {
                return 12;
            }
            case 7: {
                return 23;
            }
            case 6: {
                return 27;
            }
            case 5: {
                return 22;
            }
            case 4: 
            case 16: {
                return 3;
            }
            case 3: 
            case 10: 
            case 17: 
            case 19: 
            case 25: 
            case 28: 
            case 40: {
                return 8;
            }
            case 2: {
                return 17;
            }
            case 1: 
            case 24: {
                return 0;
            }
            case 0: 
            case 8: 
            case 12: 
            case 13: 
            case 18: 
        }
        return 13;
    }

    private static void h(Context context, String string) {
        context.getSharedPreferences(string, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    static Integer i(Integer n2, Integer n3) {
        HashSet hashSet = new HashSet();
        hashSet.add((Object)n2);
        hashSet.add((Object)n3);
        return y.j((Collection)hashSet);
    }

    static Integer j(Collection collection) {
        Integer n2 = 4;
        if (collection.contains((Object)n2)) {
            return n2;
        }
        if (collection.contains((Object)2)) {
            return 2;
        }
        if (collection.contains((Object)0)) {
            return 0;
        }
        if (collection.contains((Object)3)) {
            return 3;
        }
        return 1;
    }

    static int k(Activity activity, String string, int n2) {
        if (n2 == -1) {
            return y.b(activity, string);
        }
        return 1;
    }

    private static boolean l(Context context, String string) {
        return context.getSharedPreferences(string, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}

