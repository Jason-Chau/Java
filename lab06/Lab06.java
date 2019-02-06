/*
Program Name:           Lab06
Program Description:    Calculates the table of sales amount and commission from the
                        value of the sales amount, that is formatted by the user's input
                        of table start, end, and increment.
Program Author:         Jason Chau
Date Created:           03/9/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab06;
//Importing the Scanner for input and Decimal Format for money form
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab06 {
    public static void main (String[] args) {
//Decimal Format that has a minimum of $0.00 and up to $999,999,999.99
        DecimalFormat df = new DecimalFormat("$###,###,##0.00");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter table start, table end, and increment:");
        double tableStart = input.nextDouble();
        double tableEnd = input.nextDouble();
        double increment = input.nextDouble();
        System.out.println("\nSales Amount\t\tCommission");
/*Loop statement with an initial salesAmount equal to tableStart, and keeps repeating with added increment 
until it reaches or exceeds the tableEnd input*/
        for (double salesAmount = tableStart; salesAmount >= tableStart && salesAmount <= tableEnd; salesAmount += increment) {
/*Method class called computeCommission goes to the separate method and will return a calculated commission value
Print out first salesAmount and commissionEarned, then repeats with new values based on loop*/
            System.out.println(df.format(salesAmount) + "\t\t" + df.format(computeCommission(salesAmount)));
        }
    }
    public static double computeCommission (double salesAmount) {
        double commission;
        if (salesAmount > 20000)
            commission = 10000 * 0.075 + 10000 * 0.1125 + (salesAmount - 20000) * 0.145;
        else if (salesAmount >= 10000.01)
            commission = 10000 * 0.075 + (salesAmount - 10000) * 0.1125;
        else
            commission = salesAmount * 0.075;
        return commission;
    }
}