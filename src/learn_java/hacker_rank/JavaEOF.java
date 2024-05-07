package learn_java.hacker_rank;

import java.util.*;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext(); i++) {
            System.out.println(i + " " + scanner.nextLine());
        }
        // // Memeriksa apakah ada token berikutnya
        // if (scanner.hasNext()) {
        // // Jika ada, baca token berikutnya dan cetak
        // String token = scanner.nextLine();
        // System.out.println("Token berikutnya: " + token);
        // } else {
        // // Jika tidak, cetak pesan
        // System.out.println("Tidak ada token berikutnya.");
        // }

        // // Menutup Scanner setelah selesai digunakan
        // scanner.close();
    }
}
