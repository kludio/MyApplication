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

        recentSearchButton.setOnClickListener(new recentSearchListener());
        patientInterestLayout.setOnClickListener(new patientInterestListener());

    }

    private void initialize() {
        patient_Search_Box = (EditText) findViewById(R.id.patient_search_box);
        recentSearchButton = (Button) findViewById(R.id.recentSearch_button);
        patientInterestButton = (Button) findViewById(R.id.patient_interest_button);
        recentSearchLayout = (LinearLayout) findViewById(R.id.recentsearch_layout);
        patientInterestLayout = (LinearLayout) findViewById(R.id.patient_interest_layout);

        recentSearchLayout.setVisibility(View.VISIBLE);
        patientInterestLayout.setVisibility(View.GONE);
    }

    private class recentSearchListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (recentSearchLayout.getVisibility() == View.GONE) {
                recentSearchButton.setBackgroundColor(Color.rgb(204, 204, 204));
                patientInterestButton.setBackgroundColor(Color.rgb(102, 102, 102));

                recentSearchLayout.setVisibility(View.VISIBLE);
                patientInterestLayout.setVisibility(View.GONE);
            }

        }
    }

    private class patientInterestListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (patientInterestLayout.getVisibility() == View.GONE) {
                recentSearchButton.setBackgroundColor(Color.rgb(102, 102, 102));
                patientInterestButton.setBackgroundColor(Color.rgb(204, 204, 204));

                recentSearchLayout.setVisibility(View.GONE);
                patientInterestLayout.setVisibility(View.VISIBLE);
            }
        }
    }

}
