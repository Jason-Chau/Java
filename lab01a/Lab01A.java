/*
Program Name:           Lab01A
Program Description:    Converting temperature between Celsius and Fahrenheit with the following formulas:
                        Celsius * 9/5 + 32 = Fahrenheit
                        (Fahrenheit - 32) * 5/9 = Celsius
Program Author:         Jason Chau
Date Created:           01/26/17
Change#:                
Change Date:            
Programmer Name:        
Description:            
*/
package lab01a;

public class Lab01A {
    public static void main(String[] args) {
        System.out.println("Today's temperature is 50 degrees Fahrenheit. In Celsius it is: " + ((50 - 32) * 5.0/9));
        //Calculating the degrees in Fahrenheit into degrees in Celsius
        System.out.println("The temperature is 95 degrees Fahrenheit in Celsius is: " + ((95 - 32) * 5.0/9));
        System.out.println("The temperature is 85 degrees Fahrenheit in Celsius is: " + ((85 - 32) * 5.0/9));
        System.out.println("The temperature is 65 degrees Fahrenheit in Celsius is: " + ((65 - 32) * 5.0/9));
        System.out.println("The temperature is 0 degrees Fahrenheit in Celsius is: " + ((0 - 32) * 5.0/9));
        System.out.println("--------------------------------------------------------------------------");
        //Calculating the degrees in Celsius into degrees in Fahrenheit
        System.out.println("The temperature 100 degrees Celsius in Fahrenheit is: " + (100 * 9.0/5 + 32));
        System.out.println("The temperature 45 degrees Celsius in Fahrenheit is: " + (45 * 9.0/5 + 32));
        System.out.println("The temperature 35 degrees Celsius in Fahrenheit is: " + (35 * 9.0/5 + 32));
        System.out.println("The temperature 0 degrees Celsius in Fahrenheit is: " + (0 * 9.0/5 + 32));
    }   
}
