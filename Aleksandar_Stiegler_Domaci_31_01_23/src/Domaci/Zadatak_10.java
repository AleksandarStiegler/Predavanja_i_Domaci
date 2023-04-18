package Domaci;

import java.util.Scanner;

public class Zadatak_10 {

	public static void main(String[] args) {
		// Napisati program koji omogućuje unos 10 brojeva unutar niza, traženog broja,
		// a zatim je potrebno ispisati koliko puta se traženi broj pojavljuje u nizu.

		Scanner sc = new Scanner(System.in);
		int niz[] = new int[10];

		System.out.println("Unesite elemente niza : ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("Izgled niza");
		for (int i : niz) {
			System.out.print(i + " ");
		}
		int ponovljen = 0;

		System.out.println();
		System.out.println("Unesite broj koji zelite da proverite ");
		int k = sc.nextInt();

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == k) {
				ponovljen++;
			}
		}
		System.out.println("Broj " + k + " se nalazi " + ponovljen + " puta u posmatranom nizu.");
		sc.close();
	}

}
