package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmails {
    public static boolean emailSamples(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
        return pattern.matcher(email).matches();
    }
}
