package com.example.uzer.test6_listviewadvance;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FruitAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Fruit> fruitList;

    public FruitAdapter(Context context, int layout, List<Fruit> fruitArrayList) {
        this.context = context;
        this.layout = layout;
        this.fruitList = fruitArrayList;
    }

    @Override
    public int getCount() {
        return fruitList.size();
    }

    @Override
    public Object getItem(int position) {
        return fruitList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgfruit);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView detail = (TextView) convertView.findViewById(R.id.detail);

        Fruit fruit;
        fruit = fruitList.get(position);

        imageView.setImageResource(fruit.getImage());
        name.setText(fruit.getName());
        detail.setText(fruit.getDetail());

        return convertView;
    }
}
