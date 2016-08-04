package com.example.serife.eczanem;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;


public class Main3Activity extends AppCompatActivity {

    String urlnew = "https://www.izmir.bel.tr/NobetciEczaneler/162/tr";

    ProgressDialog nProgressDialog;


    public ArrayList<String> listValuesnob;

    public NobEczaneAdapter nobeczaneAdapter ;

    public ListView listemnob ;





    private GoogleApiClient client;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listValuesnob = new ArrayList<>();

        nobeczaneAdapter = new NobEczaneAdapter(this,listValuesnob);

        Button eczbuttonnob = (Button) findViewById(R.id.eczbuttonnob);
        // Capture button click
        eczbuttonnob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                new EcczzNob().execute();
            }
        });
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


    }
    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.serife.eczanem/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.serife.eczanem/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }






        public class EcczzNob extends AsyncTask<Void, Void, Void> {

            String nobisim;
            String nobaddress;
            String nobsemt;
            NobEczane ecznob[]=null;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                nProgressDialog = new ProgressDialog(Main3Activity.this);
                nProgressDialog.setTitle("Eczaneler");
                nProgressDialog.setMessage("eczaneler alınıyor...");
                nProgressDialog.setIndeterminate(false);
                nProgressDialog.show();
            }

        int i = 0;

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect(urlnew).get();

                    Elements nobtable = document.getElementsByClass("grid");

                    Elements row = nobtable.select("tr");

                    ecznob = new NobEczane[row.size()];

                    for (Element rows : row) {

                        int i = 0;

                        ecznob[i] = new NobEczane(nobisim, nobaddress, nobsemt);

                        Elements column = rows.getElementsByTag("td");

                        for (Element columnsemt : column) {
                            columnsemt = column.get(0);
                            nobsemt = columnsemt.text().toString();
                        }


                        for (Element columnsisim : column) {
                            columnsisim = column.get(1);
                            nobisim = columnsisim.text().toString();
                        }
                        for (Element columnsadress : column) {
                            columnsadress = column.get(2);
                            nobaddress = columnsadress.text().toString();

                        }

                        Log.e("tag", ecznob[i].getNamenob() + ecznob[i].getAddressnob());

                        listValuesnob.add( ecznob[i].getSemtnob()+"\n"+ecznob[i].getNamenob() + " ECZANESİ " + "\n" + ecznob[i].getAddressnob());

                        i++;
                    }
                }

        catch (IOException e) {
            e.printStackTrace();
        }

                return  null;

    }
            @Override
            protected void onPostExecute(Void result) {

                System.out.println(listValuesnob);

                listemnob = (ListView) findViewById(R.id.listView_nob);

                listemnob.setAdapter(nobeczaneAdapter);


                nProgressDialog.dismiss();

            }}}



