package com.brigelabz.regexproblems;


public class RegexProblem {

    static String PINCODE_PATTERN = "^[1-9][0-9]{2} ?[0-9]{3}$";

    public static boolean validatePinCode(String pincode) {
        return pincode.matches(PINCODE_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Regex Problems");
        String pincode1 = "400088";
        String pincode2 = "400 088";
        String pincode3 = "400088B";

        if (validatePinCode(pincode1)) {
            System.out.println(pincode1 + " is a valid pincode.");
        } else {
            System.out.println("Invalid Pincode: " + pincode1);
        }

        if (validatePinCode(pincode2)) {
            System.out.println(pincode2 + " is a valid pincode.");
        } else {
            System.out.println("Invalid Pincode: " + pincode2);
        }

        if (validatePinCode(pincode3)) {
            System.out.println(pincode3 + " is a valid pincode.");
        } else {
            System.out.println("Invalid Pincode: " + pincode3);
        }
    }
}