package com.example.serife.eczanem;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Karsiyaka extends Main4Activity {

    private String[] eczaneKarsiyaka = {"Ali Eczanesi \n 1713 Sok. No.56 Karşıyaka Devl Tiyatrosu Karşısı Karşıyaka/İzmir" ,
            "Ataşen Eczanesi \n 1690 Sok. No. 8 Eski Adliye Sokağı Karşıyaka/İzmir" ,
            "Aylin Çoban Eczanesi \n Donanmacı Mah. Ulvi Başman Sok. No.19/A Karşıyaka/İzmir" ,
            "Egeşan Eczanesi \n 1728 Sok. No. 65/A Klise Karşısı Ssk Dispanser Yanı Karşıyaka/İzmir" ,
            "Ekici Eczanesi \n Donanmacı Mah.. 1728 Sok. No.66/A Klise Sokak Ssk Dispanseri Karşısı Karşıyaka/İzmir " ,
            "Epir Eczanesi \n Atatürk Bul. No. 3/B Karşıyaka/İzmir" , "Ferah Eczanesi \n 1717 Sok. No.75 Karşıyaka/İzmir" ,
            "Gürden Eczanesi \n 1696 Sok. 41/C İskele Teb Bankası Sokağı Sonu Karşıyaka/İzmir" ,
            "Güzin Eczanesi \n 1690 Sok. 5/23 Araba Sok. Gürmar Yanı Karşıyaka/İzmir" ,
            "İmbat Eczanesi \n K.Paşa Cad. 1717 Sok. No.148/A Karşıyaka/İzmir" ,
            "Karahisarlı Eczanesi \n B.Üçok Cad. No.4/1-E Karşıyaka/İzmir" ,
            "Karşıyaka Çağdaş Eczanesi \n Çarşı Cad. 1717 Sok. No. 169/B İstasyon Karşısı Karşıyaka/İzmir" ,
            "Karşıyaka Çınar Eczanesi \n Donanmacı Mah. 1728 Sok. No. 67/1-A Klise Sokağı Karşıyaka/İzmir" ,
            "Karşıyaka İlke Eczanesi \n 1879 Sok. No. 19/A Karşıyaka/İzmir" ,
            "Karşıyaka İlker Eczanesi \n 	Donanmacı Mah. 1728 Sok.No.:29/A Kilise Sokağı Halkmar Yanı Karşıyaka/İzmir" ,
            "Karşıyaka İpek Eczanesi \n Bahriye Üçok Bulv. No.15/3-A Karşıyaka Devlet Hast Semp 1 No Lu Poliklinik Yanı Karşıyaka/İzmir" ,
            "Karşıyaka Merkez Eczanesi \n B.Üçok Bul. No. 15/1-A Karşıyaka/İzmir" ,
            "Karşıyaka Sağlık Eczanesi \n Soğukkuyu Mah.. Bahriye Üçok Blv. 15/3B Karşıyaka/İzmir" ,
            "Karşıyaka Sevgi Eczanesi \n Eshot Sok. İzsu Tedaş Karşısı 1710 Sok. 48/A Karşıyaka/İzmir",
            "Manolya Eczanesi \n Bahariye Mah.. Atatürk Bulv. No.4/B Zübeyde Hanım Tıp Merkezi Karşısı Karşıyaka/İzmir" ,
            "Maviköşe Eczanesi \n 1688 Sok. No.54 Celal Bey Asfaltı Karşıyaka/İzmir" ,
            "Nazlı Eczanesi \n Yalı Cad. No.364/A Deü Poliklinik Yanı Karşıyaka/İzmir" ,
            "Özdecan Eczanesi \n Donanmacı Mah.Cemal Gürsel Cad. No.354/A Karşıyaka/İzmir" ,
            "Pınar Öz Eczanesi \n Donanmacı Mah. 1728 Sok.No.:58/A Kilise Sokağı Karşıyaka/İzmir" ,
            "Rüya Eczanesi \n 	B.Üçok Bulvarı No.1/2-A Hükümet Konağı Karşısı Karşıyaka/İzmir" ,
            "Sefa Eczanesi \n 1693 Sok. No.56/A Mehmet İhsan Zeyrek Sokağı Karşıyaka/İzmir" ,
            "Yeni Afşin Eczanesi \n 1715 Sok. No.35/A Banka Sokağı Karşıyaka/İzmir" ,
            "Yeni İpek Eczanesi \n 1710 Sok. No.33/1 Karşıyaka/İzmir" ,
            "Yeni Kuter Eczanesi \n Donanmacı Mah.. 1728 Sok. No.63/A Karşıyaka/İzmir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama açıldığında çalıştırılan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karsiyaka);

        ArrayList<KarsiyakaEczane> karsiyakaEczanes = new ArrayList<KarsiyakaEczane>();

        for (int i = 0 ; i< eczaneKarsiyaka.length ;i++){

            karsiyakaEczanes.add(new KarsiyakaEczane(eczaneKarsiyaka[i]));

        }


        KarsiyakaAdapter karsiyakaAdapter = new KarsiyakaAdapter(this,R.layout.karsiyaka,karsiyakaEczanes);

        ListView listviewEczanekarsi = (ListView)findViewById(R.id.listView_karsiyaka);

        if (listviewEczanekarsi!= null){

            listviewEczanekarsi.setAdapter(karsiyakaAdapter);
        }

    }
}

