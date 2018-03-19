package common;


import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import pwr.swim.lab2.R;

public class MyAdapter extends BaseAdapter {
    private Context ctx;

    public Integer[] id_obrazkow = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img2, R.drawable.img3, R.drawable.img1,
            R.drawable.img3, R.drawable.img1, R.drawable.img2
    };

    public MyAdapter(Context c){
        ctx = c;
    }

    public int getCount() {
        return id_obrazkow.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    @Override
    public View getView(int pos, View cV, ViewGroup parent) {
        ImageView mV;
        if(cV == null) {
            mV = new ImageView(ctx);
            mV.setLayoutParams(new GridView.LayoutParams(200, 200));
            mV.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mV.setPadding(8, 8, 8, 8);
        } else {
            mV = (ImageView) cV;
        }
        mV.setImageResource(id_obrazkow[pos]);
        return  mV;
    }


}
