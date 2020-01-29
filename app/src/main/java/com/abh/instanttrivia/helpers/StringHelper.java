package com.abh.instanttrivia.helpers;

import java.util.regex.Pattern;

public class StringHelper{

    //tests if a string has email format
    public static boolean isEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static boolean isUsername(String username){
        if(username.length() >= 6){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPassword(String password){
        if(password.length() >= 8){
            return true;
        }else{
            return false;
        }
    }
}
