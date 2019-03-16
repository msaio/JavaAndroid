package com.example.uzer.testing;

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
import java.util.zip.Inflater;

import static com.example.uzer.testing.R.id.hinh;

public class traicayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<traicay> traicayList;

    public traicayAdapter(Context context, int layout, List<traicay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }

    @Override
    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int position) {
        return traicayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView ten = (TextView) convertView.findViewById(R.id.ten);
//        ten.setText(traicayList.get(position).getTen());
        TextView chitiet = (TextView) convertView.findViewById(R.id.chitiet);
//        chitiet.setText(traicayList.get(position).getChitiet());
        ImageView hinh = (ImageView) convertView.findViewById(R.id.hinh);
//        hinh.setImageResource(traicayList.get(position).getHinh());

        traicay traicay = traicayList.get(position);

        ten.setText(traicay.getTen());
        chitiet.setText(traicay.getChitiet());
        hinh.setImageResource(traicay.getHinh());

        return convertView;
    }
}
