package com.example.uzer.hentai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView show_1;
    EditText input_1, input_2;
    Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionRandom();
    }
    private void actionRandom(){
        show_1 = (TextView) findViewById(R.id.show1);
        button_1 = (Button) findViewById(R.id.button1);
        input_1 = (EditText) findViewById(R.id.input1);
        input_2 = (EditText) findViewById(R.id.input2);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = input_1.getText().toString();
                String inputText2 = input_2.getText().toString();

                if (inputText1.length() == 0 || inputText2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Must not be empty!", Toast.LENGTH_SHORT).show();
                }else{
                    int min = Integer.parseInt(inputText1);
                    int max = Integer.parseInt(inputText2);
                    if (min >= max) {
                        Toast.makeText(MainActivity.this, "Max must be bigger than Min",Toast.LENGTH_SHORT).show();
                    }else{
                        Random random_number = new Random();
                        int number = random_number.nextInt(max - min +1) + min;
                        show_1.setText(number+"");
                    }
                }
            }
        });
    }
}
