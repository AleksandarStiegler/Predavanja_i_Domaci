package Primer_02;

// Pokretanje nove niti
// Novu nit pokrecete tako sto napravite instancu objekta tipa Thread
// To se moze uraditi na dva nacina : 
// 1. Implementacija interfejsa Runnable * prvo cemo da odradimo preko ovog nacina
// 2. Prosirivanjem ( nasledjivanjem ) klase Thread



// U main klasi :
// Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je napraviti instancu
// objekta tipa Thread ***


public class Nova_Nit {

	public static void main(String[] args) {
		
		A a = new A(); // **
		
	// ***
	// Oblik konstruktora
	// Thread(Runnable objekatNit, String imeNiti ) 
	// objekatNit je instanca klase koja implementira interfejs Runnable
	// Definise mesto gde zapocinje nit.
		
		
	// imeNiti - predstavlja ime nove niti ( koje vi zadajete )
		
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
