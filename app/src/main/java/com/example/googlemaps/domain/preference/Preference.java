package com.example.googlemaps.domain.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {
    private static Preference single_instance = null;
    private final SharedPreferences preferences;

    private Preference(Context context) {
        preferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
    }

    public void polygonUsed() {
        preferences.edit().putBoolean("isPolygon", true).apply();
    }

    public boolean isPolygonUsed() {
        return preferences.getBoolean("isPolygon", false);
    }

    public static Preference getInstance(Context context) {
        return single_instance = new Preference(context);
    }

    public static Preference getInstance() {
        return single_instance;
    }

    public void polylineUsed() {
        preferences.edit().putBoolean("isPolyline", true).apply();
    }

    public boolean isPolylineUsed() {
        return preferences.getBoolean("isPolyline", false);
    }

}
