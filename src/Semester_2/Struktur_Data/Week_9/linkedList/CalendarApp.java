package Semester_2.Struktur_Data.Week_9.linkedList;

/*
 * Nama          : Haqi Dhiya Firmana
 * NIM           : 23051130016
 * Kelas Praktek : J2 
 */

import java.util.Scanner;

public class CalendarApp {

    // Kelas Node
    class Node {
        int number;
        String activity;
        Node prev;
        Node next;

        public Node(int number, String activity) {
            this.number = number;
            this.activity = activity;
            this.prev = null;
            this.next = null;
        }
    }

    // Kelas DoubleCircularLinkedList
    class DoubleCircularLinkedList {
        private Node head;
        private int activityCount;

        public DoubleCircularLinkedList() {
            this.head = null;
            this.activityCount = 0;
        }

        // Tambahkan kegiatan baru dengan nomor otomatis
        public void addActivity(String activity) {
            activityCount++;
            Node newNode = new Node(activityCount, activity);
            if (head == null) {
                head = newNode;
                head.next = head;
                head.prev = head;
            } else {
                Node tail = head.prev;
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                head.prev = newNode;
            }
        }

        // Hapus kegiatan berdasarkan nomor kegiatan
        public void removeActivity(int number) {
            if (head == null)
                return;

            Node current = head;
            do {
                if (current.number == number) {
                    if (current == head && head.next == head) {
                        head = null;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                        if (current == head) {
                            head = current.next;
                        }
                    }
                    return;
                }
                current = current.next;
            } while (current != head);
        }

        // Tampilkan semua kegiatan
        public void displayActivities() {
            if (head == null) {
                System.out.println("Tidak ada kegiatan.");
                return;
            }

            Node current = head;
            do {
                System.out.println("Kegiatan ke-" + current.number + " " + current.activity);
                current = current.next;
            } while (current != head);
        }
    }

    public static void main(String[] args) {
        CalendarApp app = new CalendarApp();
        DoubleCircularLinkedList calendar = app.new DoubleCircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==============================");
            System.out.println("Menu Kalender Kegiatan Harian:");
            System.out.println("1. Tambah Kegiatan");
            System.out.println("2. Hapus Kegiatan");
            System.out.println("3. Tampilkan Semua Kegiatan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Menerima newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kegiatan: ");
                    String activity = scanner.nextLine();
                    activity = activity.substring(0, 1).toUpperCase() + activity.substring(1);
                    calendar.addActivity(activity);
                    System.out.println("Kegiatan berhasil ditambahkan.");
                    System.out.println("==============================\n");
                    break;
                case 2:
                    System.out.print("Masukkan nomor kegiatan yang akan dihapus: ");
                    int activityNumber = scanner.nextInt();
                    calendar.removeActivity(activityNumber);
                    System.out.println("Kegiatan berhasil dihapus.");
                    System.out.println("==============================\n");
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("Daftar Kegiatan:");
                    calendar.displayActivities();
                    System.out.println("==============================\n");
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

/*
 * Output :
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 1
 * Masukkan nama kegiatan: Belajar
 * Kegiatan berhasil ditambahkan.
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 1
 * Masukkan nama kegiatan: Olahraga
 * Kegiatan berhasil ditambahkan.
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 1
 * Masukkan nama kegiatan: membaca buku
 * Kegiatan berhasil ditambahkan.
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 3
 * ==============================
 * Daftar Kegiatan:
 * Kegiatan ke-1 Belajar
 * Kegiatan ke-2 Olahraga
 * Kegiatan ke-3 Membaca buku
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 2
 * Masukkan nomor kegiatan yang akan dihapus: 3
 * Kegiatan berhasil dihapus.
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 3
 * ==============================
 * Daftar Kegiatan:
 * Kegiatan ke-1 Belajar
 * Kegiatan ke-2 Olahraga
 * ==============================
 * 
 * ==============================
 * Menu Kalender Kegiatan Harian:
 * 1. Tambah Kegiatan
 * 2. Hapus Kegiatan
 * 3. Tampilkan Semua Kegiatan
 * 4. Keluar
 * Pilih opsi: 4
 * Keluar dari aplikasi.
 */