/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution20
 *  Copyright 2021 Tyler King
 */

package exercise20;

import java.util.Scanner;
@SuppressWarnings("all")
public class Solution20 {

    private static final Scanner in = new Scanner(System.in);

    private double amount, taxValue, taxValueEC, taxValueD, taxValueI, totalWithTax, totalWithTaxEC, totalWithTaxD, totalWithTaxI;
    private String state, county;

    // Method for getting the total from user.
    private double readDoubleFromUser() {
        System.out.print("What is the order amount? ");
        return in.nextDouble();
    }
    // Method for getting the state from user.
    private String readStringFromUser(String prompt) {
        System.out.print(prompt);
        state = in.nextLine();
        return state;
    }
    // Method for calculating tax in the state of Wisconsin.
    public double calcTaxWisconsin(double amount){
        taxValue = amount*.050;
        return taxValue;
    }
    // Method for calculating tax in the city of Eau Claire.
    public double calcEauClaireTax(double amount){
        taxValueEC = amount*0.055;
        return taxValueEC;
    }
    // Method for calculating tax in the city of Dunn.
    public double calcDunnTax(double amount){
        taxValueD = amount*0.054;
        return taxValueD;
    }
    // Method for calculating tax in the state of Illinois.
    public double calcTaxIllinois(double amount){
        taxValueI = amount*.080;
        return taxValueI;
    }

    public static void main(String[] args) {
        Solution20 app = new Solution20();

        app.amount = app.readDoubleFromUser();
        in.nextLine(); // To consume newline left-over
        app.state = app.readStringFromUser("What state do you live in? ");

        if (app.state.equals("Illinois")) {
            app.taxValueI = app.calcTaxIllinois(app.amount);
            app.totalWithTaxI = app.amount + app.taxValueI;
            System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", app.amount, app.taxValueI, app.totalWithTaxI);
        }

        if (app.state.equals("Wisconsin")) {
            app.county = app.readStringFromUser("What county do you live in? ");

            if (app.county.equals("Eau Claire")) {
                app.taxValueEC = app.calcEauClaireTax(app.amount);
                app.totalWithTaxEC = app.amount + app.taxValueEC;
                System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", app.amount, app.taxValueEC, app.totalWithTaxEC);
                System.exit(0);
            }
            else if (app.county.equals("Dunn")) {
                app.taxValueD = app.calcDunnTax(app.amount);
                app.totalWithTaxD = app.amount + app.taxValueD;
                System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", app.amount, app.taxValueD, app.totalWithTaxD);
                System.exit(0);
            }
            else {
                app.taxValue = app.calcTaxWisconsin(app.amount);
                app.totalWithTax = app.taxValue + app.amount;
                System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", app.amount, app.taxValue, app.totalWithTax);
                System.exit(0);
            }
        }

        if ((!app.state.equals("Wisconsin")) && (!app.state.equals("Illinois"))){
            System.out.printf("The total is $%.2f.", app.amount);
        }
    }
}