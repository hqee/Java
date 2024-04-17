package Semester_2.Struktur_Data.Week_5;

import java.util.Scanner;

class Penumpang {
    private String nama;
    private String tujuan;
    private int biaya;

    public Penumpang(String nama, String tujuan, int biaya) {
        this.nama = nama;
        this.tujuan = tujuan;
        this.biaya = biaya;
    }
    
    public String getNama() {
        return this.nama;
    }

    public String getTujuan()   {
        return this.tujuan;
    }

    public int getBiaya() {
        return this.biaya;
    }
}

class CircularQueue {
    private int max;
    private Penumpang[] antrian;
    private int kepala;
    private int ekor;
    private int nItems;

    public CircularQueue(int size) {
        max = size;
        antrian = new Penumpang[max];
        kepala = 0;
        ekor = -1;
        nItems = 0;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == max);
    }

    public void enqueue(Penumpang penumpang) {
        if (!isFull()) {
            if (ekor == max - 1) {
                ekor = -1;
            }
            antrian[++ekor] = penumpang;
            nItems++;
            System.out.println("=============================");
            System.out.println("Penumpang atas nama " + penumpang.getNama() + " berhasil ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh. Penumpang tidak dapat ditambahkan. Mohon tunggu sebentar.");
        }
    }

    public Penumpang dequeue() {
        if (!isEmpty()) {
            Penumpang removedPassenger = antrian[kepala++];
            if (kepala == max) {
                kepala = 0;
            }
            nItems--;
            System.out.println("=============================");
            System.out.println("Panggilan atas nama: " + removedPassenger.getNama());
            System.out.println("Tujuan : " + removedPassenger.getTujuan());
            System.out.println("Biaya : Rp " + removedPassenger.getBiaya() + ".000,00");
            System.out.println("=============================");
            return removedPassenger;
        } else {
            System.out.println("\nAntrian kosong. Tidak ada penumpang yang dapat dipanggil.");
            return null;
        }
    }

    public void displayQueue() {
        if (!isEmpty()) {
            System.out.println("Antrian Penumpang :");
            int current = kepala;
            for (int i = 0; i < nItems; i++) {
                System.out.println("=============================");
                System.out.println("Nomor Antrian: " + (i + 1));
                System.out.println("Nama: " + antrian[current].getNama());
                System.out.println("Tujuan: " + antrian[current].getTujuan());
                System.out.println("Biaya: Rp " + antrian[current].getBiaya() + ".000,00");
                System.out.println("=============================\n");
                current = (current + 1) % max;
            }
        } else {
            System.out.println("\nAntrian kosong. Tidak ada penumpang yang dapat dipanggil.");
        }
    }
}

public class javaCircularQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularQueue queue = new CircularQueue(5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Pendaftaran Penumpang");
            System.out.println("2. Pemanggilan Penumpang");
            System.out.println("3. Lihat antrian penumpan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan anda : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\n=== Pendaftaran Penumpang ===");
                    System.out.print("Nama Penumpang : ");
                    String name = scanner.nextLine();
                    System.out.print("Tujuan (Jakarta/Bandung/Surabaya): ");
                    String destination = scanner.nextLine();
                    int cost = 0;
                    switch (destination.toLowerCase()) {
                        case "jakarta":
                            cost = 210;
                            break;
                        case "bandung":
                            cost = 185;
                            break;
                        case "surabaya":
                            cost = 197;
                            break;
                        default:
                            System.out.println("Input salah, silakan coba lagi.");
                            continue;
                    }
                    Penumpang passenger = new Penumpang(name, destination, cost);
                    queue.enqueue(passenger);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("\nTerima kasih, Semoga perjalanan anda menyenangkan!!\n");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Input salah, silahkan coba lagi.");
            }
        }
    }
}