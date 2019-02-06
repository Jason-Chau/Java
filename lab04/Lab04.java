/*
Program Name:           Lab04
Program Description:    This program calculates net paycheck information and 
                        displays it in a paystub format
Program Author:         Jason Chau
Date Created:           02/16/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab04;

import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
//Declaring these names and values as constants
        final double SOC_SEC_RATE = 0.06;
        final double MEDICARE_RATE = 0.01;
        final double UNION_DUES_RATE = 0.01;
        final double RETIREMENT_PLAN_RATE = 0.02;
        final double RETIREMENT_HEALTH_RATE = 0.03;
//Prompts the user to input hours worked, pay rate, and tax rates
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of hours worked in a pay period: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Please enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Please enter federal tax withholding rate (e.g. 0.15): ");
        double fedTaxWithholdingRate = input.nextDouble();
        System.out.print("Please enter state tax withholding rate (e.g. 0.045): ");
        double stateTaxWithholdingRate = input.nextDouble();
//Calculating the gross pay, the tax deductions, and the net pay
        double grossPay = hoursWorked * payRate;
        double federalTaxWithheld = grossPay * fedTaxWithholdingRate;
        double stateTaxWithheld = grossPay * stateTaxWithholdingRate;
        double socsecTaxWithheld = grossPay * SOC_SEC_RATE;
        double medicareTaxWithheld = grossPay * MEDICARE_RATE;
        double unionDuesWithheld = grossPay * UNION_DUES_RATE;
        double retirementPlanWithheld = grossPay * RETIREMENT_PLAN_RATE;
        double retirementHealthWithheld = grossPay * RETIREMENT_HEALTH_RATE;
        double totalDeductions = federalTaxWithheld + stateTaxWithheld + socsecTaxWithheld + medicareTaxWithheld + unionDuesWithheld + retirementPlanWithheld + retirementHealthWithheld;
        double netPay = grossPay - totalDeductions;
/*
Displays the gross pay, tax deductions, and net pay in a paystub format
which inlcudes the exact tax deduction name, the percentage it has on the gross pay and
and actual dollar amounts which later gets added together in the total deductions
*/
        System.out.println("\n************************");
        System.out.println("* Paystub Information: *");
        System.out.println("************************");
        System.out.println("Hours Worked:\t" + hoursWorked);
//Format Specifier %f to display decimals as cents in currency format
        System.out.printf("Pay Rate:\t$%.2f\n", payRate);
        System.out.printf("Gross Pay:\t$%.2f\n", grossPay);
        System.out.println("Deductions:");
//%f which displays the tax rate as a percentage and then the tax withheld in currency format
        System.out.printf("  Federal Tax (%.1f%%):\t\t$%.2f\n", fedTaxWithholdingRate * 100, federalTaxWithheld);
        System.out.printf("  State Tax (%.1f%%):\t\t$%.2f\n", stateTaxWithholdingRate * 100, stateTaxWithheld);
        System.out.printf("  Social Security Tax (%.1f%%):\t$%.2f\n", SOC_SEC_RATE * 100, socsecTaxWithheld);
        System.out.printf("  Medicare Tax (%.1f%%):\t\t$%.2f\n", MEDICARE_RATE * 100, medicareTaxWithheld);
        System.out.printf("  Union Dues (%.1f%%):\t\t$%.2f\n", UNION_DUES_RATE * 100, unionDuesWithheld);
        System.out.printf("  Retirement Plan (%.1f%%):\t$%.2f\n", RETIREMENT_PLAN_RATE * 100, retirementPlanWithheld);
        System.out.printf("  Retirement Health (%.1f%%):\t$%.2f\n", RETIREMENT_HEALTH_RATE * 100, retirementHealthWithheld);
        System.out.printf("Total Deductions:\t\t$%.2f\n\n", totalDeductions);
        System.out.printf("Net Pay:\t\t\t$%.2f\n", netPay);
    }
}
