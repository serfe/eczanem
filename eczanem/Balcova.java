package com.example.serife.eczanem;


import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Balcova extends Main4Activity {

    public String[] eczaneBalcova = {"Ahmet Kılıç Eczanesi  \n Eğitim Mah. Dumlupınar Sok. No. 2/A Balçova/İzmir",
            "Ahmet Necat Eczanesi \n Ata Cad. No.185/B Balçova/İzmir ",
            "Akyürek Eczanesi \n Kızılcık Sok.No. 32/A Balçova/İzmir",
            "Ayşe Pınar Eczanesi \n Dumlupınar Sok. 3/A Eski Karakol Sokağı Balçova/İzmir",
            "Balçova Eczanesi \n Özsağlık Sok. No. 46/A Sanayi Yolu Balçova/İzmir",
            "Balçova İpek Eczanesi \n Onur Mah. Dalya Sok. No. 46-B-C Balçova/İzmir",
            " Büyük Halk Eczanesi\n Onur Mah. Sarmaşık Cad. No. 46/A Balçova/İzmir" ,
            " Balçova Sağlık Eczanesi \n Onur Mah. Akasya Sokak No.7/B Eyüp Sabri Camii Çaprazı Balçova/İzmir" ,
            "Dereli Eczanesi \n Eğitim Mah. Dumlupınar Sokak No.8/A Balçova/İzmir" ,
            "Ege İlker Eczanesi \n Fevzi Çakmak Mah. Cengiz Topel Sok.No.:11 Balçova/İzmir" ,
            "Egenur Eczanesi \n Ata Cad. 154/A (Ata Cad. Üzeri) Balçova/İzmir",
            "Eyüp Sabri Eczanesi \n Eğitim Mah. Dumlupınar Sok. No. 6/A Balçova/İzmir" ,
            "Feyza Eczanesi \n Sakarya Cad. No.11/B Balçova Pehlivanoğlu Yanı Balçova/İzmir" ,
            "Hoşcan Eczanesi \n Sarmaşık Sok. No.18/A Balçova/İzmir" ,
            "İlayda Eczanesi \n Onur Mah. Ata Cad. No.92/B Balçova/İzmir" ,
            "Sakarya Eczanesi \n Sakarya Cad. No.39/A Balçova/İzmir","Serap Eczanesi \n B.Ata Cad. No.194 Balçova/İzmir" ,
            "Ülkü Vural Eczanesi \n Eğitim Mah.. Dumlupınar Sok. No.10/1A ( Eski Karakol Sokağı ) Balçova/İzmir",
            "Yalçınkaya Eczanesi \n Sakarya Cad. No.17 Balçova/İzmir" ,
            "Yeni Barış Eczanesi \n Eğitim Mah. Karakol Sok. Sağlık Ocağı Yanı Balçova/İzmir " ,
            "Yeni Gökşen Eczanesi \n Onur Mah.. Kaan Sok.No. 5/B Balçova/İzmir",
            "Yeşildere Eczanesi \n Onur Mah. Manolya Sokak No.42 Balçova Balçova/İzmir"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balcova);



        ArrayList<BalcovaEczane> balcovaEczanes= new ArrayList<BalcovaEczane>();

        for (int i = 0 ; i< eczaneBalcova.length ;i++){

            balcovaEczanes.add(new BalcovaEczane(eczaneBalcova[i]));

        }


        BalcovaAdapter balcovaAdapter = new BalcovaAdapter(this,R.layout.balcova,balcovaEczanes);

        ListView listviewEczane = (ListView)findViewById(R.id.listView_balcova);

        if (listviewEczane!= null){

            listviewEczane.setAdapter(balcovaAdapter);
        }


    }
    }


