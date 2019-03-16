package com.example.uzer.test10_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<PussyVsButt> arrayList;
    PussyVsButtAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(new PussyVsButt(R.drawable.butt1,"Angel From Blue Sky"));
        arrayList.add(new PussyVsButt(R.drawable.butt2,"Devil From Bloody Hell"));
        arrayList.add(new PussyVsButt(R.drawable.butt3,"Godness Over The Heaven"));
        arrayList.add(new PussyVsButt(R.drawable.butt4,"Overlord Of The Death"));
        arrayList.add(new PussyVsButt(R.drawable.butt5,"Master From Dark Sky"));
        arrayList.add(new PussyVsButt(R.drawable.nude1,"The Dark Death"));
        arrayList.add(new PussyVsButt(R.drawable.tit1,"Cyka Blyat"));
        arrayList.add(new PussyVsButt(R.drawable.tit2, "Mother Fucker"));

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new PussyVsButtAdapter(MainActivity.this,R.layout.thelayout, arrayList);
        spinner.setAdapter(adapter);
    }
}
