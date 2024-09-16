package com.brigelabz.regexproblems;

import java.util.regex.Pattern;

public class EmailRegex {

    private static final String EMAIL_REGEX = "^[a-z]{3}\\.?[a-z]*@[a-z]{10}.*$";

    public boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public void validateEmail(String email) {
        if (isValidEmail(email)) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }

    public static void main(String[] args) {
        EmailRegex regex = new EmailRegex();
        String email = "abc.xyz@bridgelabz.co.in";
        regex.validateEmail(email);
    }
}