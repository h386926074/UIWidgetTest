package com.huangfeng.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private EditText editText;
    private Button button;
    private ImageView imageview;
    private ProgressBar progress_bar;
    private Button button1;
    private Button button4;
    private Button button3;//percentlayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);
        imageview = (ImageView) findViewById(R.id.image_view);
        progress_bar=(ProgressBar) findViewById(R.id.progress_bar);
        button1 = (Button)findViewById(R.id.button_2);
        button1.setOnClickListener(this);
        button.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(this);

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

                imageview.setImageResource(R.drawable.img2);


                editText.setText("I write some string");
//                if (progress_bar.getVisibility()==View.VISIBLE){
//                    progress_bar.setVisibility(View.GONE);
//                }else{
//                    progress_bar.setVisibility(View.VISIBLE);
//                }
                int progress= progress_bar.getProgress();
                progress = progress +10;
                progress_bar.setProgress(progress);
                progress_bar.setVisibility(View.GONE);
//                Toast.makeText(this,editText.getText().toString(),Toast.LENGTH_SHORT).show();

//                AlertDialog.Builder  dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("this is a alertdialog!");
//                dialog.setMessage("Something important。");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    }
//                });
//                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                dialog.show();

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is a progressDialog.");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
                break;
            case R.id.button_2:
            {
                Intent intent = new Intent(this,LayoutActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.button_4:{
                Intent intent = new Intent(this,percent_layout.class);
                startActivity(intent);
            }
            break;

            case R.id.button_3:{
                Intent intent = new Intent(this,new_percent.class);
                startActivity(intent);
            }
            break;

            default:
                break;
        }
    }
}
