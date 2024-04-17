package Semester_2.Pemrograman_2.Week_2;

import java.io.*;
import java.util.*;

public class NIM23051130016HaqiDhiyaFirmanaSoal02c {
    public static void main(String[] args) throws FileNotFoundException {
        // Menghitung frekuensi kemunculan angka dari 1 hingga 100 untuk masing-masing file
        int[] frequenciesFile1 = countFrequencies("NIM23051130016HaqiDhiyaFirmanaHasilFileA.txt");
        int[] frequenciesFile2 = countFrequencies("NIM23051130016HaqiDhiyaFirmanaHasilFileB.txt");
        int[] frequenciesFile3 = countFrequencies("NIM23051130016HaqiDhiyaFirmanaHasilFileC.txt");

        // Menuliskan frekuensi kemunculan angka ke dalam file
        writeFrequenciesToFile("NIM23051130016HaqiDhiyaFirmanaHasilTugas2c1.txt", frequenciesFile1);
        writeFrequenciesToFile("NIM23051130016HaqiDhiyaFirmanaHasilTugas2c2.txt", frequenciesFile2);
        writeFrequenciesToFile("NIM23051130016HaqiDhiyaFirmanaHasilTugas2c3.txt", frequenciesFile3);

        System.out.println("Frekuensi kemunculan angka telah dituliskan ke dalam file.");
    }

    // Method untuk menghitung frekuensi kemunculan angka dari 1 hingga 100 di dalam file
    public static int[] countFrequencies(String filename) throws FileNotFoundException {
        int[] frequencies = new int[101]; // array dengan kapasitas 101 untuk mencatat kemunculan angka dari 1 hingga 100
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number >= 1 && number <= 100) { // Pastikan angka berada dalam rentang yang valid
                frequencies[number]++; // Menginkremen counter untuk angka yang muncul
            }
        }
        scanner.close();
        return frequencies;
    }

    // Method untuk menuliskan frekuensi kemunculan angka ke dalam file
    public static void writeFrequenciesToFile(String filename, int[] frequencies) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File(filename));
        for (int i = 1; i < frequencies.length; i++) {
            output.println(" Angka " + " Muncul "); 
            output.println("   " + i + "    " + frequencies[i]);
        }
        output.close();
    }
}
