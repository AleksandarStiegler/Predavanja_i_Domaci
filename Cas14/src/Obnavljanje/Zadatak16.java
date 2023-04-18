package Obnavljanje;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int broj, cifra , temp = 0;
		
		System.out.println("Unesite neki broj ");
		broj = sc.nextInt();
		int i = broj;
		while ( broj != 0)
		{
			cifra = broj % 10;
			if ( temp < cifra)
			{
				temp = cifra;
			}
			broj /= 10;
			
		}
		System.out.println("Najveca cifra unetog broja "+i+" je "+temp);
		sc.close();
	}

}
