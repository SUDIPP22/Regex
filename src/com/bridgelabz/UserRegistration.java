package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose : To implement the methods for user registration
 */
public class UserRegistration {
    /**
     * Purpose : This method is used for creating the patterns of regex
     * @param name This is the first parameter
     * @return returns matching value
     */
    public static boolean validateName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        boolean b = matcher.matches();
        if (name.isEmpty())
            return false;
        return b;
    }

    /**
     * Purpose : This method is used for creating the pattern of regex to validate E-Mail ID
     * @param Email This is the first parameter of this method
     * @return returns matching value
     */
    public static boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile("^([a-zA-z0-9-_+.]+)@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$");
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    /**
     * Purpose : This method is used for creating the pattern of regex to validate Mobile Number
     * @param mobileNumber This is the first parameter of this method
     * @return returns matching value
     */
    public static boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^[91]{2}[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    /**
     * Purpose : This method is used for creating the pattern of regex to validate Password
     * Rule 1 : Password should have minimum 8 characters
     * Rule 2 : Password should have at least 1 Upper Case
     * Rule 3 : Password should have at least 1 Numeric Number
     * @param password This is the first parameter of this method
     * @return returns matching value
     */
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^[a-z(?=.*A-Z)(?=.*0-9)@#$%^&+=]{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**
     * This method is created to implement and verify the user input
     */
    public void validateUserDetails() {
        Scanner sc = new Scanner(System.in);
        UserDetails userDetails = new UserDetails();

        // validity of first name of user
        System.out.println("Enter Your First Name : ");
        userDetails.setFirstName(sc.next());
        boolean firstName = validateName(userDetails.getFirstName());
        if (firstName)
            System.out.println("Entered name : " + userDetails.getFirstName() + " is valid");
        else
            System.out.println("Entered name : " + userDetails.getFirstName() + " is not valid");

        // validity of last name of user
        System.out.println("Enter Your Last Name : ");
        userDetails.setLastName(sc.next());
        boolean lastName = validateName(userDetails.getLastName());
        if (lastName)
            System.out.println("Entered name : " + userDetails.getLastName() + " is valid");
        else
            System.out.println("Entered name : " + userDetails.getLastName() + " is not valid");

        // validity of Email ID of user
        System.out.println("Enter Your E-Mail ID. : ");
        userDetails.setEmail(sc.next());
        boolean mail = validateEmail(userDetails.getEmail());
        if (mail)
            System.out.println("Entered E-Mail ID. " + userDetails.getEmail() + " is valid");
        else
            System.out.println("Entered E-Mail ID. " + userDetails.getEmail() + " is not valid");

        // validity of Phone Number of user
        System.out.println("Enter Your Mobile Number : ");
        userDetails.setMobileNumber(sc.next());
        boolean phoneNumber = validateMobileNumber(userDetails.getMobileNumber());
        if (phoneNumber)
            System.out.println("Entered Mobile Number : " + userDetails.getMobileNumber() + " is valid");
        else
            System.out.println("Entered Mobile Number : " + userDetails.getMobileNumber() + " is not valid");

        // validity of Password of user
        System.out.println("Set Your Password : ");
        userDetails.setPassword(sc.next());
        boolean password = validatePassword(userDetails.getPassword());
        if (password)
            System.out.println(userDetails.getPassword() + " is available");
        else
            System.out.println("Invalid Password!!!");
        sc.close();
    }
}
