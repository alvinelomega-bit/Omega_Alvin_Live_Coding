/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab.java;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Omega_problem1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Read the input integer
        int number = input.nextInt();
        int result = sumOfDigits(number);

        // Validate input and display the sum of its digit
        if (number < 0) {
            System.out.println("Invalid Input.");
        } else {
            System.out.println(result);
        }
        input.close();
    }

    // Recursively calculates the sum of all digits in a non-negative integer
    public static int sumOfDigits(int number) {

        // Base case: stop when no digits remain
        if (number == 0) {
            return 0;
        }
        // Add the last digit (number % 10) to the sum of the remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }
}