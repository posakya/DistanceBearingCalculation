package com.ar_tech.distancebearing;

public class DistanceBearingCalculation {

        /*

            determining the bearing angle

         */

    public static double bearing(double lat1, double lng1, double lat2, double lng2) {

        double dLon = Math.toRadians(lng2 - lng1);

        double x = Math.sin(Math.toRadians(dLon)) * Math.cos(Math.toRadians(lat2));
        double y = Math.cos(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) - Math.sin(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(dLon));
        double bearing = Math.toDegrees((Math.atan2(x, y)));
        bearing = (360 - ((bearing + 360) % 360));

        return bearing;
    }

        /*

            determining the distance between two gps coordinates point

         */

    public static double distance(double lat1, double lng1, double lat2, double lng2) {

        double R = 6371e3;
        double dLon = Math.toRadians(lng2 - lng1);
        double dLat = Math.toRadians(lat2 - lat1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1) * Math.cos(Math.toRadians(lat2)))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c; // distance in meter

        return distance;

    }
}


