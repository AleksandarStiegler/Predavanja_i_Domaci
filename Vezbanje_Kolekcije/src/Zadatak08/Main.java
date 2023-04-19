package Zadatak08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Rad sa kolekcijama sta god mi padne napamet uz obavezno brisanje podataka
		// pretvaranje u niz i obrnuto
		
		int x[] = {1, 3, 5, 7, 9, 11, 12, 33, 22};
		// Pretvoricemo ovaj niz u listu
		
		List<Integer> lista1 = new ArrayList<Integer>();
		
		for (int i : x) {
			lista1.add(i);
		}
		System.out.println(lista1); // ovim smo niz prebacili u kolekciju
		
		lista1.add(14);
		System.out.println("Trenutna duzina kolekcije "+ lista1.size());
		
		// ajde da napravimo jos jednu listu pomocu koje cemo izbaciti nezeljene elemente prve 
		// kolekcije
		
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(14);
		lista2.add(15);
		lista2.add(7);
		lista2.add(33);
		for(int i : lista2) {
			System.out.print(i + " ");
		}
		
		// Ajmo sada da iz prve liste izbrisemo nezeljene elemente pomocu druge liste
		
		System.out.println();
		// Da bismo to mogli da uradimo moramo da uvedemo iterator
		
		Iterator<Integer> iter = lista1.iterator();
		// Pomocu metoda hasnext koja vraca true ako postoji sledeci clan ili false u suprotnom
		// i metode next procicemo kroz liste
		
		while(iter.hasNext()) {
			if(lista2.contains(iter.next())) {
				iter.remove();
			}
		}
		System.out.println("Velicina kolekcije nakon brisanja elemenata "+lista1.size());
		System.out.println("Nova lista ");
		for (int i = 0; i < lista1.size(); i++) {
			System.out.print(lista1.get(i) + " ");
		}
		System.out.println();
		if(lista1.contains(5)) {
			System.out.println("Trazeni element se sadrzi u kolekciji");
		}
		else {
			System.out.println("Trazeni element se ne nalazi u kolekciji");
		}
		System.out.println("Element 9 se nalazi na "+ (lista1.indexOf(9) + 1)+ " mestu.");
		
		Integer niz[] = new Integer [lista1.size()];
		
		lista1.toArray(niz); // ovo bi trebalo da radi ali iz nekog razloga ne prihvata mi ovako\
							 // ako prebacim u String prihvata bez problema
		// Idiot liste NE RADE SA PRIMITIVNIM PODATCIMA jos sam o tome razmisljao i hteo da odradim
		// ali ne nisam ni probao a vec sam trazio resenje IDIOT!!!
		for(int i = 0 ; i < niz.length ; i++) {
			System.out.print(niz[i] + " ");
		}
		
	}
	// ok sa ovim mislim da sam manje vise prosao kroz metode i Array liste za sada ce biti dovoljno

}
