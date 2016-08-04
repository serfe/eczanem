
package com.example.serife.eczanem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NotEkleActivity extends Activity {

	EditText konuET, icerikET;
	Button ekleBT;
	NotDefteriDatabase dba;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ekleguncelle);

		konuET = (EditText) findViewById(R.id.konuText);
		icerikET = (EditText) findViewById(R.id.icerikText);
		ekleBT = (Button) findViewById(R.id.opButton);

		ekleBT.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				try {
					dba = new NotDefteriDatabase(NotEkleActivity.this);
					dba.ac();
					

					
					if(konuET.getText().length()!=0 && icerikET.getText().length()!=0){
					notEkle();					
					}
					else{
						int duration = Toast.LENGTH_SHORT;
						
						Toast toast = Toast.makeText(getApplicationContext(),		
										"Konu ve Icerik Giriniz !",
								duration);
						toast.show();
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	public void notEkle() {

		dba.notEkle(konuET.getText().toString(), icerikET.getText()
				.toString());
		dba.kapat();
		konuET.setText("");
		icerikET.setText("");
		
		Intent i = new Intent(NotEkleActivity.this, NotlariListeleActivity.class);
		
		startActivity(i);
		finish();
	}
}
