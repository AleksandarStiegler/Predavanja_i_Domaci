package Zadatak06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Napraviti dve liste od kojih ce jedna biti unesena preko konzole
		// i prebaciti iz niza u listu i na kraju od preostale liste napraviti
		// niz. igrati se sa raznim metodama kroz zadatak kao i nacinom ispisa
		
		int zaBrisanje[] = { 1, 8, 13};
		// ovaj niz cemo da pretvorimo u listu
		
		List<Integer> listaZB = new ArrayList<Integer>(); 
		for(int j : zaBrisanje) {
			
			listaZB.add(j);
			
		}
		System.out.println("Duzina liste za brisanje "+ listaZB.size());
		
		System.out.print("Elementi liste za brisanje "+listaZB);
		
		// sad cemo da formiramo novu listu preko konzole
		System.out.println();
		Konzola lista = new Konzola();
		lista.unos();
		
		System.out.println("\n\nDuzina liste "+ lista.size());
		lista.prikaz();
		
		Iterator<Integer> iter = listaZB.iterator();
		Iterator<Integer> it = ((List<Integer>) lista).iterator();
		it = ((List<Integer>)lista).iterator();
		// Pravi mi problem prilikom pravljenja iteratora za listu preko konzole videcu kad dodjem
		// dotle cu da odslusam do kraja i onda malo da slusam lambda izraze
		
		while (it.hasNext()) {
			if (listaZB.contains(it.next())) {
				it.remove();
			}
		} // Jos uvek ne mogu da nadjem gde je problem ali cu ovo probati za vikend uz nasledjivanje
		// mislim da ce biti zabavno
	}

}
