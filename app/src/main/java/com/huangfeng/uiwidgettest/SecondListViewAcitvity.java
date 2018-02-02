package com.huangfeng.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondListViewAcitvity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_list_view_layout);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(SecondListViewAcitvity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.sencond_listview);
        listView.setAdapter(adapter);


    }


    private void initFruits(){
        for(int i = 0 ;i<3;i++){
            Fruit apple = new Fruit("Apple", R.drawable.icon_apple);
            fruitList.add(apple);

            Fruit banana = new Fruit("Banana",R.drawable.icon_banana);
            fruitList.add(banana);

            Fruit orange = new Fruit("Orange", R.drawable.icon_orange);
            fruitList.add(orange);

            Fruit peach = new Fruit("Peach", R.drawable.icon_peach);
            fruitList.add(peach);

            Fruit tomato = new Fruit("Tomato", R.drawable.icon_tomato);
            fruitList.add(tomato);

            Fruit grapes = new Fruit("Grapes", R.drawable.icon_grapes);
            fruitList.add(grapes);

            Fruit mango = new Fruit("Mango", R.drawable.icon_mango);
            fruitList.add(mango);

            Fruit pineapple = new Fruit("Pineapple", R.drawable.icon_pineapple);
            fruitList.add(pineapple);
        }
    }
}
