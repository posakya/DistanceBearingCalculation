package com.ar_tech.bearingdirection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       double lat1 = 39.099912;
       double lat2 = 38.627089;
       double lng1 = -94.581213;
       double lng2 = -90.200203;

        /*

           determining the bearing angle

        */

       double bearing = DistanceBearingCalculation.bearing(lat1,lng1,lat2,lng2);
       System.out.println("Bearing : "+bearing);


        /*

           determining the distance between two gps coordinates point

        */

       double distance = DistanceBearingCalculation.distance(lat1,lng1,lat2,lng2);
       System.out.println("Distance : "+distance);


    }



}
