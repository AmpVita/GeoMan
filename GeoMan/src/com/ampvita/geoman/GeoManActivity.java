package com.ampvita.geoman;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GeoManActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_man);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.geo_man, menu);
        return true;
    }
    
}