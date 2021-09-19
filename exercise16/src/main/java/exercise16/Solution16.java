/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution16
 *  Copyright 2021 Tyler King
 */

package exercise16;

import java.util.Scanner;

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);

    private int age;

    // Method for getting age from user.
    private int readIntegerFromUser() {
        System.out.print("What is your age? ");
        return in.nextInt();
    }

    public static void main(String[] args) {
        Solution16 app = new Solution16();

        app.age = app.readIntegerFromUser();
        String message = app.age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.printf("%s",message);
    }
}