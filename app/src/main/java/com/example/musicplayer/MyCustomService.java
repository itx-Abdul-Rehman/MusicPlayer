package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.provider.Settings;

import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuAdapter;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MyCustomService extends Service {

   private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player=MediaPlayer.create(this, R.raw.amp);
        player.setLooping(true);
        player.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
