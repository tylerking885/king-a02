/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution07
 *  Copyright 2021 Tyler King
 */

package exercise07;

import java.util.Scanner;

public class Solution07 {
    private static final Scanner in = new Scanner(System.in);

    private int firstNum, secondNum;
    private double m2, f2;
    private final double conversion = 0.09290304;

    // Method for reading input from user with prompt.
    private int readIntegerFromUser(String prompt){
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method for calculating feet squared from given integers.
    public double calcFeetSquared(int firstNum, int secondNum){
        f2 = firstNum*secondNum;
        return f2;
    }
    // Method for calculating meters squared from feet squared.
    public double calcMeterSquared(final double conversion, double f2 ){
        m2 = f2*conversion;
        return m2;
    }

    public static void main(String[] args) {
        Solution07 app = new Solution07();

        app.firstNum = app.readIntegerFromUser("What is the length of the room in feet? ");
        app.secondNum = app.readIntegerFromUser("What is the width of the room in feet? ");
        app.f2 = app.calcFeetSquared(app.firstNum, app.secondNum);
        app.m2 = app.calcMeterSquared(app.f2, app.conversion);
        System.out.printf("You entered dimensions of %d feet by %d feet.%n",app.firstNum, app.secondNum);
        System.out.printf("The area is%n%.0f square feet%n%.3f square meters",app.f2, app.m2);
    }
}