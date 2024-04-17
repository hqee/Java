package Semester_2.Struktur_Data.Week_1;

import java.util.Scanner;
import java.util.InputMismatchException;

class metod {
    private int[] dt; // array
    private int jml_data;
    private int i;
    public int jumlahDitemukan;

    // Constructor
    public metod() {
        dt = new int[100]; // array sebanyak 100 indek
        jml_data = 0; // jumlah data mula-mula nol
    }

    // Method input untuk memasukkan data ke dalam array
    public void input(int data) {
        dt[jml_data] = data;
        jml_data++;
    }

    // Method untuk menampilkan data yang ada dalam array
    public void lihat() {
        for (i = 0; i < jml_data; i++) // menampilkan data
            System.out.println(dt[i]);
        System.out.println("");
    }

    // Method untuk mencari data yang ada dalam array
    public int cari(int cr) {
        int count = 0; // variable to store the count of occurrences
        for (i = 0; i < jml_data; i++) // mencari data pada setiap elemen array
            if (dt[i] == cr) { // data pada array sama dengan data yang dicari?
                count++; // increment the count if data is found
            }
        return count; // return the count of occurrences
    }

    // Method untuk menghapus data yang ada dalam array
    public boolean hapus(int hps) {
        boolean found = cari(hps) > 0; // menggunakan hasil dari fungsi cari
        if (found) { // bila data ditemukan maka dihapus
            for (int j = i; j < jml_data - 1; j++) // melakukan penimpaan data
                dt[j] = dt[j + 1];
            jml_data--; // jangan lupa jumlah data dikurangi satu!!!
            return true;
        } else // bila data tidak ditemukan
            return false;
    }
}

/////////////////////////////////////////////////////////////////////////
class prak01_23051130016 {
	public static void main(String[] args) {
		int dat, cariData;
		try (Scanner sken = new Scanner(System.in)) {
            metod md = new metod(); // memanggil class metod dengan variabel md
            
//----------------------------------------------------------------------
            
            int menu;
            int jumlahData;
            boolean isKeluar = false;

            while(!isKeluar) {
            	System.out.println("\nPilih Menu di bawah ini");
            	System.out.println("====================");
                System.out.println("1. Memasukkan data");
            	System.out.println("2. Pencarian data");
            	System.out.println("3. Penghapusan data");
            	System.out.println("4. Penampilan data");
            	System.out.println("5. Keluar");
                System.out.println("====================");
            	System.out.print("Pilihan Anda : ");
            	
                try {
                    menu = sken.nextInt();    
                } catch (InputMismatchException e) {
                    System.out.println("Error, silahkan masukkan angka!");
                    sken.nextLine();
                    continue;
                }            

            	if (menu == 1) {
                    System.out.print("Berapa data yang ingin Anda masukkan? ");
                    try {
                        jumlahData = sken.nextInt();    
                    } catch (InputMismatchException e) {
                        System.out.println("Error, silahkan masukkan angka!");
                        continue;
                    }            
                      
                    for (int j = 0; j < jumlahData; j++) {
                        System.out.print("Masukkan data ke-" + (j + 1) + " = ");
                        dat = sken.nextInt();
                        md.input(dat);
                    }
                System.out.println();
                } 
            	
            	if (menu == 2) {
                    System.out.print("Data yang anda cari = ");
                    
                    try {
                        cariData = sken.nextInt();    
                    } catch (InputMismatchException e) {
                        System.out.println("Error, silahkan masukkan angka!");
                        sken.nextLine();
                        continue;
                    }

                    int count = md.cari(cariData); // memanggil method cari pada class metod
                    if (count > 0) {
                        System.out.println("Data " + cariData + " ditemukan dengan jumlah " + count);
                    } else {
                        System.out.println("Data " + cariData + " tidak ditemukan");
                    }
                    System.out.println("");
                }

                 else if (menu==3) {
            		System.out.print("Data yang anda hapus = ");
                    try {
                        cariData = sken.nextInt();   
                    } catch (InputMismatchException e) {
                        System.out.println("Error, silahkan masukkan angka!");
                        sken.nextLine();
                        continue;
                    }
            	 	boolean sts = md.hapus(cariData); // memanggil method hapus pada class metod
            	 	if (sts==true)
            	 		System.out.println("Data " + cariData + " berhasil dihapus");
            	 	else
            	 		System.out.println("Data " + cariData + " TIDAK ditemukan");
            		
            		System.out.println("");

            	} else if (menu==4) {
            		md.lihat();
            	} else if (menu==5){
                    isKeluar = true;
                    System.out.println("Program selesai");
                    System.exit(0);
                } 
            }
        }       
	} 
} 