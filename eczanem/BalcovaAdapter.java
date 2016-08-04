package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class BalcovaAdapter extends ArrayAdapter<BalcovaEczane> {

    public BalcovaAdapter(Context context, int resource, List<BalcovaEczane> items){

        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.balcovaitem, null);
        }


        BalcovaEczane e = getItem(position);

        if (e != null) {


            ImageView imageView = (ImageView)v.findViewById(R.id.simge);
            TextView eczaneName = (TextView)v.findViewById(R.id.balcovaisim);
            if(eczaneName != null  ){
                eczaneName.setText(e.getIsım());
                imageView.setImageResource(R.drawable.eczane2);
            }
        }
        return v;

    }

}
