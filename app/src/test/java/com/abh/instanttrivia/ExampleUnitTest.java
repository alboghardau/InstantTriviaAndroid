package com.abh.instanttrivia;

import com.abh.instanttrivia.helpers.QuestionHelper;

import org.junit.Test;

import java.io.Console;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        List<Character> list = QuestionHelper.getAnswerChars("ANSWER");
        System.out.println(list.toString());
    }
}