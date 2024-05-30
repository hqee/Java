package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int[] array = { 2, -1, 4, 16 };
        System.out.println("Printed all doubled numbers in the array.");
        printDoubled(array);
    }

    public static void printDoubled(int[] array) {
        Arrays.stream(array)
                .map(num -> num * 2)
                .forEach(System.out::println);
    }
}

/*
 * Output :
 * Printed all doubled numbers in the array.
 * 4
 * -2
 * 8
 * 32
 */
