package Semester_2.Pemrograman_2.Week_9;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
    6
    8
    7
    5
    -2
 */

public class mystery3 {
    public static int hasil(int n) {
        if (n < 0) {
            return -hasil(-n);
        } else if (n < 10) {
            return n;
        } else {
            return hasil(n / 10 + n % 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(hasil(6));
        System.out.println(hasil(17));
        System.out.println(hasil(259));
        System.out.println(hasil(977));
        System.out.println(hasil(-479));
    }

}
