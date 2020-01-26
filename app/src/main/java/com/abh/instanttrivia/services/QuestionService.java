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
    @Override
    public Question getRandomQuestion() {
        try {
            String data   = new WebPostAsync().execute("http://itrivia.eu/api/question/getRandomQuestion/", "").get();

            JSONObject questionJson = new JSONObject(data);
            Question question = new Question.Builder()
                    .id(Integer.parseInt(questionJson.getString("Id")))
                    .question(questionJson.getString("Question"))
                    .answer(questionJson.getString("Answer"))
                    .difficulty(Double.parseDouble(questionJson.getString("Difficulty")))
                    .build();

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
