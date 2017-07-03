package com.example.ludio.zetbio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Ludio on 2017-05-12.
 */

public class MainViewActivity extends AppCompatActivity {
    private LinearLayout testView;
    private LinearLayout testResultView;
    private LinearLayout informationView;
    private LinearLayout setUpView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        testResultView.setOnClickListener(new testResultListener());
        setUpView.setOnClickListener(new setUpListener());


    }

    private void initialize() {
        testView = (LinearLayout) findViewById(R.id.test);
        testResultView = (LinearLayout) findViewById(R.id.testResult);
        informationView = (LinearLayout) findViewById(R.id.informationSearch);
        setUpView = (LinearLayout) findViewById(R.id.set_Up);
    }

    private class testResultListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainViewActivity.this, PsearchActivity.class);
            MainViewActivity.this.startActivity(intent);
        }
    }

    private class setUpListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainViewActivity.this, SetUpActivity.class);
            MainViewActivity.this.startActivity(intent);
        }
    }

}
