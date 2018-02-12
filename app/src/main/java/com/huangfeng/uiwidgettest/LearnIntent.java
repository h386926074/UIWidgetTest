package com.huangfeng.uiwidgettest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LearnIntent extends AppCompatActivity {


    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.learn_intent_layout);



        tv = new TextView(this);
        tv.setWidth(20);
        tv.setHeight(100);

        tv.setText("hello Ardroid!");
        setContentView(tv);



        //退过这种方式可以获取 intent data 传过来的数据
        Uri uri = getIntent().getData();
        System.out.println(uri);


        // 隐式 intent 可以访问别的应用的 activity
        /*
        *  如果不想让别的应用访问  这个本活动
        *  可以在activity 注册的地方 添加exported:"false"
        *
        *  <activity
        *       android:name = ".MyAty"
        *       android:exported = "false" >
        *       android:label = "@string/title_activity_my_aty>
        *
        *       <intent-filter>
        *           <category android:name = "android.intent.category.DEFAULT"/>
        *           <action android:name="com.jikexueyuan.learnintent.intent.action.MyAty"/> 隐式intent必写项
        *           <data android；scheme:"app"/>
        *
        *       </intent-filter>
        *   </activity>
        *
        *  多个activity 可以有同一个 Intent action
        *  程序会让你选择相应的 不相app  或着不同的 activity
        *
        *
        *   如果多个acitvity 有相同的action   如果想打开唯一指定的 页面 可以通过  intent data 来匹配
        *   startActivity(new Intent("com.jikexueyuan.learnintent.intent.action.MyAty",Uri.parse("app://hello")));
        * */


        try{
            startActivity(new Intent(this, MainActivity.class));
        }catch (Exception e){
            Toast.makeText(this,"无法启动指定activity",Toast.LENGTH_SHORT).show();
        }


        /*
        * 通过网页链接打开 本地 app
        * <activity
        *       android:name = ".MyAty"
        *       android:exported = "false" >  //是否可以被别的应用访问
        *       android:label = "@string/title_activity_my_aty>
        *
        *       <intent-filter>
        *
        *           <category android:name = "android.intent.category.DEFAULT"/>
        *           <category android:name = "android.intent.category.BROWSABLE"/>
        *           <action android:name="android.intent.action.VIEW"/>
        *           <data android；scheme:"app"/>
        *
        *       </intent-filter>
        *   </activity>
        *
        *
        *
        * */



        // Context




    }


}
