package com.huangfeng.uiwidgettest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by huangfeng on 2018/2/13.
 */

public class Main2  extends Activity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        TextView tv2 = new TextView(this);
        tv2.setText("hello main2");
        setContentView(tv2);
    }
}
