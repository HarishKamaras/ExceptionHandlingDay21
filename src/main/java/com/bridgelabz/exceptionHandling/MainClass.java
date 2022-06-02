package com.bridgelabz.exceptionHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
   /* public boolean firstName(String firstName) {
        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
    //UC2
    public boolean lastName(String lastName) {
        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }
    //UC3
    public boolean email(String email) {
        String emailPattern = "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        Pattern pattern2 = Pattern.compile(emailPattern);
        Matcher matcher2 = pattern2.matcher(email);
        boolean result = matcher2.matches();
        return result;
    }
    //UC4
    public boolean mobileNumber(String mobileNumber) {
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(mobileNumber);
        Boolean result = matcher3.matches();
        return result;
    }
    //UC5
    public boolean passwordRule1(String passWord) {
        String PasswordPattern = "[a-zA-Z0-9~!@#$]{8,}";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    //UC6
    public boolean passwordRule2(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    //UC7
    public boolean passwordRule3(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    //UC8
    public boolean passwordRule4(String passWord) {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+*])[a-zA-Z0-9@#$%^&+*]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }
    public static void emailAll() {
        String emailPattern = "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        System.out.println("Enter your Email:");
        String[] str = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        int i = 0;
        while (i < str.length) {
            Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(str[i]);
            Boolean result = matcher.matches();

            if (result == true) {
                System.out.println(i + ": Valid");
            } else {
                System.out.println(i + ": Email is not valid");
            }
            i++;
        }
    }*/
        public static void main(String[] args) {
        System.out.println("Welcome to Exception Handling");
        /*firstName();//UC1
        lastName();//UC2
        email();//UC3
        mobileNumber();//UC4
        passwordRule1();//UC5
        passwordRule2();//UC6
        passwordRule3();//UC7
        passwordRule4();//UC8*/
        //emailAll();//UC9
            try {
                ExceptionClass.firstNameException();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");

            try {
                ExceptionClass.lastNameException();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.emailException();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.mobileNumberException();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.passwordRule1Exception();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.passwordRule2Exception();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.passwordRule3Exception();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
            try {
                ExceptionClass.passwordRule4Exception();
            } catch (CustomException e) {
                //throw new RuntimeException(e);
                System.out.println("Custom Exception is handled");
            }
            System.out.println("****Rest of codes****");
        }
}
