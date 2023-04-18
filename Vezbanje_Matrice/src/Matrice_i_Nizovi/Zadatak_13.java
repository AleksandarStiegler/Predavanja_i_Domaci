package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_13 {

	static void stampa(int x[], int k) {
		for (int i = 1; i <= k; i++) {
			System.out.print(x[i] + " , ");
		}
	}

	static void rastuci(int x[], int n, int temp) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - 1; j++) {
				if (x[i] < x[j]) {
					temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}

			}
		}

	}

	static void opadajuci(int x[], int n, int temp) {
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (x[i] < x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		// Napisati program za izdvajanje parnih i neparnih kuca u ulici koju postar
		// treba da obidje, koristeci metod parni niz postaviti u rastuci poredak
		// a neparni u opadajuci

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj kuca u ulici : ");
		int k = sc.nextInt();

		int x[] = new int[100];
		int par[] = new int[50];
		int nep[] = new int[50];
		int p = 0, n = 0;

		System.out.println("Unesite brojeve kuca.");
		for (int i = 1; i <= k; i++) {
			System.out.print(i + ". : ");
			x[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 1; i <= k; i++) {
			if (x[i] % 2 == 0) {
				p++;
				par[p] = x[i];

			} else {
				n++;
				nep[n] = x[i];

			}
		}

		System.out.println("Brojevi kuca u ulici.");
		stampa(x, k);
		int temp = 0;
		rastuci(par, p, temp);
		System.out.println("\nParni brojevi u ulici");
		stampa(par, p);

		System.out.println("\nNeparni brojevi u ulici");
		opadajuci(nep, n, temp);
		stampa(nep, n);

	}

}
