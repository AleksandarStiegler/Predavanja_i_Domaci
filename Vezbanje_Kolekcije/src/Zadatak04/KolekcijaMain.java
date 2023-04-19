package Zadatak04;

public class KolekcijaMain {

	public static void main(String[] args) {
		
		Main ab = new Main();
		
		ab.unos();
		ab.ispis();
		ab.brojevi.add(16);
		ab.ispis();  
		System.out.println("Sadrzi 4 "+ab.brojevi.contains(4));
		System.out.println("Sadrzi 5 "+ab.brojevi.contains(5));
		
		System.out.println(ab.brojevi.get(3));
		System.out.println("Broj 16 se nalazi na "+(ab.brojevi.indexOf(16)+1)+ " poziciji");
		
		ab.brojevi.remove(7);
		System.out.println("Trenutna duzina kolekcije "+ab.brojevi.size());
		ab.brojevi.clear();
		System.out.println("Duzina kolekcije "+ab.brojevi.size());
	}

}
