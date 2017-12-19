package com.huangfeng.uiwidgettest;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: ");
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
            {
                ImageView imagev = (ImageView) findViewById(R.id.image_view);
                imagev.setImageResource(R.drawable.img2);

                EditText editTexts = (EditText) findViewById(R.id.edit_text);
                editTexts.setText("I write some string");
                Toast.makeText(this,editTexts.getText().toString(),Toast.LENGTH_SHORT).show();
            }
                break;
            default:
                break;
        }
    }
}
