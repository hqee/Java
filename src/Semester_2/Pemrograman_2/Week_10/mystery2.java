package Semester_2.Pemrograman_2.Week_10;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        1
        1, 2, 4
        1, 2, 4, 8, 16
        1, 3, 7, 15, 30
        1, 3, 6, 12, 25, 50, 100
 */

public class mystery2 {
    public static void hasil(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            hasil(n / 2);
            System.out.print(", " + n);
        }
    }

    public static void main(String[] args) {
        hasil(1);
        System.out.println();
        hasil(4);
        System.out.println();
        hasil(16);
        System.out.println();
        hasil(30);
        System.out.println();
        hasil(100);
    }
}
