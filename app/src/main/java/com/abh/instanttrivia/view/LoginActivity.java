package com.abh.instanttrivia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.abh.instanttrivia.R;
import com.abh.instanttrivia.model.Question;
import com.abh.instanttrivia.model.User;
import com.abh.instanttrivia.services.QuestionService;
import com.abh.instanttrivia.services.SendPostService;

import org.json.JSONException;
import org.json.JSONObject;

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
//        usernameText = (TextView) findViewById(R.id.usernameText);
//        passwordText = (TextView) findViewById(R.id.passwordText);
//        loginButton = (Button) findViewById(R.id.loginButton);
        //test

//        JSONObject postData = new JSONObject();
//        try{
//            postData.put("email", "nelu8@gmail.com");
//            postData.put("username" , "nelu8");
//            postData.put("password", "1234");
//
//            new SendPostService().execute("http://itrivia.eu/api/question/getRandomQuestion/", postData.toString());
//        }catch (JSONException e){
//            e.printStackTrace();
//        }

        QuestionService questionService = new QuestionService(new SendPostService());
        Question question = questionService.getRandomQuestion();
        //Log.e("test", questionService.getRandomQuestion().toString());

    }
}
