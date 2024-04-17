package Semester_2.Pemrograman_2.Week_1;

import java.io.*;
import java.util.*;

public class NIM23051130016HaqiDhiyaFirmanaSoal02 {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(100) + 1;
            numbers.add(num);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        PrintWriter out = new PrintWriter(new FileWriter("NIM23051130016HaqiDhiyaFirmanaHasilFileA.txt"));
        PrintWriter outOdd = new PrintWriter(new FileWriter("NIM23051130016HaqiDhiyaFirmanaHasilFileB.txt"));
        PrintWriter outEven = new PrintWriter(new FileWriter("NIM23051130016HaqiDhiyaFirmanaHasilFileC.txt"));

        for (int i = 0; i < 1000; i++) {
            out.printf("%5d", numbers.get(i));
            if (i % 10 == 9) {
                out.println();
            }

            if (i < oddNumbers.size()) {
                outOdd.printf("%5d", oddNumbers.get(i));
                if (i % 10 == 9) {
                    outOdd.println();
                }
            }

            if (i < evenNumbers.size()) {
                outEven.printf("%5d", evenNumbers.get(i));
                if (i % 10 == 9) {
                    outEven.println();
                }
            }
        }

        out.close();
        outOdd.close();
        outEven.close();
    }
}