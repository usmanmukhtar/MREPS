package com.example.usmanmukhtar.mreps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
//    Animation fromtop;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView) findViewById(R.id.imgLogo);
//        fromtop = AnimationUtils.loadAnimation(this, R.anim.from_top);

//        logo.setAnimation(fromtop);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashScreen.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
