/*
Program Name:           Inclass09 TestRectangle
Program Description:    Specific class that calculates the  area, perimeter, and diagonal
                        of a rectangle with data fields, constructors and methods
Program Author:         Jason Chau
Date Created:           04/11/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass09;

public class TestRectangle {
    public static void main(String[] args) {
//Create a rectangle that calculates area, perimeter, and diagonal
        SimpleRectangle rectangle = new SimpleRectangle();
        System.out.println("The area of the rectangle of length " + rectangle.length + " and width " + rectangle.width + " is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle of length " + rectangle.length + " and width " + rectangle.width + " is " + rectangle.getPerimeter());
        System.out.println("The diagonal of the rectangle of length " + rectangle.length + " and width " + rectangle.width + " is " + rectangle.getDiagonal());
    }
}
//Define the rectangle class with constructors
class SimpleRectangle {
    double length;
    double width;
//Construct a rectangle with length 10 and 20
    SimpleRectangle() {
        length = 10;
        width = 20;
    }
//Construct a rectangle with a specified length and width    
    SimpleRectangle(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;
    }
//Method that returns the area of the rectangle
    double getArea() {
        return length * width;
    }
//Method that returns the perimeter of the rectangle
    double getPerimeter() {
        return (2 * length) + (2 * width);
    }
//Method that returns the diagonal of the rectangle
    double getDiagonal() {
        return Math.sqrt((length * length) + (width * width));
    }
//Set a new length and width for this rectangle
    void setLengthWidth(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;
    }
}