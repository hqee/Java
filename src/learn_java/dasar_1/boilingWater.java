package learn_java.dasar_1;

import java.util.Scanner;

public class boilingWater {
    public static void main(String[] args) {
        try (Scanner temperature = new Scanner(System.in)) {
            System.out.print("Enter the temperature: ");
            int temp = temperature.nextInt();
            System.out.print("Status: ");

            if (temp >= 100) {      
                System.out.println("Boiling");
            } else {
                System.out.println("Not boiling");
            }
        }
    }
}
