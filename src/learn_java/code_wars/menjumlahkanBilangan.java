package learn_java.code_wars;

import java.util.*;

public class menjumlahkanBilangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }
        Collections.sort(numbers);

        int total = 0;
        for (int i = 1; i < numbers.size(); i += 2) {
            total += numbers.get(i);
        }

        System.out.println(total);

    }
}

// 1, 11, 12, 23, 42, 78
