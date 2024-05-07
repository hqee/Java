package Semester_2.Pemrograman_2.Week_13;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex3 {
    public static void main(String[] args) {
        // list -> [1] -> [2] /
        ListNode list = new ListNode(1, new ListNode(2));
        ListNode temp = new ListNode(3, new ListNode(4));

        System.out.println("list -> " + list.data + " -> " + list.next.data);
        System.out.println("temp -> " + temp.data + " -> " + temp.next.data);

        // list -> [1] -> [3] -> [4] -> [2] /
        temp.next.next = list.next;
        list.next = temp;

        // list -> [1] -> [3] -> [4] -> [2] /
        System.out.println("\nlist -> " + list.data + " -> " + list.next.data + " -> " + list.next.next.data + " -> "
                + list.next.next.next.data);
    }
}

/*
 * Output:
 * list -> 1 -> 2
 * temp -> 3 -> 4
 * 
 * list -> 1 -> 3 -> 4 -> 2
 */
