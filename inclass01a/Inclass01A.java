/*
Program Name:           Inclass01A
Program Description:    This program uses Cramer's Rule to calculate the values of x and y for to linear equations.
                        If: ax + by = e and cx + dy = f
                        Then: x = (ed - bf)/(ad - bc) and y = (af - ec)/(ad - bc)
Program Author:         Jason Chau
Date Created:           01/24/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass01a;

public class Inclass01A {
    public static void main(String[] args) {
        //Beginning with the rule used in this program, Cramer's Rule, and explaining how its calculated
        System.out.println("Cramer's Rule states:\n---------------------");
        System.out.println("If:\n  ax + by = e\n  cx + dy = f");
        System.out.println("Then:\n  x = (ed - bf)/(ad - bc)\n  y = (af - ec)/(ad - bc)\n");
        //Determing the value of x and y based on the linear equations provided and Cramer's Rule
        System.out.println("Using Cramer's Rule, the values of x and y for the following two linear equations:");
        System.out.println("   3.4x + 50.2y = 44.5    and\n   2.1x + 0.55y = 5.9\nare:");
        //Both x and y are printed in the output, plus Cramer's equation with the proper input values
        /*
        a = 3.4
        b = 50.2
        c = 2.1
        d = 0.55
        e = 44.5
        f = 5.9
        */
        System.out.println("x = " + (((44.5 * 0.55) - (50.2 * 5.9))/((3.4 * 0.55) - (50.2 * 2.1))));
        System.out.println("y = " + (((3.4 * 5.9) - (44.5 * 2.1))/((3.4 * 0.55) - (50.2 * 2.1))));
    }
}