/*
Program Name:           Lab09A Point
Program Description:    Class that is used in the TestPoint class. Creates private
                        datatypes x and y, determines what the x and y values are
                        for a coordinate point format, and calculates the distance
                        between the two points given based on an equation
Program Author:         Jason Chau
Date Created:           04/20/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab09a;

public class Point {
//Declaring private datatypes for this class only
    private int x;
    private int y;
//Method with this to set the x and y to zero as default
    public Point() {
        this(0,0);
    }
//Method that connects with the object in the TestPoint class and sets x and y to inputs
    public Point(int xValue, int yValue) {
        this.x = xValue;
        this.y = yValue;
    }
//Method that will return x value in the TestPoint class
    public int getX() {
        return this.x;
    }
//Method that will return y value in the TestPoint class
    public int getY() {
        return this.y;
    }
//Method that calculates and returns the distance between the two given points
    public static double getDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }
}