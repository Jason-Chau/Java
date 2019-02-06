/*
Program Name:           Inclass05
Program Description:    Multiplication quiz that asks the user to input the number of
                        questions. Answering all the questions will then calculate how
                        many were answered correctly and incorrectly and displays it.
Program Author:         Jason Chau
Date Created:           02/21/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package inclass05;

import java.util.Scanner;
public class Inclass05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of questions in the quiz:");
//Declaring the number of questions as a constant, and value based on the input
        final int  numberOfQuestions = input.nextInt();
//Declaring number of correct/incorrect count initially at zero
        int correctCount = 0;
        int errorCount = 0;
        int questionCount = 1;
//While loop will keep repeating until the question count exceeds the number of questions input
        while (questionCount <= numberOfQuestions) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            System.out.print("Question " + questionCount + ": What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();
//Whether the answer was correct or not will be displayed and it's  count will increase by one
            if (number1 * number2 == answer) {
                System.out.println("Correct.");
                correctCount++;
            }
            else {
                System.out.println("Incorrect. " + number1 + " * " + number2 + " = " + number1 * number2);
                errorCount++;
            }
            questionCount++;
        }
//Shows number of questions wrong, the score out of 100, and a congratulations if you got zero wrong
        System.out.print("\nYou got " + errorCount + " wrong. ");
        System.out.printf("You score is %.1f", ((double)correctCount/(double)numberOfQuestions * 100));
        if (errorCount == 0)
            System.out.println(". Congratulations!");
        else
            System.out.println("");
    }
}
