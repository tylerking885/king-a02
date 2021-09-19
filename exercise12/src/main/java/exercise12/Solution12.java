/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution12
 *  Copyright 2021 Tyler King
 */

package exercise12;

import java.util.Scanner;

public class Solution12 {
    private static final Scanner in = new Scanner(System.in);

    private int years;
    private double principal, rate, amount;

    // Method to prompt user for the year value.
    private int readIntegerFromUser() {
        System.out.print("Enter the number of years: ");
        return in.nextInt();
    }
    // Method to prompt user for double values.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method to calculate the amount of interest.
    public double calcAmount(double principal, double rate, int years) {
        amount = principal * (1 + ((rate / 100) * years));
        return amount;
    }

    public static void main(String[] args) {
        Solution12 app = new Solution12();

        app.principal = app.readDoubleFromUser("Enter the principal: ");
        app.rate = app.readDoubleFromUser("Enter the rate of interest: ");
        app.years = app.readIntegerFromUser();
        app.amount = app.calcAmount(app.principal, app.rate, app.years);
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.", app.years, app.rate, app.amount);
    }
}