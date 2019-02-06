/*
Program Name:           Inclass05A
Program Description:    Entering an integer between 1 and 9 that outputs rows and
                        columns based on the integer inputted in the format of a
                        pyramid. It also displays the total number of integers
                        written, and the sum.
Program Author:         Jason Chau
Date Created:           02/28/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass05a;

import java.util.Scanner;
public class Inclass05A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 9, inclusive:");
        int maxCount = input.nextInt();
//Loop will keep repeating until constraints are met
        while ((maxCount < 1) || (maxCount > 9)) {
            System.out.println("Incorrect. Enter an integer between 1 and 9, inclusive:");
            maxCount = input.nextInt();
        }
        System.out.println();
        int totalIntegersWritten = maxCount;
        int totalSum = 0;
//Forming of the pyramid shape based on the number of rows and columns relating to the input
        for (int rowCtr = 1; rowCtr >= 1 && rowCtr <= maxCount; rowCtr++) {
            System.out.print(rowCtr);
            for (int colCtr = 2; colCtr >= 1 && colCtr <= rowCtr; colCtr++) {
                totalIntegersWritten = totalIntegersWritten + 1;
                totalSum = totalSum + rowCtr;
                System.out.print(rowCtr);
            }
            System.out.println();
        }
//Displays how many integers were written, and the sum of all the integers
        System.out.println("The total number of integers written:\t" + totalIntegersWritten);
        System.out.println("The total sum of all integers:\t\t" + (totalSum + totalIntegersWritten));
    }
}
