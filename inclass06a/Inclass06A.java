/*
Program Name:           Inclass06A
Program Description:    Taking our work from inclass06 and making it overload
                        (same method name with different data types) and creating
                        another method that assigns negative, positive or neutral
                        to the resulting value.
Program Author:         Jason Chau
Date Created:           03/21/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass06a;

import java.util.Scanner;
public class Inclass06A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two decimals: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.print("Enter two integers: ");
        int num3 = input.nextInt();
        int num4 = input.nextInt();
/*Print out the inputs and the calculated result based on the method class
Formated first with sign method, then secondary method to calculate the correct value, and if it's positive, negative, or neutral*/
        System.out.println("The minimum of " + num1 + " and " + num2 + " is " + sign(min(num1, num2)));
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + sign(max(num1, num2)));
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sign(sum(num1,num2)));
        System.out.println("The difference between " + num1 + " and " + num2 + ", rounded to the nearest integer, is " + sign((int)difference(num1, num2)));
        System.out.println("The product of " + num1 + " and " + num2 + " is " + sign(product(num1, num2)));
        System.out.println("\nThe minimum of " + num3 + " and " + num4 + " is " + sign(min(num3, num4)));
        System.out.println("The maximum of " + num3 + " and " + num4 + " is " + sign(max(num3, num4)));
        System.out.println("The sum of " + num3 + " and " + num4 + " is " + sign(sum(num3, num4)));
        System.out.println("The difference between " + num3 + " and " + num4 + ", rounded to the nearest integer, is " + sign(difference(num3, num4)));
        System.out.println("The product of " + num3 + " and " + num4 + " is " + sign(product(num3, num4)));
    }
//The method class called min that calculates the minimum value
    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    public static int min(int num3, int num4) {
        if (num3 < num4)
            return num3;
        else
            return num4;
    }
//The method class called max that calculates the maximum value
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static int max(int num3, int num4) {
        if (num3 > num4)
            return num3;
        else
            return num4;
    }
//The method class called sum that calculates the sum of the two inputs
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static int sum(int num3, int num4) {
        return num3 + num4;
    }
//The method class called difference that calculates the difference of the two inputs and rounds it
    public static double difference(double num1, double num2) {
        return Math.round(num1 - num2);
    }
    public static int difference(int num3, int num4) {
        return Math.round(num3 - num4);
    }
//The method class called product that calculates the product of the two inputs
    public static double product(double num1, double num2) {
        return num1 * num2;
    }
    public static int product(int num3, int num4) {
        return num3 * num4;
    }
//Sign method that determines if a value is positive, negative, or neutral
    public static String sign(double d) {
        if (d > 0)
            return ("positive: " + d);
        else if (d < 0)
            return ("negative: " + d);
        else
            return ("neutral: " + d);
    }
    public static String sign(int i) {
        if (i > 0)
            return ("positive: " + i);
        else if (i < 0)
            return ("negative: " + i);
        else
            return ("neutral: " + i);
    }
}