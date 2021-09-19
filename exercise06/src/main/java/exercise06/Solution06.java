/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution06
 *  Copyright 2021 Tyler King
 */

package exercise06;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution06 {
    private static final Scanner in = new Scanner(System.in);

    private int current_age, retire_age, yearsLeft;

    // Method for reading input from user with prompt.
    private int readIntegerFromUser(String prompt){
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method for calculating the years left until retirement.
    public int calcYearsLeft(int current_age, int retire_age){
        return current_age - retire_age;
    }

    // Method for calculating date of retirement.
    public int calcRetireSum(int numCurrentDate, int yearsLeft){
        return numCurrentDate + yearsLeft;
    }

    public static void main(String[] args) {
        Solution06 app = new Solution06();

        app.current_age = app.readIntegerFromUser("What is your current age? ");
        app.retire_age = app.readIntegerFromUser("At what age would you like to retire? ");

        app.yearsLeft = app.calcYearsLeft(app.retire_age, app.current_age);
        System.out.printf("You have %d years left until you can retire.%n",app.yearsLeft);

        LocalDateTime datetime1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");
        String formatDateTime = datetime1.format(format);
        int numCurrentDate = Integer.parseInt(formatDateTime);
        int numRetireSum = app.calcRetireSum(numCurrentDate, app.yearsLeft);
        System.out.printf("It's %s, so you can retire in %d.",formatDateTime, numRetireSum);
    }
}