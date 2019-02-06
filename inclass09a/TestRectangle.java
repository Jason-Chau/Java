/*
Program Name:           Inclass09A TestRectangle
Program Description:    Class with main method that prompts the user to enter four
                        integers in a dialogue pane, determines the x and y coordinates
                        and calculates the diagonal length, area, how many points,
                        and the number of rectangles formed. Then loops and shows the same
                        dialogue output pane with doubled everything.
Program Author:         Jason Chau
Date Created:           04/19/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass09a;

import javax.swing.JOptionPane;
public class TestRectangle {
    public static void main(String[] args) {
//Prompts the user to enter an integer four different times, in a nice looking window box
        int x1 = Integer.parseInt(JOptionPane.showInputDialog("Enter x1:"));
        int y1 = Integer.parseInt(JOptionPane.showInputDialog("Enter y1:"));
        int x2 = Integer.parseInt(JOptionPane.showInputDialog("Enter x2:"));
        int y2 = Integer.parseInt(JOptionPane.showInputDialog("Enter y2:"));
//Creates two object for the two different points that are formed from the inputs
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        point2.addToRectangles();
//For loop that shows the first dialogue output, and then the second with doubled values
        for (int i = 1; i <= 2; i++) {
//String that we can manipulate to print a large amount of information in one variable called output
            String output = "Point is (" + point1.getX() + ", " + point1.getY() + ")\n";
//Determining the points based on the x and y values from the Point class
            output += "Point is (" + point2.getX() + ", " + point2.getY() + ")\n\n";
//Calculating the diagonal length based on the x and y values from the Point class
            output += "Diagonal length: " + Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) + (point2.getY() - point1.getY()) * (point2.getY() - point1.getY())) + "\n";
//Calculating the perimeter based on the x and y values from the Point class
            output += "Perimeter is " + (2 * (point2.getX() - point1.getX()) + 2 * (point2.getY() - point1.getY())) + "\n";
//Calculating the area based on the x and y values from the Point class
            output += "Area is " + ((point2.getX() - point1.getX()) * (point2.getY() - point1.getY())) + "\n";
//Determining the number of points and rectangles from the Point class
            output += "Number of points is " + point2.getPoints() + "\n";
            output += "Number of rectangles is " + point2.getRectangles();
//Prints all previous string output in a dialogue box from the variable output
            JOptionPane.showMessageDialog(null, output);
//Setting new information that is doubled in the point objects
            point1.setX(point1.getX() * 2);
            point1.setY(point1.getY() * 2);
            point1.addToPoints();
            point2.setX(point2.getX() * 2);
            point2.setY(point2.getY() * 2);
            point2.addToPoints();
            point2.addToRectangles();
        }
    }
}
