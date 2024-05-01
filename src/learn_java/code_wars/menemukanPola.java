package learn_java.code_wars;

import java.util.Scanner;

public class menemukanPola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < k; i++) {
            String pattern = scanner.nextLine();
            if (n.contains(pattern)) {
                System.out.println("Ya");
            } else {
                System.out.println("Tidak");
            }
        }
    }
}
