package Semester_2.Struktur_Data.Week_9.linkedList;

//CIRCULAR DOUBLE LINKED LIST
class Node {
	public int Data1;
	public double Data2;
	public Node next;
	public Node previous;

	// -------------------------------------------------------------
	public Node(int dat1, double dat2) {
		Data1 = dat1;
		Data2 = dat2;
	}

	// -------------------------------------------------------------
	public void tampilNode() {
		System.out.print("{" + Data1 + ", " + Data2 + "} ");
	}
} // end class Node
	////////////////////////////////////////////////////////////////

class DoubleLink {
	private Node first;
	private Node last;
	private Node indek;

	// -------------------------------------------------------------
	public DoubleLink() {
		first = null;
		last = null;
		indek = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() {
		return first == null;
	}

	// -------------------------------------------------------------
	public void insertFirst(int dat1, double dat2) {
		Node newNode = new Node(dat1, dat2);
		if (isEmpty()) {
			last = newNode;
			newNode.next = last;
		} else
			first.previous = newNode;
		first = newNode;
		indek = last.next;
		newNode.next = indek;
		newNode.previous = last;
		last.next = first;
	}

	// -------------------------------------------------------------
	public void insertLast(int dat1, double dat2) {
		Node newNode = new Node(dat1, dat2);
		if (isEmpty()) {
			first = newNode;
			newNode.next = first;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
		newNode.next = first;
		first.previous = last;
	}

	// -------------------------------------------------------------
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == first) {
			last = null;
			first = null;
			indek = null;
		} else
			first.next.previous = last;
		first = first.next;
		last.next = first;
		return temp;
	}

	// -------------------------------------------------------------
	public Node deleteLast() {
		Node temp = last;
		if (first.next == first) {
			first = null;
			last = null;
			indek = null;
		} else
			last.previous.next = first;
		last = last.previous;
		first.previous = last;
		return temp;
	}

	// -------------------------------------------------------------
	public boolean insertAfter(int dat, int dat1, double dat2) {
		Node indek1 = first;
		while (indek1.Data1 != dat) {
			indek1 = indek1.next;
			if (indek1 == first)
				return false; // data tidak ditemukan
		}
		Node newNode = new Node(dat1, dat2);
		if (indek1 == last) {
			newNode.next = first;
			last = newNode;
		} else {
			newNode.next = indek1.next;
			indek1.next.previous = newNode;
		}
		newNode.previous = indek1;
		indek1.next = newNode;
		first.previous = last;
		return true;
	}

	// -------------------------------------------------------------
	public Node hapus(int dat) {
		Node indek = first;
		while (indek.Data1 != dat) {
			indek = indek.next;
			if (indek == first)
				return null; // data tidak ditemukan
		}
		if (indek == first)
			first = indek.next;
		else
			indek.previous.next = indek.next;
		if (indek == last)
			last = indek.previous;
		else
			indek.next.previous = indek.previous;
		return indek;
	}

	// -------------------------------------------------------------
	public void tampilMaju() {
		System.out.print("List (first-->last): ");
		Node indek = first;
		while (indek != last) {
			indek.tampilNode();
			indek = indek.next;
		}
		last.tampilNode();
		last.next.tampilNode(); // data terakhir kembali ke awal
		System.out.println("");
	}

	// -------------------------------------------------------------
	public void tampilMundur() {
		System.out.print("List (last-->first): ");
		Node indek = last;
		while (indek != first) {
			indek.tampilNode();
			indek = indek.previous;
		}
		first.tampilNode();
		first.previous.tampilNode(); // data pertama kembali ke akhir
		System.out.println("");
	}
	// -------------------------------------------------------------
} // end class DoubleLink
	////////////////////////////////////////////////////////////////

class circular2App {
	public static void main(String[] args) {
		DoubleLink list = new DoubleLink();
		list.insertFirst(22, 22.99);
		list.insertFirst(44, 44.99);
		list.insertFirst(66, 66.99);
		list.insertFirst(88, 88.99);
		System.out.println("Memasukkan data di depan");
		list.tampilMaju();
		list.insertLast(11, 11.99);
		list.insertLast(33, 33.99);
		System.out.println("");
		System.out.println("Memasukkan data di belakang");
		list.tampilMaju();
		System.out.println("");
		System.out.println("Menampilkan data dari depan ke belakang");
		list.tampilMaju();
		System.out.println("");
		System.out.println("Menampilkan data dari belakang ke depan");
		list.tampilMundur();
		list.deleteFirst();
		System.out.println("");
		System.out.println("Menghapus data paling depan");
		list.tampilMaju();
		list.deleteLast();
		System.out.println("");
		System.out.println("Menghapus data paling belakang");
		list.tampilMaju();
		list.hapus(11);
		System.out.println("");
		System.out.println("Menghapus data 11");
		list.tampilMaju();
		list.hapus(99);
		System.out.println("");
		System.out.println("Menghapus data 99");
		list.tampilMaju();
		list.insertAfter(22, 77, 77.99);
		System.out.println("");
		System.out.println("Memasukkan data 77 setelah data 22");
		list.tampilMaju();
		list.insertAfter(33, 99, 99.99);
		System.out.println("");
		System.out.println("Memasukkan data 99 setelah data 33");
		list.tampilMaju();
		list.insertAfter(77, 99, 99.99);
		System.out.println("");
		System.out.println("Memasukkan data 99 setelah data 77");
		list.tampilMaju();
	} // end main()
} // end class DoubleLinkList
	////////////////////////////////////////////////////////////////