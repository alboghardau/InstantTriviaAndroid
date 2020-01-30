package com.abh.instanttrivia.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class QuestionHelper {

    //TODO - test
    public static List<Character> getAnswerChars(String answer){
        List<Character> list = new ArrayList<>();
        String randomchars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(Character character : answer.toCharArray()){
            list.add(character);
        }

        list = list.stream().distinct().collect(Collectors.toList());

        while(list.size() < 16){
            Random random = new Random();
            Character character = randomchars.charAt(random.nextInt(randomchars.length()));
            if(!list.contains(character)){
                list.add(character);
            }
        }

        Collections.shuffle(list);
        return list;
    }
}
