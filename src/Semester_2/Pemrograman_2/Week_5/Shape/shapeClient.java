package Semester_2.Pemrograman_2.Week_5.Shape;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        The shape: Semester_2.Pemrograman_2.Week_5.Shape.Circle@7a81197d
        area : 452.3893421169302
        perim: 75.39822368615503
        The shape: Semester_2.Pemrograman_2.Week_5.Shape.Triangle@72ea2f77
        area : 30.0
        perim: 30.0
        The shape: Semester_2.Pemrograman_2.Week_5.Shape.Rectangle@33c7353a
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
	    System.out.println("The shape: " + s);
	    System.out.println("area : " + s.area());
	    System.out.println("perim: " + s.perimeter());
	}
}
