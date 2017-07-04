package com.example.ludio.zetbio;


import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splashscreen extends Activity{
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    Thread splashThread;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscree);
        StartAnimations();
    }
    private void StartAnimations(){
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout I=(LinearLayout) findViewById(R.id.lin_lay);
        I.clearAnimation();
        I.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.splash);
        iv.clearAnimation();
        iv.startAnimation(anim);

        splashThread = new Thread()
        {
            public void run(){
                try{
                    int waited =0;

                    while (waited < 3500){
                        sleep(100);
                        waited += 100;

                    }
                    Intent intent = new Intent(Splashscreen.this, SignUpActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    Splashscreen.this.finish();
                }catch (InterruptedException e){

                }finally {
                    Splashscreen.this.finish();
                }
            }
        };
        splashThread.start();
    }
}