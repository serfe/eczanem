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

public class NobEczaneAdapter extends BaseAdapter {

        private LayoutInflater elayoutInflaternob;
        ArrayList<String> eczanelernob;

        public NobEczaneAdapter(Activity activity, ArrayList<String> eczanelerimnob){

            elayoutInflaternob = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            eczanelernob = eczanelerimnob;
        }

        public  int getCount(){

            return eczanelernob.size();

        }


        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position){

            return position;
        }




        public List<String> eczaneListesinob(){

            return eczanelernob;
        }

        public View getView(int position, View convertView, ViewGroup parent){

            View satirView;
            satirView = elayoutInflaternob.inflate(R.layout.list_itemnob, null);

            TextView textView = (TextView) satirView.findViewById(R.id.textViewnob);

            String eczanenob = eczanelernob.get(position);

            textView.setText(eczanenob);

            return satirView;

        }



    }






