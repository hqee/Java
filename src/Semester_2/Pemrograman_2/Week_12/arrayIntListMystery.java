package Semester_2.Pemrograman_2.Week_12;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

public class arrayIntListMystery {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(14);
        list.add(3);
        list.add(6);
        list.add(2);
        list.mystery();
        System.out.println("list = " + list);
        System.out.println("size = " + list.size());
    }
}

/*
 * Output :
 * list = [14, 3, 6, 2, 21]
 * size = 5
 */