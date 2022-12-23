package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void firstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName("Omkar");
        Assertions.assertTrue(result);
    }
    @Test
    public void lastName(){
        boolean result = UserRegistration.lastName("Dudhewar");
        Assertions.assertTrue(result);
    }
    @Test
    public void email(){
        boolean result = UserRegistration.email("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void password(){
        boolean result = UserRegistration.password("A1#asdfg");
        Assertions.assertTrue(result);
    }
    @Test
    public void validNumber(){
        boolean result = UserRegistration.contactNumber("91 7020024533");
        Assertions.assertTrue(result);
    }
}

