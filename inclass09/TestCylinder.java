/*
Program Name:           Inclass09 TestCylinder
Program Description:    Specific class that calculates the surface area and volume
                        of a cylinder with data fields, constructors and methods
Program Author:         Jason Chau
Date Created:           04/11/17
Change#:                
Change Date:            
Programmer Name:        
Description:
*/
package inclass09;

public class TestCylinder {
    public static void main(String[] args) {
//Create a cylinder that calculates surface area and volume
        SimpleCylinder cylinder = new SimpleCylinder();
        System.out.println("The surface area of the cylinder of radius " + cylinder.radius + " and height " + cylinder.height + " is " + cylinder.getSurfaceArea());
        System.out.println("The volume of the cylinder of radius " + cylinder.radius + " and height " + cylinder.height + " is " + cylinder.getVolume());
    }
}
//Define the cylinder class with constructors
class SimpleCylinder {
    double radius;
    double height;
//Construct a circle with radius 10 and 30
    SimpleCylinder() {
    radius = 10;
    height = 30;
}
//Construct a cylinder with a specified radius and height    
    SimpleCylinder(double newRadius, double newHeight) {
        radius = newRadius;
        height = newHeight;
    }
//Method that returns the surface area of the cylinder
    double getSurfaceArea() {
        return 2 * (Math.PI * Math.pow(radius, 2)) + (Math.PI * 2 * radius * height);
    }
//Method that returns the volume of the cylinder
    double getVolume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }
//Set a new radius and height for this cylinder
    void setRadiusHeight(double newRadius, double newHeight) {
        radius = newRadius;
        height = newHeight;
    }
}