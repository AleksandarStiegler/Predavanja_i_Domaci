package Zadatak_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> kolAL = new ArrayList<String>();
		
		// List je interfejs koji sadrzi odredjene metode 
		// size () - vraca broj elemenata smestenih u kolekciji ArrayList
		
		System.out.println("Pocetna duzina: "+kolAL.size());
 		
		// add - dodaje element na KRAJ!!!!! kolekcije
		kolAL.add("Prvi ");
		kolAL.add("Drugi ");
		kolAL.add("Treci ");
		kolAL.add("Cetvrti ");
		
		// Prolazak kroz kolekciju
		for(String s : kolAL) {
			System.out.printf("%s ",s);
		}
		
		System.out.println("\nTrenutna duzina kolekcije "+kolAL.size());
		
		// provera da li se neki zadati element nalazi unutar kolekcije
		// contains - vraca true ako kolekcija sadrzi trazeni element
		// vraca false ukoliko ne sadrzi
		
		boolean sadrzi = kolAL.contains("Treci"); // true ili false
		
		if (sadrzi) { // sintaksa za  sadrzi == true
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji !");
		}
		else {
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji !");
		}
		
		// get() - vraca element sa zadatim indeksom
		
		String element = kolAL.get(2);
		System.out.println("Element sa indeksom 2 u kolekciji je : "+element);
		
		// indexOf - vraca indeks prve pojava zadatog elementa kolekcije
		// vratice - 1  ukoliko trazeni element ne postoji
		
		int pozicija = kolAL.indexOf("Drugi ");
		System.out.println("Element Drugi nalazi se na poziciji : "+pozicija);
		
		// toArray - sluzi za prebacivanje elemenata u niz
		
		String [] nizString = new String[kolAL.size()];
		kolAL.toArray(nizString);
		
		for (String s : nizString) {
			System.out.printf("%s ",s);
		}
		
		// remove - uklanja (brise ) prvu pojavu zadate vrednosti
		
		kolAL.remove("Treci ");
		System.out.println();
		for(String s  : kolAL) {
			System.out.print(s+" ");
		}
		
		// clear - brise sve elemente iz zadate kolekcije
		
		kolAL.clear();
		System.out.println("\nTrenutna velicina kolekcije (nakon brisanja) : "+kolAL.size());
		
		
		
		
		
		
	}

}
