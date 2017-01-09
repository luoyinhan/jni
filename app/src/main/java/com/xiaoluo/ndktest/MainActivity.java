package com.xiaoluo.ndktest;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.xiaoluo.ndktest.testjni.MyJNI;

/**
 * 描述：
 * 作者：Micheal
 * 修改时间：2016/12/28
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt_jni = (TextView) findViewById(R.id.txt_jni);
        txt_jni.setText(MyJNI.sayhello());
    }
}
