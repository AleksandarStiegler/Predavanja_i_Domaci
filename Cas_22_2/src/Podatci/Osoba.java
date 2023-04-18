package Podatci;

public class Osoba {
	
	public String ime , datum, adresa;
	
	
	// konstruktor
	// ukoliko ne navedemo konstruktor pozvace se podrazumevani konstruktor
	
	public String info() {
		
		return  "Ime : " +ime+"\nDatum rodjenja : "+datum+"\nAdresa : "+adresa+"\n";
	}

}
