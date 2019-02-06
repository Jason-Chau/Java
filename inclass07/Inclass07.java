/*
Program Name:           Inclass07
Program Description:    Entering in any number of scores and calculates which scores
                        are above and below the average. Entering a negative number
                        will end the entering of inputs.
Program Author:         Jason Chau
Date Created:           03/28/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass07;

import java.util.Scanner;
public class Inclass07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Declare and create an array
        double[] scores = new double[100];
//Initialize sum accumulator to 0
        double sum = 0;
//Initialize array index variable to 0
        int i = 0;
        System.out.print("Enter a new score or negative number to exit: ");
//Scanner input for first score
        double scoreIn = input.nextDouble();
//If score is negative, end the while loop
        while (scoreIn >= 0) {
//Otherwise populate the array
            scores[i] = scoreIn;
//Accumulate total scores
            sum += scoreIn;
//Increment the array index variable
            i += 1;
            System.out.print("Enter a new score or negative number to exit: ");
//Get next score using Scanner input
            scoreIn = input.nextDouble();
        }
//Output total scores entered
        System.out.println("\nTotal scores entered: " + i);
//Calculate average score
        double average = sum / i;
        int scoresAbove = 0;
        int scoresBelow = 0;
//Traverse the loop backwards
        for (int j = i - 1; j >= 0; j--) {
//If the scsore is greater then or equal to the average
            if (scores[j] >= average) {
//Yes - increment the above counter
                scoresAbove += 1;
            }
            else {
//No - increment the below counter
                scoresBelow += 1;
            }
            
        }
//When done looping, put out total
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + scoresAbove);
        System.out.println("Number of scores below the average: " + scoresBelow);
    }
}