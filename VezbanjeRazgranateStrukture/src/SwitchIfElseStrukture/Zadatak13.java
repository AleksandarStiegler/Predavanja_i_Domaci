package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak13 {

	public static void main(String[] args) throws Exception {
		
		// Ako se sa ulaza ucitavaju 3 prirodna broja k1, k2 i k3 koji oznacavaju redni broj dana u godini ispitati da li oznacavaju
		// isti dan u nedelji. NPR 2, 16 i30 oznacavaju isti dan ili 344 351 i 358
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int k1, k2, k3;
		
		
		System.out.print("Unesite redni broj prvog dana .  ");
		k1 = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite redni broj drugog dana .  ");
		k2 = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite redni broj treceg dana .  ");
		k3 = Integer.parseInt(bfr.readLine());
		
		// Resavanje problema
		
		System.out.printf("%9s%9s%9s \n"," Prvi dan "," Drugi dan"," Treci dan");
		if ( k1 % 7 == k2 % 7 && k1 % 7 == k3 % 7 )
		{
			System.out.printf("%8d%8d%8d \n ", k1, k2, k3);
			System.out.println("Uneti dani su isti dan u nedelji");
			
		}
		else 
		{
			System.out.printf("%8d%8d%8d \n ",k1 , k2, k3);
			System.out.println("Uneti dani nisu isti dan u nedelji");
		}

	}

}

	// Fantasticno resenje za ovaj problem komplementi kolegi Maticu ovaj tip resenja ce mi ostati u secanju
