package es.netrunners.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServicesActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button btnPlay = (Button) findViewById(R.id.btnPlay);
		btnPlay.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				getApplicationContext()
						.startService(
								new Intent(getApplicationContext(),
										LocalService.class));

			}
		});

		Button btnStop = (Button) findViewById(R.id.btnStop);
		btnStop.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				getApplicationContext()
						.stopService(
								new Intent(getApplicationContext(),
										LocalService.class));

			}
		});
	}

}