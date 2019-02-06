/*
Program Name:           Lab10
Program Description:    Program that reads an input file and creates an output file
                        that tells the name of the input file, the number of characters
                        in said file, the number of lines, and if the word 'java' in
                        any combination of characters is found in the input file
Program Author:         Jason Chau
Date Created:           04/27/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab10;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Lab10 {
//Ends the program if there are not exactly two arguments in the project configuration
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Incorrect amount of arguments");
            System.exit(0);
        }
//Creates a file object and searches for the input file stated in the arguments, but ends if not present
        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.println("Input file " + args[0] + " does not exist");
            System.exit(0);
        }
//Creates a scanner object that scans the input file from the arguments
        Scanner input = new Scanner(inputFile);
        int charCount = 0;
        int lineCount = 0;
        boolean JAVA = false;
//Scans and determines the number of characters and lines, as well as seeing if the term JAVA is present
        while (input.hasNext()) {
            String string1 = input.nextLine();
            charCount += string1.length();
            lineCount++;
            String string2 = string1.toUpperCase();
            if (string2.contains("JAVA"))
                JAVA = true;
        }
//Creates another file object that creates an output file based on the input file
        File outputFile = new File(args[1]);
        if (!outputFile.exists()) {
//Creates a printwriter object that prints specific characters in the output file
            PrintWriter output = new PrintWriter(outputFile);
            output.println("File " + inputFile + " has\n" + charCount + " characters\n" + lineCount + " lines");
//If the term JAVA is found, print that it was found
            if (JAVA == true) {
                output.println("Java appears in the input file");
            }
            else {
                output.print("Java does not appear in the input file");
            }
//Closes the output file from any more editing, and prints the file was written
            output.close();
            System.out.println("File " + args[1] + " written");
        }
        else {
            System.out.println("Output file " + args[1] + " already exists");
        }
    }
}