package com.example.serife.eczanem;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Buca extends Main4Activity {

    private String[] eczaneBuca = {"Anadolu Eczanesi \n 259 Sok. No.25/A Seyfi Demirsoy Hastanesi Arka Sokağı Aile Hekimliği Karşısı Buca 1/İzmir" ,
            "Buca Can Eczanesi \n Vali Rahmi Bey Mah. Özmen Cad. No.124/A Buca 1/İzmir" ,
            "Buca Eczanesi \n Uğur Mumcu Cad. No.2 Heykel Meydanı Buca 1/İzmir " ,
            "Buca Erdem Eczanesi \n 223 Sok. No.20/A Buca Pazaryeri Altıneller Düğün Salonu Arkası Buca 1/İzmir" ,
            "Buca Itır Eczanesi \n Özmen Cad. No.112 Buca Seyfi Demirsoy Hast Karşısı Buca 1/İzmir" ,
            "Buca Neşe Eczanesi \n Özmen Cad. No.130 Buca 1/İzmir" ,
            "Buca Özlem Eczanesi \n 223 Sok. No.59/A Buca Spor Tesisleri Arkası Buca 1/İzmir" ,
            "Buca Park Eczanesi \n 223 Sok. No.31/A Buca 1/İzmir" ,
            "Buca Tunalı Eczanesi \n Kozağaç Mah.. 223 Sok. No.45 Buca 1/İzmir" ,
            "Demirsoy Eczanesi \n  Vali Rahmi Bey Mah.. Özmen Cad. No.122/A Buca 1/İzmir" ,
            "Eczane Deniz Eczanesi \n Buca Seyfi Demirsoy Devlet Hastanesi Karşısı Özmen Cad. No.114/B Buca 1/İzmir",
            "Ege Işık Eczanesi \n Kozağaç Mah.. 249 Sok.No.:13/B Buca 1/İzmir" ,
            "Erciyas Eczanesi \n Özmen Cad. No.126/A(Seyfi Demirsoy Devl. Hast. Karşısı) Buca 1/İzmir" ,
            "Erim Eczanesi	\n 127 Sok. No.40/B Ssk Buca Hast. Cad. Buca 1/İzmir" ,
            "Handan Eczanesi \n Özmen Cad. No.40 Buca Spor Tesisleri Karşısı Buca 1/İzmir" ,
            "Helin Eczanesi \n Menderes Mah.. 157 Sok. No.37/A Buca 1/İzmir" ,
            "Heykel Eczanesi \n Uğur Mumcu Cad. 1/B Heykel Meyd. Buca 1/İzmir" ,
            "Mat Eczanesi \n Uğur Mumcu Cad. 31/G Deu Eğitim Fak Karşısı Buca 1/İzmir" ,
            "Metegün Eczanesi \n Yaylacık Mah.. Erdem Cad.No.164 Buca 1/İzmir" ,
            "Millet Eczanesi \n Üçkuyular Meyd. 222 Sok. No.1-3A Buca 1/İzmir",
            "Nevin Eczanesi \n Yaylacık Mah. Başarı Cad. No. 69/B Buca 1/İzmir" ,
            "Nur Eczanesi \n Seyfi Demirsoy Cad. 20/B Evka 1 Girişi-Belediye Sarayı Karşısı Buca 1/İzmir" ,
            "Öncü Eczanesi \n Rahmi Bey Mah. 159 Sok. No. 4/A Buca 1/İzmir" ,
            "Özmen Eczanesi \n Özmen Cad. No.143/A(Ssk Yanı) Buca 1/İzmir" ,
            "Polatoğlu Eczanesi \n Seyfi Demirsoy Devlet Hast. Karşısı Özmen Cad. No. 120/B Buca 1/İzmir" ,
            "Seram Eczanesi \n Özmen Cad. No. 128/B Buca Devlet Hastanesi Krş. Buca 1/İzmir" ,
            "Serhan Eczanesi \n Seyfi Demirsoy Cad.No. 19/A belediye Sarayı Karşısı Evka 1 Girişi Buca 1/İzmir",
            "Sudem Eczanesi \n Özmen Cad. No.118/B Buca 1/İzmir " , "Tiryakioğlu Eczanesi \n 	159/1 Sok. No.2 Buca 1/İzmir" ,
            "Yaylacık Eczanesi \n Yaylacık Mah. Başarı Cad. No.104/A Buca 1/İzmir" ,
            "Yeni Ayşegül Eczanesi \n Menderes Cad. 74/C Buca 1/İzmir" ,
            "Yeni Hazar Eczanesi \n Kozağaç Mah.. Özmen Cad.No.145 Seyfi Demirsoy Hast. Yanı Buca 1/İzmir" ,
            "Yeni Nevin Eczanesi \n Yaylacık Mah.. Başarı Cad. No.98 Buca 1/İzmir" ,
            "Yeni Pelin Eczanesi \n	118 Sok. 26/B İhtiyari Durak Evka 1 Dolmuş Yolu Girişi Buca 1/İzmir" ,
            "Açelya Eczanesi \n M.Ahmet Yesevi C. N. 19/A Buca 2/İzmir" ,
            "Akgün Eczanesi \n M.Ahmet Yesevi Cad. 206/7 Sok. No. 198/D Buca 2/İzmir" ,
            "Aksu Eczanesi \n Yenigün Mah.. 222/14 Sok. No.3/A Buca 2/İzmir" ,
            "Aslım Eczanesi \n Kuruçeşme Mah. Ahmet Piriştina Bulv. No.66/C Buca 2/İzmir " ,
            "Bayram Eczanesi \n Kuruçeşme Mah.. 205 Sok. No.23/A Özel Tınaztepe Hast. Acil Yanı Buca 2/İzmir" ,
            "Buca Koop Eczanesi \n Buca Koop Meydanı Pehlivanoğlu Karşısı Buca 2/İzmir" ,
            "Buca Şifa Eczanesi \n Atatürk Mah..206/13 Sok. No.9/A Buca Kadın Doğum Hast. Karşısı Buca 2/İzmir" ,
            "Çamlıkule Eczanesi \n Çamlıkule Mah. 222/34 Sok. No. 4/A Buca 2/İzmir" ,
            "Cebe Eczanesi \n Çamlıkule Mah.. 254 Sok. No.184/2 Buca 2/İzmir" ,
            "Ceylan Eczanesi \n Atatürk Mah.. 206/13 Sok. No.5/C Buca Kadın Doğum Karş. Buca 2/İzmir" ,
            "Gürkan Eczanesi \n Özel Tınaztepe Hastanesi Acil Karşısı 205 Sok. No.28 Kuruçeşme-Buca Buca 2/İzmir" ,
            "Hayat Eczanesi \n 	Atatürk Mah..206/13 Sok.No.7 Buca Doğum Evi Hast. Karş. Buca 2/İzmir " ,
            "Hayriye Eczanesi \n Yenigün Mah.. 222/11 No.22/A Buca 2/İzmir" ,
            "Irmak Eczanesi \n Çamlıkule Mah.. 222/24 Sok. No 22/A Buca 2/İzmir" ,
            "Kaynaklar Eczanesi \n Kuruçeşme Mah. Hoca Ahmet Yesevi Cad. No.168/B Buca 2/İzmir" ,
            "Kuruçeşme Eczanesi \n Hoca Ahmet Yesevi Cad. No. 174 Kuruçeşme Buca 2/İzmir" ,
            "Sultan Eczanesi \n Ahmet Piriştina Bulv No.70/A Özel Tınaztepe Hast. Poliklinik Krş. Buca 2/İzmir " ,
            "Yeni Çağlar Eczanesi \n Yıldız Mah. Ahmet Hoca Yesevi Cad. No. 36 Buca Doğum Hastanesi Çaprazı Buca 2/İzmir" ,
            "Yeni Emre Eczanesi \n Kozağaç Mey. G.Y.İsmail Sivri C. 222 S. N.126 Buca 2/İzmir" ,
            "Yeni Seda Eczanesi \n 	Yıldız Mah. 206/5 Sok. 91/B Buca 2/İzmir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buca);

            ArrayList<BucaEczane> bucaEczanes= new ArrayList<BucaEczane>();

            for (int i = 0 ; i< eczaneBuca.length ;i++){

                bucaEczanes.add(new BucaEczane(eczaneBuca[i]));

            }


           BucaAdapter bucaAdapter = new BucaAdapter(this,R.layout.buca,bucaEczanes);

            ListView listviewEczanebuca = (ListView)findViewById(R.id.listView_buca);

            if (listviewEczanebuca!= null){

                listviewEczanebuca.setAdapter(bucaAdapter);
            }


        }
    }
