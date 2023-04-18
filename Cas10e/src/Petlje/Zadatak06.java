package Petlje;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		// napisati niz naredbi kojima se izracunava faktorijel za 
		// dato n
		
		
		// Unos podataka
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite broj :");
		int n = ulaz.nextInt();
		ulaz.close();
		
		int faktorijel = 1; // 1 predstavlja neutral za mnozenje
		if (n>1)
		{
			for (int k = 1 ; k<=n; k++)
			{
				faktorijel = faktorijel * k;
			}
			System.out.println("Faktorijel unetog broja "+n+" iznosi "+faktorijel);
		}
			
		else
			System.out.println("Negativan broj unesite ponovo");
	}
	

}
// Moje resenje je islo for(int k = 1; k<=n; n--)
// resenje u petlji je bilo   faktorijel = faktorijel*n;
// Radilo je kako treba


