package Semester_2.Pemrograman_2.Week_11;

/*
 * Nama : Haqi Dhiya Firmana
 * NIM  : 23051130016
* Kelas: J2    
 */

import java.util.*;
import java.io.*;

public class HaqiSkorNilai {
    public static void main(String[] args) {
        // Create a stack to store the exam scores
        Stack<String> nilaiStack = new Stack<>();

        try {
            // membaca file
            File inputFile = new File("nilai.txt");
            Scanner scanner = new Scanner(inputFile);

            // push setiap line ke dalam stack
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                nilaiStack.push(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Simpan elemen-elemen stack ke dalam list
        List<String> scoresList = new ArrayList<>();
        while (!nilaiStack.isEmpty()) {
            scoresList.add(nilaiStack.pop());
        }

        // Urutkan list secara descending
        Collections.sort(scoresList, Collections.reverseOrder());

        // Cetak hasilnya
        for (String nilai : scoresList) {
            System.out.println(nilai);
        }
    }
}

/*
 * Output
 * Yura Yunita 50
 * Uzumaki Boruto 64
 * Uchiha Sasuke 97
 * Raihan Pangarep 57
 * Naruto Uzumaki 74
 * Hatake Kakashi 100
 * Hadi Nugraha 79
 * Gita Puspita 64
 * Fitri Wulandari 75
 * Eka Wijaya 100
 * Dewi Kusuma 70
 * Dedi Sulistio 78
 * Cahya Pratiwi 77
 * Budi Cahyadi 78
 * Ahmad Yulianto 100
 * Adi Santoso 91
 */
