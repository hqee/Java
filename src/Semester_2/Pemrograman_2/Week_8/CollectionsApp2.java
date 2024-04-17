package Semester_2.Pemrograman_2.Week_8;

import java.util.*;

public class CollectionsApp2 {
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

        // Tallying angka yang muncul menggunakan Map
        Map<Integer, Integer> tallyMap = new HashMap<>();
        for (int number : numbers) {
            tallyMap.put(number, tallyMap.getOrDefault(number, 0) + 1);
        }

        // Urutkan Map berdasarkan nilai (jumlah kemunculan) secara descending
        List<Map.Entry<Integer, Integer>> tallyList = new ArrayList<>(tallyMap.entrySet());
        tallyList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Tampilkan hasil tallying
        System.out.println("Angka yang paling sering muncul sampai yang paling jarang muncul:");
        for (Map.Entry<Integer, Integer> entry : tallyList) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " kali || ");
        }
        System.out.println();
        /*Output :
            Angka yang paling sering muncul sampai yang paling jarang muncul:
            512: 2 kali || 401: 2 kali || 22: 2 kali || 190: 2 kali || 977: 2 kali || 736: 2 kali || 256: 1 kali || 259: 1 kali || 644: 1 kali || 261: 1 kali || 391: 1 kali || 264: 1 kali || 265: 1 kali || 393: 1 kali || 267: 1 kali || 780: 1 kali || 272: 1 kali || 18: 1 kali || 914: 1 kali || 20: 1 kali || 917: 1 kali || 279: 1 kali || 409: 1 kali || 27: 1 kali || 413: 1 kali || 30: 1 kali || 159: 1 kali || 672: 1 kali || 546: 1 kali || 803: 1 kali || 292: 1 kali || 37: 1 kali || 293: 1 kali || 677: 1 kali || 805: 1 kali || 678: 1 kali || 552: 1 kali || 936: 1 kali || 553: 1 kali || 814: 1 kali || 693: 1 kali || 311: 1 kali || 445: 1 kali || 62: 1 kali || 575: 1 kali || 449: 1 kali || 584: 1 kali || 841: 1 kali || 969: 1 kali || 203: 1 kali || 460: 1 kali || 461: 1 kali || 78: 1 kali || 334: 1 kali || 718: 1 kali || 207: 1 kali || 592: 1 kali || 337: 1 kali || 849: 1 kali || 210: 1 kali || 83: 1 kali || 213: 1 kali || 726: 1 kali || 472: 1 kali || 729: 1 kali || 474: 1 kali || 858: 1 kali || 93: 1 kali || 222: 1 kali || 224: 1 kali || 353: 1 kali || 99: 1 kali || 485: 1 kali || 613: 1 kali || 741: 1 kali || 869: 1 kali || 487: 1 kali || 999: 1 kali || 233: 1 kali || 745: 1 kali || 873: 1 kali || 234: 1 kali || 618: 1 kali || 493: 1 kali || 112: 1 kali || 882: 1 kali || 115: 1 kali || 246: 1 kali || 759: 1 kali || 376: 1 kali || 888: 1 kali || 250: 1 kali || 123: 1 kali || 251: 1 kali ||
         */ 

        //menghapus angka - angka yang kurang dari 500 dari set
        Iterator<Integer> setIterator = numberSet.iterator();
        while (setIterator.hasNext()) {
            int number = setIterator.next();
            if (number < 500) {
                setIterator.remove();
            }
        }
        System.out.println("\nSet setelah menghapus angka - angka kurang dari 500: \n" + numberSet);
        /* Output 
            Set setelah menghapus angka - angka kurang dari 500:
            [512, 780, 546, 803, 805, 552, 553, 814, 575, 584, 841, 592, 849, 858, 613, 869, 873, 618, 882, 888, 644, 914, 917, 672, 677, 678, 936, 693, 969, 718, 977, 726, 729, 736, 741, 999, 745, 759] 
         */

        // membuat map
        Map<Integer, String> numberMap = new HashMap<>();
        for (int number : numbers) {
            numberMap.put(number, "Value");
        }

        // Menghapus angka-angka yang kurang dari 500 dari Map
        Set<Integer> keySet = numberMap.keySet();
        Iterator<Integer> mapIterator = keySet.iterator();
        while (mapIterator.hasNext()) {
            int key = mapIterator.next();
            if (key < 500) {
                mapIterator.remove();
            }
        }

        // menampilkan angka - angka yang tersisa dalam map
        System.out.println();
        System.out.print("Map setelah menghapus angka-angka kurang dari 500: ");
        for (int key : keySet) {
            System.out.print(key + ": " + numberMap.get(key) + " || ");
        }
        System.out.println();
        /* Output
            Map setelah menghapus angka-angka kurang dari 500: 513: Value || 516: Value || 774: Value || 905: Value || 786: Value || 534: Value || 537: Value || 793: Value || 794: Value || 928: Value || 675: Value || 806: Value || 563: Value || 569: Value || 961: Value || 834: Value || 966: Value || 585: Value || 586: Value || 970: Value || 843: Value || 849: Value || 980: Value || 730: Value || 731: Value || 988: Value || 606: Value || 863: Value || 608: Value || 992: Value || 739: Value || 742: Value || 999: Value || 747: Value || 625: Value || 888: Value || 765: Value || 638: Value ||                 
            */
    }    
    
}
