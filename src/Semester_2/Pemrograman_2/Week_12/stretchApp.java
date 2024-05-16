package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class stretchApp {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(18);
        list.add(7);
        list.add(4);
        list.add(24);
        list.add(11);

        list.stretch(3);
        System.out.println(list);
    }
}

/*
 * Output
 * [18, 18, 18, 7, 7, 7, 4, 4, 4, 24, 24, 24, 11, 11, 11]
 */