

package com.example.serife.eczanem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class CustomListAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
	private ArrayList<Not> notlar;
	private NotDefteriDatabase dba;

	public CustomListAdapter(Context context) {

		mInflater = LayoutInflater.from(context);
		notlar = new ArrayList<Not>();

		dba = new NotDefteriDatabase(context);		
		dba.ac();
		notlar=dba.tumNotlar();		
		dba.kapat();
	}

	public int getCount() {
		return notlar.size();
	}

	public long getItemId(int position) {
		return position;
	}

	public Not getItem(int i) {
		return notlar.get(i);
	}

	public ArrayList<Not> notListesi() {
		return notlar;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		

		ViewHolder holder;


		if (convertView == null) {

			convertView = mInflater.inflate(R.layout.notitems, null);

			holder = new ViewHolder();			
			holder.mKonu = (TextView) convertView.findViewById(R.id.konuText);
			holder.mTarih = (TextView) convertView.findViewById(R.id.tarihText);
			holder.mIcerik = (TextView) convertView.findViewById(R.id.icerikText);

			
		} else {
			

			holder = (ViewHolder) convertView.getTag();
		}
		

				
		holder.mTarih.setText(notlar.get(position).kayittarihi);
		holder.mKonu.setText(notlar.get(position).konu);
		holder.mIcerik.setText(notlar.get(position).icerik);


		convertView.setTag(holder);

		return convertView;
	}
		

	public class ViewHolder {
		TextView mKonu;
		TextView mTarih;
		TextView mIcerik;

	}

}
