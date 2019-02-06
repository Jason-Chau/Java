/*
Program Name:           Inclass07A Array03Test
Program Description:    Asks the user to enter the amount of students, then last name
                        and grade for each student, prints a listing of names and grades,
                        the average, and the highest and lowest grade
Program Author:         Jason Chau
Date Created:           04/4/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass07a;

import java.util.Scanner;
public class Array03Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of students: ");
        int studentsListLength = input.nextInt();
        int gradesListLength = studentsListLength;
//Create two arrays
        String[] studentsList = new String[studentsListLength];
        int[] gradesList = new int [studentsListLength];
//For loop that allows input of student name and grades until array meets constraint
        for (int i = 0; i < studentsListLength; i++) {
            System.out.print("Enter a last name and grade: ");
            studentsList[i] = input.next();
            gradesList[i] = input.nextInt();
        }
        System.out.println("The students and grades entered are:");
//For loop that prints strings and values in arrays
        for (int i = 0; i < studentsListLength; i++) {
            System.out.println(studentsList[i] + "   " + gradesList[i]);
        }
        double total = 0;
        int highest = 0;
        int saveHighestIndex = 0;
        int lowest = 100;
        int saveLowestIndex = 0;
//For loop that calculates the highest and lowest grades
        for (int i = 0; i < gradesListLength; i++) {
            if (gradesList[i] > highest) {
                highest = gradesList[i];
                saveHighestIndex = i;
            }
            else if (gradesList[i] < lowest) {
                lowest = gradesList[i];
                saveLowestIndex = i;
            }
            total += gradesList[i];
        }
//Prints the average of the total scores, and the students with the highest and lowest grade
        double average = total / gradesListLength;
        System.out.println("Average: " + average);
        System.out.println("Highest: " + studentsList[saveHighestIndex] + " " + gradesList[saveHighestIndex]);
        System.out.println("Lowest: " + studentsList[saveLowestIndex] + " " + gradesList[saveLowestIndex]);
    }
}
