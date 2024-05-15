package Semester_2.Struktur_Data.Week_9.linkedList;

// Simple Linked List
import java.util.Scanner;
import static java.lang.System.out;

////////////////////////////////////////////////////////////////

class Node {
	public String Data1;
	public Node next;

// -------------------------------------------------------------

	public Node(String dat1) { // constructor
		Data1 = dat1;
	}

// -------------------------------------------------------------

	public String tampilNode() { // menampilkan data
		return Data1;
	}

// -------------------------------------------------------------
} // end class Node

////////////////////////////////////////////////////////////////

class LinkList {
	private Node first;
	private int count=0;
	
// -------------------------------------------------------------
	
	public LinkList() {
		first = null;
	}

// -------------------------------------------------------------

	public boolean isEmpty() {
		return (first==null);
	}

// -------------------------------------------------------------
	// memasukkan node pada awal list

	public void insertFirst(String dat1) {
		Node newNode = new Node(dat1);
		newNode.next = first;
		count++;
		first = newNode;
		displayList(false);
	}

// -------------------------------------------------------------
	// menghapus node yang pertama dalam list
/*
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		count--;
		displayList();
		return temp;
	}
*/
// -------------------------------------------------------------

    // menghapus node terakhir dalam list
    public Node deleteLast () {
        Node temp = first;
        Node temp2 = first;
        while (temp.next != null) {
            temp2 = temp;
            temp = temp.next;
        }
        temp2.next = null;
        count--;
        displayList(false);
        return temp;
    }

    // public Node deleteLast() {
    //     Node temp = first;
    //     Node temp2 = null;
    
    //     while (temp.next != null) {
    //         temp2 = temp;
    //         temp = temp.next;
    //     }
    
    //     if (temp2 == null) {
    //         first = null;
    //     } else {
    //         temp2.next = null;
    //     }
    
    //     count--;
    //     return temp;
    // }
    

	// menampilkan node (data) dalam list

	public void displayList(boolean del) {
		Node current = first;
		Node temp = first;
		int kon=count;

		if(del==true) {
			first = first.next;
			count--;
			current = first;
		}
		out.println();
		
		if(current==null) {
			out.println("Deleted");
			out.println("  |");
			out.println("  V");
			out.println("-----");
			out.println("| " + temp.tampilNode() + " |");
			out.println("-----");
		}

		while(current != null) {
			if(kon!=count && current==first) {
				out.println("First     Deleted");
				out.println("  |          |");
				out.println("  V          V");
				out.print("######");
				out.println("      -----");
				out.print("# " + current.tampilNode() + "  #");
				out.println("      | " + temp.tampilNode() + " |");
				out.print("######");
				out.println("      -----");
				kon--;
			}
			else {
				if(current==first) {
					out.println("First");
					out.println("  |");
					out.println("  V");
				}
				out.println("######");
				out.println("# " + current.tampilNode() + "  #");
				out.println("#next#");
				//out.println("#####");
			}
			current = current.next;

			if(kon!=1){
				out.println("##|###");
				out.println("  |");
				out.println("  V");
			}
			else {
				out.println("##|###");
				out.println("  |");
				out.println("  V");
				out.println(" NULL");
			}
			kon--;
		}
		out.println();
	}

// -------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////

class LinkListAnim2 {
	public static void main(String[] args) {
		LinkList theList = new LinkList(); // membuat list baru
		int menu;
		do {
			out.println("Pilih Menu");
			out.println("1. Tambah data");
			out.println("2. Ambil data");
			out.println("3. Lihat data");
			out.println("4. Keluar");
			out.print("Pilihan anda --> : ");
  			Scanner input = new Scanner(System.in);
  	    	menu = input.nextInt();
  	    	out.println();
  	    	
//--------------------------------------------------------------
			
			switch(menu) {
				case 1 : {
					out.println("               PERHATIAN !!!!");
					out.println("DATA BERUPA ANGKA SATU DIGIT TIDAK BOLEH NOL");
					out.print("Datanya --> ");
					String data = input.next();
					if(data.compareTo("1")!=0 && data.compareTo("2")!=0 &&
					   data.compareTo("3")!=0 && data.compareTo("4")!=0 &&
					   data.compareTo("5")!=0 && data.compareTo("6")!=0 &&
					   data.compareTo("7")!=0 && data.compareTo("8")!=0 &&
					   data.compareTo("9")!=0) {
						out.println("INPUT DATA SALAH !!!");
						out.println();
					}
					else {
						theList.insertFirst(data);
						out.println();
					}
					break;
				}
				
				case 2 : {
					if(!theList.isEmpty()) {
						out.println();
						theList.displayList(true);
						out.println();
					}
					else {
						out.println("Maaf, tidak ada data");
						out.println();
					}
					break;
				}
				
				case 3 : {
					if(!theList.isEmpty()) {
						theList.displayList(false); // menampilkan data
						out.println();
					}
					else {
						out.println("Maaf, tidak ada data");
						out.println();
					}
					break;
				}
			}
		} while(menu > 0 && menu < 4);
	} // end main()
} // end class LinkListAppAnim

////////////////////////////////////////////////////////////////
