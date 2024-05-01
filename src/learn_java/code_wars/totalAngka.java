package learn_java.code_wars;

import java.util.Scanner;

public class totalAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int total = (n * n) * m;
        System.out.println(total);
    }
}
