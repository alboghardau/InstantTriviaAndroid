package com.abh.instanttrivia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.abh.instanttrivia.R;
import com.abh.instanttrivia.model.Question;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.services.QuestionService;
import com.abh.instanttrivia.services.UserService;

public class LoginActivity extends AppCompatActivity {

    //UI VARIABLES
    TextView textUsername;
    TextView textPassword;
    TextView textRegister;

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        //UI ELEMENTS
        textUsername = (TextView) findViewById(R.id.textUsername);
        textPassword = (TextView) findViewById(R.id.textPassword);
        textRegister = (TextView) findViewById(R.id.textRegister);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textUsername.getText().equals("") && !textPassword.getText().equals("")){
                    User user = new User.Builder()
                            .email(textUsername.getText().toString())
                            .password((String) textPassword.getText().toString())
                            .build();
                    UserService userService = new UserService(user, getSharedPreferences("settings", MODE_PRIVATE));

                    String message = userService.loginUser();
                    if(message.equals("Login succeeded!")){
                        Toast.makeText(getApplication(), message,
                                Toast.LENGTH_SHORT).show();
                        goDashboard();
                    }else{
                        Toast.makeText(getApplication(), message,
                                Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });





    }

    private void goRegister(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    private void goDashboard(){
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
}
