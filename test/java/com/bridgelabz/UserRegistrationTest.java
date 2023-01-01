package com.bridgelabz;

import com.bridgelabz.exception.InvalidEMailException;
import com.bridgelabz.exception.InvalidPasswordException;
import com.bridgelabz.exception.InvalidPhoneNumberException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    String input;
    boolean expectedResult;
    UserRegistration userRegistration;

    public void UserRegistration(String input, boolean expectedResult) {
        UserRegistration UserRegistration = new UserRegistration();
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emailInputs() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
        });
    }

    @Test
    public void firstNameHappy() throws InvalidNameException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validateName("Omkar");
        assertEquals(true, output);
    }

    @Test
    public void firstNameSad() throws InvalidNameException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validateName("omkar");
        assertEquals(false, output);
    }

    @Test
    public void phoneNumberHappy() throws InvalidPhoneNumberException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validatePhoneNumber("91 7020024533");
        assertEquals(true, output);
    }

    @Test
    public void phoneNumberSad() throws InvalidPhoneNumberException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validatePhoneNumber("hi@@gmail.com");
        assertEquals(false, output);
    }

    @Test
    public void passwordHappy() throws InvalidPasswordException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validatePassword("hi5@There");
        assertEquals(true, output);
    }

    @Test
    public void passwordSad() throws InvalidPasswordException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validatePassword("hi!!therekfjslkf");
        assertEquals(false, output);
    }

    @Test
    public void emailTest() throws InvalidEMailException {
        UserRegistration userRegistration = new UserRegistration();
        boolean output = UserRegistration.validateEMail(input);
        assertEquals(expectedResult, output);
    }
}
