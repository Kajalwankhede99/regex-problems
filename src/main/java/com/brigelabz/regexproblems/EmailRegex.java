package com.brigelabz.regexproblems;

import java.util.regex.Pattern;

public class EmailRegex {

    private static final String EMAIL_REGEX = "^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}.(\\.[a-z]{2})?$";

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
        String email1 = "abc.xyz@bridgelabz.co.in";
        String email2= "abc+xyz@bridgelabz.co.in";
        String email3 = "abc-xyz@bridgelabz.co.in";
        String email4 = "abc#xyz@bridgelabz.co.in"; //Invalid "#" not allowed

        String email5 = "abc@bridgelabz.co.in";
        String email6 = "abc.xyz@bridgelabz.co";
        String email7 = "abc.xyz@bridgelabz.co.uk";
        String email8 = "abc.xyz@bridgelabz";
        regex.validateEmail(email1);
        regex.validateEmail(email2);
        regex.validateEmail(email3);
        regex.validateEmail(email4);
        regex.validateEmail(email5);
        regex.validateEmail(email6);
        regex.validateEmail(email7);
        regex.validateEmail(email8);
    }
}