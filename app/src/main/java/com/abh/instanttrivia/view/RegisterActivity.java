package com.abh.instanttrivia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.abh.instanttrivia.R;
import com.abh.instanttrivia.helpers.StringHelper;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.services.UserService;

public class RegisterActivity extends AppCompatActivity {

    private TextView textEmail;
    private TextView textUsername;
    private TextView textPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textEmail = findViewById(R.id.textEmail);
        textUsername = findViewById(R.id.textUsername);
        textPassword = findViewById(R.id.textPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!StringHelper.isEmail(textEmail.getText().toString())){
                    Toast.makeText(getApplication(), "Email is not a valid format!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }else if(!StringHelper.isUsername(textUsername.getText().toString())){
                    Toast.makeText(getApplication(), "Username is less than 8 characters long!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }else if(!StringHelper.isPassword(textPassword.getText().toString())){
                    Toast.makeText(getApplication(), "Username is less than 8 characters long!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    User user = new User.Builder()
                            .email(textEmail.getText().toString())
                            .username(textUsername.getText().toString())
                            .password(textPassword.getText().toString())
                            .build();
                    UserService userService = new UserService(user,getSharedPreferences("settings", MODE_PRIVATE));
                    String message = userService.registerUser();
                    Toast.makeText(getApplication(), message,
                            Toast.LENGTH_SHORT).show();
                    if(message.equals("Register successful!")){
                        finish();
                    }
                }
            }
        });

    }

}
