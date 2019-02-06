/*
Program Name:           Inclass07A Array01Test
Program Description:    Asks the user for the length of the array, has the user input
                        integers in the array, and performs calculations, and reversals
                        on the integers in the array
Program Author:         Jason Chau
Date Created:           04/4/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass07a;

import java.util.Scanner;
public class Array01Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of numbers in the array: ");
        int arraymax = input.nextInt();
//Create array
        int [] array = new int[arraymax];
        double sum = 0;
//For loop that allows input until array meets constraint
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
            sum += array[i];
        }
//Initializing average that is later printed out in output
        double average = sum / arraymax;
        System.out.println("\nThe numbers entered are:");
//For loop that prints out array values and its value squared
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " and " + array[i] + " squared is " + (int)Math.pow(array[i], 2));
        }
//Initializing nexttoLast that calculates the number that was second to last entered
        int nextToLast = array[arraymax - 2];
//Prints out average
        System.out.println("Average = " + average);
        System.out.println("\nThe numbers entered in reverse order are: ");
        int[] result = new int[array.length];
//For loop that revereses the values in the array
        for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
            System.out.println(array[j]);
        }
        System.out.println("Next to last number entered was " + nextToLast);
    }
}
