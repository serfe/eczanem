package com.example.serife.eczanem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main4Activity extends MainActivity {

    Button balcova;
    Button buca;
    Button bornova;
    Button karsiyaka;
    Button konak;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        balcova = (Button) findViewById(R.id.button_balcova);
        buca = (Button) findViewById(R.id.button_buca);
        bornova = (Button) findViewById(R.id.button_bornova);
        karsiyaka = (Button) findViewById(R.id.button_karsiyaka);
        konak = (Button) findViewById(R.id.button_konak);


        balcova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbal = new Intent(Main4Activity.this, Balcova.class);
                startActivity(intentbal);
            }
        });

        buca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbuca = new Intent(Main4Activity.this, Buca.class);
                startActivity(intentbuca);
            }
        });

        bornova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbornova = new Intent(Main4Activity.this, Bornova.class);
                startActivity(intentbornova);
            }
        });
        karsiyaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentkarsiyaka = new Intent(Main4Activity.this, Karsiyaka.class);
                startActivity(intentkarsiyaka);
            }
        });
        konak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentkonak = new Intent(Main4Activity.this, Konak.class);
                startActivity(intentkonak);
            }
        });



    }
}

