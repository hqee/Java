package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex1 {

    // Doubles the values of all elements in an array.
    public static void doubleAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * a[i];
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        doubleAll(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output :
 * 2 8 18 32 18 14 8 18 22
 */

// It modifies the array that was passed in. It should return the new array
// state
