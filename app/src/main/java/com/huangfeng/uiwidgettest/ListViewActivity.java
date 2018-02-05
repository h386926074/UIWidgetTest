package com.huangfeng.uiwidgettest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","recyclerview 实现横向滚动","recyclerview 瀑布流布局",
    "UIBestPractice"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.m_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 5:{
                        Intent intent = new Intent(ListViewActivity.this,HorizontalRecyclerViewActivity.class);
                        startActivity(intent);
                    }
                    break;

                    case 6:{
                        Intent intent = new Intent(ListViewActivity.this,StaggeredGridActivity.class);
                        startActivity(intent);
                    }
                    break;

                    case 7:{
                        Intent intent = new Intent(ListViewActivity.this,UIBestPracticeActivity.class);
                        startActivity(intent);
                    }
                    break;


                    default:
                        Toast.makeText(ListViewActivity.this,""+position,Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}
