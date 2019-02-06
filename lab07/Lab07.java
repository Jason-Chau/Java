/*
Program Name:           Lab07
Program Description:    Prompts the user to input the length of an array and the
                        number of scores. Program will print out the scores, the lowest
                        & highest scores, the average score, there corresponding
                        letter grade, and the scores in descending order
Program Author:         Jason Chau
Date Created:           03/30/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab07;

import java.util.Scanner;
public class Lab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Entering array length which will be the number of scores to be inputted
        System.out.println("Enter the length of the array:");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
//The number of scores must equal the array length
        System.out.println("Enter " + arrayLength + " scores:");
        for (int i = 0; i <= arrayLength - 1; i++) {
            array[i] = input.nextInt();
        }
        printScores(array);
        lowestScore(array);
        highestScore(array);
        averageScore(array);
        countGrades(array, 'A');
        countGrades(array, 'B');
        countGrades(array, 'C');
        countGrades(array, 'D');
        countGrades(array, 'F');
        printDescendingScores(array);
    }
//print scores
    public static void printScores(int[] array) {
        System.out.print("Printed scores: ");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
//lowest score
    public static int lowestScore(int[] array) {
        System.out.print("\nLow:\t");
        int lowest = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        System.out.println(lowest);
        return lowest;
    }
//highest score
    public static int highestScore(int[] array) {
        System.out.print("High:\t");
        int highest = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        System.out.println(highest);
        return highest;
    }
//average score
    public static double averageScore(int[] array) {
        System.out.print("Avg:\t");
        double sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println(average);
        return average;
    }
//count grades
    public static int countGrades(int[] array, char gradeType) {
        int max = 0;
        int min = 0;
        int count = 0;
        switch (gradeType) {
            case 'A':
                max = 100;
                min = 90;
                System.out.print("A's:\t");
                break;
            case 'B':
                max = 89;
                min = 80;
                System.out.print("B's:\t");
                break;
            case 'C':
                max = 79;
                min = 70;
                System.out.print("C's:\t");
                break;
            case 'D':
                max = 69;
                min = 60;
                System.out.print("D's:\t");
                break;
            case 'F':
                max = 59;
                min = 0;
                System.out.print("F's:\t");
                break;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] >= min && array[i] <= max) {
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }
//print descending scores
    public static void printDescendingScores(int[] array) {
        System.out.print("Scores in descending order are: ");
        java.util.Arrays.sort(array);
        int[] result = new int[array.length];
        for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
