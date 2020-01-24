package com.abh.instanttrivia.services;

import android.util.JsonReader;
import android.util.Log;

import com.abh.instanttrivia.interfaces.QuestionInterface;
import com.abh.instanttrivia.model.Category;
import com.abh.instanttrivia.model.Question;
import com.abh.instanttrivia.network.WebPostAsync;

import org.json.JSONObject;

public class QuestionService implements QuestionInterface {

    //TESTED
    public Question getRandomQuestion() {
        try {
            String data   = new WebPostAsync().execute("http://itrivia.eu/api/question/getRandomQuestion/", "").get();

            JSONObject questionJson = new JSONObject(data);
            Question question = new Question();
            question.setId(Integer.parseInt(questionJson.getString("Id")));
            question.setQuestion(questionJson.getString("Question"));
            question.setAnswer(questionJson.getString("Answer"));
            question.setDifficulty(Double.parseDouble(questionJson.getString("Difficulty")));

            JSONObject categoryJson = new JSONObject(questionJson.getString("Category"));
            Category category = new Category(categoryJson.getInt("Id"),
                    categoryJson.getString("Name"));

            question.setCategory(category);

            return question;
        } catch (Exception e){
            Log.e("Error", e.toString());
            return null;
        }
    }


}
