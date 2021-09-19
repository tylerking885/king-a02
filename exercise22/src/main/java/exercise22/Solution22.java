/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution22
 *  Copyright 2021 Tyler King
 */

package exercise22;

import java.util.Scanner;

// I understand this can be dangerous here but compiler insisted on using math.max()
// when constraint was to not use a built in function. This was very annoying hence the suppress.
@SuppressWarnings("all")
public class Solution22 {
    private static final Scanner in = new Scanner(System.in);

    private int firstNum, secondNum, thirdNum, max1, max2, max3;

    // Method for getting 3 numbers from user.
    private int readIntegerFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
    // Method to calulate the largest number from 3 different values.
    public int calcMaxNumber(int firstNum, int secondNum, int thirdNum, int max1, int max2, int max3){
        max1 = firstNum > secondNum ? firstNum : secondNum;
        max2 = secondNum > thirdNum ? secondNum : thirdNum;
        max3 = max1 > max2 ? max1 : max2;
        return max3;
    }

    public static void main(String[] args) {
        Solution22 app = new Solution22();

        app.firstNum = app.readIntegerFromUser("Enter is the first number: ");
        app.secondNum = app.readIntegerFromUser("Enter is the second number: ");
        app.thirdNum = app.readIntegerFromUser("Enter is the third number: ");
        app.max3 = app.calcMaxNumber(app.firstNum, app.secondNum, app.thirdNum, app.max1, app.max2, app.max3);

        if ((app.firstNum == app.secondNum) || (app.firstNum == app.thirdNum) || (app.secondNum == app.thirdNum)) {
            System.exit(0);
        }
        System.out.printf("The largest number is %d.", app.max3);
    }
}