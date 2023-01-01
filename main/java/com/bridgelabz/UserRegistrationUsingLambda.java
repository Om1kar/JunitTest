package com.bridgelabz;

import java.util.regex.Pattern;
@FunctionalInterface
interface verify{
    boolean verify(String regex,String value);
    static void output(verify obj, String regex, String details) {
        if (obj.verify(regex, details)) {
            System.out.println("'" +details+ "' Valid");
        }
        else {
            System.out.println("'" +details+ "' Invalid");
        }
    }
}
public class UserRegistrationUsingLambda {
    public static void main(String[] args) {
        verify detailVerification = Pattern::matches;
        System.out.println("\nFirst Name");
        verify.output(detailVerification,"^[A-Z][a-z]{2,}$","Omkar");
        verify.output(detailVerification,"^[A-Z][a-z]{2,}$","omkar");
        System.out.println("\nLast Name");
        verify.output(detailVerification,"^[A-Z][a-z]{2,}$","Dudhewar");
        verify.output(detailVerification,"^[A-Z][a-z]{2,}$","dudhewar");
        System.out.println("\nemail ID");
        verify.output(detailVerification,"^([a-z0-9]+(?:[+._-][a-z0-9]+)*)@([a-z0-9]+(?:[.-][a-z0-9]+)*\\.[a-z]{2,})$","omkardudhewar@gmailcom");
        verify.output(detailVerification,"^([a-z0-9]+(?:[+._-][a-z0-9]+)*)@([a-z0-9]+(?:[.-][a-z0-9]+)*\\.[a-z]{2,})$","omkardudhewar@.com");
        System.out.println("\nPhone Number");
        verify.output(detailVerification,"^[0-9]{2} [0-9]{10}$","91 7020024533");
        verify.output(detailVerification,"^[0-9]{2} [0-9]{10}$","917020024533");
        System.out.println("\nPassword");
        verify.output(detailVerification,"^(?=.*[A-Z])(?=.*[0-9])(?=.*\\p{Punct}).{8,}$","Omkar#12");
        verify.output(detailVerification,"^(?=.*[A-Z])(?=.*[0-9])(?=.*\\p{Punct}).{8,}$","od##00");
    }
}
