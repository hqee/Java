package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class longestSortedSequenceApp {
    public static void main(String[] args) {
        ArrayIntList numbers = new ArrayIntList();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(7);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(42);
        numbers.add(308);
        numbers.add(17);

        System.out.println(numbers.longestSortedSequence());
    }
}

/*
 * Output
 * 4
 */
