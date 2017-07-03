package com.example.ludio.zetbio;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ludio on 2017-05-19.
 */

public class SignUpActivity extends AppCompatActivity{
    private Button overlapButton;
    private Button signupCompleteButton;

    private TextView hospital_ID;
    private EditText signup_InputID;
    private EditText signup_InputName;
    private EditText signup_InputPW;
    private EditText signup_InputEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        initialize();
        signupCompleteButton.setOnClickListener(new SignUpCompleteButtonListner());
    }

    private void initialize(){
        signupCompleteButton = (Button) findViewById(R.id.signup_completeButton);
        overlapButton = (Button) findViewById(R.id.overlap_button);
        hospital_ID = (TextView) findViewById(R.id.hospital_id);
        signup_InputID = (EditText) findViewById(R.id.signUp_ID);
        signup_InputName = (EditText) findViewById(R.id.signUp_name);
        signup_InputPW = (EditText) findViewById(R.id.signUp_PW);
        signup_InputEmail = (EditText) findViewById(R.id.signUp_email);
    }

    private class SignUpCompleteButtonListner implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            SignUpActivity.this.startActivity(intent);
        }
    }

}
