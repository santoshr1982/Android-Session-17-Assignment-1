package assignment.fragment.rsantosh.com.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    private MediaPlayer mMediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();

        mMediaPlayer = MediaPlayer.create(this,R.raw.merajootha);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(!mMediaPlayer.isPlaying()){

            mMediaPlayer.start();

        }


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mMediaPlayer.stop();
        mMediaPlayer.release();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
