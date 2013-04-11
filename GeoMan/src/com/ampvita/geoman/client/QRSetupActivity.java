package com.ampvita.geoman.client;

import com.ampvita.geoman.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Toast;

public class QRSetupActivity extends Activity {
	public boolean isHost;

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		IntentResult scanResult = IntentIntegrator.parseActivityResult(
				requestCode, resultCode, intent);
		if (scanResult != null) {
			setContentView(R.layout.activity_qr_setup);
			Toast.makeText(this, scanResult.getContents(), Toast.LENGTH_LONG)
					.show();
		}
		// else continue with any other code you need in the method
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qr_setup);

		Intent intent = getIntent();
		isHost = intent.getBooleanExtra("isHost", false);

		IntentIntegrator integrator = new IntentIntegrator(this);
		if (isHost) {
			integrator.addExtra("ENCODE_SHOW_CONTENTS", false);
			integrator.shareText("Hey Richard!");
		} else {
			integrator.initiateScan(IntentIntegrator.QR_CODE_TYPES);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.geo_man, menu);
		return true;
	}

}
