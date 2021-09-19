/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution08
 *  Copyright 2021 Tyler King
 */

package exercise08;

import java.util.Scanner;

    public class Solution08 {
        private static final Scanner in = new Scanner(System.in);

        private int numPeople, numPizzas, numSlices, totalSlices, pizzaServed, leftovers;

        // Method for reading integers from user with a prompt.
        private int readIntegerFromUser(String prompt) {
            System.out.print(prompt);
            return in.nextInt();
        }
        // Method for calculating total possible slices of pizza.
        public int calcTotalSlices(int numPizzas, int numSlices) {
            totalSlices = numPizzas * numSlices;
            return totalSlices;
        }
        // Method for calculating the number of pizzas served.
        public int calcPizzaServed(int totalSlices, int numPeople) {
            pizzaServed = totalSlices / numPeople;
            return pizzaServed;
        }
        // Method for calculating the number of leftover pizza slices.
        public int calcLeftovers(int totalSlices, int numPeople) {
            leftovers = totalSlices % numPeople;
            return leftovers;
        }

        public static void main(String[] args) {
            Solution08 app = new Solution08();

            app.numPeople = app.readIntegerFromUser("How many people? ");
            app.numPizzas = app.readIntegerFromUser("How many pizzas do you have? ");
            app.numSlices = app.readIntegerFromUser("How many slices per pizza? ");
            app.totalSlices = app.calcTotalSlices(app.numPizzas, app.numSlices);
            app.pizzaServed = app.calcPizzaServed(app.totalSlices, app.numPeople);
            app.leftovers = app.calcLeftovers(app.totalSlices, app.numPeople);
            System.out.printf("%d people with %d pizzas (%d slices)%n", app.numPeople, app.numPizzas, app.totalSlices);
            System.out.printf("Each person gets %d pieces of pizza.%n", app.pizzaServed);
            System.out.printf("There are %d leftover pieces.", app.leftovers);
        }
    }