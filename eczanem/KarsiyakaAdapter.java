package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class KarsiyakaAdapter extends ArrayAdapter<KarsiyakaEczane> {
    public KarsiyakaAdapter(Context context, int resource, List<KarsiyakaEczane> items){

        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View vkar = convertView;
        if (vkar == null) {
            LayoutInflater vikar;
            vikar = LayoutInflater.from(getContext());
            vkar = vikar.inflate(R.layout.karsiyakaitem, null);
        }


        KarsiyakaEczane b = getItem(position);

        if (b != null) {


            ImageView imageView = (ImageView)vkar.findViewById(R.id.simge);
            TextView eczaneName = (TextView)vkar.findViewById(R.id.karsiyakaisim);
            if(eczaneName != null  ){
                eczaneName.setText(b.getKarsiyakaIsım());
                imageView.setImageResource(R.drawable.eczane2);
            }
        }
        return vkar;

    }

}
