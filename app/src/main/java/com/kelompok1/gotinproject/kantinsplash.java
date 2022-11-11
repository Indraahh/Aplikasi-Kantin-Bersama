package com.kelompok1.gotinproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class kantinsplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kantinsplash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread = new Thread(){
            @Override
            public void run(){
                try{
                    MediaPlayer suara = MediaPlayer.create(kantinsplash.this,R.raw.kantinintro);
                    suara.start();
                    sleep(5000);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally{
                    startActivity(new Intent(kantinsplash.this, halamanawal.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}