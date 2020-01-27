package com.abh.instanttrivia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.abh.instanttrivia.R;
import com.abh.instanttrivia.helpers.StringHelper;
import com.abh.instanttrivia.model.User;

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

        //TODO Complete
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(StringHelper.isEmail(textEmail.getText().toString() ){
                    User user = new User.Builder()

                            .build();
                }
            }
        });

    }

}
