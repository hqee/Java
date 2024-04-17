package Semester_2.Struktur_Data.Week_4;

// contoh bubbleSort.java
/////////////////////////////////////////////////////////////////////////

class latBubble {
	// Status atau atribut dari kelas
	private long[] a; // array a dengan tipe data long
	private int nElemen; // jumlah elemen array
	
//----------------------------------------------------------------------

	public latBubble(int max) { // constructor
		a = new long[max]; // menciptakan array
		nElemen = 0; // elemen array masih kosong
	}
	
//----------------------------------------------------------------------

	// Behaviour atau method untuk memasukkan data
	public void input(long data) {
		a[nElemen] = data; // memasukkan data
		nElemen++; // jumlah elemen array bertambah satu
	} // end input()
	
//----------------------------------------------------------------------

	// Behaviour atau method untuk menampilkan data
	public void tampil() { // menampilkan isi array
		for(int i=0; i<nElemen; i++)
		System.out.print(a[i] + " ");
		System.out.println("");
	} // end tampil()
	
//----------------------------------------------------------------------

	// mengurutkan data dengan metode bubble sort
	public void bubSort() {
		int i, j;
		for(i=nElemen-1; i>1; i--) // perulangan pertama untuk mengulangi perbandingan dari awal
			for(j=0; j<i; j++) // perulangan kedua untuk membandingkan data
				if( a[j] > a[j+1] ) // data pertama lebih besar?
					tukar(j, j+1); // memanggil method tukar() --> melakukan pertukaran tempat
	} // end bubbleSort()
	
//---------------------------------------------------------------------

	// method untuk melakukan pertukaran tempat
	private void tukar(int data1, int data2) {
		long temp = a[data1];
		a[data1] = a[data2];
		a[data2] = temp;
	} //end tukar()

} // end class latBubble
		
/////////////////////////////////////////////////////////////////////////	

class bubbleSort {
	public static void main(String[] args) {
		int makArray = 100; // maksimum elemen array 100
		latBubble larik;
		larik = new latBubble(makArray);
				
		larik.input(57); // memasukkan data
		larik.input(89);
		larik.input(49);
		larik.input(51);
		larik.input(12);
		larik.input(90);
		larik.input(1);
		larik.input(0);
		larik.input(63);
		larik.input(25);
		
		larik.tampil(); // menampilkan data array
		larik.bubSort();	
		larik.tampil();
	
	} // end main()
} // end arrayClass