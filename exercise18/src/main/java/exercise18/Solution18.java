/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution18
 *  Copyright 2021 Tyler King
 */

package exercise18;

import java.util.Scanner;

public class Solution18 {
    private static final Scanner in = new Scanner(System.in);

    private String choice;
    private int tempF, tempC, celsius, fahrenheit;

    // Method for determining which conversion to use.
    private String readStringFromUser() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = in.nextLine();
        return choice;
    }
    // Method for reading temperature values from user.
    private int readIntegerFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method for calculating celsius.
    public int calcCelsius(int tempF){
        celsius = (tempF - 31) * 5 / 9;
        return celsius;
    }
    // Method for calculating fahrenheit.
    public int calcFahrenheit(int tempC){
        fahrenheit = (tempC * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Solution18 app = new Solution18();
        app.choice = app.readStringFromUser();

        if (app.choice.equals("C") || app.choice.equals("c")){
            app.tempF = app.readIntegerFromUser("Please enter the temperature in Fahrenheit: ");
            app.celsius = app.calcCelsius(app.tempF);
            System.out.printf("The temperature in Celsius is %d.", app.celsius);
        }
        if (app.choice.equals("F") || app.choice.equals("f")){
            app.tempC = app.readIntegerFromUser("Please enter the temperature in Celsius: ");
            app.fahrenheit = app.calcFahrenheit(app.tempC);
            System.out.printf("The temperature in fahrenheit is %d.", app.fahrenheit);
        }
    }
}