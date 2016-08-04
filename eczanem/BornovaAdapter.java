package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class BornovaAdapter extends ArrayAdapter<BornovaEczane> {
    public BornovaAdapter(Context context, int resource, List<BornovaEczane> items){

        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View vbornova = convertView;
        if (vbornova == null) {
            LayoutInflater vibornova;
            vibornova = LayoutInflater.from(getContext());
            vbornova = vibornova.inflate(R.layout.bornovaitem, null);
        }


        BornovaEczane a = getItem(position);

        if (a != null) {


            ImageView imageView = (ImageView)vbornova.findViewById(R.id.simge);
            TextView eczaneName = (TextView)vbornova.findViewById(R.id.bornovaisim);
            if(eczaneName != null  ){
                eczaneName.setText(a.getBornovaIsım());
                imageView.setImageResource(R.drawable.eczane2);
            }
        }
        return vbornova;

    }

}
