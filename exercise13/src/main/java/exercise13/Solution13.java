/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution13
 *  Copyright 2021 Tyler King
 */

package exercise13;

import java.util.Scanner;

public class Solution13 {
    private static final Scanner in = new Scanner(System.in);

    private int years, numCompound;
    private double principal, rate, amount;

    // Method for prompting user for integer value.
    private int readIntegerFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method for prompting user for double value.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method for calculating compound interest.
    public double calcAmount(double principal, double rate, int years, int numCompound) {
        amount = principal * Math.pow((1 + ((rate / 100) / numCompound)), numCompound * years);
        return amount;
    }

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        app.principal = app.readDoubleFromUser("What is the principal amount? ");
        app.rate = app.readDoubleFromUser("What is the rate of interest? ");
        app.years = app.readIntegerFromUser("What is the number of years? ");
        app.numCompound = app.readIntegerFromUser("What is the number of times the interest is compounded per year? ");
        app.amount = app.calcAmount(app.principal, app.rate, app.years, app.numCompound);
        System.out.printf("$%.0f invested at %.1f%% for %d years compounded %d times per year is $%.2f.", app.principal, app.rate, app.years, app.numCompound, app.amount);
    }
}