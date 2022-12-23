package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {




    public static boolean firstName(String firstName) {
        boolean result = Pattern.compile("^[A-Z]{1}[a-z]{4}$").matcher(firstName).matches();
        return result;
    }

    public static boolean lastName(String lastName) {
        boolean result = Pattern.compile("^[A-Z]{1}[a-z]{7}$").matcher(lastName).matches();
        return result;
    }

    public static boolean contactNumber(String contactNumber) {
        boolean result = Pattern.compile("^[0-9]{2} [0-9]{10}$").matcher(contactNumber).matches();
        return result;
    }

    public static boolean email(String email) {
        boolean result = Pattern.compile("^[a-z]{3}.[a-z]{3}@[a-z]{2}.[a-z]{2}.[a-z]{2}$").matcher(email).matches();
        return result;
    }

    public static boolean password(String password) {
        boolean result = Pattern.compile("^[A-Z]+[0-9]+[@#%&*!$^]{1}+[a-z]{5}$").matcher(password).matches();
        return result;
    }
    public static boolean sampleEmail(String email){
        boolean result = Pattern.compile("[a-z]{3,}[-.+]{0,1}[10]{0,3}[@]{1}[10]{0,3}[a-z]{0,5}[.]{0,1}[a-z]{0,3}[,.]{0,1}[a-z]{0,3}").matcher(email).matches();
        return result;
    }
}






