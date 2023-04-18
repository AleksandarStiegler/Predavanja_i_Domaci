package Domaci;

public class Zadatak_03 {

	public static void main(String[] args) {

		// Napisati program koji ispisuje sve proste brojeve od 1 do 10

		// Prosti brojevi deljivi samo sa 1 i samim sobom
		// Prosti brojevi od 1 do 10 su  2, 3, 5 i 7

		int b = 0; // promenljiva u koju cemo smestiti vrednost nekog broja a onda proci 
				   // kroz for petlju i deliti pocetni broj i trenutnu vrednost ove promenljive
		 		   // ako je moduo tog deljenja 0 podizemo brojac za 1
		String s = ""; // String za smestanje brojeva
		
		for (int i = 1; i <= 10; i++) {
			int k = 0; // brojac, ukoliko nam brojac predje 2 broj se delio jos nekim brojem
					   // osim 1 i samim sobom pa nije prost broj
			for (b = i; b >= 1; b--) { // Moglo je i b da ide od 1 pa do i sa rastom isto bi bilo
				if (i % b == 0) {
					k += 1;
				}
			}
			if (k == 2) {
				s += i + " ";
			}
		}
		System.out.println("Prosti brojevi od 1 do 10 su : "+s);
		
	}
}
