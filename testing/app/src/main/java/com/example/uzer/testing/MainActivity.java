package com.example.uzer.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<traicay> traicayList;
    traicayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        traicayList = new ArrayList<>();
        traicayList.add(new traicay("dau tay", "dau tay da lat", R.drawable.strawberry));
        traicayList.add(new traicay("dau tay con cac", "dau tay da lat", R.drawable.strawberry));
        traicayList.add(new traicay("dau tay con cac", "dau tay da lat", R.drawable.grapefruit));
        traicayList.add(new traicay("do=eo hieu cac gi ca", "hihihi", R.drawable.grape));


        listView = (ListView) findViewById(R.id.danhsach);
        adapter = new traicayAdapter(MainActivity.this,R.layout.traicay, traicayList);
        listView.setAdapter(adapter);
    }

}
