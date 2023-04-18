package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
	
		int niza[][] = new int[red][kolona];
		
		
		System.out.println("Unesite elemente matrice I.");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niza[i][j] = sc.nextInt();
			
			}

		}
		int max = niza[0][0];
		int min = niza[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				
				if (niza[i][j] > max)
					max = niza[i][j];
				if (niza[i][j] < min)
					min = niza[i][j];
			}
		}
		
		System.out.println("\n Matrica");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niza[i][j] + " ");

			}
			System.out.println();

		}
		sc.close();
		System.out.println("Najveci element je "+max);
		System.out.println("Najmanji element je "+min);
	}

}
