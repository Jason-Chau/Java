/*
Program Name:           Inclass04
Program Description:    This program will give a day based on a number,
                        give a range between two input values,
                        calculate the square root of an input value,
                        calculate an exponential and round it the nearest whole number,
                        give a numbers equivalent letter,
                        give the uppercase letter of it's lowercase version,
                        and say a quote with an inputted adjective and last name.
Program Author:         Jason Chau
Date Created:           02/14/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass04;

import java.util.Scanner;
public class Inclass04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer for the day of the week (0-6): ");
        int day_number = input.nextInt();
//Switch statement for integers 0-6 and their respective days
        switch (day_number) {
            case 0: System.out.println("0 is Sunday"); break;
            case 1: System.out.println("1 is Monday"); break;
            case 2: System.out.println("2 is Tuesday"); break;
            case 3: System.out.println("3 is Wednesday"); break;
            case 4: System.out.println("4 is Thursday"); break;
            case 5: System.out.println("5 is Friday"); break;
            case 6: System.out.println("6 is Saturday"); break;
            default: System.out.println("Integer is invalid."); break;
        }
//Calculating the min and max of integers inputted by the user
        System.out.println("\nPlease enter two numbers for max and min:");
        double number_1 = input.nextDouble();
        double number_2 = input.nextDouble();
        System.out.println("The minimum is " + Math.min(number_1, number_2) + " and the maximum is " + Math.max(number_1, number_2));
//Calculating the square root of an integer inputted by the user
        System.out.println("\nPlease enter a number to be square-rooted:");
        double number_3 = input.nextDouble();
        System.out.println("The square root of " + number_3 + " is: " + Math.sqrt(number_3));
//Calculating the exponential of integers inputted by the user, and rounding it
        System.out.println("\nPlease enter a base:");
        double base = input.nextDouble();
        System.out.println("Please enter a power:");
        double power = input.nextDouble();
        System.out.println("The base " + base + " raised to the power of " + power + ", rounded to the nearest whole number, is " + Math.round(Math.pow(base, power)));
//Determining the lower case letter of its equivalent integer
        System.out.println("\nPlease enter an integer between 1-26:");
        int integer_1 = input.nextInt();
        int lower_case = integer_1 + 96;
        System.out.println("Letter " + integer_1 + " is: " + (char)lower_case);
//Showing the upper case letter of an inputted lower case character
        System.out.println("\nPlease enter a lower case character:");
        char character = input.next().charAt(0);
        System.out.println("Letter in uppercase is " + Character.toUpperCase(character));
//Inputting a last name and adjective for a quote with a smiley face
        System.out.println("\nPlease enter your last name:");
        String last_name = input.next();
        System.out.println("Please enter an adjective for Java:");
        String adjective = input.next();
        System.out.println("Here's my quote:\n\t\"Programming is \'" + adjective + "\' for those that work hard.\" - " + last_name + "\u263A");
    }
}