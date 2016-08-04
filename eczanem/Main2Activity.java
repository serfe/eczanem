package com.example.serife.eczanem;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
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

public class Main2Activity extends AppCompatActivity {

    String url = "http://www.hastanebul.com.tr/izmir-eczaneler";

    ProgressDialog mProgressDialog;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public ArrayList<String> listValues;

    public EczaneAdapter eczaneAdapter ;

    public ListView listem ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listValues = new ArrayList<>();

        eczaneAdapter = new EczaneAdapter(this,listValues);

        Button eczbutton = (Button) findViewById(R.id.eczbutton);

        eczbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                new Ecczz().execute();
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

    // Ecczz AsyncTask
    public class Ecczz extends AsyncTask<Void, Void, Void> {

        String eczanem_isim;
        String eczanem_address;
        Eczane ecz[]=null;
        int i ;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(Main2Activity.this);
            mProgressDialog.setTitle("Eczaneler");
            mProgressDialog.setMessage("eczaneler alınıyor...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {

            try {


                Document document = Jsoup.connect(url).get();

                Elements table_class = document.getElementsByClass("table-striped");

                Elements table = table_class.select("table");

                Elements row = table.select("tr");

                ecz=new Eczane[row.size()];

                for (Element rows: row){

                    int i = 0;

                    ecz[i]=new Eczane(eczanem_isim,eczanem_address);

                    Elements column = rows.getElementsByTag("td");


                    for (Element columnsisim : column) {
                        columnsisim = column.get(2);
                        eczanem_isim = columnsisim.text().toString();
                    }
                    for (Element columnsadress : column) {
                        columnsadress = column.get(4);
                        eczanem_address = columnsadress.text().toString();

                    }

                    Log.e("tag", ecz[i].getName() + ecz[i].getAddress());

                    listValues.add(ecz[i].getName()+"\n"+ecz[i].getAddress());

                    i++;
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {

            System.out.println(listValues);

            listem = (ListView) findViewById(R.id.listView_eczanes);

            listem.setAdapter(eczaneAdapter);

            mProgressDialog.dismiss();
        }
    }}

