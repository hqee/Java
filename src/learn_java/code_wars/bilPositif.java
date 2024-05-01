package learn_java.code_wars;

import java.util.Scanner;

public class bilPositif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Masukkan bilangan-bilangan: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int count = countPositiveNumbers(numbers);
        System.out.println("Jumlah bilangan positif dalam array: " + count);
    }

    public static int countPositiveNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }
}
