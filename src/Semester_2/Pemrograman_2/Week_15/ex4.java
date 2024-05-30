package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

import java.util.*;

public class ex4 {
    public static int largestEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
    }

    public static void main(String[] args) {
        int[] numbers = { 5, -1, 12, 10, 29, 2, 8 };
        System.out.println(largestEven(numbers));
    }
}

/*
 * Output :
 * 12
 */
