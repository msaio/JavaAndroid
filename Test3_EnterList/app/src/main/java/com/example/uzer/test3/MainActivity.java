package com.example.uzer.test3;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    ListView lv;
    TextView textView2;
    String show = "";
    ArrayList<String> x ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action1();
    }

    private void action1(){
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);


        textView2 = (TextView) findViewById(R.id.textView2);

        x = new ArrayList<String>();
        x.add("Hello");
        x.add("Shit");
        lv = (ListView) findViewById(R.id.listView);
        final    ArrayAdapter<String> test = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,x);
        lv.setAdapter(test);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                show += "\n"+input;
                textView2.setText(show);
                editText.clearAnimation();
                x.add(input);
                test.notifyDataSetChanged();
            }
        });


    }
}
