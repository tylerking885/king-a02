/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution14
 *  Copyright 2021 Tyler King
 */

package exercise14;

import java.util.Scanner;

public class Solution14 {
    private static final Scanner in = new Scanner(System.in);

    private double amount, taxValue, totalWithTax;
    private final double taxRate = 0.055;
    private String state;

    // Method for getting the state from user.
    private String readStringFromUser() {
        System.out.print("What is the state? ");
        return in.nextLine();
    }
    // Method for getting the amount value from user.
    private double readDoubleFromUser() {
        System.out.print("What is the order amount? ");
        return in.nextDouble();
    }
    // Method for calculating the amount of tax.
    public double calcTaxValue(double amount, final double taxRate){
        taxValue = amount * taxRate;
        return taxValue;
    }
    // Method for calculating the total with tax.
    public double calcTotalWithTax(double taxValue, double amount){
        totalWithTax = taxValue + amount;
        return totalWithTax;
    }

    public static void main(String[] args) {
        Solution14 app = new Solution14();

        app.amount = app.readDoubleFromUser();
        in.nextLine();
        app.state = app.readStringFromUser();

        if (app.state.equals("WI"))
        {
            app.taxValue = app.calcTaxValue(app.amount, app.taxRate);
            app.totalWithTax = app.calcTotalWithTax(app.taxValue, app.amount);
            System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", app.amount, app.taxValue, app.totalWithTax);
        }
        if (app.state.equals("MN"))
        {
            System.out.printf("The total is $%.2f.", app.amount);
        }
    }
}