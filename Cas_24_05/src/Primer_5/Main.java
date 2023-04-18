package Primer_5;

public class Main {

	public static void main(String[] args) {


		try {
			int a = 0;
			int b = 10 / a;
			
			
		}catch (ArithmeticException e) {
			System.out.println("Izuzetak "+e);
	/*	}catch (ArithmeticException e) {
			System.out.println("Izuzetak 1");
		} */

	// Ukoliko postoji vise catch blokova citi tip parametra odgovara tipu
	// bacenog izuzetka, izvrsava se samo prvi takav catch blok.
	// Greska je navesti dva catch bloka sa istim tipom parametra.
			
		}
	}
}
