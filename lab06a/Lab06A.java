/*
Program Name:           Lab06A
Program Description:    Entering a multi-digit number and determining if the number
                        is a palindrome (same number forward and backwards)
Program Author:         Jason Chau
Date Created:           03/23/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab06a;

import java.util.Scanner;
public class Lab06A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive mult-digit integer: ");
        int number = input.nextInt();
//While loop that repeats if number is not a multi digit integer
        while (number <= 9) {
//If statement that states number is negative and asks to input again
            if (number < 0) {
                System.out.println(number + " is negative. Please enter a positive multi-digit integer: ");
                number = input.nextInt();
            }
//When the number is neither multi digit nor negative, but it is a single digit
            else {
                System.out.println(number + " is one digit. Please enter a multi-digit positive integer: ");
                number = input.nextInt();
            }
        }
//Method that determines if integer is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }
    }
//The method that invokes another method within
    public static boolean isPalindrome(int number) {
        boolean result = false;
        if (reverse(number) ==  number) {
            result = true;
        }
        return result;
    }
//Method that calculates the integer, and if it's a palindrome
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }
        return result;
    }
}