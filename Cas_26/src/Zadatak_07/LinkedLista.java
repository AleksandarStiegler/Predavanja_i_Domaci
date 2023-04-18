package Zadatak_07;

import java.util.LinkedList;
import java.util.List;

public class LinkedLista {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		// Dodavanje elemenata u povezanoj listi

		ll.add("A"); // 0
		ll.add("B"); // 1

		ll.add(2, "C"); // 2

		System.out.println("Elementi povezane liste su: " + ll);

		// Brisanje elementa iz povezane liste

		ll.remove(1);
		ll.remove("A");
		System.out.println("Elementi povezane liste posle brisanja : " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");
		System.out.println("Trenutni elementi povezane liste : " + ll);

		// Trazenje elemenata u povezanoj listi:

		boolean sadrzi = ll.contains("E");
		if (sadrzi) {
			System.out.println("Lista sadrzi element E.");

		} else {
			System.out.println("Lista ne sadrzi element E.");
		}
		
		// pristupanje vrednosti elementa iz povezane liste
		
		Object element = ll.get(3);
		System.out.println("Zatrazen element je: "+element);
		
		// postavljanje vrednosti elemnta u povezanoj listi
		
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promena: "+ll);

	}

}
