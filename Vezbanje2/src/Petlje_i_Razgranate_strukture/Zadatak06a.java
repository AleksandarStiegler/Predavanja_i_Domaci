package Petlje_i_Razgranate_strukture;

import java.util.Scanner;

public class Zadatak06a {

	public static void main(String[] args) {

		// Armstrongov broj ponovo

		Scanner sc = new Scanner(System.in);
		int broj, temp = 0, cifra = 0, suma = 0;
		int s, d, j;
		System.out.print("Unesite broj da se proveri da li je Armstrongov : ");
		broj = sc.nextInt();
 // Hmm nemam dovoljno znanja da napravim petlju u petlji mislim da imam ideju ali nisam siguran kako tacno radi
		// verovatno cu uskoro videti primer toga dotle necu vise da gubim vreme
		// Zadatak ce biti pod a i b :  a ) Ispisati sve Armstrongove brojeve od 100 do 999    i   b) odrediti da li je broj Armstrongov broj
		
		sc.close();
		System.out.println("Armstrongovi brojevi od 100 do 1000 su :");
		for ( int i = 100; i <= 999 ; i++)
		{
			s = i / 100;
			d = (i % 100 ) / 10;
			j = i % 10 ;
			if ( i == ( Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3)))
					System.out.print("\t"+i);
		}	
		temp = broj;
		while ( broj > 0)
			{
			
			cifra = broj % 10;
			broj /= 10;
			suma += (int) Math.pow(cifra, 3);
			
			
			}
		if ( suma == temp )
		{
			System.out.println("\n"+temp+" je Armstrongov broj.");
			
		}
		else 
		{
			System.out.println("\n"+temp+" nije Armstrongov broj. ");
		}
		
		
	}

}
