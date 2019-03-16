package com.example.uzer.testing3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Database database;
    Button Click, Clear;
    Integer size = 0;
    ListView JobListView;
    List<Job> jobList;
    JobAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ClickAction();
//        ClearAction();
//        testAction();
        Action1();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_job,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.addmenu){
            DialogAdd();
        }
        return super.onOptionsItemSelected(item);
    }
//    add job
    private void DialogAdd(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_add_job);

        final EditText editText = dialog.findViewById(R.id.NameAdd);
        Button buttonAdd = dialog.findViewById(R.id.ButtonAdd);
        Button buttonCancel = dialog.findViewById(R.id.ButtonCancel);

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jobname = editText.getText().toString();
                if(jobname.equals("")){
                    Toast.makeText(MainActivity.this, "Invalid Input, Enter Something", Toast.LENGTH_SHORT).show();
                }else{
                    database.QueryData("insert into job values(null,'" + jobname + "')");
                    Toast.makeText(MainActivity.this,"Added", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                    GetDataJob();
                }
            }
        });

        dialog.show();
    }
//    edit job
    public void DialogEdit(String name, final Integer id){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_edit);

        final EditText editText = (EditText) dialog.findViewById(R.id.NameEdit);
        Button buttonEdit = (Button) dialog.findViewById(R.id.ButtonEdit);
        Button buttonCancelEdit = (Button) dialog.findViewById(R.id.ButtonCancelEdit);

        editText.setText(name);
        buttonCancelEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newName = editText.getText().toString().trim();
                database.QueryData("update job set name='"+newName+"' where id='"+id+"'");
                Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
                GetDataJob();
            }
        });
        dialog.show();
    }
//    delete job
    public void DiaglogDelete(final String name, final Integer id){
        final AlertDialog.Builder dialogDelete = new AlertDialog.Builder(this);
        dialogDelete.setMessage("You Are going to delete "+name+". Are You Sure ?");
        dialogDelete.setPositiveButton("Yes, Do It", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                database.QueryData("delete from job where id ='"+id+"'");
                Toast.makeText(MainActivity.this,name+" Deleted", Toast.LENGTH_SHORT).show();
                GetDataJob();
            }
        });
//        delete dimiss
        dialogDelete.setNegativeButton("No, Stop", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialogDelete.show();
    }
    //    Main
    private void Action1() {
        JobListView = (ListView) findViewById(R.id.JobListView);
        jobList = new ArrayList<>();
        adapter = new JobAdapter(MainActivity.this, R.layout.job, jobList);
        JobListView.setAdapter(adapter);

        database = new Database(MainActivity.this,
                "note.sqlite",
                null,
                1);
        database.QueryData("create table if not exists job" +
                "(id integer primary key autoincrement, name varchar(200))");
//        database.QueryData("insert into job values(null, 'job number')");
        GetDataJob();
    }

    private void GetDataJob(){
        Cursor dataJob = database.GetData("select * from job");
        jobList.clear();
        while (dataJob.moveToNext()){
            String name = dataJob.getString(1);
            Integer id = dataJob.getInt(0);
            jobList.add(new Job(id, name));
        }

        adapter.notifyDataSetChanged();
    }

    //    Testing
    /*
    private void testAction(){
        database =  new Database(this, "note.sqlite", null, 1);

        database.QueryData("create table if not exists job(" +
                "id integer primary key," +
                " name varchar(200))");

        database.QueryData("insert into job values(null, 'job number')");

        database.QueryData("delete from job");

        MainActivity.this.deleteDatabase("note.sqlite");
    }

    private void ClearAction(){
        Clear = (Button) findViewById(R.id.Clear);
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database =  new Database(MainActivity.this, "note.sqlite", null, 1);
                database.QueryData("delete from job");
                size = 0;
                Click.setText("Click "+ size);
            }
        });

    }
    private void ClickAction(){
        Click = (Button) findViewById(R.id.Click);
        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testAction();
                Click.setText("Click "+ size);
                size++;
            }
        });
        Click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                database =  new Database(MainActivity.this, "note.sqlite", null, 1);

                Cursor datajob = database.GetData("select * from job");
                while (datajob.moveToNext()){
                    String id = datajob.getString(0);
                    String name = datajob.getString(1);
                    Toast.makeText(MainActivity.this, name +" "+ id, Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }
    */


}
