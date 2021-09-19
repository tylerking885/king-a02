/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution21
 *  Copyright 2021 Tyler King
 */

package exercise21;

import java.util.Scanner;

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);

    private int month;

    // Method for getting the month value from user.
    private int readIntegerFromUser() {
        System.out.print("Please enter the number of the month: ");
        return in.nextInt();
    }

    public static void main(String[] args) {
        Solution21 app = new Solution21();

        app.month = app.readIntegerFromUser();

        // The logic to determine a valid month.
        if ((app.month < 1) || (app.month > 12)){
            System.out.print("ERROR!: Entered month is outside of the range of included months.");
        }
        // The use of a switch case to determine which month to print based on user input.
        switch (app.month) {
            case 1 -> System.out.print("The name of the month is January.");
            case 2 -> System.out.print("The name of the month is February.");
            case 3 -> System.out.print("The name of the month is March.");
            case 4 -> System.out.print("The name of the month is April.");
            case 5 -> System.out.print("The name of the month is May.");
            case 6 -> System.out.print("The name of the month is June.");
            case 7 -> System.out.print("The name of the month is July.");
            case 8 -> System.out.print("The name of the month is August.");
            case 9 -> System.out.print("The name of the month is September.");
            case 10 -> System.out.print("The name of the month is October.");
            case 11 -> System.out.print("The name of the month is November.");
            case 12 -> System.out.print("The name of the month is December.");
        }
    }
}