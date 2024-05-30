package Semester_2.Pemrograman_2.Week_5.Shape;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Circle with radius 12.0
        area : 452.3893421169302
        perim: 75.39822368615503

        Triangle with sides 5.0, 12.0, and 13.0
        area : 30.0
        perim: 30.0

        Rectangle with width 4.0 and height 7.0
        area : 28.0
        perim: 22.0
 */

public class shapeClient {
    public static void main(String[] args) {
        Circle circ = new Circle(12.0);
        Rectangle rect = new Rectangle(4, 7);
        Triangle tri = new Triangle(5, 12, 13);
        printInfo(circ);
        printInfo(tri);
        printInfo(rect);

    }

    public static void printInfo(Shape s) {
        System.out.println(s);
        System.out.println("area : " + s.area());
        System.out.println("perim: " + s.perimeter() + "\n");
    }
}
