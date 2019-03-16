package com.example.uzer.test12_amination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgAlpha, imgRotate, imgScale, imgScale2, imgTranslate;
    Button ClickMe;
    List<Integer> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = (ImageView) findViewById(R.id.imageViewAlpha);
        imgRotate = (ImageView) findViewById(R.id.imageViewRotate);
        imgScale = (ImageView) findViewById(R.id.imageViewScale);
        imgScale2 = (ImageView) findViewById(R.id.imageViewScale2);
        imgTranslate = (ImageView) findViewById(R.id.imageViewTranslate);
//        Create List of Picture
        List = new ArrayList();
        List.add(R.drawable.dragunovsvd);
        List.add(R.drawable.lvoac);
        List.add(R.drawable.lvoacbadnews);
        List.add(R.drawable.lvoacdivision);
        List.add(R.drawable.silencio);
        List.add(R.drawable.skorpionevo);
        List.add(R.drawable.tar21predator);
        List.add(R.drawable.whisper);
//        Random Picture
        Random random = new Random();
        int index;
        index = random.nextInt(List.size());
        imgAlpha.setImageResource(List.get(index));
        index = random.nextInt(List.size());
        imgTranslate.setImageResource(List.get(index));
        index = random.nextInt(List.size());
        imgScale.setImageResource(List.get(index));
        index = random.nextInt(List.size());
        imgScale2.setImageResource(List.get(index));
        index = random.nextInt(List.size());
        imgRotate.setImageResource(List.get(index));

        ClickMe = (Button) findViewById(R.id.ClickMe);

        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animScale2 = AnimationUtils.loadAnimation(this, R.anim.anim_scale2);
        final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translte);
        // Alpha animation on click action
        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);

            }
        });
        imgAlpha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.clearAnimation();
                // return false; // Animation keeps going if we stop click
                return true; // Animation totally stops
            }
        });
        // Rotate animation on click action
        imgRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });
        imgRotate.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.clearAnimation();
                return true;
            }
        });
        // Scale animation on click action
        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });
        imgScale.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.clearAnimation();
                return true;
            }
        });
        // Scale 2
        imgScale2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale2);
            }
        });
        imgScale2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.clearAnimation();
                return true;
            }
        });
        // Translate animation on click action
        imgTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate);
            }
        });
        imgTranslate.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                v.clearAnimation();
                return true;
            }
        });
        // Animation Intent
        // Move to second Activity
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                overridePendingTransition(R.anim.anim_for_activity_start,R.anim.anim_for_activity_exit);

            }
        });

    }
}
