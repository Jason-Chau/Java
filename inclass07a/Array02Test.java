/*
Program Name:           Inclass07A Array02Test
Program Description:    Asks the user for the length of the array, has the user input
                        integers in the array, and performs calculations, and the median.
                        For an odd array length, the median is the one in the middle. For an
                        even array length, it is the average of the two in the middle. If
                        the sentinel value is entered, issue a break statement
Program Author:         Jason Chau
Date Created:           04/4/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass07a;

import java.util.Scanner;
public class Array02Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of numbers in the array: ");
        int numListMax = input.nextInt();
//Create array
        int[] numList = new int[numListMax];
        int numListLength = 0;
//For loop that allows input until array meets contraint or input entered is 999
        for (int i = 0; i < numList.length; i++) {
            System.out.print("Enter a number, or 999 to exit: ");
            numList[i] = input.nextInt();
                if (numList[i] == 999) {
                numListLength = i;
                break;
            }
                else {
                    numListLength = numListMax;
                }
        }
//For loop that prints out array values and its value square root
        for (int i = 0; i < numListLength; i++) {
            System.out.println(numList[i] + " and its square root is " + Math.sqrt(numList[i]));
        }
//Prints the median based on the values in teh array
        if (numListLength % 2 == 1) {
            System.out.println("The median is: " + numList[numListLength / 2 + 1]);
        }
        else {
            double medianAverage = (numList[numListLength / 2 - 1] + (numList[numListLength / 2])) / 2.0;
            System.out.println("The median is: " + medianAverage);
        }
    }
}
