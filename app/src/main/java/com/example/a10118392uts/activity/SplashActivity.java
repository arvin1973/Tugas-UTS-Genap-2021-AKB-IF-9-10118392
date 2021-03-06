package com.example.a10118392uts.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.a10118392uts.MainActivity;
import com.example.a10118392uts.R;

/*
* Tanggal pengerjaan : 2 Juni 2021
* Nim                : 10118392
* Nama               : Raden Arvin Rizky A
* Kelas              : IF-9
* */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}