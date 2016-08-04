package com.example.serife.eczanem;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class EczaneAdapter extends BaseAdapter{

    private LayoutInflater elayoutInflater;
    ArrayList<String> eczaneler;

    public EczaneAdapter(Activity activity, ArrayList<String> eczanelerim){

        elayoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        eczaneler = eczanelerim;
    }

    public  int getCount(){

        return eczaneler.size();

    }


    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position){

        return position;
    }




    public List<String> eczaneListesi(){

        return eczaneler;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View satirView;
        satirView = elayoutInflater.inflate(R.layout.list_items, null);

        TextView textView = (TextView) satirView.findViewById(R.id.textViewname);

        String eczane = eczaneler.get(position);

        textView.setText(eczane);

        return satirView;

    }



}





