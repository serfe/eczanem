package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by serife on 24.5.2016.
 */
public class KonakAdapter extends ArrayAdapter<KonakEczane> {
    public KonakAdapter(Context context, int resource, List<KonakEczane> items){

        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View vkonak = convertView;
        if (vkonak == null) {
            LayoutInflater vikonak;
            vikonak = LayoutInflater.from(getContext());
            vkonak = vikonak.inflate(R.layout.konakitem, null);
        }


        KonakEczane a = getItem(position);

        if (a != null) {


            ImageView imageView = (ImageView)vkonak.findViewById(R.id.simge);
            TextView eczaneName = (TextView)vkonak.findViewById(R.id.konakisim);
            if(eczaneName != null  ){
                eczaneName.setText(a.getKonakIsım());
                imageView.setImageResource(R.drawable.eczane2);
            }
        }
        return vkonak;

    }

}
