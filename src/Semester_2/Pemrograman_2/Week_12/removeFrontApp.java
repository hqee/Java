package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class removeFrontApp {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(8);
        list.add(17);
        list.add(9);
        list.add(24);
        list.add(42);
        list.add(3);
        list.add(8);
        list.removeFront(4);
        System.out.println(list);
    }
}

/*
 * Output :
 * [42, 3, 8]
 */
