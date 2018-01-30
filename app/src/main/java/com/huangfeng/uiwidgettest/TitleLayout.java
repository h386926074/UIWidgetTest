package com.huangfeng.uiwidgettest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by huangfeng on 2018/1/29.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrss){
        super(context,attrss);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        LayoutInflater minflater= LayoutInflater.from(context);

        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked Eidt button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
