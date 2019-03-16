package com.example.uzer.test7_listviewadvanceholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class JavIdolAdapter extends BaseAdapter {

    private Context context;
    private Integer layout;
    private ArrayList<JavIdol> javIdolArrayList;

    public JavIdolAdapter(Context context, Integer layout, ArrayList<JavIdol> javIdolArrayList) {
        this.context = context;
        this.layout = layout;
        this.javIdolArrayList = javIdolArrayList;
    }

    @Override
    public int getCount() {
        return javIdolArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return javIdolArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView idolpicture;
        TextView idolname, idoldetail;
    }
    public int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    public Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {

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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();

            viewHolder.idolpicture = (ImageView) convertView.findViewById(R.id.idolpicture);
            viewHolder.idolname = (TextView) convertView.findViewById(R.id.idolname);
            viewHolder.idoldetail = (TextView) convertView.findViewById(R.id.idoldetail);
            convertView.setTag(viewHolder);
        }else   {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        JavIdol javIdol = javIdolArrayList.get(position);

        viewHolder.idolpicture.setImageBitmap(decodeSampledBitmapFromResource(context.getResources(), javIdolArrayList.get(position).getPicture(),120,120));
        viewHolder.idolname.setText(javIdol.getName());
        viewHolder.idoldetail.setText(javIdol.getDetail());

        //Set Animation
        Animation animation= AnimationUtils.loadAnimation(context,R.anim.scale_list);
        convertView.startAnimation(animation);

        return convertView;
    }


}


