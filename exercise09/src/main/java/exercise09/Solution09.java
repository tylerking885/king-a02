/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution09
 *  Copyright 2021 Tyler King
 */

package exercise09;

import java.util.Scanner;

public class Solution09 {
    private static final Scanner in = new Scanner(System.in);

    private final double gallonConversion = 350;
    private double length, width, area, paintCalculation;

    // Method for reading doubles from user with a prompt.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method for calculating the area of an object with given dimensions.
    public double areCalculation(double length, double width) {
        area = length * width;
        return area;
    }
    // Method for calculating the amount of paint to purchase in gallons.
    public double paintCalculation(double area, final double gallonConversion) {
        paintCalculation = Math.ceil(area / gallonConversion);
        return paintCalculation;
    }

    public static void main(String[] args) {
        Solution09 app = new Solution09();

        app.length = app.readDoubleFromUser("What is the length of object to be painted? ");
        app.width = app.readDoubleFromUser("What is the width of object to be painted? ");
        app.area = app.areCalculation(app.length, app.width);
        app.paintCalculation = app.paintCalculation(app.area, app.gallonConversion);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", app.paintCalculation, app.area);
    }
}