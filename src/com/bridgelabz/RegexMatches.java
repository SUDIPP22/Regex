package com.bridgelabz;

/**
 * Purpose :To implement usage of Java Regular Expression and Patterns
 * To validate the First Name, Last Name, Email-ID, Mobile Number, Password of user using regex
 * To validate sample mails
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-09
 */
public class RegexMatches {
    public static void main(String[] args) {
        System.out.println("Welcome To The Program");
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateUserDetails();
        SampleEmails.sampleEmailCheck();
    }
}