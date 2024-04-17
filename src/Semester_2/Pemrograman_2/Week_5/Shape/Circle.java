package Semester_2.Pemrograman_2.Week_5.Shape;

// Represents circles.
public class Circle implements Shape {
    private double radius;
    
    // Constructs a new circle with the given radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Returns the area of this circle.
    public double area() {
        return Math.PI * radius * radius;
    }
    
    // Returns the perimeter of this circle.
    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }
}
