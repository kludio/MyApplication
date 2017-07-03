package com.example.ludio.zetbio;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;

/**
 * Created by Ludio on 2017-05-18.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler(){
            public void handleMessage(Message msg){
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 3000);
    }
}
