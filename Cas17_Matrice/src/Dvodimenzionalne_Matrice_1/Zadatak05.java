package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
		System.out.print("Unesite skalar : ");
		int n = sc.nextInt();

		int niza[][] = new int[red][kolona];
		int nizb[][] = new int[red][kolona];
		int rez[][] = new int[red][kolona];

		System.out.println("Unesite elemente matrice I.");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niza[i][j] = sc.nextInt();
			}

		}
		System.out.println("\nUnesite elemente matrice II.");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + "," + j + "] = ");
				nizb[i][j] = sc.nextInt();
			}

		}
		sc.close();
		System.out.println("\nPrva Matrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niza[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println("\nDruga Matrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				System.out.print(nizb[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println("Zbir matrica");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				rez[i][j] = niza[i][j] + nizb[i][j];
				System.out.print(rez[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("\nRazlika matrica");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				rez[i][j] = niza[i][j] - nizb[i][j];
				System.out.print(rez[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("\nProizvod matrica");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				rez[i][j] = niza[i][j] * nizb[i][j];
				System.out.print(rez[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("\nMnozenje matrice skalarom");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				niza[i][j] = n * niza[i][j];
				System.out.print(niza[i][j] + " ");

			}
			System.out.println();

		}

	}

}
