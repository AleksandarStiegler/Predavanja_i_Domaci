package Petlje;

public class Zadatak05 {

	public static void main(String[] args) {
	
		
		// Napisati niz naredbi kojim se izracunava kvadrat prirodnih 
		// brojeva od 15 do 25
		
		
		System.out.printf("%8s%8s \n","Broj","Kvadrat");
		
		for (int k = 15; k<=25 ; k++)
		{
			System.out.printf("%8d%8d \n", k, k*k);
		}

	}

}
// drugi nacin  system.out.println(" Kvadrat broja "+k+" iznosi "+k*k)
