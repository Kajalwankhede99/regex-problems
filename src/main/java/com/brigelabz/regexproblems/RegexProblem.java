package com.brigelabz.regexproblems;


public class RegexProblem {

    static String PINCODE_PATTERN = "^[1-9][0-9]{5}$";

    public static boolean validatePinCode(String pincode) {
        return pincode.matches(PINCODE_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex Problems");
        String pincode = "4000788";

        if (validatePinCode(pincode)) {
            System.out.println(pincode + " is a valid pincode.");
        } else {
            System.out.println("Invalid Pincode");
        }
    }
}
