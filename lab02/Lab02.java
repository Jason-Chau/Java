/*
Program Name:           Lab02
Program Description:    Prompts a user to enter the price of their appetizer,
                        dinner, and dessert. It will calculate all the prices
                        with tax and tip and display the restaurant bill
Program Author:         Jason Chau
Date Created:           02/1/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab02;

import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        //Declaring the constants of tip rate and tax rate
        final double lowTipRate = 0.10;
        final double medTipRate = 0.15;
        final double highTipRate = 0.20;
        final double ctTaxRate = 0.0635;
        //Creating a scanner to prompt users to enter prices for their meal
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of your appetizer: ");
        double appetizerPrice = input.nextDouble();
        System.out.print("Enter the price of your dinner: ");
        double dinnerPrice = input.nextDouble();
        System.out.print("Enter the price of your dessert: ");
        double dessertPrice = input.nextDouble();
        //Displaying prices for meals including the calculated tax and total bill
        System.out.println("\nAppetizer price:\t$" + appetizerPrice);
        System.out.println("Dinner price:\t\t$" + dinnerPrice);
        System.out.println("Dessert price:\t\t$" + dessertPrice);
        double totalPrices = appetizerPrice + dinnerPrice + dessertPrice;
        double totalTax = totalPrices * ctTaxRate;
        System.out.println("CT tax:\t\t\t$" + (int)(totalTax * 100)/100.0);
        double totalBill = totalPrices + totalTax;
        System.out.println("Total bill:\t\t$" + (int)(totalBill * 100)/100.0);
        //Determining and displaying the tip rate from the total bill
        double lowTip = totalBill * lowTipRate;
        double medTip = totalBill * medTipRate;
        double highTip = totalBill * highTipRate;
        System.out.println("\nTip recommendations:");
        System.out.println("Low tip (10%):\t\t$" + (int)(lowTip * 100)/100.0);
        System.out.println("Medium tip (15%):\t$" + (int)(medTip * 100)/100.0);
        System.out.println("High tip (20%):\t\t$" + (int)(highTip * 100)/100.0);
    }
}
