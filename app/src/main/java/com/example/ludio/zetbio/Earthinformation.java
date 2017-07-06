package com.example.ludio.zetbio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Ludio NAME
 * Created by Ludio on 2017-07-05.
 */

public class Earthinformation extends AppCompatActivity {

    private LinearLayout koreaLayout;
    private Button countrySearchButton;
    private Button continentSearchButton;
    private LinearLayout countryLayout;
    private LinearLayout continentLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earth_information);

        initialize();

        koreaLayout.setOnClickListener(new koreaLayoutListener());
        countryLayout.setVisibility(View.VISIBLE);
        continentLayout.setVisibility(View.GONE);

        continentSearchButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeView(1);
            }
        });

        countrySearchButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeView(0);
            }
        });
    }

    private void initialize() {
        koreaLayout = (LinearLayout) findViewById(R.id.korea_layout);
        countrySearchButton = (Button) findViewById(R.id.country_search_button);
        continentSearchButton = (Button) findViewById(R.id.continent_search_button);
        countryLayout = (LinearLayout) findViewById(R.id.country_layout);
        continentLayout = (LinearLayout) findViewById(R.id.continent_layout);
    }

    private class koreaLayoutListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Earthinformation.this, CountryInformationActivity.class);
            Earthinformation.this.startActivity(intent);
        }
    }

    private void changeView(int index) {
        switch (index) {
            case 0:
                countrySearchButton.setBackgroundResource(R.drawable.shape_button_search);
                continentSearchButton.setBackgroundResource(R.drawable.shape_button_searchd);

                countryLayout.setVisibility(View.VISIBLE);
                continentLayout.setVisibility(View.GONE);
                break;

            case 1:
                countrySearchButton.setBackgroundResource(R.drawable.shape_button_searchd);
                continentSearchButton.setBackgroundResource(R.drawable.shape_button_search);

                countryLayout.setVisibility(View.GONE);
                continentLayout.setVisibility(View.VISIBLE);
                break;
        }

    }

}
