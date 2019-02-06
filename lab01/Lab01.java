/*
Program Name:           Lab01 - Approximating PI
Program Description:    This program calculates an approximation of π using the following formula:
                        π = 4 * [1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13]
Program Author:         Jason Chau
Date Created:           01/19/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab01;

import javax.swing.JOptionPane;
public class Lab01 {
    public static void main(String[] args) {
        //Identify PI and setting it equal to the expression given to approximate it's value
        //Using the characters "J" and "C" and proper indentation to create a larger version of the given characters
        System.out.println("J  J  J  J  J       C  C  C\n      J           C\n      J         C\nJ     J         C\nJ     J           C\n  J J               C  C  C\n");
        System.out.println("Welcome to CSC 108.");
        //Our name and the approximation of the pi symbol from a unicode character in the next line
        System.out.println("Jason Chau's appoximation of \u03C0 is:\n" + (4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13)));
        //Our name and approximation of pi shown in a message dialogue box
        JOptionPane.showMessageDialog(null, "Jason Chau's appoximation of \u03C0 is:\n" + (4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13)));
    }
}