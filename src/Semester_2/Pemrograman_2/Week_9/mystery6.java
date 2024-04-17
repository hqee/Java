package Semester_2.Pemrograman_2.Week_9;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        4
        8, 4, 8
        16, 8, 16
        12, 8, 4, 8, 12
        12, 9, 6, 3, 6, 9, 12
 */

public class mystery6 {
    public static void main(String[] args) {
        hasil(4, 1);
        System.out.println();
        hasil(4, 2);
        System.out.println();
        hasil(8, 2);
        System.out.println();
        hasil(4, 3);
        System.out.println();
        hasil(3, 4);
    }

    public static void hasil(int x, int y) {
        if (y == 1) {
            System.out.print(x);
        } else {
            System.out.print(x * y + ", ");
            hasil(x, y - 1);
            System.out.print(", " + x * y);
        }
    }
}
