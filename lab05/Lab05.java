/*
Program Name:           Lab05
Program Description:    Displays the following pi value for i = 200, i = 500, i = 1000
                        and determines which iteration causes the value of pi to display
                        an exact value
Program Author:         Jason Chau
Date Created:           02/23/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab05;


public class Lab05 {
    public static void main(String[] args) {
        double PI = 3;
        double savePI = 0;
        double term;
        double savei = 0;
        double sign = 1;
        boolean isRangeFound = false;
//For loop that stores the value of pi for each iteration between 1-1000
        for (double i = 1; i >= 1 && i <= 1000; i++) {
//Calculating pi via the Nilakantha formula
            term = (sign * 4)/((2 * i) * (2 * i + 1) * (2 * i + 2));
            PI = PI + term;
//With each loop the signs will change from + and -
            sign = -1 * sign;
//Determines which iteration will meet the given constraint
            if ((isRangeFound == false) && (PI >= 3.14159265) && (PI < 3.14159266)) {
                savePI = PI;
                savei = i;
                isRangeFound = true;
            }
//Displays the values of pi for each of these three iterations
            if ((i == 200) || (i == 500) || (i == 1000)) {
                System.out.printf("The value of \u03C0 is: %.10f when i = %.0f\n", PI, i);
            }
        }
        System.out.printf("The number of iterations to get to 3.14159265 is %.0f. \u03C0 = %.10f\n", savei, savePI);
    }
}
