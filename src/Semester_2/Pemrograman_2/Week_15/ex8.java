package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ex8 {
    public static long fourLetterWords(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                .filter(line -> line.length() == 4)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        try {
            String fileName = "src/Semester_2/Pemrograman_2/Week_15/file.txt";
            long fourLetterWordsCount = fourLetterWords(fileName);
            System.out.println(fourLetterWordsCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Output
 * 5
 */
