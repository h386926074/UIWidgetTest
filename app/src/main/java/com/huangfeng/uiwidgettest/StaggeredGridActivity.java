package com.huangfeng.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaggeredGridActivity extends AppCompatActivity {


    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staggered_grid_layout);
        initFruits();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.staggered_grid_layout_recyclerview);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitRecyclerViewAdapter adapter = new FruitRecyclerViewAdapter(fruitList,"staggered");
        recyclerView.setAdapter(adapter);
    }


    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengthName("Apple"),R.drawable.icon_apple);
            fruitList.add(apple);

            Fruit banana = new Fruit(getRandomLengthName("Banana"),R.drawable.icon_banana);
            fruitList.add(banana);

            Fruit orange = new Fruit(getRandomLengthName("Orange"), R.drawable.icon_orange);
            fruitList.add(orange);

            Fruit peach = new Fruit(getRandomLengthName("Peach"), R.drawable.icon_peach);
            fruitList.add(peach);

            Fruit tomato = new Fruit(getRandomLengthName("Tomato"), R.drawable.icon_tomato);
            fruitList.add(tomato);

            Fruit grapes = new Fruit(getRandomLengthName("Grapes"), R.drawable.icon_grapes);
            fruitList.add(grapes);

            Fruit mango = new Fruit(getRandomLengthName("Mango"), R.drawable.icon_mango);
            fruitList.add(mango);

            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.icon_pineapple);
            fruitList.add(pineapple);
        }
    }



    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
