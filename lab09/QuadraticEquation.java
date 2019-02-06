/*
Program Name:           Lab09 QuadraticEquation
Program Description:    Class called QuadraticEquation that is identified as an
                        object in the TestQuadraticEquation class. Inputs from the
                        TestQuadraticEquation are identified here as a, b, and c
                        and are used to calculate the discriminant and roots
Program Author:         Jason Chau
Date Created:           04/13/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab09;

public class QuadraticEquation {
//Declare private data fields "final" was recommended by program
    private final int a;
    private final int b;
    private final int c;
//Create QuadraticEquation constructor with three arguments
    QuadraticEquation(int newA, int newB, int newC) {
        a = newA;
        b = newB;
        c = newC;
    }
//Get method that returns first coefficient
    int getA() {
        return a;
    }
//Get method that returns second coefficient
    int getB() {
        return b;
    }
//Get method that returns third coefficient
    int getC() {
        return c;
    }
//Create a method that returns the discriminant based on equation
    double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }
//Create a method that returns first root based on equation
    double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
//Create a method that returns second root based on equation
    double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}