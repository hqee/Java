package Semester_2.Struktur_Data.Week_9.linkedList;

//CIRCULAR SINGLE LINKED LIST
class Node {
	public int Data1;
	public double Data2;
	public Node next;

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

class circularList {
	private Node first;
	private Node last;
	private Node indek;

	// -------------------------------------------------------------
	public circularList() {
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
		}
		first = newNode;
		indek = last.next;
		newNode.next = indek;
		last.next = first;
	}

	// -------------------------------------------------------------
	public void insertLast(int dat1, double dat2) {
		Node newNode = new Node(dat1, dat2);
		if (isEmpty()) {
			first = newNode;
			newNode.next = first;
		}
		indek = last;
		last = newNode;
		if (first.next != first)
			indek.next = last;
		newNode.next = first;
		indek = last;
	}

	// -------------------------------------------------------------
	public int hapusFirst() {
		int temp = first.Data1;
		if (first.next == first) {
			first = null;
			last = null;
			indek = null;
		}
		if (first != null) {
			first = first.next;
			last.next = first;
			indek = first.next;
		}
		return temp;
	}

	// -------------------------------------------------------------
	public int hapusLast() {
		int temp = last.Data1;
		if (first.next == first) {
			first = null;
			last = null;
			indek = null;
		} else if (first.next == last) {
			last = first;
			indek = first;
			last.next = first;
		} else {
			Node indek1 = first;
			while (indek1.next.next != last) {
				indek1 = indek1.next;
			}
			last = indek1.next;
			indek = last;
			last.next = first;
		}
		return temp;
	}

	// -------------------------------------------------------------
	public void tampilList() {
		System.out.println("List (awal-->akhir): ");
		Node indek = first;
		while (indek != last) {
			indek.tampilNode();
			indek = indek.next;
		}
		if (last != null) {
			last.tampilNode();
			last.next.tampilNode(); // data terakhir kembali ke awal
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
} // end class firstEndList
	////////////////////////////////////////////////////////////////

class circular1App {
	public static void main(String[] args) {
		circularList list = new circularList();
		System.out.println("Data awal");
		list.insertFirst(22, 2.99); // memasukkan data di awal Link List
		list.insertFirst(44, 4.99);
		list.insertFirst(66, 6.99);
		System.out.println("");
		System.out.println("Pemasukan Data diawal Link List");
		list.tampilList();
		list.insertLast(11, 11.99); // memasukkan data diakhir Link List
		list.insertLast(33, 33.99);
		list.insertLast(55, 55.99);
		System.out.println("");
		System.out.println("Pemasukan Data diakhir Link List");
		list.tampilList();
		list.hapusFirst();
		list.hapusFirst();
		System.out.println("");
		System.out.println("Dua Data diawal Link List di hapus");
		list.tampilList();
		list.hapusLast();
		// list.hapusLast();
		System.out.println("");
		System.out.println("Satu Data diakhir Link List di hapus");
		list.tampilList();
	} // end main()
} // end class DoubleEndLinked
	////////////////////////////////////////////////////////////////