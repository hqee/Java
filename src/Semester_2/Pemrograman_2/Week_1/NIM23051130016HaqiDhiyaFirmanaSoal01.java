package Semester_2.Pemrograman_2.Week_1;

import java.io.*;
import java.util.*;

public class NIM23051130016HaqiDhiyaFirmanaSoal01 {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(100) + 1;
            numbers.add(num);
        }

        PrintWriter out = new PrintWriter(new FileWriter("NIM230511300016HaqiDhiyaFirmanaHasilFileA.txt"));

        for (int i = 0; i < 1000; i++) {
            out.printf("%10d", numbers.get(i));
            if (i % 10 == 9) {
                out.println();
            }
        }
        out.close();
    }
}