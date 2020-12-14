package com.zzh.hotfixtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.taobao.sophix.SophixManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this, "更新了", Toast.LENGTH_LONG).show();
        SophixManager.getInstance().queryAndLoadNewPatch();
        // 添加
        // branch2
        Log.i("zzz1", "");
    }
}
