package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_12 {

	public static void prikaz(int a[][], int r, int k) {

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// Ucitati matricu 5x5 i ispisati sumu elemenata treceg reda
		// Naci sumu elemenata 5 kolone matrice nxm

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
		int x[][] = new int[red][kolona];

		System.out.println("Unesite elemente matrice.");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("x[" + i + "," + j + "] = ");
				x[i][j] = sc.nextInt();
			}
		}
		prikaz(x, red, kolona);

		// Suma elemenata 3 reda
		int suma3r = 0;
		for (int j = 0; j < kolona; j++) {
			suma3r += x[2][j];
		}
		// suma elemenata 5 kolone
		int suma5k = 0;
		for (int i = 0; i < red; i++) {
			suma5k += x[i][4];
		}

		System.out.println("Suma elemenata 3-ceg reda = " + suma3r + ".\n" + "Suma elemenata 5-te kolone = " + suma5k+".");

		sc.close();

	}

}
