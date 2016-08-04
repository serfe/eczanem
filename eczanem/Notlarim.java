package com.example.serife.eczanem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by serife on 26.5.2016.
 */
public class Notlarim extends Activity {

    Button ekle;
    Button listele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notlarim);

        ekle = (Button) findViewById(R.id.buttonekle);
        listele = (Button) findViewById(R.id.buttonlistele);

        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentekle = new Intent(Notlarim.this,NotEkleActivity.class);
                startActivity(intentekle);
            }
        });

        listele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlistele = new Intent(Notlarim.this,NotlariListeleActivity.class);
                startActivity(intentlistele);
            }
        });




    }}
