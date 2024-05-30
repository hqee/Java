package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class isPairwiseSortedApp {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(19);
        list.add(24);
        list.add(-3);
        list.add(0);
        list.add(4);
        list.add(4);
        list.add(8);
        list.add(205);
        list.add(42);

        System.out.println(list.isPairwiseSorted());
    }
}

/*
 * Output :
 * true
 */
