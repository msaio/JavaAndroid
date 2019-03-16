package com.example.uzer.test9_gridviewadvance;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<picture> pictureArrayList;
    pictureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pictureArrayList = new ArrayList<>();
        pictureArrayList.add(new picture(R.drawable.b2));
        pictureArrayList.add(new picture(R.drawable.helena));
        pictureArrayList.add(new picture(R.drawable.honoka));
        pictureArrayList.add(new picture(R.drawable.honoka3));
        pictureArrayList.add(new picture(R.drawable.kasumi));
        pictureArrayList.add(new picture(R.drawable.marierose));
        pictureArrayList.add(new picture(R.drawable.misaki));
        pictureArrayList.add(new picture(R.drawable.tifa));
        pictureArrayList.add(new picture(R.drawable.tifa2));

        gridView = (GridView) findViewById(R.id.gv);
        adapter = new pictureAdapter(MainActivity.this, R.layout.picture, pictureArrayList);
        gridView.setAdapter(adapter);

    }

}
