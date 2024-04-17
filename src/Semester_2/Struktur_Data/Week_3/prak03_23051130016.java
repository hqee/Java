package Semester_2.Struktur_Data.Week_3;

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
        System.out.println("Tambah data BERHASIL");
    }

    public void dataArai() {
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("NIM       Nama        IPK");
        System.out.println("----------------------------");
        for (i = 0; i < jml_data; i++)
            dt[i].lihatData();
        System.out.println("----------------------------");
        System.out.println("");
    }

    public int[] cari(String cr) {
        int[] matchingIndices = new int[jml_data];
        int count = 0;
        for (i = 0; i < jml_data; i++) {
            if (dt[i].getNama().toLowerCase().contains(cr.toLowerCase())) {
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
}

class prak03_23051130016 {
    public static void main(String[] args) {
        int i = 1, jml_arai = 100;
        try (Scanner sken = new Scanner(System.in)) {
            ArrayMahasiswa md = new ArrayMahasiswa(jml_arai);
            String nim, nama, cariData;
            double ipk;

            int menu;
            do {
                System.out.println("Pilih Menu di bawah ini");
                System.out.println("1. Memasukkan data");
                System.out.println("2. Pencarian data");
                System.out.println("3. Penghapusan data");
                System.out.println("4. Penampilan data");
                System.out.println("5. Keluar");
                System.out.print("Anda memilih : ");
                menu = Integer.parseInt(sken.nextLine());

                if (menu == 1) {
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
                    System.out.print("Data mahasiswa yang anda cari [tulis nama] = ");
                    cariData = sken.nextLine();
                    int[] matchingIndices = md.cari(cariData);
                    if (matchingIndices.length > 0) {
                        System.out.println("Data ditemukan");
                        for (int index : matchingIndices) {
                            Mahasiswa mahasiswa = md.getDataByIndex(index);
                            System.out.println("NIM  : " + mahasiswa.getNim());
                            System.out.println("Nama : " + mahasiswa.getNama());
                            System.out.println("IPK  : " + mahasiswa.getIpk());
                        }
                    } else {
                        System.out.println("Data dengan nama " + cariData + " tidak ditemukan");
                    }
                    System.out.println("");
                } else if (menu == 3) {
                    System.out.print("Data NAMA yang anda hapus = ");
                    cariData = sken.nextLine();
                    boolean sts = md.hapus(cariData);
                    if (sts)
                        System.out.println("Data " + cariData + " berhasil dihapus");
                    else
                        System.out.println("Data " + cariData + " TIDAK ditemukan");

                    System.out.println("");
                } else if (menu == 4) {
                    md.dataArai();
                }
            } while (menu >= 1 && menu < 5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
