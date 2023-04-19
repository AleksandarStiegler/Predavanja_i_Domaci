package Zadatak02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		// Za arraylist da bi ubacili interfejs ide interfejs <tip promenljive> ime = new ArrayList<tip promenljive>();
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(13);
		lista.add(2);
		lista.add(4);
		lista.add(8);
		// Metoda add se nalazi unutar interfejsa List i mozemo da je koristimo uvodjenjem odgovarajuceg interfejsa
		
		System.out.println(lista);
		for (int c : lista) {
			System.out.println(c+" "); // ok ekstra moze i ovako
			
		}
		// Posto kolekcije tipa ArrayList nisu ogranicene, nemaju konacan broj elemenata mozemo dodavati
		// nove elemente
		lista.add(17);
		lista.add(22);
		System.out.println(lista);
		
		List<String> lista1 = new ArrayList<String>();
		// size() vraca duzinu (trenutnu duzinu niza)
		
		System.out.println("Pocetna duzina : "+ lista1.size());
		
		lista1.add("Pera");
		lista1.add("Mika");
		lista1.add("Nada");
		// add dodaje element na kraj kolekcije
		lista1.add("Marija");
		System.out.println(lista1);
		System.out.println("Trenutna duzina : "+ lista1.size());
		
		for (String s : lista1) {
			System.out.printf("%s ", s); // Print f sluzi za formatiranje pri stampanju
										 // nisam cesto koristio pa ne znam sve kako sta ide
		}
		// Da bi proverili da li kolekcija sadrzi neki element koristimo metodu 
		// contains - vraca true ako ima ili false u suprotnom
		// moramo uvesti logicku promenljivu
		
		boolean sadrzi = lista1.contains("Steva");
		System.out.println();
	 // System.out.println(sadrzi);
		
		// Contains vraca true ili false pa da bi prikazali resenje moramo peske da prikazemo
		// da li se element nalazi ili ne u kolekciji
		
		if (sadrzi) { // posto je ovo logicka promenljiva ovakva sintaksa je jednaka 
					  //  sadrzi == true
		System.out.println("Trazeni element se nalazi u posmatranoj kolekciji!");	
		}
		else {
			System.out.println("Trazeni element se ne nalazi u posmatranoj kolekciji!");
		}
		
		// get() metoda vraca element sa zadataim indeksom
		
		String clan = lista1.get(2);
		System.out.println("Clan sa indeksom 2 u kolekciji je "+clan);
		// Posto smo rekli da indeksiranje kolekcija krece od 0 u ovom slucaju mi cupamo 3 clan kolekcije
		// a ajde da vidimo sta ce da pokaze ako pokusam da izvucem clan sa vecim indeksom 
		// od broja clanova u kolekciji
		try {
		clan = lista1.get(4);
		System.out.println(clan);
		}catch(Exception e) {
			System.out.println("Izuzetak van opsega kolekcije");
		}
		// kao sto sam ocekivao iskocio je izuzetak IndeksoutofBounds ajde da to postavimo u
		// try catch blok
	}

}
