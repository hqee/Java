package Semester_2.Pemrograman_2.Week_13;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex5 {
    public static void main(String[] args) {
        // list stores [1, 18, 2, 7, 8, 39, 18, 40]
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println(list.hasTwoConsecutive());
    }
}

/*
 * Output :
 * true
 */
