package Semester_2.Pemrograman_2.Week_13;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex4 {
    public static void main(String[] args) {
        // list stores [42, 17, 29, 8, 54, 36]
        LinkedIntList list = new LinkedIntList();
        list.add(42);
        list.add(17);
        list.add(29);
        list.add(8);
        list.add(54);
        list.add(36);

        System.out.println(list.min());
    }
}

/*
 * Output
 * 8
 */
