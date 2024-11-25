package com.example;


import java.util.regex.Pattern;

public class EmailValidation {

    String emailRegex="^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?$";

    public boolean checkEmail(String email){

        return Pattern.matches(emailRegex, email);

    }
    
}