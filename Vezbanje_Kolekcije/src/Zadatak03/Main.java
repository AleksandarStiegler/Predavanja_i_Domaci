package Zadatak03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Posto smo vec dosta metoda prosli kroz prethodni primer nastavicu ovde sa ostalim metodama
		// i pozvacu se na prethodne kao vezbu
		
		// IndexOf - vraca index prve pojave trazenog elementa
		// adje da napravimo neku listu i protrcimo kroz metode na kratko
		
		List<String> lista = new ArrayList<String>();
		
		// ajde da dodamo nekoliko elemenata i 2 3 neka se ponavljaju
		lista.add("Marko");
		lista.add("Maja");
		lista.add("Mirko");
		lista.add("Petar");
		lista.add("Maja");
		lista.add("Nada");
		lista.add("Marko");
		
		System.out.println("Clanovi liste : "+ lista);
		// ajmo i unapredjenom for petljom cisto onako
		for(String k : lista) {
			System.out.print(k + " ");
		}
		System.out.println("\nCetvrti clan kolekcije je "+ lista.get(3));
	
		System.out.println("\nTrenutna duzina niza je "+lista.size());
		System.out.println();
		boolean element = lista.contains("Zvonko");
		if(element) {
			System.out.println("Posmatrana koleckija sadrzi clan.");
		}
		else {
			System.out.println("Posmatrana kolekcija ne sadrzi trazeni clan.");
		}
		System.out.println();
		element = lista.contains("Maja");
		if(element){
			System.out.println("Posmatrana kolekcija sadrzi trazeni clan");
		}else {
			System.out.println("Posmatrana kolekcija ne sadrzi trazeni clan");
		}
		// ajde sada da iskoristimo metodu indexOf i da vidimo na 2 slucaja
		
		int pozicija = lista.indexOf("Maja");
		
		System.out.println("Element Maja je na poziciji "+pozicija);
		pozicija = lista.indexOf("Marko");
		System.out.println("Element Marko je na poziciji "+pozicija);
		
		// kao sto vidimo on nam prijavljuje prvu poziciju na kojoj se trazeni element pojavljuje
		// ajde da vidimo sta ce da se desi ako trazimo neki element koji se ne nalazi u kolekciji
		
		pozicija = lista.indexOf("Zivadin");
		System.out.println("Element Zivadin se nalazi na poziciji "+pozicija);
		// aha posto nemamo taj element on nam je prikazao -1 kao nesto cega nema 
		// posto elementi se indeksiraju od 0
		
		// Kolekcije se po potrebi mogu pretvoriti (prebaciti) u niz
		// Koristimo metodu toArray
		
		String niz[] = new String[lista.size()];
		lista.toArray(niz);
		for (int i = 0 ; i < niz.length; i++) {
			System.out.println(niz[i]+" ");
		}
		System.out.println(); // i pomocu unapredjene for petlje
		
		for (String s : niz) {
			System.out.printf("%s ",s);
		}
		// Dakle toArray koristi se za prebacivanje u niz
		// remove - brise trazeni element i to prvi na koji naidje a ostale kopije tog elementa ostaju
		System.out.println();
		lista.remove("Marko");
		System.out.println("Lista nakon uklanjanja elementa Marko");
		System.out.println(lista);
		System.out.println("Duzina kolekcije nakon uklanjanja elementa "+lista.size());
		// Kao sto vidimo izbrisao je samo prvu pojavu Marka
		// Metoda clear cisti nasu kolekciju u potpunosti
		lista.clear();
		System.out.println("Velicina kolekcije nakon brisanja "+lista.size());
		

	}

}
