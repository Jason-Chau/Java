/*
Program Name:           Lab09 TestQuadraticEquation
Program Description:    Program that runs and tests the quadratic equation based
                        on the three values inputted. Actual discriminant and roots
                        are calculated in a different class that is identified by
                        an object in this class. Will print out equation with
                        coefficients, roots, and time the program ran
Program Author:         Jason Chau
Date Created:           04/13/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab09;

import java.util.Scanner;
public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three coefficients:");
//Get 3 coefficients from the console
        int newA = input.nextInt();
        int newB = input.nextInt();
        int newC = input.nextInt();
//Create QuadraticEquation object with three coefficients
        QuadraticEquation quadratic = new QuadraticEquation(newA, newB, newC);
//If discriminant method returns > 0 prints both roots from get root methods
        if (quadratic.getDiscriminant() > 0) {
            System.out.println("For: " + quadratic.getA() + "x\u00b2 + " + quadratic.getB() + "x + " + quadratic.getC() + " = 0");
            System.out.println("Roots are " + quadratic.getRoot1() + " and " + quadratic.getRoot2());
        }
//If discriminant method returns = 0 prints first root from get root method
        else if (quadratic.getDiscriminant() == 0) {
            System.out.println("For: " + quadratic.getA() + "x\u00b2 + " + quadratic.getB() + "x + " + quadratic.getC() + " = 0");
            System.out.println("Root is " + quadratic.getRoot1());
        }
//If discriminant method returns < 0 prints no roots
        else {
            System.out.println("For: " + quadratic.getA() + "x\u00b2 + " + quadratic.getB() + "x + " + quadratic.getC() + " = 0");
            System.out.println("No roots");
        }
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
    }
}