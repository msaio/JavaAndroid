package com.example.uzer.test4_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student sinhvien1 = new student();
        sinhvien1.setFullname("HelloBoy");
        sinhvien1.setAddress("From Hell");
        sinhvien1.setBirthday(20180318);
        Toast.makeText(this,sinhvien1.getFullname(), Toast.LENGTH_SHORT).show();
        Log.d("motherfucker", sinhvien1.getFullname() + " " + sinhvien1.getAddress() +" "+ sinhvien1.getBirthday());
    }
}
