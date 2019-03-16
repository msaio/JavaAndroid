package com.example.uzer.test2;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button btn_to_s2nd;
    ImageView i1;
    int i = 0;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action1();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.to_2nd,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.to2nd) {
//            Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
            overridePendingTransition(R.anim.out,R.anim.in);
        }
        return super.onOptionsItemSelected(item);
    }

    private void action1(){
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        btn_to_s2nd = (Button) findViewById(R.id.second_activity);
        i1 = (ImageView) findViewById(R.id.imageView);
        final ArrayList<Integer> ImageList = new ArrayList<>();
        ImageList.add(R.drawable.pic_1);
        ImageList.add(R.drawable.pic_2);
        ImageList.add(R.drawable.pic_3);
        ImageList.add(R.drawable.pic_4);
        ImageList.add(R.drawable.pic_5);

        final Animation anim = AnimationUtils.loadAnimation(this,R.anim.anim_picture_1);

        Animation anim_in = AnimationUtils.loadAnimation(this,R.anim.in);
        Animation anim_out = AnimationUtils.loadAnimation(this,R.anim.out);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<0)i=ImageList.size()-1;
                i1.setImageResource(ImageList.get(i));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>ImageList.size()-1)i=0;
                i1.setImageResource(ImageList.get(i));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                i = random.nextInt(ImageList.size());
                i1.setImageResource(ImageList.get(i));
            }
        });

        btn_to_s2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }
}
