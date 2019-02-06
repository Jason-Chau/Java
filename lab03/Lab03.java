/*
Program Name:           Lab03
Program Description:    This program sorts even and odd integers in ascending order
Program Author:         Jason Chau
Date Created:           02/8/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab03;

import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer between 0-99: ");
        int input1 = input.nextInt();
//First attempt for the first input
        if ((input1 < 0) || (input1 > 99)) {
            System.out.print("Outside range. Please enter an integer between 0-99: ");
            input1 = input.nextInt();
        }
//Second attempt for the first input
        if ((input1 < 0) || (input1 > 99)) {
                System.out.println("Outside range. Program ending.");
//Ends program if second attempt does not fit constraints. Program suggested I remove return statement.
        }
        else {
            System.out.print("Next, please enter another integer between 0-99: ");
            int input2 = input.nextInt();
//First attempt for the second input
            if ((input2 < 0) || (input2 > 99)) {
                System.out.print("Outside range. Please enter an integer between 0-99: ");
                input2 = input.nextInt();
            }
//Second attempt for the second input
            if ((input2 < 0) || (input2 > 99)) {
                System.out.println("Outside range. Program ending.");
                return;
            }
//Declaring min and max for input values
            if (input1 < input2) {
                int min = input1;
                int max = input2;
//Generating random numbers
                int int1 = min + (int)(Math.random() * ((max - min) + 1 ));
                int int2 = min + (int)(Math.random() * ((max - min) + 1 ));
                int int3 = min + (int)(Math.random() * ((max - min) + 1 ));
//Sorting random numbers in ascending order
                if (int1 > int2) {
                    int temp = int1;
                    int1 = int2;
                    int2 = temp;
                }
                if (int2 > int3) {
                    int temp = int2;
                    int2 = int3;
                    int3 = temp;
                }
                if (int1 > int2) {
                    int temp = int2;
                    int1 = int2;
                    int2 = temp;
                }
                System.out.println("The range begins at " + min + " and ends at " + max);
                System.out.println("Three sorted random integers between " + min + " and " + max + " are: ");
//Assigning random numbers as even or odd
                if (int1 % 2 == 0)
                    System.out.println(int1 + "\tEven");
                else
                    System.out.println(int1 + "\tOdd");
                if (int2 % 2 == 0)
                    System.out.println(int2 + "\tEven");
                else
                    System.out.println(int2 + "\tOdd");
                if (int3 % 2 == 0)
                    System.out.println(int3 + "\tEven");
                else
                    System.out.println(int3 + "\tOdd");
//Determining the sum, product, and quotient of the three random numbers
                int sum = int1 + int2 + int3;
                int product = int1 * int2 * int3;
                double quotient1 = (double)(int1)/(double)(int2);
                double quotient2 = quotient1/(double)(int3);
                double quotient = quotient2;
                System.out.println("Sum = " + sum);
                System.out.println("Product = " + product);
                System.out.println("Quotient (Int1 / Int2 / Int3) = " + quotient);
            }
//Switching min and max based on inputs
            else {
                int max = input1;
                int min = input2;
                int int1 = min + (int)(Math.random() * ((max - min) + 1 ));
                int int2 = min + (int)(Math.random() * ((max - min) + 1 ));
                int int3 = min + (int)(Math.random() * ((max - min) + 1 ));
                if (int1 > int2) {
                    int temp = int1;
                    int1 = int2;
                    int2 = temp;
                }
                if (int2 > int3) {
                    int temp = int2;
                    int2 = int3;
                    int3 = temp;
                }
                if (int1 > int2) {
                    int temp = int2;
                    int1 = int2;
                    int2 = temp;
                }
                System.out.println("The range begins at " + min + " and ends at " + max);
                System.out.println("Three sorted random integers between " + min + " and " + max + " are: ");
                if (int1 % 2 == 0)
                    System.out.println(int1 + "\tEven");
                else
                    System.out.println(int1 + "\tOdd");
                if (int2 % 2 == 0)
                    System.out.println(int2 + "\tEven");
                else
                    System.out.println(int2 + "\tOdd");
                if (int3 % 2 == 0)
                    System.out.println(int3 + "\tEven");
                else
                    System.out.println(int3 + "\tOdd");
                int sum = int1 + int2 + int3;
                int product = int1 * int2 * int3;
                double quotient1 = (double)(int1)/(double)(int2);
                double quotient2 = quotient1/(double)(int3);
                double quotient = quotient2;
                System.out.println("Sum = " + sum);
                System.out.println("Product = " + product);
                System.out.println("Quotient (Int1 / Int2 / Int3) = " + quotient);
            }
        }
    }
}