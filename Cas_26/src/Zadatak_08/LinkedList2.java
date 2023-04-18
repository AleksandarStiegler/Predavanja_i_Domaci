package Zadatak_08;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {

		String imena[] = { "Mika", "Zika", "Fica" };

		List<String> listaImena = new LinkedList<String>();

		for (String s : imena) {
			listaImena.add(s);
		}
		String imena1[] = { "Ana", "Lena", "Hana", "Una" };

		List<String> listaImena1 = new LinkedList<String>();

		for (String k : imena1) {
			listaImena1.add(k);
		}

		System.out.println("Lista pre dodavanja imena: " + listaImena);
		System.out.println();
		System.out.println("Druga lista imena: " + listaImena1);
		listaImena.addAll(listaImena1);
		System.out.println();
		System.out.println("Lista nakon dodavanja: " + listaImena);

		listaImena.subList(1, 4).clear();

		System.out.println("\nLista nakon brisanja: " + listaImena);

	}

}
