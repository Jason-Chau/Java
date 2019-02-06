/*
Program Name:           Lab09A TestPoint
Program Description:    Class that determines the points on a graph based on input
                        from the user, and calculates the distance between the two
                        points from the Point class
Program Author:         Jason Chau
Date Created:           04/20/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package lab09a;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class TestPoint {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter x1 y1 x2 y2:");
//Tokenizer that allows for multiple inputs in one dialog box
        StringTokenizer st = new StringTokenizer(input, " ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
//Creating two Point objects that calculates information based on inputs
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
//String output in a dialog box that shows the two points and the distance between the two points
        String output = "The distance between the two points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + Point.getDistance(point1, point2);
        JOptionPane.showMessageDialog(null, output);
    }
}