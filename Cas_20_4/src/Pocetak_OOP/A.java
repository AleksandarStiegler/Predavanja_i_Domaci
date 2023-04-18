package Pocetak_OOP;

public class A {
	
	private String message;

	// Deklarisanjem privatnih podataka vrsi se enkapsulacija - skrivanje podataka
	// Sprecava se promena vrednosti promenljivih iz koda van zadate klase
	
	// podatak = atribut = osobina klase
	// Objekti imaju svoje atribute
	// Atributi se predstavljaju preko promenljivih u deklaraciji klase
	// Deklarisu se unutar klase van svih metoda
	
	// Metode klase
	
	// Metoda setMessage() postavlja poruku .
	
	public void setMessage( String msg ) // metoda je public , da bi se omogucilo pristup podatcima
	// Void znaci da ne vracaju rezultat, kao parametar imaju promenljivu istog tipa
	
	{
		message = msg; // postavlja vrednost promenljivoj message
	}
	
	// Metoda getMessage() vraca poruku.
	
	public String getMessage() // nema parametara, vracaju odgovarajuci tip podataka.
	{
		return message;
	}
	/*
	 * Parametri i argumenti metoda
	 * Promenljiva deklarisana u zaglavlju metode nazivamo parametrom
	 * Argument se prosledjuje metodi prilikom poziva metode
	 * !!! Prilikom poziva, parametri dobijaju vrednosti argumenata metode.
	 */
	
	
	
}
