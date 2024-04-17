package learn_java.solo_learn;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt();
            int sum = 0;
            int i = 1;

            do {
                sum += i;
                i++;
            } while (i <= N);

            System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
        }
    }
}
