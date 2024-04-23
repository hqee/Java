package Semester_2.Pemrograman_2.Week_10;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Recursive
        9
        9
        9
        
        Iterasi 
        9
        9
        9

        Recursive method execution time: 1 milliseconds
        Iterative method execution time: 0 milliseconds
 */

public class mystery {
    public static void main(String[] args) {
        long startTime, endTime, recursiveTime, iterativeTime;

        // Recursive method
        startTime = System.currentTimeMillis();
        System.out.println(hasilRecursive(648));
        System.out.println(hasilRecursive(72));
        System.out.println(hasilRecursive(9));
        endTime = System.currentTimeMillis();
        recursiveTime = endTime - startTime;

        // Iterative method
        startTime = System.currentTimeMillis();
        System.out.println(hasilIterative(648));
        System.out.println(hasilIterative(72));
        System.out.println(hasilIterative(9));
        endTime = System.currentTimeMillis();
        iterativeTime = endTime - startTime;

        System.out.println("Recursive method execution time: " + recursiveTime + " milliseconds");
        System.out.println("Iterative method execution time: " + iterativeTime + " milliseconds");
    }

    public static int hasilRecursive(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return hasilRecursive(a + b);
        }
    }

    public static int hasilIterative(int n) {
        while (n >= 10) {
            int a = n / 10;
            int b = n % 10;
            n = a + b;
        }
        return n;
    }
}
