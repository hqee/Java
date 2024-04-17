package Semester_2.Pemrograman_2.Week_5.Shape;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Luas Circle : 452.3893421169302
        Luas Rectangle : 28.0
        Luas Triangle : 30.0
        ===============================
        Total Luas : 510.3893421169302
 */

public class shapeClient2 {
    public static void main(String[] args) {
        Circle circ = new Circle(12.0);
        Rectangle rect = new Rectangle(4, 7);
        Triangle tri = new Triangle(5, 12, 13);
        
        double circleArea = circ.area();
        double rectangleArea = rect.area();
        double triangleArea = tri.area();
        
        System.out.println("Luas Circle : " + circleArea);
        System.out.println("Luas Rectangle : " + rectangleArea);
        System.out.println("Luas Triangle : " + triangleArea);
        System.out.println("===============================");
        
        double totalArea = calculateTotalArea(circ, rect, tri);
        System.out.println("Total Luas : " + totalArea);
    }

    public static double calculateTotalArea(Shape... shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
