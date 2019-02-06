/*
Program Name:           Inclass03
Program Description:    This program helps my daughter check her math homework
Program Author:         Jason Chau
Date Created:           02/7/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass03;

import java.util.Scanner;
public class Inclass03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your problem number: ");
        //Using byte data type and setting variable range with logical OR operator
        byte problem_number = input.nextByte();
        if ((problem_number < 1) || (problem_number > 10)) {
            System.out.println("Problem number outside range. Program ending.");
            return;
        }
        //Multiple if statement and identifying even problems which calculate circles
        if (problem_number % 2 == 0) {
            System.out.println("Circle");
            System.out.print("Enter radius: \n");
            double radius = input.nextDouble();
            final double PI = 3.14159;
            double area = PI * radius * radius;
            System.out.println("Area = " + area);
        }
        //An else statement that identifies odd problems, calculates rectangles
        else {
            System.out.println("Rectangle");
            System.out.print("Enter length: \n");
            double length = input.nextDouble();
            System.out.print("Enter width: \n");
            double width = input.nextDouble();
            double area = length * width;
            System.out.println("Area = " + area);
        }
    }
}
