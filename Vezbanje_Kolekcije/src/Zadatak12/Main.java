package Zadatak12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		// Zadatak u kojem cu da se igram sa metodama LinkedListe i ListIteratorom
		// Sta god mi padne napamet s tim da cemo da pravimo ponovo niz od liste i listu od niza
		// koristiti get i set metode obavezno
		
		// Ne zaboraviti da za get i set metode moramo uvesti superklasu (koren) Object iz koje
		// su izvedene sve ostale klase
		
		double niz[] = {1.15, 2.76, 7.15, 9.56, 11.25};
		
		// Pretvaranje niza u Listu
		
		List<Double> realbr = new LinkedList<Double>();
		for(double b : niz) {
			realbr.add(b);
		}
		System.out.println("Clanovi povezane liste : " + realbr);
		
		System.out.println();
		realbr.add(5, 19.22);
		System.out.println("Trenutna duzina povezane liste : "+realbr.size());
		realbr.subList(2, 5).clear();
		// ovim smo obrisali 3 i 4 element u listi
		
		// ajde da dodam jos jednu listu
		System.out.println("Povezana lista nakon brisanja"+realbr);
		List<Double> realbr1 = new LinkedList<Double>();
		realbr1.add(3.1);
		realbr1.add(5.2);
		realbr1.add(7.3);
		realbr1.add(9.11);
		realbr1.add(4.12);
		// Sada cu da dodam sve elemente ove liste prvoj listi
		
		realbr.addAll(realbr1);
		System.out.println("Nova povezana lista nakon dodavanja elemenata druge liste :\n " + realbr + " "
				+ ",i njena trenutna duzina : "+realbr.size());
		
		// Posto su double elementi ajde da izbrisemo i neki broj samo preko indeksa lakse je
		
		realbr.remove(5);
		boolean k = realbr.contains(4.52);
		if (k) {
			System.out.println("Trazeni element se nalazi u povezanoj listi");
		}else {
			System.out.println("Trazeni element se ne nalazi u povezanoj listi");
		}
		try {
		Object rb = realbr.get(7);
		
		System.out.println("Trazeni element iz kolekcije je "+rb);
		
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Izuzetak : trazeni index je van kolekcije");
		}
		System.out.println();
		realbr.set(2, 14.75);
		realbr.set(4, 33.66);
		System.out.println("Nova kolekcija posle promene elemenata");
		for (double b : realbr) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("Index elementa 11.25 je " + realbr.indexOf(11.25));
		
		// i da privodimo kraju trenutno mi ne pada nista napamet vise od ovoga
		// nisam koristio list iterator 
		// koristimo hasnext i hasPrevious za kretanje kroz liste
		
		ListIterator litr = realbr.listIterator();
		System.out.println("Kretanje od prvog ka poslednjem elementu liste");
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		
		System.out.println();
		System.out.println("Kretanje od poslednjeg elementa ka prvom");
		while(litr.hasPrevious()) {
			System.out.printf("%s ",litr.previous());
		}
		// i da vratim u niz
		
		System.out.print("\nPrebacivanje liste u niz i elementi novonastalog niza su : \n");
		Double niz1[] = new Double[realbr.size()];
		realbr.toArray(niz1);
		for(int i = 0; i < niz1.length; i++) {
			System.out.print(niz1[i] + " ");
		}
		// To je to sto se tice listi za sada makar
		
		
		
		
		

	}

}
