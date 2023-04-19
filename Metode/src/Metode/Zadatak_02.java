package Metode;

import java.util.Scanner;

public class Zadatak_02 {
	/*
	 * moje resenje, radi ali ovo nije kako je profesor mislio a njegovo resenje me
	 * buni aj da vidim da li mogu da ukapiram sta se desava, ovo ostavljam pod
	 * komentarom
	 * 
	 * public static int fak(int n) { if (n == 0) { return 1; } else { int f = 1;
	 * for (int i = 1 ; i <= n; i++) { f *= i; } return f; }
	 * 
	 * }
	 */

	static int fak(int n) {
		if (n == 0) {
			return 1;
		} else {

			return fak(n - 1) * n;

		}

	}

	public static void main(String[] args) {

		// Napisati metodu za rekurzivno izracunavanje faktorijela broja

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj n.");
		int n = sc.nextInt();

		
		System.out.println("Faktorijel broja " + n + " je " + fak(n));
		sc.close();
	}

}
