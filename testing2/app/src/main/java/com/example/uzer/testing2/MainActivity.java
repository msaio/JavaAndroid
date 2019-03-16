package com.example.uzer.testing2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<idol> idolList;
    adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        idolList = new ArrayList<>();
        idolList.add( new idol(R.drawable.butt2));
        idolList.add( new idol(R.drawable.butt3));
        idolList.add( new idol(R.drawable.butt1));
        idolList.add( new idol(R.drawable.butt2));

        adapter = new adapter(MainActivity.this, idolList);
        listView.setAdapter(adapter);
    }

    //idol adapter
    public class adapter extends BaseAdapter{
        private Context context;
        private ArrayList<idol> idolList;

        public adapter(Context context, ArrayList<idol> idolList) {
            this.context = context;
            this.idolList = idolList;
        }

        @Override
        public int getCount() {
            return idolList.size();
        }

        @Override
        public Object getItem(int position) {
            return idolList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.idol, null);
            ImageView pic = (ImageView) convertView.findViewById(R.id.idol);
            pic.setImageBitmap(decodeSampledBitmapFromResource(getResources(), idolList.get(position).getPic(), 120, 120));
//            pic.setImageResource(idolList.get(position).getPic());
            return convertView;
        }
    }
    //class idol
    public class idol{
        private int pic;
        public idol(int pic) {
            this.pic = pic;
        }
        public int getPic() {
            return pic;
        }
        public void setPic(int pic) {
            this.pic = pic;
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {
        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

}
