package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
	
		int niza[][] = new int[red][kolona];
		
		int suma = 0;
		System.out.println("Unesite elemente matrice .");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niza[i][j] = sc.nextInt();
				suma += niza[i][j];
			}

		}
		System.out.println("\n Matrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niza[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("Suma elemenata matrice je "+suma);
		sc.close();
		


	}

}
