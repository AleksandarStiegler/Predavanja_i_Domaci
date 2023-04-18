package Petlje;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		// Koliko brojeva zelite da saberete
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da saberete");
		int broj = sc.nextInt();
		
		int zbir = 0;
		for (int k = 1; k<=broj; k++)
		{
			System.out.println("Unesite "+k+" broj");
			int i = sc.nextInt();
			 zbir = zbir + i;
		}
		System.out.println(zbir);
		sc.close();
	}

}
	// ovde cu drugi nacin sa predavanja koji je manje vise isti 
	// sta sam video da je zanimljivo sam odmah dodao u svoje resenje
	// sad je lepse :-)

