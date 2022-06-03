package com.bridgelabz.exceptionHandling;

import org.junit.Test;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidationMailTest {

    private String emailTest;
    private boolean expectedEmail;

    public ValidationMailTest(String emailTest, boolean expectedEmail){
        this.emailTest=emailTest;
        this.expectedEmail=expectedEmail;
    }


    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"ab@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc..2002@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });

    }

    //  String[] str = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
    //        "abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    @Test
    public void userEmailShouldPassTheRegexValidationByParameterizedTest() {
        MainClass validator = new MainClass();
        boolean result = validator.email(this.emailTest);
        assertEquals("Email",this.expectedEmail,result);
    }
}

