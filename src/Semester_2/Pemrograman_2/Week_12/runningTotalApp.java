package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class runningTotalApp {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(15);
        list.add(20);
        list.add(7);

        System.out.println(list.runningTotal());
    }
}

/*
 * Output :
 * [2, 5, 10, 14, 21, 36, 56, 63]
 */
