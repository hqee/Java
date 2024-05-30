package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

import java.util.*;

public class ex5 {
    public static int countNegatives(int[] numbers) {
        return (int) Arrays.stream(numbers)
                .filter(n -> n < 0)
                .count();
    }

    public static void main(String[] args) {
        int[] numbers = { 5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6 };
        System.out.println(countNegatives(numbers));
    }
}

/*
 * Output :
 * 7
 */
