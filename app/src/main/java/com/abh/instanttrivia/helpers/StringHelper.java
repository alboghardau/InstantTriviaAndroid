package com.abh.instanttrivia.helpers;

public class StringHelper{

    //tests if a string has email format
    public static boolean isEmail(String email){
        if(email.contains("@")){
            return true;
        }
        return false;
    }

}
