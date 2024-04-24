package Semester_2.Pemrograman_2.Week_11;

/*
 * Nama : Haqi Dhiya Firmana
 * NIM  : 23051130016
* Kelas: J2    
 */

import java.util.*;
import java.io.*;

public class HaqiSkorNilaiTambahan {
    public static void main(String[] args) {
        // 1. Membaca skor ujian ke dalam antrian
        Queue<String> nilaiQueue = nilaiToQueue("nilai.txt");

        // 2. Menyaring ujian yang memiliki skor 100
        Queue<String> filteredScoresQueue = nilaiFilter(nilaiQueue);

        // 3. Melakukan proses sebelumnya untuk mencetak siswa yang tersisa
        lihatNilaiFilter(filteredScoresQueue);
    }

    private static Queue<String> nilaiToQueue(String filename) {
        Queue<String> examScoresQueue = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                examScoresQueue.offer(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return examScoresQueue;
    }

    // Menyaring ujian yang memiliki skor 100
    private static Queue<String> nilaiFilter(Queue<String> queue) {
        Queue<String> filteredQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            String score = queue.poll();
            String[] parts = score.split("\\s+");
            int examScore = Integer.parseInt(parts[2]);
            if (examScore != 100) {
                filteredQueue.offer(score);
            }
        }
        return filteredQueue;
    }

    private static void lihatNilaiFilter(Queue<String> queue) {
        Stack<String> reversedStack = new Stack<>();
        while (!queue.isEmpty()) {
            reversedStack.push(queue.poll());
        }
        System.out.println("Menampilkan Daftar nama setelah di filter:");
        while (!reversedStack.isEmpty()) {
            System.out.println(reversedStack.pop());
        }
    }
}

/*
 * Output
 * Menampilkan Daftar nama setelah di filter:
 * Uzumaki Boruto 64
 * Uchiha Sasuke 97
 * Naruto Uzumaki 74
 * Yura Yunita 50
 * Raihan Pangarep 57
 * Dedi Sulistio 78
 * Cahya Pratiwi 77
 * Hadi Nugraha 79
 * Gita Puspita 64
 * Fitri Wulandari 75
 * Dewi Kusuma 70
 * Budi Cahyadi 78
 * Adi Santoso 91
 */