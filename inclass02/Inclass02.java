/*
Program Name:           Inclass02
Program Description:    This program calculates the volme of two different
                        sized cylinders and then reports the difference in 
                        volumes as a positive number
                        Volume = PI * Radius^2 * Height
Program Author:         Jason Chau
Date Created:           01/31/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass02;

import java.util.Scanner;
public class Inclass02 {
    public static void main(String[] args) {
        //Declaring the constant pi
        final double PI = 3.14159;
        //Creating a scanner to accept keyboard input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of the first cylinder: ");
        //Declaring radius, height, and volume to calculate the first cylinder's volume
        double radius1 = input.nextDouble();
        double height1 = input.nextDouble();
        double volume1 = PI * radius1 * radius1 * height1;
        System.out.println("The volume of the first cylinder = " + volume1);
        System.out.print("Enter radius and height of the second cylinder: ");
        //Declaring radius, height, and volume to calculate the second cylinder's volume
        double radius2 = input.nextDouble();
        double height2 = input.nextDouble();
        double volume2 = PI * radius2 * radius2 * height2;
        System.out.println("The volume of the second cylinder = " + volume2);
        //Determining the difference of the two volumes as a positive value
        double volume_difference = Math.abs(volume1 - volume2);
        System.out.println("The difference in volumes = " + volume_difference);
   }   
}