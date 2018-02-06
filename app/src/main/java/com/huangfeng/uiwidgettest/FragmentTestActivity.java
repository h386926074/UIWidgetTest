package com.huangfeng.uiwidgettest;

import android.icu.text.Replaceable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentTestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);


        Button button = (Button) findViewById(R.id.leftfragementbutton);
        button.setOnClickListener(this);

        LeftFragment rightFragment = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.left_fragment);



        replaceFragment(new RightFragment());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.leftfragementbutton:
                replaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }

    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout,fragment);
//
//        transaction.addToBackStack(null);
//
//        transaction.commit();
    }
}
