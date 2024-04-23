package Semester_2.Pemrograman_2.Week_10;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Recursive
            111
            1100
            101010
            111000
            1001000111
        
        Iterasi 
            111
            1100
            101010
            111000
            1001000111

        Recursive Time: 2ms
        Iterative Time: 0ms
 */

public class printBinary {
    public static void main(String[] args) {
        long startTime, endTime, recursiveTime, iterativeTime;

        // Recursive method
        startTime = System.currentTimeMillis();
        printBinaryRecursive(7);
        System.out.println();
        printBinaryRecursive(12);
        System.out.println();
        printBinaryRecursive(42);
        System.out.println();
        printBinaryRecursive(56);
        System.out.println();
        printBinaryRecursive(72);
        endTime = System.currentTimeMillis();
        recursiveTime = endTime - startTime;

        // Iterative method
        startTime = System.currentTimeMillis();
        printBinaryIterative(7);
        System.out.println();
        printBinaryIterative(12);
        System.out.println();
        printBinaryIterative(42);
        System.out.println();
        printBinaryIterative(56);
        System.out.println();
        printBinaryIterative(72);
        endTime = System.currentTimeMillis();
        iterativeTime = endTime - startTime;

        System.out.println("Recursive Time: " + recursiveTime + "ms");
        System.out.println("Iterative Time: " + iterativeTime + "ms");
    }

    // Recursive method
    public static void printBinaryRecursive(int n) {
        if (n < 0) {
            // recursive case for negative numbers
            System.out.print("-");
            printBinaryRecursive(-n);
        } else if (n < 2) {
            // base case; same as base 10
            System.out.print(n);
        } else {
            // recursive case; break number apart
            printBinaryRecursive(n / 2);
            printBinaryRecursive(n % 2);
        }
    }

    // Iterative method
    public static void printBinaryIterative(int n) {
        if (n < 0) {
            System.out.print("-");
            n = -n;
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        System.out.print(binary);
    }

    public class printBinary_iterative {

        public static void main(String[] args) {
            printBinaryIterative(7);
            System.out.println();
            printBinaryIterative(12);
            System.out.println();
            printBinaryIterative(42);
            System.out.println();
        }

        public static void printBinaryIterative(int n) {
            if (n == 0) {
                System.out.print("0");
                return;
            }

            StringBuilder binary = new StringBuilder();
            while (n > 0) {
                binary.append(n % 2);
                n /= 2;
            }

            System.out.print(binary.reverse().toString());
        }
    }

}
