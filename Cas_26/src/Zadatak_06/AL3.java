package Zadatak_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL3 {

	public static void main(String[] args) {

		String imena[] = { "Mika", "Zika", "Ana", "Lana", "Hana", "Una" };

		List<String> listaImena = new ArrayList<String>();

		for (String s : imena) {
			listaImena.add(s);
		}

		String imenaZaBrisanje[] = { "Mika", "Lana", "Hana" };

		List<String> listaImenaZaBrisanje = new ArrayList<String>();

		for (String ime : imenaZaBrisanje) {
			listaImenaZaBrisanje.add(ime);
		}
		// Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora

		Iterator<String> iter = listaImena.iterator();

		System.out.println("Stampanje elemenata pomocu iteratora.");
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}

		// Brisanje elemenata liste imena koja se nalaze u listi listaImenaZaBrisanja

		iter = listaImena.iterator();
		while (iter.hasNext()) { // Utvrdjujemo da li lista imena za brisanje sadrzi element na koji
			if (listaImenaZaBrisanje.contains(iter.next())) { // ukazuje iterator ako je
				iter.remove(); // odgovor true , brisemo element
			}
		}

		System.out.println("Lista nakon brisanja : ");

		for (int i = 0; i < listaImena.size(); i++) {
			System.out.println(listaImena.get(i) + " ");
		}

	}

}
