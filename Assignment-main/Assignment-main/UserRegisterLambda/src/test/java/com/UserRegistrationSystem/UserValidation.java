package com.UserRegistrationSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidation {

    UserRegistration user;
    boolean result;
    String[] allEmails;

    @Before
    public void setup(){
        user = new UserRegistration();
    }
    
    @Test
    public void testFirstNameHappy(){
        result = user.checkFirstName("Satya");
        user.checkException(result);
    }
    
    @Test
    public void testFirstNameSad(){
        result = user.checkFirstName("Sa");
        user.checkException(result);
    }

    @Test
     public void testLastNameHappy() {
	result = user.checkLastName("Satya");
        user.checkException(result);
    }
    
    @Test
    public void testLastNameSad(){
        result = user.checkLastName("Sa");
        user.checkException(result);
    }

    @Test
    public void testEmailHappy(){
        result = user.checkEmail("abc111@abc.com");
        user.checkException(result);
    }
    
    @Test
    public void testEmailSad(){
        result = user.checkEmail("arshadgmail.com");
        user.checkException(result);
    }

    @Test
    public void testMobileNumHappy() {
        result = user.checkMobileNum("9717534982");
        user.checkException(result);
    }
    
    @Test
    public void testMobileNumSad() {
        result = user.checkMobileNum("009717534982");
        user.checkException(result);
    }

    @Test
    public void testPasswordHappy() {
        result = user.checkPassword("Satya@123");
        user.checkException(result);
    }
    
    @Test
    public void testPasswordSad() {
        result = user.checkPassword("satya123S@@SasD");
        user.checkException(result);
    }

    @Test
    public void testAllEmailsHappy() {
        allEmails = new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com"};
        for (String emailIDs : allEmails) {
            result = user.checkEmail(emailIDs);
            user.checkException(result);
        }
    }
    
    @Test
    public void testAllInValidEmailsSad() {
        allEmails = new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                                    ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                                    "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (String emailIDs: allEmails) {
            result = user.checkEmail(emailIDs);
            user.checkException(result);
        }
    }

}