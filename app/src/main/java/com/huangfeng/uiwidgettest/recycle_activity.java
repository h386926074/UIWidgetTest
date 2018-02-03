package com.huangfeng.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recycle_activity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_layout);

        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FruitRecyclerViewAdapter adapter  = new FruitRecyclerViewAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }


    private void initFruits(){
        for(int i = 0 ;i<1;i++){
            Fruit apple = new Fruit("Apple", R.drawable.icon_apple);
            fruitList.add(apple);

            Fruit banana = new Fruit("Banana",R.drawable.icon_banana);
            fruitList.add(banana);

            Fruit orange = new Fruit("Orange", R.drawable.icon_orange);
            fruitList.add(orange);
        }




    }
}
