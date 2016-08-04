package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class BucaAdapter extends ArrayAdapter<BucaEczane> {

    public BucaAdapter(Context context, int resource, List<BucaEczane> items){

        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View vbuca = convertView;
        if (vbuca == null) {
            LayoutInflater vibuca;
            vibuca = LayoutInflater.from(getContext());
            vbuca = vibuca.inflate(R.layout.bucaitem, null);
        }


        BucaEczane a = getItem(position);

        if (a != null) {


            ImageView imageView = (ImageView)vbuca.findViewById(R.id.simge);
            TextView eczaneName = (TextView)vbuca.findViewById(R.id.bucaisim);
            if(eczaneName != null  ){
                eczaneName.setText(a.getbucaIsım());
                imageView.setImageResource(R.drawable.eczane2);
            }
        }
        return vbuca;

    }

}
