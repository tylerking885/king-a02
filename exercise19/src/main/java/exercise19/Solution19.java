/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution19
 *  Copyright 2021 Tyler King
 */

package exercise19;

import java.util.Scanner;

public class Solution19 {
    private static final Scanner in = new Scanner(System.in);

    private double weight, height, bmi;

    // Method for prompting user to enter height and weight.
    private double readDoubleFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
    // Method for calculating bmi based on given values.
    public double calcBMI(double weight, double height){
        bmi = (weight / (height * height)) * 703;
        return bmi;
    }

    public static void main(String[] args) {
        Solution19 app = new Solution19();

        app.weight = app.readDoubleFromUser("Enter your weight (pounds): ");
        app.height = app.readDoubleFromUser("Enter your height (inches): ");
        app.bmi = app.calcBMI(app.weight, app.height);

        if (app.bmi > 18.5 && app.bmi < 25) {
            System.out.printf("Your BMI is %.1f.%nYou are within the ideal weight range.", app.bmi);
        }
        else if (app.bmi > 25) {
            System.out.printf("Your BMI is %.1f.%nYou are overweight. You should see your doctor.", app.bmi);
        }
        else System.out.printf("Your BMI is %.1f.%nYou are underweight. You should see your doctor.", app.bmi);
    }
}