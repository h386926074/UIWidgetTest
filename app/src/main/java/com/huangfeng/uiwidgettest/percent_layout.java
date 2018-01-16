package com.huangfeng.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class percent_layout extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_layout);

    }

    @Override
    public void onClick(View v) {

    }

    public void add(View v){
        finish();
    }
}
