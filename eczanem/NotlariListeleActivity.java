
package com.example.serife.eczanem;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

public class NotlariListeleActivity extends ListActivity {

	private ArrayList<Not> notlar;
	private NotDefteriDatabase dba;
	private CustomListAdapter cla;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listele);

		dba = new NotDefteriDatabase(this);
		dba.ac();

		cla = new CustomListAdapter(this);
		setListAdapter(cla);
		notlar = cla.notListesi();
		

		if (notlar.size() == 0) {
			yeniNot();
		}
		

		kisaUzunTiklama();

	}

	public void kisaUzunTiklama() {

		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {

				Context context = getApplicationContext();

				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context,
						notlar.get(position).icerik.toString(), duration);
				toast.show();
			}
		});
		



		getListView().setOnItemLongClickListener(
				new AdapterView.OnItemLongClickListener() {
					@Override
					public boolean onItemLongClick(AdapterView<?> av, View v,
							int pos, long id) {
						final int ps = pos;

						final CharSequence[] items = { "Yeni Not Ekle",
								" Notu Duzenle", "Notu Sil" };

						AlertDialog.Builder builder = new AlertDialog.Builder(
								NotlariListeleActivity.this);
						builder.setTitle(notlar.get(ps).konu.toString());
						builder.setItems(items,
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int item) {

										switch (item) {
										case 0:
											yeniNot();
											break;
										case 1:
											notGuncelle(ps);
											break;
										case 2:
											notSil(ps);
											break;
										default:
											break;
										}
									}
								});

						AlertDialog alert = builder.create();
						alert.show();

						return false;

					}
				});
	}

	public void yeniNot() {
		Intent i = new Intent(NotlariListeleActivity.this,
				NotEkleActivity.class);
		startActivity(i);
		finish();

	}
	

	public void notGuncelle(int ps) {
		Intent i = new Intent(NotlariListeleActivity.this,
				GuncelleActivity.class);
		i.putExtra("ID", notlar.get(ps)._id);
		i.putExtra("KONU", notlar.get(ps).konu);
		i.putExtra("ICERIK", notlar.get(ps).icerik);

		startActivity(i);
		finish();
	}
	


	public void notSil(int p) {
		final int ps = p;
		
		AlertDialog.Builder builder = new AlertDialog.Builder(
				NotlariListeleActivity.this);
		builder.setMessage(
				notlar.get(ps).konu
						+ "  konulu notu silmek istediginizden emin misiniz ?")
				.setCancelable(true)
				.setPositiveButton("Evet",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {

								
									dba.idIleNotSil(notlar.get(ps)._id);
									
									int duration = Toast.LENGTH_SHORT;

									Toast toast = Toast.makeText(getApplicationContext(),
											notlar.get(ps).konu.toString()
													+ "  silinmistir !",
											duration);
									toast.show();

									yenile();

								
							}
						})
				.setNegativeButton("Hayir",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						});
		AlertDialog alert = builder.create();
		alert.show();
		

	}

	public void yenile()
	{
		cla = null;
		cla = new CustomListAdapter(getApplicationContext());
		setListAdapter(cla);
		if ((notlar = cla.notListesi()).size() == 0)
			yeniNot();

	}

}
