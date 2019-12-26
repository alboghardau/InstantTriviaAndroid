package com.abh.instanttrivia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.abh.instanttrivia.R;
import com.abh.instanttrivia.model.User;

public class LoginActivity extends AppCompatActivity {

    //UI VARIABLES
    TextView usernameText;
    TextView passwordText;

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //UI ELEMENTS
        usernameText = (TextView) findViewById(R.id.usernameText);
        passwordText = (TextView) findViewById(R.id.passwordText);
        loginButton = (Button) findViewById(R.id.loginButton);



    }
}
