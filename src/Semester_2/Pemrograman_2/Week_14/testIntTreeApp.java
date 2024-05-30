package Semester_2.Pemrograman_2.Week_14;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class testIntTreeApp {
    public static void main(String[] args) {
        IntTree it = new IntTree(9);
        it.printSideways();
        System.out.println("====================");
        it.trim(2, 8);
        it.printSideways();
    }
}
/*
 * Output:
 * 7
 * 3
 * 6
 * 1
 * 5
 * 2
 * 9
 * 4
 * 8
 * ====================
 * 7
 * 3
 * 6
 */
