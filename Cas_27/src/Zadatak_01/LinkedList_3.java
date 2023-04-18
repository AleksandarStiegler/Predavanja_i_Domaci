package Zadatak_01;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_3 {

	public static void main(String[] args) {

		List<String> Llist = new LinkedList<String>();

		Llist.add("1");
		Llist.add("2");
		Llist.add("3");
		Llist.add("4");
		Llist.add("5");

		ListIterator itr = Llist.listIterator(); // Sluzi za kretanje kroz liste

		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\nKretanje kroz listu od poslednjeg do prvog elementa: ");
		while (itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}

	}

}
