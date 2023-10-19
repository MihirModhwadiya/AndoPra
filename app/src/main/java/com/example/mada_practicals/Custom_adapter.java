package com.example.mada_practicals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_adapter extends BaseAdapter {

    String[] country;
    int[] flag;
    Context cntxt;

    LayoutInflater lf;

    public Custom_adapter(String[] country, int[] flag, Context cntxt){
            this.country = country;
            this.flag = flag;
            this.cntxt = cntxt;
            lf = LayoutInflater.from(cntxt);
    }

    @Override
    public int getCount() {
        return country.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = lf.inflate(R.layout.activity_item2, null);
        ImageView img = view.findViewById(R.id.flag_img);
        TextView txt = view.findViewById(R.id.country_txt);
        img.setImageResource(flag[i]);
        txt.setText(country[i]);

        return view;
    }
}
