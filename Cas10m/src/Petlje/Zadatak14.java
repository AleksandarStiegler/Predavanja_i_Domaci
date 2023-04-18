package Petlje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		
		// Napisati program za izracunavanje aritmeticke sredine parnih brojeva
		
		// Unos podataka
		
		int x, y, k=0 ;
		double arsr = 0.0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("Unesite koliko cemo brojeva koristiti :");
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++)
		{
			System.out.print("Unesite "+i+" broj :");
			y = sc.nextInt();
			if (y %2 == 0)
			{
				k++;
			arsr = arsr+y;
			}
		}
		System.out.print("Rezultat je "+df.format(arsr/k));
		sc.close();
	}

}
