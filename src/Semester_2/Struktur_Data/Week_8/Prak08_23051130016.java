package Semester_2.Struktur_Data.Week_8;

/*
 * Nama : Haqi Dhiya' Firmana
 * NIM  : 23051130016
 * Kelas: J2
 * 
 * Output :
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 1
        Masukkan nama pemilik: Haqi
        Masukkan jenis kendaraan (R2 untuk motor, R4 untuk mobil): R2
        Masukkan nomor polisi: 123
        Masukkan merk kendaraan: Toyota
        Masukkan warna kendaraan: Hitam
        Data berhasil ditambahkan!
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 1
        Masukkan nama pemilik: Virna
        Masukkan jenis kendaraan (R2 untuk motor, R4 untuk mobil): R4
        Masukkan nomor polisi: 234
        Masukkan merk kendaraan: Honda
        Masukkan warna kendaraan: Kuning
        Data berhasil ditambahkan!
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 1
        Masukkan nama pemilik: Ghibran
        Masukkan jenis kendaraan (R2 untuk motor, R4 untuk mobil): R2
        Masukkan nomor polisi: 345
        Masukkan merk kendaraan: Kawasaki
        Masukkan warna kendaraan: Merah
        Data berhasil ditambahkan!
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 1
        Masukkan nama pemilik: Lutfi
        Masukkan jenis kendaraan (R2 untuk motor, R4 untuk mobil): R4
        Masukkan nomor polisi: 456
        Masukkan merk kendaraan: Innova
        Masukkan warna kendaraan: Biru
        Data berhasil ditambahkan!
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 3
        Jumlah kendaraan roda 2: 2
        Jumlah kendaraan roda 4: 2
        Menu:
        1. Tambah Data Pemilik Kendaraan
        2. Tampilkan Data Pemilik Kendaraan
        3. Tampilkan Jumlah Kendaraan
        4. Keluar
        Masukkan pilihan Anda: 4
        Terima kasih!
 */

import java.util.Scanner;

class Node {
    String pemilik;
    String jenis;
    String nomorPolisi;
    String merk;
    String warna;
    Node next;

    public Node(String pemilik, String jenis, String nomorPolisi, String merk, String warna) {
        this.pemilik = pemilik;
        this.jenis = jenis;
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.warna = warna;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void tambahData(String pemilik, String jenis, String nomorPolisi, String merk, String warna) {
        Node newNode = new Node(pemilik, jenis, nomorPolisi, merk, warna);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void tampilkanData() {
        Node current = head;
        while (current != null) {
            System.out.println("Nama Pemilik: " + current.pemilik);
            System.out.println("Jenis Kendaraan: " + current.jenis);
            System.out.println("Nomor Polisi: " + current.nomorPolisi);
            System.out.println("Merk: " + current.merk);
            System.out.println("Warna: " + current.warna);
            System.out.println("--------------------");
            current = current.next;
        }
    }

    // method untuk menghitung jumlah kendaraan berdasarkan jenisnya, yaitu R2 /
    // roda 2, dan R4 / roda 4
    public void hitungKendaraan() {
        int roda2 = 0;
        int roda4 = 0;
        Node current = head;
        while (current != null) {
            if ("R2".equals(current.jenis)) {
                roda2++;
            } else if ("R4".equals(current.jenis)) {
                roda4++;
            }
            current = current.next;
        }
        System.out.println("Jumlah kendaraan roda 2: " + roda2);
        System.out.println("Jumlah kendaraan roda 4: " + roda4);
    }
}

public class Prak08_23051130016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Pemilik Kendaraan");
            System.out.println("2. Tampilkan Data Pemilik Kendaraan");
            System.out.println("3. Tampilkan Jumlah Kendaraan");
            System.out.println("4. Keluar"); // new menu option
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membuang newline character setelah input angka

            if (pilihan == 1) {
                System.out.print("Masukkan nama pemilik: ");
                String pemilik = input.nextLine().toUpperCase();

                System.out.print("Masukkan jenis kendaraan (R2 untuk motor, R4 untuk mobil): ");
                String jenis = input.nextLine().toUpperCase();

                System.out.print("Masukkan nomor polisi: ");
                String nomorPolisi = input.nextLine().toUpperCase();

                System.out.print("Masukkan merk kendaraan: ");
                String merk = input.nextLine().toUpperCase();

                System.out.print("Masukkan warna kendaraan: ");
                String warna = input.nextLine().toUpperCase();

                linkedList.tambahData(pemilik, jenis, nomorPolisi, merk, warna);
                System.out.println("Data berhasil ditambahkan!");
            } else if (pilihan == 2) {
                if (linkedList.head == null) {
                    System.out.println("Tidak ada data pemilik kendaraan.");
                } else {
                    System.out.println("Data Pemilik Kendaraan:");
                    linkedList.tampilkanData();
                }
            } else if (pilihan == 3) {
                linkedList.hitungKendaraan();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
        input.close();
    }
}
