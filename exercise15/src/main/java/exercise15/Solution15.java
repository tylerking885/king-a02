/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution15
 *  Copyright 2021 Tyler King
 */

package exercise15;

import java.util.Scanner;

public class Solution15 {
    private static final Scanner in = new Scanner(System.in);

    private final String correctPW = "CupOfJava123";
    private String password;

    // Method for getting password from user.
    private String readStringFromUser() {
        System.out.print("What is the password? ");
        return in.nextLine();
    }

    public static void main(String[] args) {
        Solution15 app = new Solution15();

        app.password = app.readStringFromUser();

        // The logic for a correct login.
        if (app.password.equals(app.correctPW))
            System.out.print("Welcome!");

        // logic for incorrect logins.
        else
            System.out.print("I don't know you.");
    }
}