package Semester_2.Struktur_Data.Week_9.linkedList;

import java.util.Scanner;

public class calenderApp_prak09_23051130016 {

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
                System.out.println(current.number + ". " + current.activity);
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
                    calendar.addActivity(activity);
                    break;
                case 2:
                    System.out.print("Masukkan nomor kegiatan yang akan dihapus: ");
                    int activityNumber = scanner.nextInt();
                    calendar.removeActivity(activityNumber);
                    break;
                case 3:
                    System.out.println("Daftar Kegiatan:");
                    calendar.displayActivities();
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
