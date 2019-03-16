package com.example.uzer.test6_listviewadvance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Fruit> fruitList;
    FruitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitList = new ArrayList<>();

        fruitList.add(new Fruit(R.drawable.strawberry, "dautay", "dautaydalat"));
        fruitList.add(new Fruit(R.drawable.strawberry, "dautay hentai", "dit met maydautaydalat"));
        fruitList.add(new Fruit(R.drawable.grape, "dautay hentai", "dit met maydautaydalat"));

//        fruitList.add(new Fruit(R.drawable.strawberry));
//        fruitList.add(new Fruit(R.drawable.strawberry));
//        fruitList.add(new Fruit(R.drawable.grape));
//        fruitList.add(new Fruit(R.drawable.grape));
//        fruitList.add(new Fruit(R.drawable.grape));
//        fruitList.add(new Fruit(R.drawable.grapefruit));

        listView = (ListView) findViewById(R.id.listoffruit);
        adapter = new FruitAdapter(MainActivity.this,R.layout.fruit, fruitList);
        listView.setAdapter(adapter);
    }



}
