package Semester_2.Pemrograman_2.Week_8;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        //generate angka dari 1 - 1000 sebanyak 100 angka
        for (int i = 1; i <= 100; i++) {
            int randomNumber = (int) (Math.random() * 1000) + 1;
            numbers.add(randomNumber); // menyimpan angka ke dalam list
        }

        // mengurutkan angka dari kecil ke besar
        Collections.sort(numbers);
        
        // menammpilkan angka dalam konsol
        System.out.print("Random Numbers setelah diurutkan : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }   
        System.out.println();
        
        /*Output :
            Random Numbers setelah diurutkan : 14 22 23 30 46 50 61 74 96 103 115 119 128 128 128 144 154 161 177 196 206 218 224 267 269 278 289 296 338 340 346 355 362 363 366 369 374 377 425 454 458 468 470 476 477 481 511 511 531 553 554 562 577 592 612 617 617 642 651 652 659 669 673 678 687 688 701 716 719 729 732 740 743 759 764 765 765 768 799 806 813 832 842 842 853 859 860 863 889 889 928 930 938 950 950 954 961 981 984 992
         */

        // Membuat set dari list numbers
        Set<Integer> numberSet = new HashSet<>(numbers);

        // Memindahkan dan menampilkan data dari List ke Set
        System.out.print("\nNumbers setelah dipindahkan ke Set : ");

        for (int number : numbers) {
            numberSet.add(number);
            System.out.print(number + " ");
        }
        /*Output :
            Numbers setelah dipindahkan ke Set : 14 22 23 30 46 50 61 74 96 103 115 119 128 128 128 144 154 161 177 196 206 218 224 267 269 278 289 296 338 340 346 355 362 363 366 369 374 377 425 454 458 468 470 476 477 481 511 511 531 553 554 562 577 592 612 617 617 642 651 652 659 669 673 678 687 688 701 716 719 729 732 740 743 759 764 765 765 768 799 806 813 832 842 842 853 859 860 863 889 889 928 930 938 950 950 954 961 981 984 992
         */

        // Menampilkan jumlah angka dalam set
        System.out.println("\nAda " + numberSet.size() + " jenis angka dalam set");
        System.out.println();
        /*Output :
            Ada 92 jenis angka dalam set
         */ 
    }
}
