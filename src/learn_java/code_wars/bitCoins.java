package learn_java.code_wars;

import java.util.*;

public class bitCoins {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] n = new int[size];

        for (int i = 0; i < size; i++) {
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int v = n[j] - n[i];

                list.add(new ArrayList<Integer>(Arrays.asList(v, i + 1, j + 1)));
            }
        }

        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                return a.get(0) - b.get(0);
            }
        });

        Collections.reverse(list);

        // list = new ArrayList<ArrayList<Integer>>(list.stream().filter(e -> e.get(0) >
        // 0).toList());

        // use java 11 syntax to filter element that the first nested element is less
        // than 0
        list.removeIf(e -> e.get(0) < 0);

        int sum = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(1) > max) {
                sum += list.get(i).get(0);
                max = list.get(i).get(2);
            }
        }

        // print sum
        System.out.println(sum);
    }
}
