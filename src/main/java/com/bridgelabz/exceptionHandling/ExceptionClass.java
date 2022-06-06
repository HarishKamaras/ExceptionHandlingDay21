package com.bridgelabz.exceptionHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionClass {

    /*public static boolean isValidEntry(String entry ){
        //String firstName = scanner.next();
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(entry);
        boolean result = matcher.matches();
        return result;
    }*/
    public static void firstNameException() throws CustomException{

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == false){
            //System.out.println("First Name is valid");
            //return true;
            throw new CustomException("Invalid First name ");
        }
        else
            System.out.println("First Name is valid");
    }
    public static void lastNameException()throws CustomException {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == false)
            throw new CustomException("Invalid Last name ");
        else
            System.out.println("Last Name is valid");
    }
    public static void emailException() throws CustomException{
        String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern pattern=Pattern.compile(emailPattern);
        Matcher matcher=pattern.matcher(email);
        boolean result=matcher.matches();

        if(result== false){
            throw new CustomException("Invalid Email ");
        }else{
            System.out.println("Valid Email");
        }
    }
    public static void mobileNumberException() throws CustomException{
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        Boolean result = matcher.matches();

        if (result == false) {
            throw new CustomException("Invalid Mobile number ");
        } else {
            System.out.println("Mobile number is valid");
        }
    }

    public static void passwordRule1Exception()throws CustomException{
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern="[a-zA-Z0-9~!@#$]{8,}";
        System.out.println("Enter the Password");
        String passWord=scanner.next();
        Pattern pattern=Pattern.compile(PasswordPattern);
        Matcher matcher=pattern.matcher(passWord);
        Boolean result=matcher.matches();

        if(result==false){
            throw new CustomException("Invaild, please enter minimum 8 character");
        }else{
            //System.out.println("Invaild, please enter minimum 8 character");
            System.out.println("Password is valid");
        }

    }
    public static void passwordRule2Exception()throws CustomException{
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern="^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        System.out.println("Enter the Password");
        String passWord=scanner.next();
        Pattern pattern=Pattern.compile(PasswordPattern);
        Matcher matcher=pattern.matcher(passWord);
        Boolean result=matcher.matches();
        if(result==false){
            throw new CustomException("Invaild, please enter one upper case and minimum 8 character");
           // System.out.println("Password is valid");
        }else{

            System.out.println("Password is valid");
        }
    }
    public static void passwordRule3Exception()throws CustomException {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        System.out.println("Enter the Password");
        String passWord = scanner.next();
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        if (result == false) {
            throw new CustomException("Invaild, please enter one number and minimum 8 characte");
            //System.out.println("Password is valid");
        } else {
            System.out.println("Password is valid");
        }
    }
    public static void passwordRule4Exception()throws CustomException {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[a-zA-Z0-9@#$%^&+=]{8,}$";
        System.out.println("Enter the Password");
        String passWord = scanner.next();
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();

        if (result == false) {
            throw new CustomException("Invaild, please enter one number and minimum 8 characte");

        } else {
            //System.out.println("Invaild, please enter one number and minimum 8 character");
            System.out.println("Password is valid");
        }
    }
}
