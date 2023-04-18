package Test2;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		// Unos podataka
		Scanner sc = new Scanner(System.in);
		int broj, max, cifra;

		System.out.print("Unesite neki broj : ");
		broj = sc.nextInt();
		sc.close();
		// Resavanje problema

		int n = broj;

		if (broj <= 0) {
			System.out.println(" Pogresan unos unesite broj veci od nule.");
		} else {
			max = 0;

			while (broj > 0) {
				cifra = broj % 10;
				if (cifra > max) {
					max = cifra;
				}

				broj = broj / 10;

			}
			// Stampanje rezultata
			System.out.println("Za uneti broj " + n + " , najveca cifra je " + max);

		}
	}
}
