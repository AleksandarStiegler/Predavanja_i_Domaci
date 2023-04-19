package Zadatak02;

import Zadatak01.Boje;

public class Main {

	public static void main(String[] args) {
		/*
		 * Jos neke ugradjene metode
		 * ordinal() - dobija redni broj tj polozaj konstante u nabrajanju. Redni brojevi
		 *  pocinju od 0.
		 *  compareTo() - uporedjuje redne brojeve dve konstante iz istog nabrajanja.
		 *  Ako je redni broj pozivajuce konstante manji od rednog broja od konstante 
		 *  vraca negativan broj , ako je veci vraca pozitivan broj i ukoliko su jednaki
		 *  vraca nulu. Broj koji vrati je razlika u pozicijama na listi konstanti
		 *  Dakle ako je redni broj pozivajuce konstante na primer 3 a redni broj konstante sa 
		 *  kojom poredimo 0 vratice nam = 3, a ako je npr redni broj konstante 10 vratice = -7.
		 *  
		 */

		System.out.println("Boja - Redni Broj ");
		for(Boje2 a : Boje2.values()) {
			System.out.println(a + " - "+ a.ordinal());
		}
		System.out.println();
		
		System.out.println(Boje2.Zelena.compareTo(Boje2.Zuta));
	
	Boje2 b1, b2, b3;
	 b1 = Boje2.Zelena;
	 b2 = Boje2.Bela;
	 b3 = Boje2.Zuta;
	
		if(b1.compareTo(b3) < 0) {
			System.out.println(b1+ " dolazi pre " + b3);
		}
		if (b1.compareTo(b2) > 0) {
			System.out.println(b1 + " dolazi posle "+b2);
			
		}
		if (b1.compareTo(b3) == 0) {
			System.out.println(b1+ " jednako " + b3);
		}
		
		// equals () - poredi se jednakost konstante iz nabrajanja sa svakim drugim objektom
		
		if(b1.equals(b2)) {
			System.out.println("Greska");
		}
		if (b1.equals(b3)) {
			System.out.println(b1+ " jednako "+ b3);
		}
		if (b1 == b3) {
			System.out.println(b1 + " == " + b3);
		}
		
	}
}
