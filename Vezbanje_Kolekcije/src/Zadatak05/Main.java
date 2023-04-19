package Zadatak05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Stringovni niz koji sadrzi neka imena
		
		String imena[] = {"Marko", "Maja", "Pera", "Nada", "Laza", "Steva", "Ana", "Marija"};
		
		List<String> listaImena = new ArrayList<String>();
		
		for(String i : imena) {
			listaImena.add(i);
		}
		System.out.println(listaImena);
		
		String imenaZaBrisanje[] = {"Maja", "Laza", "Steva"};
		
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		
		for(String lime : imenaZaBrisanje) {
			listaImenaZaBrisanje.add(lime);
		}
		System.out.println("Lista imena za brisanje");
		System.out.println(listaImenaZaBrisanje);
		for(String i : listaImenaZaBrisanje) {
			System.out.print(i+" ");
		}
		
		// Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		
		Iterator<String> iter = listaImena.iterator();
		// Ovim smo dobili iterator za prolazak kroz liste
		// pomocu metode hasNext mozemo da ispitamo da li Lista ima sledeci clan i vraca true
		// ako ima i false u suprotrnom , a sledeci clan dobijamo metodom next
		System.out.println("\nStampanje elemenata pomocu iteratora\n");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		// Brisanje elemenata koja se nalaze u listi ImenaZaBrisanje
		// Napravicemo iterator
		iter = listaImena.iterator();
		while(iter.hasNext()) {
			if (listaImenaZaBrisanje.contains(iter.next())) {
				iter.remove();
			}
		}
		System.out.println();
		System.out.println(listaImena);
		// Elemente mozemo da dohvatimo metodom get
		
		// Drugin nacin preko metode get
		
		System.out.println("\nListaImena nakon brisanja");
		for(int i = 0; i < listaImena.size(); i++) {
			System.out.print(listaImena.get(i)+" ");
		}

	}

}
