/*
Program Name:           Inclass09A Point
Program Description:    Point class that determines x and y values based on input
                        from the TestRectangle class. It will return the input values
                        as x and y appropriately as well as the number of points
                        and rectangles in total.
Program Author:         Jason Chau
Date Created:           04/19/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass09a;

public class Point {
//Declaring x, y, numberOfPoints, and numberOfRectangles as private for this class only
    private int x;
    private int y;
    private static int numberOfPoints;
    private static int numberOfRectangles;
//Declaring Point as public so that the TestRectangle class can reach this information
    public Point() {
//x and y are intially zero until program determines change, add 1 to total points
        x = 0;
        y = 0;
        numberOfPoints++;
    }
    public Point(int xValue, int yValue) {
//x and y are made equal to xValue and yValue respectively, add 1 to total points
        x = xValue;
        y = yValue;
        numberOfPoints++;
    }
//Getter methods that returns appropriate information based on what the TestRectangle class asks for
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getPoints() {
        return numberOfPoints;
    }
    public int getRectangles() {
        return numberOfRectangles;
    }
//Increasing the total count that is displayed in the TestRectangle class
    public void addToPoints() {
        numberOfPoints += 1;
    }
    public void addToRectangles() {
        numberOfRectangles += 1;
    }
//Allows for adjustment of the value based on change in the TestRectangle class
    public void setX(int xValue) {
        x = xValue;
    }
    public void setY(int yValue) {
        y = yValue;
    }
}