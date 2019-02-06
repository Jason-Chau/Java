/*
Program Name:           Inclass06
Program Description:    Determining the min, max, sum, difference, and product between
                        two numbers. But using different method classes.
Program Author:         Jason Chau
Date Created:           03/9/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass06;

import java.util.Scanner;
public class Inclass06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
/*Declaring variables that executes the given method then stores the result into the variable
Print out the inputs and the calculated result based on the method class*/
        System.out.println("The minimum of " + num1 + " and " + num2 + " is " + min(num1, num2));
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max(num1, num2));
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum(num1, num2)) ;
        System.out.println("The difference between " + num1 + " and " + num2 + ", rounded to the nearest integer, is " + (int)difference(num1, num2));
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product(num1, num2));
    }
//The method class called min that calculates the minimum value
    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
//The method class called max that calculates the maximum value
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
//The method class called sum that calculates the sum of the two inputs
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
//The method class called difference that calculates the difference of the two inputs and rounds it
    public static double difference(double num1, double num2) {
        return Math.abs(Math.round(num1 - num2));
    }
//The method class called product that calculates the product of the two inputs
    public static double product(double num1, double num2) {
        return num1 * num2;
    }
}