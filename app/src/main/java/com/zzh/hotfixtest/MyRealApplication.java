package com.zzh.hotfixtest;

import android.app.Application;
import android.util.Log;

import com.taobao.sophix.SophixManager;

/**
 * @author: zzh
 * data : 2020/11/4
 * description：
 */
public class MyRealApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("zzz1", "MyRealApplication onCreate");
        // queryAndLoadNewPatch不可放在attachBaseContext 中，否则无网络权限，建议放在后面任意时刻，如onCreate中
        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
