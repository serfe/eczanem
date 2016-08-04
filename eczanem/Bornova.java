package com.example.serife.eczanem;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bornova extends Main4Activity {
    private String[] eczaneBornova= {"Alper Eczanesi \n Erzene Mah.. Kazım Karabekir Cad. No.32/C Ata Durağı Erbil Süel Karşısı Bornova 1/İzmir",
            "Altınbaş Eczanesi \n 129 Sok.No. 1/B 4. Sanayi Sit Bornova Devl Hast Karşısı Bornova 1/İzmir" ,
            "Benlioğlu Eczanesi \n M.Kemal Cad. No.26/D Ziraat Bankası Karşısı Bornova 1/İzmir" ,
            "Cadde Eczanesi \n Erzene Mah.. Gençlik Cad.No.23/A Bornova 1/İzmir" ,
            "Çınar Eczanesi \n Ergene Mah.. 456 Sok. No.17/B Bornova 1/İzmir",
            "Demirkan Eczanesi \n Evka 3 Mah. 129 Sok.No. 1/A Türkan Özilhan Hast Yanı Bornova 1/İzmir",
            "Hakan Eczanesi \n Bornova Devlet Hastanesi Karşısı 4. Sanayi Sitesi Girişi Shell Benzin İstasyonu Bornova 1/İzmir",
            "Haşlak Eczanesi \n 456 Sok. No.17/B (Semt Polikliniği Yanı) Bornova 1/İzmir ",
            "Özışıl Eczanesi \n Ergene Mah. 454 Sok. 1/B Bornova 1/İzmir ",
            "Pelit Eczanesi \n Erzene Mah. 456 Sok. No. 11/B Bornova 1/İzmir" ,
            "Soydan Eczanesi \n K.Dirik Mah..F.Çakmak Cad. 26/A Bornova 1/İzmir " ,
            "Yeni Aras Eczanesi \n Ergene Mah.453 Sok.No.:1/D Bornova 1/İzmir" ,
            "Yeni Ata Eczanesi \n Kazım Karabekir Cad. No.47 Ata Durağı Bornova 1/İzmir" ,
            "Yeni Bornova Eczanesi \n Erzene Mah.. 1. Sok.No. 4/A Bornova 1/İzmir" ,
            "Yeni Hayat Eczanesi \n  Türkeli Cad. No 3/A Ata Durağı İzsu Karşısı Bornova 1/İzmir",
            "Yeni Selin Eczanesi \n Ergene Mah.458 Sok. No.11/B Bornova 1/İzmir " ,
            "Akhisar Eczanesi \n Ankara Cad. No.241 Bornova 2/İzmir" ,
            "Arzum Eczanesi \n Kazım Dirik Mah. Süvari Cad. No.51/A Bornova 2/İzmir" ,
            "Bornova Ege Eczanesi \n Kazım Dirik Mah.. Üniversite Cad. No.32/B Bornova 2/İzmir ",
            "Bornova Gül Eczanesi \n Kazım Dirik Mah.. Zafer Cad. No.34/A Bornova Bornova 2/İzmir ",
            "Bornova Mavi Eczanesi \n M.Kemal Cad. No.37/A Bornova İzsu Karşısı Bornova 2/İzmir",
            "Bornova Ordu Eczanesi \n Kazım Dirik Mah.. Fatih Sultan Mehmet Sok. No.2/C Bornova 2/İzmir" ,
            "Bornova Palanduz Eczanesi \n Kazım Dirik Mah. 213 Sok. No.21/A Bornova 2/İzmir" ,
            "Bornova Tan Eczanesi \n Kazım Dirik Mah.. 213 Sok. No.31/A Bornova 2/İzmir" ,
            "Çevre Eczanesi \n  Ankara Cad. No.237/1A Bornova 2/İzmir" ,
            "Doğucan Eczanesi \n Yüzbaşı Mah.. İbrahim Hakkı Cad.No.:105/1 Bornova 2/İzmir" ,
            "Emin Eczanesi \n Kazım Dirik Mah. Üniversite Cad. No.36/A (E.Ü. Hast. Karşısı) Bornova 2/İzmir" ,
            "Erdönmez Eczanesi \n 186 Sok. No.5/1-B Üniv. Karşısı Shell Arkası Bornova 2/İzmir" ,
            "Gökçeli Eczanesi \n 186/1 Sok. No.3/A Bornova 2/İzmir" ,
            "İlgisu Eczanesi \n Üniversite Cad. No.30/A Bornova 2/İzmir",
            "İlhan Çırak Eczanesi \n Üniversite Cad. No. 38/A Bornova 2/İzmir ",
            "İzmir Eczanesi \n Ankara Cad. 227/A Shell Yanı Bornova 2/İzmir" ,
            "Kaftan Eczanesi \n Kazım Dirik Mah.. Ankara Cad. No 233 Bornova 2/İzmir",
            "Kayasan Eczanesi \n Kazım Dirik Mah. 214 Sok. No.1/A Bornova 2/İzmir",
            "Kulaksızoğlu Eczanesi \n 168 Sok. No.8/E Metro İst. Karşısı Bornova 2/İzmir" ,
            "Şengül Eczanesi \n Gediz Cad. 6/G Bornova 2/İzmir ",
            "Simav Eczanesi \n Kazım Dirik Mah.. Üniversite Cad. No.24/B Bornova 2/İzmir",
            "Tarımcı Eczanesi \n Üniversite Cad. No. 18/A Bornova 2/İzmir" ,
            "Üniversite Eczanesi \n Üniversite Cad. No.14/A Bornova 2/İzmir",
            "Vitamin Eczanesi \n Süvari Cad. No.44/A Bornova 2/İzmir",
            "Yavuz Eczanesi \n E.Ü. Cad. No.18 Hastane Karşısı Bornova 2/İzmir" ,
            "Yeni Abidin Eczanesi \n E.Ü Hastane Cad. No.26/A Bornova 2/İzmir" ,
            "	Yeni Filiz Eczanesi \n Ankara Cad. No.233/A Bornova 2/İzmir" ,
            "Yıldız Eczanesi \n Ankara Cad. No. 237/1-B Bornova 2/İzmir" ,
            "Ahsen Eczanesi \n 	273 Sok. No.10/1 Mansuroğlu Mah. Özkanlar Karakol Karşısı Bornova 3/İzmir" ,
            "Akgüneş Eczanesi \n Kazım Dirik Mah. 194 Sok. 46/C Şekerbank Karşısı Bornova 3/İzmir" ,
            "Arınç Eczanesi \n Haşim İşcan Cad. No.9/A Özkanlar Sitesi Bornova 3/İzmir" ,
            "Atalay Eczanesi \n Haydar Aliyev Cad. No.30 Bayraklı Folkart Yakını Bornova 3/İzmir ",
            "Bayraklı İnci Eczanesi \n Manavkuyu Mah. Alija İzet Begoviç Cad. 252 Sok. No.54/A Bornova 3/İzmir" ,
            "Belma Eczanesi \n M. Kemal Cad. No.155/D M. Kemal Lisesi Okul Durağı Manavkuyu Muhtarlık Karşısı Bornova 3/İzmir" ,
            "Betül Eczanesi \n Kazım Dirik Mah.. Mustafa Kemal Cad. No.120/1-B Bornova 3/İzmir" ,
            "	Bornova Ceren Eczanesi \n Manavkuyu Mah. Sakarya Cad. No.102 Bornova 3/İzmir" ,
            "Bornova Ece Eczanesi \n Fatih Sultan Mehmet Cad. No.34/A Bornova 3/İzmir" ,
            "Bornova Hülya Eczanesi \n M. Kemal Cad. 114/B Anadolu Bankası Karşısı Bornova 3/İzmir" ,
            "	Bornova Seçil Eczanesi \n Dumlupınar Cad. No.140/C Bornova 3/İzmir " ,
            "Çağında Eczanesi \n Mansuroğlu Mah.. 286 Sok. No.16/A Bornova 3/İzmir",
            "Çimecioğlu Eczanesi \n Mansuroğlu Mah. 273/1 Sok. No. 36/1-B Bornova 3/İzmir ",
            "Cun Eczanesi \n 	286 Sok. No. 29 Aydemir Plaza Kırçiçeği Karşısı Manavkuyu Bornova 3/İzmir",
            "Eczane Naturel Eczanesi \n Kazım Dirik Mah.. Mustafa Kemal Cad. No.121/1-D Bornova 3/İzmir" ,
            "Engin Eczanesi \n 236 Sok. No.3/B Bornova Bornova 3/İzmir" ,
            "Kibarlı Eczanesi \n 	Mansuroğlu Mah.. 273/6 Sok.No. 6/C Bornova 3/İzmir" ,
            "Kızmaz Eczanesi \n 2132 Sok. No. 91/A Bornova 3/İzmir" ,
            "Metin Eczanesi \n 	M. Kemal Cad. 132/D Doğa Sitesi Şekerbank Arkası Özkanlar Bornova 3/İzmir" ,
            "Nihan Okutan Eczanesi \n Manavkuyu Mah. Fatih Sultan Mehmet Cad. No.70/C Bornova 3/İzmir",
            "Önem Eczanesi \n 283/1 Sok. No. 19/L Manav Kuyu Bornova 3/İzmir" ,
            "Övünç Eczanesi \n Manavkuyu Mah.. 251/4 Sok.No. 7/A Bornova 3/İzmir" ,
            "Öykü Eczanesi \n 273/1 Sok. No. 2/B Bornova 3/İzmir" ,
            "Park Eczanesi \n Mansuroğlu Mah. 273/4 Sok. No. 8/B Bornova 3/İzmir" ,
            "Recep Altındağ Eczanesi \n Mustafa Kemal Cad. 144/A Bornova 3/İzmir",
            "Seçkin Eczanesi \n 273/4 Sok. 10/C Özkanlar Polis Karakolu Karşısı Bornova 3/İzmir" ,
            "Şirin Eczanesi \n 288/7 Sok. No. 1C-1D Bornova 3/İzmir " ,
            "Tan Eczanesi\n Adalet Mah.. 1594/1 Sok. No.76/B Adalet Sağlık Birimi Yanı Bornova 3/İzmir" ,
            "Taşkent Eczanesi \n 235 Sok.19/A Taşkent Taksi Durağı Karş. Migros Ark. Bornova 3/İzmir" ,
            "Tülün Eczanesi \n Manavkuyu Mah.. M.Kemal Cad. No.162/1-Df Bornova 3/İzmir" ,
            "Ufuk Eczanesi \n 	Adalet Mah. Haydar Aliyev Cad. No.18/C Bornova 3/İzmir" ,
            "Yazgan Eczanesi \n Mansuroğlu Mah.. 259 Sok. No.35 Bornova 3/İzmir" ,
            "Yeni Başar Eczanesi \n Şehit Pilot Üsteğmen Türker Aydın Sk 30/C Manavkuyu Bornova 3/İzmir" ,
            "Yeni Bulvar Eczanesi \n K. Dirik Mah. M. Kemal Cad. No.122/F Bornova 3/İzmir " ,
            "Yeni Işıl Eczanesi \n Mansuroğlu Mah. 266 Sok. No.10/C Özkanlar 19 Nolu Sağlık Birimi Karşısı Bornova 3/İzmir " ,
            "Yeni Nuray Eczanesi \n Sakarya Cad. 273/5 Sok. No.12/C Bornova 3/İzmir" ,
            "Yeni Öztürk Eczanesi \n Manavkuyu Mah..243 Sok. No.10/D Özkanlar Migros Yan Sokağı Bornova 3/İzmir" ,
            "Yonca Eczanesi \n Manavkuyu Mah. 275/8 Sok. No.10/D Bornova 3/İzmir"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bornova);



        ArrayList<BornovaEczane> bornovaEczanes= new ArrayList<BornovaEczane>();

        for (int i = 0 ; i< eczaneBornova.length ;i++){

            bornovaEczanes.add(new BornovaEczane(eczaneBornova[i]));

        }


        BornovaAdapter bornovaAdapter = new BornovaAdapter(this,R.layout.bornova,bornovaEczanes);

        ListView listviewEczanebornova = (ListView)findViewById(R.id.listView_bornova);

        if (listviewEczanebornova!= null){

            listviewEczanebornova.setAdapter(bornovaAdapter);
        }
}}

