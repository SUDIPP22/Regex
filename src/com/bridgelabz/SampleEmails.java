package com.bridgelabz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Purpose : To validate E-Mail Samples
 */
public class SampleEmails {

    /* Creating this method to validate sample mails */
    public static void sampleEmailCheck(){
        // Using ArrayList to store E-Mail Samples
        ArrayList<String> emails = new ArrayList<>();

        // Valid E-Mails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        // Invalid E-Mails
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.aa.au");

        String regexEmail = "^[0-9A-Za-z]+(([._+-]?)[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
        Pattern pattern = Pattern.compile(regexEmail);

        /* Iterating over the array to check every emails */
        for (String email:emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
    }
}
