package learn_java.code_wars;

import java.util.Scanner;

public class hafidzGuntur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();

        if (A / B == C / D) {
            System.out.println("sama");
        } else if (A / B > C / D) {
            System.out.println("lebih besar");
        } else {
            System.out.println("lebih kecil");
        }

    }
}
