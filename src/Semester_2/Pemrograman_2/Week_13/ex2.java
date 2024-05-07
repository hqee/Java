package Semester_2.Pemrograman_2.Week_13;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex2 {
    public static void main(String[] args) {
        // list -> [1] -> [2] /
        ListNode list = new ListNode(1, new ListNode(2));

        System.out.println("list -> " + list.data + " -> " + list.next.data);

        // list -> [3] -> [2] -> [1] /
        list = new ListNode(3, list);

        System.out.println("list -> " + list.data + " -> " + list.next.data + " -> " + list.next.next.data);
    }
}

/*
 * Output:
 * 1 -> 2
 * 3 -> 2 -> 1
 */
