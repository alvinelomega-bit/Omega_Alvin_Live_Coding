/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package omega_problem3;

import java.util.Scanner; 
/**
 *
 * @author Asus
 */
public class Omega_problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        // Remove curly brackets and spaces
        line = line.replace("{", "").replace("}", "").replace(" ", "");

        // Separate the numbers using commas
        String[] numbers = line.split(",");

        // Convert the numbers into an integer array
        int[] values = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }

        // Display the expected results
        System.out.println();
        System.out.println(arraySum(values, 0) + ", "
                + findMaximum(values, 0) + ", "
                + countEven(values, 0));

        input.close();
    }

    // Method to calculate the sum of array elements
    public static int arraySum(int[] values, int index) {

        // Base case
        if (index == values.length) {
            return 0;
        }

        // Recursive case
        return values[index] + arraySum(values, index + 1);
    }

    // Method to find the largest element
    public static int findMaximum(int[] values, int index) {

        // Base case
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case
        int maximum = findMaximum(values, index + 1);

        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    // Method to count even elements
    public static int countEven(int[] values, int index) {

        // Base case
        if (index == values.length) {
            return 0;
        }

        // Recursive case
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }
}