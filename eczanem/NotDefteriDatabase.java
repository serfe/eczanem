package com.example.serife.eczanem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NotDefteriDatabase {

	private SQLiteDatabase db;
	private final Context context;
	private final NotDefteriDBhelper dbhelper;
	
	

	public NotDefteriDatabase(Context c) {
		context = c;

		dbhelper = new NotDefteriDBhelper(context, Sabitler.DATABASE, null,
				Sabitler.DATABASE_VERSION);
	}

	public void kapat() {
		db.close();
	}

	public void ac() throws SQLiteException {
		try {
			db = dbhelper.getWritableDatabase();
		} catch (SQLiteException ex) {
			Log.v("Open database exception", ex.getMessage());
			db = dbhelper.getReadableDatabase();
		}
	}


	public long notEkle(String konu, String icerik) {
		try {
			ContentValues yeniDegerler = new ContentValues();

			yeniDegerler.put(Sabitler.KONU, konu);
			yeniDegerler.put(Sabitler.ICERIK, icerik);
			yeniDegerler.put(Sabitler.TARIH,
					System.currentTimeMillis());
			return db.insert(Sabitler.TABLO, null, yeniDegerler);

		} catch (SQLiteException ex) {

			Log.v("hata tespit edildi !",ex.getMessage());
			return -1;
		}
	}
	

	public void notGuncelle(int id, String konu, String icerik) {
		
		
		ContentValues guncelDegerler = new ContentValues();
		String[] idArray = { String.valueOf(id) };

		guncelDegerler.put(Sabitler.KONU, konu);
		guncelDegerler.put(Sabitler.ICERIK, icerik);
		guncelDegerler
				.put(Sabitler.TARIH, System.currentTimeMillis());
		db.update(Sabitler.TABLO, guncelDegerler, Sabitler.KEY_ID + "=?",
				idArray);
	}
	


	public Cursor tumNotlariGetir() {

		Cursor c = db.query(Sabitler.TABLO, null, null, null, null, null,
				Sabitler.KEY_ID + " desc");

		return c;
	}
	
	public ArrayList<Not> tumNotlar() {
		ArrayList<Not> notlar=new ArrayList<Not>();

		Cursor c = tumNotlariGetir();

		if (c.moveToFirst()) {
			do {
				int id1 = c.getInt(c.getColumnIndex(Sabitler.KEY_ID));
				String konu = c.getString(c.getColumnIndex(Sabitler.KONU));

				String icerik = c.getString(c.getColumnIndex(Sabitler.ICERIK));
				DateFormat dateFormat = DateFormat.getDateTimeInstance();
				String tarih = dateFormat.format(new Date(c.getLong(c
						.getColumnIndex(Sabitler.TARIH))).getTime());
				Not gecici = new Not(id1, konu, icerik, tarih);

				notlar.add(gecici);

			} while (c.moveToNext());
		}
		return notlar;
	}
	


	public void idIleNotSil(int id) {
		
		db.delete(Sabitler.TABLO, Sabitler.KEY_ID + "=" + id, null);
		
	}
}
