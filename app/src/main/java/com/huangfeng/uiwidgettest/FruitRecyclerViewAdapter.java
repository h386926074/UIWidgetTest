package com.huangfeng.uiwidgettest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by huangfeng on 2018/2/3.
 */

public class FruitRecyclerViewAdapter extends RecyclerView.Adapter<FruitRecyclerViewAdapter.ViewHolder> {

    private String mtype = null;
    private  List<Fruit> mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View view){
            super(view);
            fruitView = view;
            fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }



    public FruitRecyclerViewAdapter(List<Fruit> fruitList,String type){
        mFruitList = fruitList;
        mtype = type;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         View view;
        if (mtype.equals("Horizontal")){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_fruit_item,parent,false);
        }else if (mtype.equals("staggered")){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_fruit_item,parent,false);
        }else if(mtype.equals("123")) {
           view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        }

        final  ViewHolder holder = new ViewHolder(view);

        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(),"you clicked view "+fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });

        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(),"you clicked image "+fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });

        return  holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
