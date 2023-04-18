package Petlje_i_Razgranate_strukture;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {


			// Podsecanje ternarnog operatora 
		
		// naci manji od tri broja a , b i c
		
		int a, b, c, min ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj  ");
		a = sc.nextInt();
		System.out.println("Unesite drugi broj  ");
		b = sc.nextInt();
		System.out.println("Unesite treci broj  ");
		c = sc.nextInt();
		
		// Zadatak resiti preko If else i preko ternarnog operatora
		
		// If else
	/*	
		min = a;
		if ( min > b)
		{
			min = b;
			if ( min > c)
			{
				min = c;
			}
		}
		else if (min > c)
		{
			min = c;
		}  */
		
		// Ternarni
		
		min = (a <= b) ? (( a <= c ) ? a : c) : ((b < c) ? b : c);  // Malo je konfuznije kad se koriste ispitivanje za 3 broja posto je zapis slozeniji
																	// Van toga jasno mi je sta i kako radi i ovo je bilo dobro ponavljanje
		
		System.out.println(min);
		sc.close();
	}

}
