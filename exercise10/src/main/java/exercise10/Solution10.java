/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution10
 *  Copyright 2021 Tyler King
 */

package exercise10;

import java.util.Scanner;

public class Solution10 {
    private static final Scanner in = new Scanner(System.in);

    private final double tax = 0.055;
    private double subtotal, taxTotal, total;
    private int item1Quantity, item2Quantity, item3Quantity, priceItem1, priceItem2, priceItem3;

    // Method for reading item prices and quantities from user with a prompt.
    private int readIntegerFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method for calculating total before tax.
    public double calcSubtotal(int priceItem1, int priceItem2, int priceItem3, int item1Quantity, int item2Quantity, int item3Quantity) {
        subtotal = ((priceItem1 * item1Quantity)) + ((priceItem2 * item2Quantity)) + ((priceItem3 * item3Quantity));
        return subtotal;
    }
    // Method for calculating the total amount of tax to be added.
    public double calcTaxTotal(double subtotal, final double tax) {
        taxTotal = subtotal * tax;
        return taxTotal;
    }
    // Method for calculating the overall total with tax.
    public double calcTotal(double subtotal, double taxTotal) {
        total = subtotal + taxTotal;
        return total;
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        app.priceItem1 = app.readIntegerFromUser("Enter the price of item 1: ");
        app.item1Quantity = app.readIntegerFromUser("Enter the quantity of item 1: ");
        app.priceItem2 = app.readIntegerFromUser("Enter the price of item 2: ");
        app.item2Quantity = app.readIntegerFromUser("Enter the quantity of item 2: ");
        app.priceItem3 = app.readIntegerFromUser("Enter the price of item 3: ");
        app.item3Quantity = app.readIntegerFromUser("Enter the quantity of item 3: ");
        app.subtotal = app.calcSubtotal(app.priceItem1, app.priceItem2, app.priceItem3, app.item1Quantity, app.item2Quantity, app.item3Quantity);
        app.taxTotal = app.calcTaxTotal(app.subtotal, app.tax);
        app.total = app.calcTotal(app.subtotal, app.taxTotal);
        System.out.printf("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f", app.subtotal, app.taxTotal, app.total);
    }
}