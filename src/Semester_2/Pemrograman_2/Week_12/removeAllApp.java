package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class removeAllApp {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(14);
        list.add(5);
        list.add(-1);
        list.add(7);
        list.add(14);
        list.add(7);
        list.add(7);
        list.add(29);
        list.add(3);
        list.add(7);
        list.removeAll(7);
        System.out.println(list);
    }
}

/*
 * Output :
 * [14, 5, -1, 14, 29, 3]
 */
