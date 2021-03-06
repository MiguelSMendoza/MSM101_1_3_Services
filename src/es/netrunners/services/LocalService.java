package es.netrunners.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class LocalService extends Service {

	private static final String TAG = "LocalService";
	MediaPlayer player;
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	@Override
	public void onCreate() {
		Toast.makeText(this, "LocalService Created", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onCreate");		
		player = MediaPlayer.create(this, R.raw.sample);
		player.setLooping(false); // Set looping
	}
	
	@Override
	public void onDestroy() {
		Toast.makeText(this, "LocalService Destroyed", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onDestroy");
		player.stop();
	}
	
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "LocalService Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
		player.start();
	}
}
