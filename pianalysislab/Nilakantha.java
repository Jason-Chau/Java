/*
Program Name:           PiAnalysisLab Nilakantha
Program Description:    
Program Author:         Jason Chau
Date Created:           05/2/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package pianalysislab;

public class Nilakantha {
    public static void main(String[] args) {
        double PI = 3;
        double term;
        double sign = 1;
        long startTime = System.currentTimeMillis();
        for (double i = 1; i >= 1 && i <= 1000000; i++) {
            term = (sign * 4)/((2 * i) * (2 * i + 1) * (2 * i + 2));
            PI = PI + term;
            sign = -1 * sign;
            if (i == 1000000) {
                System.out.printf("The value of \u03C0 is: %.10f when i = %.0f\n", PI, i);
            }
        }
        long endTime = System.currentTimeMillis();
        long currentTime = endTime - startTime;
        System.out.println(currentTime + " millseconds");
    }
}
