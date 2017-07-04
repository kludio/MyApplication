package com.example.ludio.zetbio;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Ludio Lee JH
 * Created by Ludio on 2017-06-02.
 */

public class PsearchActivity extends AppCompatActivity {
    private EditText patient_Search_Box;
    private Button recentSearchButton;
    private Button patientInterestButton;
    private LinearLayout recentSearchLayout;
    private LinearLayout patientInterestLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_search);

        initialize();

        recentSearchLayout.setVisibility(View.VISIBLE);
        patientInterestLayout.setVisibility(View.GONE);

        patientInterestButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                changeView(1);
            }
        });

        recentSearchButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                changeView(0);
            }
        });
    }

    private void initialize() {
        patient_Search_Box = (EditText) findViewById(R.id.patient_search_box);
        recentSearchButton = (Button) findViewById(R.id.recentSearch_button);
        patientInterestButton = (Button) findViewById(R.id.patient_interest_button);
        recentSearchLayout = (LinearLayout) findViewById(R.id.recentsearch_layout);
        patientInterestLayout = (LinearLayout) findViewById(R.id.patient_interest_layout);

    }

    private void changeView(int index) {
        switch(index) {
            case 0:
                recentSearchButton.setBackgroundResource(R.drawable.shape_button_search);
                patientInterestButton.setBackgroundResource(R.drawable.shape_button_searchd);

                recentSearchLayout.setVisibility(View.VISIBLE);
                patientInterestLayout.setVisibility(View.GONE);

            case 1:
                recentSearchButton.setBackgroundResource(R.drawable.shape_button_searchd);
                patientInterestButton.setBackgroundResource(R.drawable.shape_button_search);

                recentSearchLayout.setVisibility(View.GONE);
                patientInterestLayout.setVisibility(View.VISIBLE);
        }

    }

}
