package com.example.ludio.zetbio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Ludio on 2017-06-19.
 */

public class SetUpActivity extends AppCompatActivity{
    private LinearLayout newPatientLayout;
    private LinearLayout bkPatientLayout;
    private LinearLayout deviceLinkLayout;
    private LinearLayout selectLanguageLayout;
    private LinearLayout logoutLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_up);

        initialize();

        newPatientLayout.setOnClickListener(new newPatientListener());
    }

    private void initialize() {
        newPatientLayout = (LinearLayout) findViewById(R.id.new_patient_layout);
        bkPatientLayout = (LinearLayout) findViewById(R.id.bkpatient_layout);
        deviceLinkLayout = (LinearLayout) findViewById(R.id.devicelink_layout);
        selectLanguageLayout = (LinearLayout) findViewById(R.id.selectlanguage_layout);
        logoutLayout = (LinearLayout) findViewById(R.id.logout_layout);

    }

    private class newPatientListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(SetUpActivity.this, NewPatientRegister.class);
            SetUpActivity.this.startActivity(intent);
        }
    }
}
