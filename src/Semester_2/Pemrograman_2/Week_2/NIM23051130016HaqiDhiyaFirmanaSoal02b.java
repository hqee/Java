package Semester_2.Pemrograman_2.Week_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NIM23051130016HaqiDhiyaFirmanaSoal02b {

    public static void main(String[] args) throws FileNotFoundException {
        // Deklarasi array untuk menyimpan data dari file
        int[] data1 = new int[100];
        int[] data2 = new int[100];
        int[] data3 = new int[100];

        // Membaca data dari file ke array
        bacaDataFile("NIM23051130016HaqiDhiyaFirmanaHasilFileA.txt", data1);
        bacaDataFile("NIM23051130016HaqiDhiyaFirmanaHasilFileB.txt", data2);
        bacaDataFile("NIM23051130016HaqiDhiyaFirmanaHasilFileC.txt", data3);

        // Menghitung rata-rata, nilai terbesar, dan nilai terkecil dari setiap file
        for (int i = 1; i <= 3; i++) {
            int[] data = null;
            String namaFile = null;
            switch (i) {
                case 1:
                    data = data1;
                    namaFile = "data1.txt";
                    break;
                case 2:
                    data = data2;
                    namaFile = "data2.txt";
                    break;
                case 3:
                    data = data3;
                    namaFile = "data3.txt";
                    break;
            }

            int rataRata = hitungRataRata(data);
            int nilaiTerbesar = hitungNilaiTerbesar(data);
            int nilaiTerkecil = hitungNilaiTerkecil(data);

            // Menampilkan hasil ke console
            System.out.println("File " + namaFile + ":");
            System.out.println("Rata-rata: " + rataRata);
            System.out.println("Nilai terbesar: " + nilaiTerbesar);
            System.out.println("Nilai terkecil: " + nilaiTerkecil);
            System.out.println();
        }
    }

    private static void bacaDataFile(String namaFile, int[] data) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(namaFile));
        int i = 0;
        while (scanner.hasNext()) {
            data[i++] = scanner.nextInt();
        }
        scanner.close();
    }

    private static int hitungRataRata(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total / data.length;
    }

    private static int hitungNilaiTerbesar(int[] data) {
        int nilaiTerbesar = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > nilaiTerbesar) {
                nilaiTerbesar = data[i];
            }
        }
        return nilaiTerbesar;
    }

    private static int hitungNilaiTerkecil(int[] data) {
        int nilaiTerkecil = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < nilaiTerkecil) {
                nilaiTerkecil = data[i];
            }
        }
        return nilaiTerkecil;
    }
}
