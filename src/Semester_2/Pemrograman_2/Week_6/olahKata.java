package Semester_2.Pemrograman_2.Week_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class olahKata {
    public static void main(String[] args) {
        ArrayList<String> dataKata = readTextFile("chapter10data.txt");

        System.out.println("Pekerjaan Pertama:");
        System.out.println(dataKata);

        System.out.println("\nPekerjaan Kedua:");
        ArrayList<String> resultPluralsAndCaps = displayPluralsAndCaps(dataKata);
        System.out.println(resultPluralsAndCaps);

        System.out.println("\nPekerjaan Ketiga:");
        ArrayList<String> resultReversed = displayReversed(dataKata);
        System.out.println(resultReversed);

        System.out.println("\nPekerjaan Keempat:");
        ArrayList<String> resultPluralsRemoved = displayPluralsRemoved(dataKata);
        System.out.println(resultPluralsRemoved);
    }

    public static ArrayList<String> readTextFile(String fileName) {
        ArrayList<String> dataKata = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    dataKata.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataKata;
    }

    public static ArrayList<String> displayPluralsAndCaps(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.endsWith("s") && !word.equals(word.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }

    public static ArrayList<String> displayReversed(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.add(words.get(i));
        }
        return result;
    }

    public static ArrayList<String> displayPluralsRemoved(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (!word.endsWith("s")) {
                result.add(word);
            }
        }
        return result;
    }
}

