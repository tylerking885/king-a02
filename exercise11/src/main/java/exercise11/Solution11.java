/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution11
 *  Copyright 2021 Tyler King
 */

package exercise11;

import java.util.Scanner;

public class Solution11 {
    private static final Scanner in = new Scanner(System.in);

    private double euros, dollars, exchangeRate;

    // Method for prompting user to input doubles in the form of euros.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method for calculating euros to dollars.
    public double calcDollarConversion(double euros, double exchangeRate) {
        dollars = euros * exchangeRate;
        return dollars;
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        app.euros = app.readDoubleFromUser("How many euros are you exchanging? ");
        app.exchangeRate = app.readDoubleFromUser("What is the current exchange rate? ");
        app.dollars = app.calcDollarConversion(app.euros, app.exchangeRate);
        System.out.printf("%.0f euros at an exchange rate of %.4f is %n%.2f U.S. dollars.", app.euros, app.exchangeRate, app.dollars);
    }
}