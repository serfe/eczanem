package com.example.serife.eczanem;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    public void onSearch(View view){
        EditText location_tf = (EditText)findViewById(R.id.adresstext);
        String location = location_tf.getText().toString();
        List<Address> addressList = null;

        if (location != null || !location.equals("")){

            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location,1);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Address adres = addressList.get(0);
            LatLng latlngm = new LatLng(adres.getLatitude() , adres.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latlngm).title(location));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latlngm));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlngm, 13));

        }
    }

    public void onChangeType(View view){
        if (mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL)
        {mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);}
        else
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    public void onZoom (View view){

        if (view.getId() == R.id.buttonzoom)
        {mMap.animateCamera(CameraUpdateFactory.zoomIn());}

        if (view.getId() == R.id.buttonzoomout) {
            mMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
        }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394678, 27.058420)).title("Eyüp Sabri Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394820, 27.058334)).title("Ahmet Kılıç Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394560, 27.058476)).title("Ülkü Vural Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.395034, 27.058278)).title("Yeni Öykü Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394773, 27.058565)).title("Yeni Barış Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394708, 27.058600)).title("Ayşe Pınar Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.394096, 27.057874)).title("Derman Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.392918, 27.056381)).title("Uge Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.391303, 27.054595)).title("İpek Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.391872, 27.051978)).title("Balçova Sağlık Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.464699, 27.118220)).title("Ali Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.456151, 27.118912)).title("Ataşen Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.454474, 27.114814)).title("Egeşan Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.454473, 27.114660)).title("Ekici Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.461786, 27.114997)).title("Epir Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.456697, 27.117574)).title("Ferah Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.458116, 27.120886)).title("Gürden Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.456241, 27.118906)).title("Güzin Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.457450, 27.116453)).title("İmbat Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4603447,27.1149801)).title(" Karahisarlı Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4576792,27.1133382)).title(" Karşıyaka Çağdaş Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4544432,27.1125273)).title(" Karşıyaka Çınar Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4583842,27.1120602)).title(" Karşıyaka İlke Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4553537,27.1104084)).title(" Karşıyaka İlker Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4616322,27.1123971)).title(" Karşıyaka Sağlık Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4615009,27.1144429)).title(" Karşıyaka İpek Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4570612,27.1178243)).title(" Karşıyaka Sevgi Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4618593,27.1128522)).title(" Manolya Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4579252,27.1190183)).title(" Maviköşe Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4507002,27.1106871)).title(" Nazlı Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4507712,27.1109323)).title(" Özdecan Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4507795,27.1109323)).title(" Pınar Öz Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4592212,27.1121012)).title(" Rüya Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4581322,27.1160465)).title(" Sefa Eczanesi  "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4581528,27.1094804)).title(" Yeni Afşin Eczanesi  "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4545132,27.1126193)).title(" Kuter Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4309383,27.1361572)).title("Palanduz Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4579472,27.2073392)).title("Üniversite Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4625452,27.2118212)).title("Vitamin Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4683062,27.2169253)).title("Pelit Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4641262,27.2224143)).title("Yenihayat Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4611432,27.2105513)).title("Arzum Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4593902,27.2075743)).title("Erdönmez Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4685432,27.2168513)).title("Yeni Selin Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4640512,27.2122073)).title("Bornova Mavi Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4589992,27.2065094)).title("Gökçeli Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4163855,27.1178839)).title("Yeni Universite Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4200412,27.1712608)).title("Burçak Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4160112,27.1279535)).title("Tüba Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4184352,27.1292833)).title("Sıhhat Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4176226,27.1140257)).title("Sayıner Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3997692,27.1582693)).title("Şah Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4229781,27.1335876)).title("Özgökçen Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4070512,27.1029515)).title("Karantina Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4196652,27.1280683)).title("Demirdöven Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4168792,27.1280993)).title("Coşkunoğlu Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4155618,27.1277913)).title("Cemre Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.4169092,27.1277703)).title("Aydıner Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.399018,27.0892113)).title("Göztepe Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3973353,27.0979227)).title("Anadolu Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.385189,27.1643563)).title("Buca Can Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3878852,27.1709792)).title("Buca Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3848207,27.1715923)).title("Buca Erdem Eczanesi "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3847912,27.1647983)).title("Buca Itır Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3854166,27.1639337)).title("Neşe eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3817562,27.1718773)).title("Buca Park Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3843702,27.1655432)).title("Erim Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3879962,27.1713842)).title("Heykel Eczanesi"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(38.3759752,27.1773593)).title("Yeni Çağlar Eczanesi"));



    }
}

