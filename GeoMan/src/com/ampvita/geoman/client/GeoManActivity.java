package com.ampvita.geoman.client;

import com.ampvita.geoman.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class GeoManActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_man);

        final Intent qr = new Intent(this, QRSetupActivity.class);
        final Button hostButton = (Button) findViewById(R.id.host);
        hostButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	qr.putExtra("isHost", true);
            	startActivity(qr);
            }
        });
        
        final Button guestButton = (Button) findViewById(R.id.guest);
        guestButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	startActivity(qr);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.geo_man, menu);
        return true;
    }
    
}
