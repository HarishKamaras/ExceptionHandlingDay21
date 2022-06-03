package com.bridgelabz.exceptionHandling;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest {


    @Test
    public void userFirstNameShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.firstName("Arish");
        assertEquals("fName",true,result);
    }

    @Test
    public void userLastNameShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.lastName("Kamarasu");
        assertEquals("LName",true,result);
    }

    @Test
    public void userEmailShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.email("abc+100@gmail.com");
        assertEquals("Email",true,result);
    }

    @Test
    public void userMobileNumberShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.mobileNumber("91-9876543210");
        assertEquals("Mobile",true,result);
    }

    @Test
    public void userPassWordRule1ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule1("harish12");
        assertEquals("passwordRule1",true,result);
    }

    @Test
    public void userPassWordRule2ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule2("Harish12");
        assertEquals("passwordRule2",true,result);
    }

    @Test
    public void userPassWordRule3ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule3("Harish12");
        assertEquals("passwordRule3",true,result);
    }

    @Test
    public void userPassWordRule4ShouldPassTheRegexValidation() {
        MainClass obj = new MainClass();
        boolean result = obj.passwordRule4("Harish12*");
        assertEquals("passwordRule4",true,result);
    }
}