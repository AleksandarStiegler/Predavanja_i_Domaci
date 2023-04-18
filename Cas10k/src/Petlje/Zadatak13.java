package Petlje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		
		// Napisati program za izracunavanje aritmeticke 
		// sredine unetih brojeva
		
		// Unos podataka
		int x,  y;
		double arsredina = 0.0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("Unesite koliko brojeva koristimo : ");
		x = sc.nextInt();
		
		// obrada problema
		for (int i = 1; i <=x ; i++)
		{
			System.out.print("Unesite "+i+" broj : ");
			y = sc.nextInt();
			arsredina = arsredina+y;
		}
		// Prikaz resenja
		
		System.out.println("Rezutlat je "+df.format(arsredina/x));
 sc.close();
	}

}
