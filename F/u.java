/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlarmManager
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.util.Log
 *  androidx.core.app.a
 *  androidx.core.app.i
 *  androidx.core.content.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 */
package F;

import F.n;
import F.o;
import F.p;
import F.q;
import F.r;
import F.s;
import F.t;
import F.y;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.app.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p1.m;

final class u
implements m,
p1.n {
    private final Context a;
    private b b;
    private Activity c;
    private int d;
    private Map e;

    public u(Context context) {
        this.a = context;
    }

    private int c() {
        List list = y.c(this.a, 21);
        if (list != null && !list.isEmpty()) {
            return 1;
        }
        Log.d((String)"permissions_handler", (String)"Bluetooth permission missing in manifest");
        return 0;
    }

    private int d() {
        if (Build.VERSION.SDK_INT < 33) {
            if (i.b((Context)this.a).a()) {
                return 1;
            }
            return 0;
        }
        if (t.a(this.a, "android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return y.b(this.c, "android.permission.POST_NOTIFICATIONS");
    }

    private int f(int n2) {
        if (n2 == 17) {
            return this.d();
        }
        if (n2 == 21) {
            return this.c();
        }
        if ((n2 == 30 || n2 == 28 || n2 == 29) && Build.VERSION.SDK_INT < 31) {
            return this.c();
        }
        int n3 = 0;
        if (!(n2 != 37 && n2 != 0 || this.g())) {
            return 0;
        }
        List list = y.c(this.a, n2);
        if (list == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No android specific permissions needed for: ");
            stringBuilder.append(n2);
            Log.d((String)"permissions_handler", (String)stringBuilder.toString());
            return 1;
        }
        if (list.size() == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No permissions found in manifest for: ");
            stringBuilder.append((Object)list);
            stringBuilder.append(n2);
            Log.d((String)"permissions_handler", (String)stringBuilder.toString());
            if (n2 == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (n2 == 22 && Build.VERSION.SDK_INT < 30) {
                return 2;
            }
            n2 = n3;
            if (Build.VERSION.SDK_INT < 23) {
                n2 = 1;
            }
            return n2;
        }
        if (this.a.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            for (String string : list) {
                if (n2 == 16) {
                    string = this.a.getPackageName();
                    PowerManager powerManager = (PowerManager)this.a.getSystemService("power");
                    if (powerManager != null && n.a(powerManager, string)) {
                        hashSet.add((Object)1);
                        continue;
                    }
                    hashSet.add((Object)0);
                    continue;
                }
                if (n2 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        hashSet.add((Object)2);
                    }
                    hashSet.add((Object)(o.a() ? 1 : 0));
                    continue;
                }
                if (n2 == 23) {
                    hashSet.add((Object)(p.a(this.a) ? 1 : 0));
                    continue;
                }
                if (n2 == 24) {
                    if (Build.VERSION.SDK_INT < 26) continue;
                    hashSet.add((Object)(q.a(this.a.getPackageManager()) ? 1 : 0));
                    continue;
                }
                if (n2 == 27) {
                    hashSet.add((Object)(r.a((NotificationManager)this.a.getSystemService("notification")) ? 1 : 0));
                    continue;
                }
                if (n2 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        hashSet.add((Object)(s.a((AlarmManager)this.a.getSystemService("alarm")) ? 1 : 0));
                        continue;
                    }
                    hashSet.add((Object)1);
                    continue;
                }
                if (androidx.core.content.a.a((Context)this.a, (String)string) == 0) continue;
                hashSet.add((Object)y.b(this.c, string));
            }
            if (!hashSet.isEmpty()) {
                return y.j((Collection)hashSet);
            }
        }
        return 1;
    }

    private boolean g() {
        List list = y.c(this.a, 37);
        boolean bl = list != null && list.contains((Object)"android.permission.WRITE_CALENDAR");
        boolean bl2 = list != null && list.contains((Object)"android.permission.READ_CALENDAR");
        if (bl && bl2) {
            return true;
        }
        if (!bl) {
            Log.d((String)"permissions_handler", (String)"android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!bl2) {
            Log.d((String)"permissions_handler", (String)"android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    private void h(String string, int n2) {
        if (this.c == null) {
            return;
        }
        Intent intent = new Intent(string);
        if (!string.equals((Object)"android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            string = this.c.getPackageName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("package:");
            stringBuilder.append(string);
            intent.setData(Uri.parse((String)stringBuilder.toString()));
        }
        this.c.startActivityForResult(intent, n2);
        ++this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean a(int n2, int n3, Intent object) {
        block20: {
            int n4;
            block17: {
                block19: {
                    block18: {
                        object = this.c;
                        n4 = 0;
                        if (object == null) {
                            return false;
                        }
                        n3 = 23;
                        if (n2 != 209) break block17;
                        if (Build.VERSION.SDK_INT < 23) break block18;
                        object = this.a.getPackageName();
                        PowerManager powerManager = (PowerManager)this.a.getSystemService("power");
                        n3 = n4;
                        if (powerManager != null) {
                            n3 = n4;
                            if (n.a(powerManager, (String)object)) {
                                n3 = 1;
                            }
                        }
                        break block19;
                    }
                    n3 = 2;
                }
                n2 = 16;
                break block20;
            }
            if (n2 == 210) {
                if (Build.VERSION.SDK_INT < 30) {
                    return false;
                }
                n3 = o.a() ? 1 : 0;
                n2 = 22;
            } else if (n2 == 211) {
                if (Build.VERSION.SDK_INT < 23) {
                    return false;
                }
                n4 = p.a((Context)object);
                n2 = n3;
                n3 = n4;
            } else if (n2 == 212) {
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                n3 = q.a(object.getPackageManager()) ? 1 : 0;
                n2 = 24;
            } else if (n2 == 213) {
                if (Build.VERSION.SDK_INT < 23) {
                    return false;
                }
                n3 = r.a((NotificationManager)object.getSystemService("notification")) ? 1 : 0;
                n2 = 27;
            } else {
                if (n2 != 214) {
                    return false;
                }
                object = (AlarmManager)object.getSystemService("alarm");
                n3 = Build.VERSION.SDK_INT >= 31 ? (int)(s.a((AlarmManager)object) ? 1 : 0) : 1;
                n2 = 34;
            }
        }
        this.e.put((Object)n2, (Object)n3);
        this.d = n2 = this.d - 1;
        object = this.b;
        if (object != null && n2 == 0) {
            object.a(this.e);
        }
        return true;
    }

    @Override
    public boolean b(int n2, String[] object, int[] nArray) {
        int n3 = 0;
        if (n2 != 24) {
            this.d = 0;
            return false;
        }
        if (this.e == null) {
            return false;
        }
        if (((String[])object).length == 0 && nArray.length == 0) {
            Log.w((String)"permissions_handler", (String)"onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        Object object2 = Arrays.asList((Object[])object);
        int n4 = object2.indexOf((Object)"android.permission.WRITE_CALENDAR");
        n2 = n3;
        if (n4 >= 0) {
            n2 = nArray[n4];
            n4 = y.k(this.c, "android.permission.WRITE_CALENDAR", n2);
            this.e.put((Object)36, (Object)n4);
            int n5 = object2.indexOf((Object)"android.permission.READ_CALENDAR");
            n2 = n3;
            if (n5 >= 0) {
                n2 = nArray[n5];
                object2 = y.i(n4, y.k(this.c, "android.permission.READ_CALENDAR", n2));
                object2.intValue();
                this.e.put((Object)37, object2);
                this.e.put((Object)0, object2);
                n2 = n3;
            }
        }
        while (n2 < ((String[])object).length) {
            object2 = object[n2];
            if (!object2.equals((Object)"android.permission.WRITE_CALENDAR") && !object2.equals((Object)"android.permission.READ_CALENDAR") && (n3 = y.g((String)object2)) != 20) {
                n4 = nArray[n2];
                if (n3 == 8) {
                    object2 = y.i((Integer)this.e.get((Object)8), y.k(this.c, (String)object2, n4));
                    this.e.put((Object)8, object2);
                } else if (n3 == 7) {
                    if (!this.e.containsKey((Object)7)) {
                        this.e.put((Object)7, (Object)y.k(this.c, (String)object2, n4));
                    }
                    if (!this.e.containsKey((Object)14)) {
                        this.e.put((Object)14, (Object)y.k(this.c, (String)object2, n4));
                    }
                } else if (n3 == 4) {
                    n3 = y.k(this.c, (String)object2, n4);
                    if (!this.e.containsKey((Object)4)) {
                        this.e.put((Object)4, (Object)n3);
                    }
                } else if (n3 == 3) {
                    n4 = y.k(this.c, (String)object2, n4);
                    if (Build.VERSION.SDK_INT < 29 && !this.e.containsKey((Object)4)) {
                        this.e.put((Object)4, (Object)n4);
                    }
                    if (!this.e.containsKey((Object)5)) {
                        this.e.put((Object)5, (Object)n4);
                    }
                    this.e.put((Object)n3, (Object)n4);
                } else if (!this.e.containsKey((Object)n3)) {
                    this.e.put((Object)n3, (Object)y.k(this.c, (String)object2, n4));
                }
            }
            ++n2;
        }
        this.d = n2 = this.d - nArray.length;
        object = this.b;
        if (object != null && n2 == 0) {
            object.a(this.e);
        }
        return true;
    }

    void e(int n2, a a2) {
        a2.a(this.f(n2));
    }

    void i(List list, b b2, F.b b3) {
        if (this.d > 0) {
            b3.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
            return;
        }
        if (this.c == null) {
            Log.d((String)"permissions_handler", (String)"Unable to detect current Activity.");
            b3.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        this.b = b2;
        this.e = new HashMap();
        this.d = 0;
        b2 = new ArrayList();
        for (Integer n2 : list) {
            if (this.f(n2) == 1) {
                if (this.e.containsKey((Object)n2)) continue;
                this.e.put((Object)n2, (Object)1);
                continue;
            }
            list = y.c((Context)this.c, n2);
            if (list != null && !list.isEmpty()) {
                int n3 = Build.VERSION.SDK_INT;
                if (n3 >= 23 && n2 == 16) {
                    this.h("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                    continue;
                }
                if (n3 >= 30 && n2 == 22) {
                    this.h("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                    continue;
                }
                if (n3 >= 23 && n2 == 23) {
                    this.h("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                    continue;
                }
                if (n3 >= 26 && n2 == 24) {
                    this.h("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                    continue;
                }
                if (n3 >= 23 && n2 == 27) {
                    this.h("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                    continue;
                }
                if (n3 >= 31 && n2 == 34) {
                    this.h("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                    continue;
                }
                if (n2 != 37 && n2 != 0) {
                    b2.addAll((Collection)list);
                    this.d += list.size();
                    continue;
                }
                if (this.g()) {
                    b2.add("android.permission.WRITE_CALENDAR");
                    b2.add("android.permission.READ_CALENDAR");
                    this.d += 2;
                    continue;
                }
                this.e.put((Object)n2, (Object)0);
                continue;
            }
            if (this.e.containsKey((Object)n2)) continue;
            if (n2 == 16 && Build.VERSION.SDK_INT < 23) {
                this.e.put((Object)n2, (Object)2);
            } else {
                this.e.put((Object)n2, (Object)0);
            }
            if (n2 == 22 && Build.VERSION.SDK_INT < 30) {
                this.e.put((Object)n2, (Object)2);
                continue;
            }
            this.e.put((Object)n2, (Object)0);
        }
        if (b2.size() > 0) {
            list = (String[])b2.toArray(new String[0]);
            androidx.core.app.a.g((Activity)this.c, (String[])list, (int)24);
        }
        if ((list = this.b) != null && this.d == 0) {
            list.a(this.e);
        }
    }

    public void j(Activity activity) {
        this.c = activity;
    }

    void k(int n2, c c2, F.b b2) {
        Activity activity = this.c;
        if (activity == null) {
            Log.d((String)"permissions_handler", (String)"Unable to detect current Activity.");
            b2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        b2 = y.c((Context)activity, n2);
        if (b2 == null) {
            b2 = new StringBuilder();
            b2.append("No android specific permissions needed for: ");
            b2.append(n2);
            Log.d((String)"permissions_handler", (String)b2.toString());
            c2.a(false);
            return;
        }
        if (b2.isEmpty()) {
            b2 = new StringBuilder();
            b2.append("No permissions found in manifest for: ");
            b2.append(n2);
            b2.append(" no need to show request rationale");
            Log.d((String)"permissions_handler", (String)b2.toString());
            c2.a(false);
            return;
        }
        c2.a(androidx.core.app.a.h((Activity)this.c, (String)((String)b2.get(0))));
    }
}

