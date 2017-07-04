package com.example.ludio.zetbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText idInput;
    private EditText passwordInput;
    private Button loginButton;
    private Button signUpButton;
    private Button findIdPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Splashscreen.class));
        setContentView(R.layout.login_view);
        initialize();
        loginButton.setOnClickListener(new LoginButtonListener());
        signUpButton.setOnClickListener(new SignUpButtonListener());
        findIdPassword.setOnClickListener(new FindIdPasswordListener());

    }

    private void initialize() {
        idInput = (EditText) findViewById(R.id.editID);
        passwordInput = (EditText) findViewById(R.id.editPW);
        loginButton = (Button) findViewById(R.id.loginbutton);
        signUpButton = (Button) findViewById(R.id.signUp);
        findIdPassword = (Button) findViewById(R.id.findIdPassword);
    }

    private class LoginButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
//            String id = idInput.getText().toString();
//            String password = passwordInput.getText().toString();
//
//            if(id.isEmpty() || password.isEmpty()){
//                Toast.makeText(MainActivity.this, "빈칸을 채워주세요", Toast.LENGTH_SHORT).show();
//                return;
//            }
            Intent intent = new Intent(MainActivity.this, MainViewActivity.class);
            MainActivity.this.startActivity(intent);


        }
    }

    private class SignUpButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivityForResult(intent, 1000);
        }
    }

    private class FindIdPasswordListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, FindIdPasswordActivity.class);
            startActivityForResult(intent, 1000);
        }
    }

}
