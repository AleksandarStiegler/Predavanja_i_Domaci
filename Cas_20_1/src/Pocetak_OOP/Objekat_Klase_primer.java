package Pocetak_OOP;

public class Objekat_Klase_primer {

	public static void main(String[] args) {
		
		// int a = 5;
		
		// nazivKlase nazivObjekta = new nazivKlase();
		
		A objekat = new A(); // kreiranje novog objekta (instance) klase A.
    	//	A obj = new A();
		// Svaki objekat predstavlja instancu odredjene klase, kreiran tokom 
		// izvrsavanja od odredjenog broja polja (podataka)
		
		objekat.PrikaziPoruku();
		//Metode klase se pozivaju pomocu operatora  .  (tacka) :
		// nazivObjekta.nazivMetode();
		objekat.PrikaziPoruku();
		objekat.PrikaziPoruku();
	}

}
