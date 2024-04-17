package Semester_2.Struktur_Data.Week_6;

import java.util.Scanner;

class Mahasiswa {
    private String nimMhs;
    private String namaMhs;
    private double ipkMhs;

    public Mahasiswa(String nim, String nama, double ipk) {
        nimMhs = nim;
        namaMhs = nama;
        ipkMhs = ipk;
    }

    public void lihatData() {
        System.out.println(nimMhs + " --> " + namaMhs + " --> " + ipkMhs);
    }

    public String getNim() {
        return nimMhs;
    }

    public String getNama() {
        return namaMhs;
    }

    public double getIpk() {
        return ipkMhs;
    }

    public void setNim(String nim) {
        nimMhs = nim;
    }

    public void setNama(String nama) {
        namaMhs = nama;
    }

    public void setIpk(double ipk) {
        ipkMhs = ipk;
    }
}

class ArrayMahasiswa {
    private Mahasiswa[] dt;
    private int jml_data;
    private int i;

    public ArrayMahasiswa(int max) {
        dt = new Mahasiswa[max];
        jml_data = 0;
    }

    public void input(String nim, String nama, double ipk) {
        dt[jml_data] = new Mahasiswa(nim, nama, ipk);
        jml_data++;
        System.out.println("==============================");
        System.out.println("Tambah data BERHASIL");
    }

    // Method untuk mengurutkan data dengan metode bubble sort
    public void bubbleSort(boolean sortByNim, boolean ascending) {
        int n = jml_data;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortByNim) {
                    if (ascending && dt[j].getNim().compareTo(dt[j + 1].getNim()) > 0 ||
                            !ascending && dt[j].getNim().compareTo(dt[j + 1].getNim()) < 0) {
                        swap(j, j + 1);
                    }
                } else {
                    if (dt[j].getIpk() > dt[j + 1].getIpk()) {
                        swap(j, j + 1);
                    }
                }
            }
        }
    }

    // Method untuk melakukan pertukaran tempat sesuai dengan urutan
    private void swap(int i, int j) {
        Mahasiswa temp = dt[i];
        dt[i] = dt[j];
        dt[j] = temp;
    }

    public void dataArai() {
        bubbleSort(true, true);
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("NIM          Nama            IPK");
        System.out.println("--------------------------------");
        for (i = 0; i < jml_data; i++)
            dt[i].lihatData();
        System.out.println("--------------------------------");
        System.out.println("");
    }

    public int[] cari(String cr) {
        int[] matchingIndices = new int[jml_data];
        int count = 0;
        for (i = 0; i < jml_data; i++) {
            if (dt[i].getNama().toLowerCase().contains(cr.toLowerCase()) || dt[i].getNim().toLowerCase().contains(cr.toLowerCase())) {
                matchingIndices[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(matchingIndices, 0, result, 0, count);
        return result;
    }
    

    public Mahasiswa getDataByIndex(int index) {
        return dt[index];
    }

    public boolean hapus(String nama) {
        boolean deleted = false;
        for (i = 0; i < jml_data; i++) {
            if (dt[i].getNama().equalsIgnoreCase(nama)) {
                for (int j = i; j < jml_data - 1; j++) {
                    dt[j] = dt[j + 1];
                }
                jml_data--;
                deleted = true;
                break;
            }
        }
        return deleted;
    }

    public boolean ubahData(String nim, String newNim, String newNama, double newIpk) {
        boolean updated = false;
        for (i = 0; i < jml_data; i++) {
            if (dt[i].getNim().equalsIgnoreCase(nim)) {
                if (!dt[i].getNim().equals(newNim) || !dt[i].getNama().equals(newNama) || dt[i].getIpk() != newIpk) {
                    dt[i].setNim(newNim);
                    dt[i].setNama(newNama);
                    dt[i].setIpk(newIpk);
                    updated = true;
                }
                break;
            }
        }
        return updated;
    }
}

class prak06_23051130016 {
    public static void main(String[] args) {
        int i = 1, jml_arai = 100;
        try (Scanner sken = new Scanner(System.in)) {
            ArrayMahasiswa md = new ArrayMahasiswa(jml_arai);
            String nim, nama, cariData;
            double ipk;

            int menu;
            do {
                System.out.println("\nPilih Menu di bawah ini");
                System.out.println("1. Memasukkan data");
                System.out.println("2. Pencarian data");
                System.out.println("3. Penghapusan data");
                System.out.println("4. Penampilan data");
                System.out.println("5. Mengubah data");
                System.out.println("6. Keluar");
                System.out.print("Anda memilih : ");
                menu = Integer.parseInt(sken.nextLine());

                if (menu == 1) {
                    System.out.println("\n==== Input Data Mahasiswa ====");
                    System.out.println("Masukkan data mahasiswa ke-" + i);
                    System.out.print("NIM  : ");
                    nim = sken.nextLine();
                    System.out.print("Nama : ");
                    nama = sken.nextLine();
                    System.out.print("IPK  : ");
                    ipk = Double.parseDouble(sken.nextLine());
                    md.input(nim, nama, ipk);
                    i++;

                } else if (menu == 2) {
                    System.out.println("\n======= Pencarian Data Mahasiswa =======");
                    System.out.print("Data mahasiswa yang anda cari (Nama/Nim) = ");
                    cariData = sken.nextLine();
                    int[] matchingIndices = md.cari(cariData);
                    if (matchingIndices.length > 0) {
                        System.out.println("\n===== Data Mahasiswa Ditemukan =====");
                        for (int index : matchingIndices) {
                            Mahasiswa mahasiswa = md.getDataByIndex(index);
                            System.out.println("NIM  : " + mahasiswa.getNim());
                            System.out.println("Nama : " + mahasiswa.getNama());
                            System.out.println("IPK  : " + mahasiswa.getIpk());
                            System.out.println("=====================================");
                        }
                    } else {
                        System.out.println("Data dengan nama " + cariData + " tidak ditemukan");
                    }
                    System.out.println("");

                } else if (menu == 3) {
                    System.out.println("\n=== Penghapusan Data Mahasiswa ===");
                    System.out.print("Data yang anda hapus = ");
                    cariData = sken.nextLine();
                    boolean sts = md.hapus(cariData);
                    System.out.println("================================");
                    if (sts)
                        System.out.println("Data " + cariData + " berhasil dihapus");
                    else
                        System.out.println("Data " + cariData + " TIDAK ditemukan");

                    System.out.println("");

                } else if (menu == 4) {
                    md.dataArai();

                } else if (menu == 5) {
                    System.out.print("\nData NIM yang ingin diubah = ");
                    cariData = sken.nextLine();
                    int[] matchingIndices = md.cari(cariData);
                    if (matchingIndices.length > 0) {
                        System.out.println("\nData ditemukan");
                        for (int index : matchingIndices) {
                            Mahasiswa mahasiswa = md.getDataByIndex(index);
                            System.out.println("NIM  : " + mahasiswa.getNim());
                            System.out.println("Nama : " + mahasiswa.getNama());
                            System.out.println("IPK  : " + mahasiswa.getIpk());
                            System.out.println("\n==== Masukkan data baru ====");
                            System.out.print("NIM  : ");
                            nim = sken.nextLine();
                            System.out.print("Nama : ");
                            nama = sken.nextLine();
                            System.out.print("IPK  : ");
                            ipk = Double.parseDouble(sken.nextLine());
                            boolean updated = md.ubahData(cariData, nim, nama, ipk);
                            System.out.println("=============================");
                            if (updated) {
                                System.out.println("Data berhasil diubah!!");
                            } else {
                                System.out.println("Data gagal diubah!!");
                            }
                        }
                    } else {
                        System.out.println("Data dengan NIM " + cariData + " tidak ditemukan");
                    }
                    System.out.println("");

                }
            } while (menu >= 1 && menu < 6);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
