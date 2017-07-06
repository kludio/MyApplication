package com.example.ludio.zetbio;

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

public class CountryInformationActivity extends AppCompatActivity {
    private Button countrySearchButton;
    private Button continentSearchButton;
    private LinearLayout countryLayout;
    private LinearLayout continentLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_information);

    }

}
