package com.example.uzer.test7_listviewadvanceholder;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView idollist;
    ArrayList<JavIdol> javIdolArrayList;
    JavIdolAdapter javIdolAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createlist();
        javIdolAdapter = new JavIdolAdapter(MainActivity.this, R.layout.javidolitem, javIdolArrayList);
        idollist.setAdapter(javIdolAdapter);

    }


    private void createlist(){
        javIdolArrayList = new ArrayList<>();
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));
        javIdolArrayList.add(new JavIdol("Miss Banana", "An angel from sky with beautiful butt", R.drawable.butt1));
        javIdolArrayList.add(new JavIdol("Miss Alice", "A devil from hell with dick-destroy shape", R.drawable.nude1));
        javIdolArrayList.add(new JavIdol("Miss Leolulu","Best shape ever in this earth",R.drawable.butt2));
        javIdolArrayList.add(new JavIdol("Rossie","Beauty with power of lion king", R.drawable.tit1));
        javIdolArrayList.add(new JavIdol("Suri","God of cuteness",R.drawable.butt3));
        javIdolArrayList.add(new JavIdol("Min Dolce","Love from first sight",R.drawable.butt4));
        javIdolArrayList.add(new JavIdol("Hentai Blyn","The true perfect still alive",R.drawable.butt5));


        idollist = (ListView) findViewById(R.id.idollist);
    }
}
