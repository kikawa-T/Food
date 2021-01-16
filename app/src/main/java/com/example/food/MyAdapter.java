package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<MainActivity.Food> foodList;

    public MyAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public  void setFoodList(ArrayList<MainActivity.Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return foodList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.foodrow, parent, false);

        ((TextView)convertView.findViewById(R.id.name)).setText(foodList.get(position).getName());
        ((TextView)convertView.findViewById(R.id.price)).setText(String.valueOf(foodList.get(position).getPrice()));
        ((ImageView)convertView.findViewById(R.id.img1)).setImageResource(foodList.get(position).getImageId());
       // ((Button)convertView.findViewById(R.id.button2)).
        return convertView;
    }
}
