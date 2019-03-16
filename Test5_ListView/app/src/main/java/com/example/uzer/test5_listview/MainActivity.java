package com.example.uzer.test5_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class    MainActivity extends AppCompatActivity {
    ListView tuong;
    ArrayList<String> danhsach;
    EditText editText;
    Button button;
    Button buttonUpdate;
    int pos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danhsach = new ArrayList<String>();
        danhsach.add("Hello Man");
        danhsach.add("Dit me may");
        danhsach.add("Cyka Blyat");

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        buttonUpdate = (Button) findViewById(R.id.button2);
        tuong = (ListView) findViewById(R.id.list);

        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, danhsach);
        tuong.setAdapter(adapter);

        tuong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editText.setText(danhsach.get(position));
                pos = position;
            }
        });
        tuong.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Deleting " + danhsach.get(position), Toast.LENGTH_SHORT).show();
                danhsach.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input =  editText.getText().toString();
                danhsach.add(input);
                adapter.notifyDataSetChanged();
            }
        });
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                danhsach.set(pos, editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }

}
