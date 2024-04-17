package Semester_2.Pemrograman_2.Week_9;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Recursive 
            *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
            **********
        
        Iterative 
            *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
            **********

        Recursive method elapsed time: 1 milliseconds
        Iterative method elapsed time: 3 milliseconds
 */

public class printStars {
    public static void main(String[] args) {
        long startTimeIter = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            printStarsIter(i);
        }

        long endTimeIter = System.currentTimeMillis();
        long executionTimeIter = endTimeIter - startTimeIter;

        long startTimeRecur = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            printStarsRecur(i);
        }
        long endTimeRecur = System.currentTimeMillis();
        long executionTimeRecur = endTimeRecur - startTimeRecur;

        System.out.println("Recursive method elapsed time: " + executionTimeRecur + " milliseconds");
        System.out.println("Iterative method elapsed time: " + executionTimeIter + " milliseconds");
    }

    // Iterasi version
    public static void printStarsIter(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // end the line of output
    }

    // Recursive version
    public static void printStarsRecur(int n) {
        if (n == 0) {
            // base case; just end the line of output
            System.out.println();
        } else {
            // recursive case; print one more star
            System.out.print("*");
            printStarsRecur(n - 1);
        }
    }
}
