package com.example.serife.eczanem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button tumEczaneler;

    Button nobetciEczaneler;

    Button ilceleregoreEczaneler;

    Button notlarim;

    Button harita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.vector);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);

        tumEczaneler = (Button) findViewById(R.id.button);

        nobetciEczaneler = (Button) findViewById(R.id.button3);

        ilceleregoreEczaneler = (Button) findViewById(R.id.button2);

        notlarim = (Button) findViewById(R.id.buttonnot);

        harita = (Button) findViewById(R.id.button_harita);

        tumEczaneler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }

        });

        nobetciEczaneler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent2);
            }
        });

        ilceleregoreEczaneler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent3);
            }
        });

        notlarim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Notlarim.class);
                startActivity(intent4);
            }
        });

        harita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentkonak = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intentkonak);
            }
        });






    }
}
