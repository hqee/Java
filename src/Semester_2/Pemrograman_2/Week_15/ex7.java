package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

import java.util.Arrays;
import java.util.stream.Collectors;

public class ex7 {
    public static String pigLatin(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> word.substring(1) + "-" + word.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String input = "go seattle mariners";
        String pigLatinForm = pigLatin(input);
        System.out.println(pigLatinForm);
    }
}

/*
 * Output
 * o-gay eattle-say ariners-may
 */
