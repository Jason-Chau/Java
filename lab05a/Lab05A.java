/*
Program Name:           Lab05A
Program Description:    Converts Decimal input into Binary
Program Author:         Jason Chau
Date Created:           03/2/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab05a;

import java.util.Scanner;
public class Lab05A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer betwee 0-255, or 999 to exit: ");
        int decint = input.nextInt();
//Program requires an integer from 0-255 or 999 to move on
        while (decint != 999) {
//When the integer is not 999 but also doesn't meet the constraint, the loop keeps repeating
            while ((decint < 0) || (decint > 255)) {
                System.out.print("Entry out of bounds. Please re-enter: ");
                decint = input.nextInt();
            }
//Takes the integer input and divides it by two while storing the remainder in a bit variable
            int bit8 = decint%2;
            int quotient = decint/2;
            int bit7 = quotient%2;
            quotient = quotient/2;
            int bit6 = quotient%2;
            quotient = quotient/2;
            int bit5 = quotient%2;
            quotient = quotient/2;
            int bit4 = quotient%2;
            quotient = quotient/2;
            int bit3 = quotient%2;
            quotient = quotient/2;
            int bit2 = quotient%2;
            quotient = quotient/2;
            int bit1 = quotient%2;
//Displays the integer in decimal form, and then its converted binary form
            System.out.println("Decimal = " + decint);
            System.out.println("Binary = " + bit1 + bit2 + bit3 + bit4 + bit5 + bit6 + bit7 + bit8 + "\n");
            System.out.print("Enter an integer between 0-255, or 999 to exit: ");
//Program will keep looping for integer inputs unless it is 999
            decint = input.nextInt();
        }
        System.out.println("Program ending.");
    }
}