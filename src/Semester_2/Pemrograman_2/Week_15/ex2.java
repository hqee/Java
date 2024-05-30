package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex2 {
    public static int x;

    public static int f(int x) {
        x = (int) Math.pow(x, 2);
        return x;
    }

    public static void main(String[] args) {
        x = 4;
        System.out.println(f(x));
    }
}

/*
 * Output :
 * 16
 */
