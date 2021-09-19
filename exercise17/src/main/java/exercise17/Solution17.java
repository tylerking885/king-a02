/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution17
 *  Copyright 2021 Tyler King
 */

package exercise17;

import java.util.Scanner;

public class Solution17 {
    private static final Scanner in = new Scanner(System.in);

    private double alcohol, weight, hours, ratio, BAC;
    private int gender;

    // Method for getting double values from user.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method for getting integer values from user.
    private int readIntegerFromUser() {
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        return in.nextInt();
    }
    // Method for determining the appropriate ratio based on given gender.
    public double determineRatio(int gender) {
        ratio = gender < 2 ? 0.73 : 0.66;
        return ratio;
    }
    // Method for calculating your blood alcohol content.
    public double calcBAC(double alcohol, double weight, double ratio, double hours) {
        BAC = (alcohol * 5.14 / weight * ratio) - (.015 * hours);
        return BAC;
    }

    public static void main(String[] args) {
        Solution17 app = new Solution17();

        app.gender = app.readIntegerFromUser();
        app.alcohol = app.readDoubleFromUser("How many ounces of alcohol did you have? ");
        app.weight = app.readDoubleFromUser("What is your weight, in pounds? ");
        app.hours = app.readDoubleFromUser("How many hours has it been since your last drink? ");
        app.ratio = app.determineRatio(app.gender);
        app.BAC = app.calcBAC(app.alcohol, app.weight, app.ratio, app.hours);
        System.out.printf("Your BAC is %f%n", app.BAC);

        String message = app.BAC < 0.08 ? "It is legal for you to drive" : "It is not legal for you to drive";
        System.out.printf("%s", message);
    }
}