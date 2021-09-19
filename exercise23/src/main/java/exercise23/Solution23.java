/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution23
 *  Copyright 2021 Tyler King
 */

package exercise23;

import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);

    private int answer, answer2, answer3, answer4, answer5, answer6;

    // Method for getting yes/no answer from user.
    private int readIntegerFromUser(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }

    public static void main(String[] args) {
        Solution23 app = new Solution23();

        // Program starts with a question to user which leads to a series of If Else statements.
        app.answer = app.readIntegerFromUser("Is the car silent when you turn the key? (1 for yes, 0 for no) ");

        // Logic to move through the tree
        if (app.answer == 1) { app.answer2 = app.readIntegerFromUser("Are the battery terminals corroded? (1 for yes, 0 for no) ");
            if (app.answer2 == 1){
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);}
            else if (app.answer2 == 0){
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        }
        // Moving through the tree.
        else  { app.answer3 = app.readIntegerFromUser("Does the car make a slicking noise? (1 for yes, 0 for no) ");
            if (app.answer3 == 1) {
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            // Moving through the tree.
            else if (app.answer3 == 0){ app.answer4 = app.readIntegerFromUser("Does the car crank up but fail to start? (1 for yes, 0 for no) ");
                if (app.answer4 == 1) {
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                }
                // Moving through the tree.
                else if (app.answer4 == 0) { app.answer5 = app.readIntegerFromUser("Does the engine start and then die? (1 for yes, 0 for no) ");
                    if (app.answer5 == 1) { app.answer6 = app.readIntegerFromUser("Does you car have fuel injection? (1 for yes, 0 for no) ");
                        if (app.answer6 == 1) {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else if (app.answer6 == 0){
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}