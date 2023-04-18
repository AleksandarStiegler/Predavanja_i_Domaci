package Domaci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Zadatak_02 {

	public static void main(String[] args) {

		// Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 123456

		Scanner sc = new Scanner(System.in);
		int x[] = new int[50];

		System.out.println("Unesite broj clanova niza");
		int n = sc.nextInt();
		System.out.println("Unesite elemente niza ");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		// Ovako unesen niz cu da pretvorim u listu

		List<Integer> duplikati = new ArrayList<Integer>();
		ListIterator<Integer> listitr = duplikati.listIterator();
		for (int i = 0; i < n; i++) {
			duplikati.add(x[i]);
		}
		System.out.println(duplikati);
		List<Integer> novaLista = new ArrayList<Integer>();
		/*
		 * int j = 0; while (j < n) {
		 * 
		 * int k = duplikati.get(j); int b = j + 1; while (b < n) { if (k ==
		 * duplikati.get(b)) { novaLista.add(duplikati.get(b)); // dobijam duplikate }
		 * b++; } j++;
		 * 
		 * } System.out.println(novaLista);
		 * 
		 * listitr = duplikati.listIterator();
		 * 
		 * while (listitr.hasNext()) {
		 * 
		 * if (novaLista.contains(listitr.next())) {
		 * 
		 * listitr.remove(); // Problem koji se javlja je da on brise sve pojave
		 * elementa // a ne samo duplikate hmm najbolje bi bilo da preradim uslove i da
		 * direktno // kreiram listu bez duplikata. Zakomplikovao sam ali necu da brisem
		 * moze // mozda u nekom trenutku da posluzi samo cu da zakomentarisem }
		 * 
		 * }
		 */

		// da prodjemo kroz listu pa da vidim direktno da ubacujem elemente koji se ne
		// pojavljuju
		int j = 0;
		while (j < n) {

			int k = duplikati.get(j);
			if (novaLista.contains(k) == false) {
				novaLista.add(k);
			}
			j++;
		}

		// Ovo izgleda da radi koliko vidim kroz testiranje
		// Pocetna ideja je bila dobra ali izgleda da sa remove nisam mogao da izbrisem
		// samo
		// ove koji se daljem toku pojavljuju . LinkedLista + indeksi ??? probati u
		// nekom trenutku.

		System.out.println(novaLista);
		
		
	}

}
