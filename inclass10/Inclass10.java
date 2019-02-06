/*
Program Name:           Inclass10
Program Description:    Creates and scans an input file, then prompts the user to
                        input a domain name where the program creates an output file
                        that have the names of the employees as well as a generated
                        email based on their first and middle initial and the domain name
Program Author:         Jason Chau
Date Created:           04/25/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass10;

import java.util.Scanner;
import java.io.File;
public class Inclass10 {
    public static void main(String[] args) throws Exception {
//Creates file related to the employees email after a domain is inputted
        java.io.File file = new java.io.File("EmployeeEmails.txt");
//If the file with the same name as above already exists, the program prints that it exists and ends
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
//Scanner object that prompts user to input the domain for an email address
        Scanner input = new Scanner(System.in);
        System.out.print("Enter domain name (e.g. ibm): ");
        String domainName = input.nextLine();
        domainName = "@" + domainName + ".com";
//Scans the file that is a part of this program related to the employees names
        input = new Scanner(new File("EmployeeNames.txt"));
//Will print out the names accordingly
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        while(input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            String firstInit = firstName.substring(0,1);
            String middleInit = middleName.substring(0,1);
//Emails are created based on the initials of the employees name and the domain name
            String emailAddress = firstInit + middleInit + lastName + domainName;
            output.printf("%-8s%-10s%-8s%-10s\n", firstName, middleName, lastName, emailAddress.toLowerCase());
        }
//Closes output after creation of file
        output.close();
        System.out.println("File written successfully");

    }
}