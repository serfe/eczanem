package com.example.serife.eczanem;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Konak extends Main4Activity {

    private String[] eczaneKonak = {"Yıldız Eczanesi \n Konak Is Bankasi Arkasi 3-f Konak Izmir" ,
            "Yeni Universite Eczanesi \n  452 Sok.no:27 Konak Izmir" ,
            "Uğur Eczanesi \n 857 Sok. No:2/f Konak Izmir" ,
            "Tungay Eczanesi \n  Odunkapı Mah.450 Sok.no:6 Konak Merkez Sag.ocagı Yanı Konak Izmir " ,
            "Tuba Eczanesi \n 847 Sk.no:10/1e Konak Izmir " ,
            "Sıhhat Eczanesi \n  Anafartalar Cd.no:67 Konak Izmir" ,
            "Sevil Eczanesi \n  847 Sokak No:10/d Konak Izmir" ,
            "Sayıner Eczane \n Milli Kütüphane Cd. No:31/a – Konak Izmir" ,
            "Sah Eczanesi \n 851 Sok.no:1/a Konak Izmir" ,
            "Özgökçen Eczanesi \n  Cumhuriyet Bul.no:48/a Konak Izmir " ,
            "Özgökçen Eczanesi \n  Mimar Kemalettin Cad. No:8 Konak Izmir" ,
            "Ozan Eczanesi \n 850 Sk. No:27 3. Beyler Konak Izmir " ,
            "Melek Eczanesi \n 452 Sok. No:9/a Konak Izmir " ,
            "Levent Eczanesi \n Ankara Palas Oteli Alti No:3/c Konak Izmir " ,
            "Konak Eczanesi \n 452 Sok. No:19/b Konak Izmir " ,
            "Karantina Eczanesi \n  525/b Mithatpasa Cad. Kucukyali Konak Izmir" ,
            "Fatih Eczanesi \n  452 Sk.no:23/a Konak Izmir " ,
            "Demirdogen Eczanesi \n 858 Sok.no:2/a Konak Izmir" ,
            "Coşkunoğlu Eczanesi \n  847 Sk. No:6/a Konak Izmir" ,
            "Cemre Eczanesi  \n  452 Sok.no:25/a Konak Izmir " ,
            "Can Eczanesi \n 846 Sok.no:55 Konak Izmir " ,
            "Burçak Eczanesi \n  857 Sk.no:2/l – Konak Izmir " ,
            "Bilge Eczanesi \n  852 Sk. No:3/c Konak Izmir" ,
            "Aydıner Eczanesi \n 847 Sk. No:8/2 Konak Izmir " ,
            "Armağan Eczanesi \n  S.s.k Bloklari No:43 – Konak Izmir  " ,
            "Alp Eczanesi \n 847 Sok.no:8/d Konak Izmir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konak);

        ArrayList<KonakEczane> konakEczanes = new ArrayList<KonakEczane>();

        for (int i = 0 ; i< eczaneKonak.length ;i++){

            konakEczanes.add(new KonakEczane(eczaneKonak[i]));

        }


        KonakAdapter konakAdapter = new KonakAdapter(this,R.layout.konak,konakEczanes);

        ListView listviewEczanekonak = (ListView)findViewById(R.id.listView_konak);

        if (listviewEczanekonak!= null){

            listviewEczanekonak.setAdapter(konakAdapter);
        }



    }
}

