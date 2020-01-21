package com.abh.instanttrivia.services;

import android.util.Log;

import com.abh.instanttrivia.interfaces.QuestionInterface;
import com.abh.instanttrivia.model.Question;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class QuestionService implements QuestionInterface {

    private SendPostService sendPostService;

    public QuestionService(SendPostService sendPostService) {
        this.sendPostService = sendPostService;
    }

    @Override
    public Question getRandomQuestion() {
        try {
            String data = this.sendPostService.execute("http://itrivia.eu/api/question/getRandomQuestion/").get();
            Log.e("DATA", data);
            JSONObject jsonObject = new JSONObject(data);

            Question question = new Question();
            question.setQuestion(jsonObject.getString("Question"));

            Log.e("OBJ", question.toString());

            return question;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
