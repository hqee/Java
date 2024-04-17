package learn_java.dasar_1;

import java.util.Scanner;

public class billCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the bill amount: $");
            int bill = input.nextInt();
            double tip = bill * 15 / 100;
            System.out.println("The tip is $"+tip);
        }
    }
}
