package Zadatak07;

public class Main {

	public static void main(String[] args) throws Exception{
		
		// U ovom primeru cu zapravo ponoviti samo primer koji je profesor radio 
		// cisto vezbe radi, manje vise sve ce biti postavljeno u klasi UnosPodatakaKonzlom
		// a ovde cemo da ih pozovemo
		
		UnosPodatakaKonzolom upk = new UnosPodatakaKonzolom();
		
		upk.unos();
		System.out.println();
		System.out.println("Duzina kolekcije je "+upk.duzina());
		System.out.println();
		upk.ispis();
		System.out.println();
		System.out.println("Trazeni element se nalazi u listi :"+upk.ispitaj());
		System.out.println();
		upk.unos();
		upk.prikaz();
		System.out.println("\nTrenutna duzina kolekcije je "+upk.duzina());
	}

}
