package Petlje_i_Razgranate_strukture;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		// Na intervalu od 1 do n ispisati sve parne brojeve i naci njihovu sumu.
		// Koristiti for , while i do while petlju

		Scanner sc = new Scanner(System.in);
		int n, suma = 0;

		System.out.print("Unesite broj do kojeg ce se vrsiti ispitivanje  ");
		n = sc.nextInt();

		// FOR
		/*
		 * for ( int i = 1; i <= n ; i++) { if ( i % 2 == 0) {
		 * System.out.println("\t"+i); suma += i; } }
		 */
		// While
		int i = 1;
		/*
		 * while ( i <= n) { if (i % 2 == 0) { System.out.print("\t"+i); suma += i; }
		 * i++;
		 * 
		 * 
		 * }
		 */
		// Do while
		do {
			if (i % 2 == 0) {
				System.out.print("\t" + i);
				suma += i;
			}
			i++;
		} while (i <= n);

		System.out.println("\nSuma brojeva na posmatranom intervalu iznosi : " + suma);
		sc.close();
	}

}
