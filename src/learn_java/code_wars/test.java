package learn_java.code_wars;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter the elements of the array (enter -1 to stop):");
        int input = scanner.nextInt();
        while (input != -1) {
            array.add(input);
            input = scanner.nextInt();
        }

        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }

        System.out.println("The count of positive numbers in the array is: " + count);
    }
}
