package Semester_2.Pemrograman_2.Week_6;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Sebelum pengurutan:
        (52, 5)
        (61, 68)
        (97, 43)
        (48, 7)
        (39, 50)
        (34, 35)
        (75, 39)
        (29, 4)
        (12, 72)
        (11, 40)

        Setelah pengurutan:
        (11, 40)
        (12, 72)
        (29, 4)
        (34, 35)
        (39, 50)
        (48, 7)
        (52, 5)
        (61, 68)
        (75, 39)
        (97, 43)
 */

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        int result = Integer.compare(this.x, other.x);
        if (result == 0) {
            result = Integer.compare(this.y, other.y);
        }
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ArrayPoint {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            points.add(new Point(x, y));
        }

        System.out.println("Sebelum pengurutan:");
        for (Point point : points) {
            System.out.println(point);
        }

        Collections.sort(points);

        System.out.println("\nSetelah pengurutan:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}