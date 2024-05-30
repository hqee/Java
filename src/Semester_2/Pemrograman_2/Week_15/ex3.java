package Semester_2.Pemrograman_2.Week_15;

// Nama  : Haqi Dhiya' Firmana
// NIM   : 23051130016
// Kelas : J2

public class ex3 {
    public static String namaLengkap(String namaDepan, String namaBelakang) {
        return namaBelakang + " " + namaDepan;
    }

    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaBelakang = "Faisal";
        System.out.println(namaLengkap(namaDepan, namaBelakang));
    }
}

/*
 * Output :
 * Faisal Muhammad
 */
