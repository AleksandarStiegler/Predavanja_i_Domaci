package Zadatak09;

import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> ll = new LinkedList<String>();
		
		// Rekli smo da indeksiranje kod kolekcija ide od 0 kao i kod nizova
		
		ll.add("A"); 	// 0
		ll.add("B"); 	// 1	
		ll.add(2, "C"); // 2
		System.out.println("Elementi povezane liste su : " + ll);
		System.out.println("Duzina liste "+ ll.size());
		System.out.println();
		// Brisanje elemenata iz kolekcije
		// moze se odraditi na 2 nacina
		// 1 preko indeksa i 2 preko samog elementa
		
		ll.remove(0);
		ll.remove("B");
		System.out.println("Duzina kolekcije nakon brisanja " + ll.size());
		System.out.println("Elementi nakon brisanja u povezanoj listi : " + ll);
		ll.add(0, "D");
		ll.add("E");
		ll.add("F");
		
		System.out.println("\nNova povezana lista : " + ll);
		
		// trazenje elementa u listi
		
		boolean sadrzi = ll.contains("E");
		if(sadrzi) {
			System.out.println("Lista sadrzi trazeni element");
		}else {
			System.out.println("Lista ne sadrzi trazeni element");
		}
		// Najverovatnije smo ubacili logicku promenljivu da bismo mogli da ispisemo poruke
		// koje mi zelimo
		
		System.out.println("Duzina nove povezane liste " + ll.size());
		
		// pristupanje (uzimanje) vrednosti elementa iz povezane liste
		
		Object element = ll.get(2); // Object je super klasa iz koje su izvedene sve ostale klase
									// pomocu super klase mozemo pristupiti elementu kolekcije
		// Naravno kako smo rekli kod ArrayList elementima ne mozemo da pristupimo preko []
		// vec moramo da koristimo get metode , ovde to radimo preko superklase Object
		
		System.out.println("Zatrazen element je " + element);
		// Pomocu metode set mozemo da postavimo vrednost elementa u povezanoj listi
		
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promena : " + ll);
		
		// Samo ne zaboraviti da kod LinkedLista moramo da koristimo superklasu Object i da ga
		// deklarisemo i onda teko mozemo da koristimo metode set i get
		
		System.out.println(+77);
		
		
	}

}
