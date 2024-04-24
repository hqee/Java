package Semester_2.Pemrograman_2.Week_11;

import java.util.*;
import java.io.*;

/*
 * Nama : Haqi Dhiya Firmana
 * NIM  : 23051130016
 * Kelas: J2    
 */

public class HaqiSkorNilaiNo5 {
    public static void main(String[] args) {
        // Create a queue to store the exam scores
        Queue<String> nilaiQueue = new LinkedList<>();

        try {
            // membaca file
            File inputFile = new File("nilai.txt");
            Scanner scanner = new Scanner(inputFile);

            // enqueue each line into the queue
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                nilaiQueue.add(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create a stack to store the exam scores
        Stack<String> nilaiStack = new Stack<>();

        // dequeue each element from the queue and push it into the stack
        while (!nilaiQueue.isEmpty()) {
            String score = nilaiQueue.remove();
            nilaiStack.push(score);
        }

        // Cetak hasilnya
        while (!nilaiStack.isEmpty()) {
            String score = nilaiStack.pop();
            System.out.println(score);
        }
    }
}

/*
 * Output
 * Uzumaki Boruto 64
 * Hatake Kakashi 100
 * Uchiha Sasuke 97
 * Naruto Uzumaki 74
 * Yura Yunita 50
 * Raihan Pangarep 57
 * Dedi Sulistio 78
 * Ahmad Yulianto 100
 * Cahya Pratiwi 77
 * Hadi Nugraha 79
 * Gita Puspita 64
 * Fitri Wulandari 75
 * Eka Wijaya 100
 * Dewi Kusuma 70
 * Budi Cahyadi 78
 * Adi Santoso 91
 */
