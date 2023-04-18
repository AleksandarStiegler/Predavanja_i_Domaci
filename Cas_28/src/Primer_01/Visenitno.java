package Primer_01;

public class Visenitno {

	public static void main(String[] args) {
		
	// Prilikom pokretanja Java programa, jedna programska nit odmah pocinje da se izvrsava
	// To je glavna ili inicijalna nit, i ona se poslednja zavrsava, i skuplja sve ostatke pri zatvaranju.
	
	// Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metode currentThread 
	// currentThread () klase Thread. odnosno pripadi klasi Thread
		
		Thread t = Thread.currentThread();
		
		System.out.println("Trenutna nit " +t);
		
		// [ ime niti , prioritet , ime groupe kojoj pripada nit ] 
		// podrazumevano ime glavne niti je main. Njen prioritet je 5 , sto je takodje podrazumevana vrednost.
		// (treci parametar ) main je ime grupe niti kojoj ta nit pripada, 
		// grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		
		// getName() - vraca ime niti
		
		System.out.println("Naziv niti: "+Thread.currentThread().getName());
		
		// getPriority () -  vraca prioritet niti
		System.out.println("Prioritet niti : "+Thread.currentThread().getPriority());
	}

}
