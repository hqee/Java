package Semester_2.Pemrograman_2.Week_10;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Recursive
            8
            81
            1024
            1024
            243

        Iterasi 
            8
            81
            1024
            1024
            243
            
        Recursive method elapsed time: 1 milliseconds
        Iterative method elapsed time: 0 milliseconds
 */

public class pow {
    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;

        // Recursive method
        startTime = System.currentTimeMillis();
        System.out.println(powRecursive(2, 3));
        System.out.println(powRecursive(3, 4));
        System.out.println(powRecursive(4, 5));
        System.out.println(powRecursive(2, 10));
        System.out.println(powRecursive(3, 5));
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Recursive method elapsed time: " + elapsedTime + " milliseconds");

        // Iterative method
        startTime = System.currentTimeMillis();
        System.out.println(powIterasi(2, 3));
        System.out.println(powIterasi(3, 4));
        System.out.println(powIterasi(4, 5));
        System.out.println(powIterasi(2, 10));
        System.out.println(powIterasi(3, 5));
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Iterative method elapsed time: " + elapsedTime + " milliseconds");
    }

    // Recursive method
    public static int powRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * powRecursive(base, exponent - 1);
        }
    }

    // Iterative method
    public static int powIterasi(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
