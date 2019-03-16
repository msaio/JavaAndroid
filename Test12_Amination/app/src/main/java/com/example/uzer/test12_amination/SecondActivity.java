package com.example.uzer.test12_amination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button ClickMeAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ClickMeAgain = (Button) findViewById(R.id.ClickMeAgain);

        ClickMeAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                overridePendingTransition(R.anim.anim_for_activity_start,R.anim.anim_for_activity_exit);
            }
        });
    }
}
