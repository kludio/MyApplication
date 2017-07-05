package com.example.ludio.zetbio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Ludio NAME
 * Created by Ludio on 2017-07-05.
 */

public class Earthinformation extends AppCompatActivity {

    private LinearLayout koreaLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earth_information);

        initialize();

        koreaLayout.setOnClickListener(new koreaLayoutListener());
    }

    private void initialize() {
        koreaLayout = (LinearLayout) findViewById(R.id.korea_layout);
    }

    private class koreaLayoutListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Earthinformation.this, CountryInformationActivity.class);
            Earthinformation.this.startActivity(intent);
        }
    }

}
