package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int [red][kolona];
		System.out.println("Unesite elemente matrice.");
		
		for ( int i = 0; i < red ; i++)
		{
			for (int j = 0 ; j < kolona ; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
	/*	System.out.println("\nTransponovana matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; i++)
			{
				System.out.print(niz[j][i]+" "); // Ovo radi za matrice nxn
			}									// ne i za m x n
			System.out.println();
			System.out.println("\nTransponovana matrica II"); 
		}  */
		
		System.out.println("\nTransponovana matrica II");
		// ako matrica nije nxn onda je problem red x kolona za razlicite vrednosti
		// formiracu novu matricu
		
	//	int nizb [][] = new int [kolona][red];
		for (int i = 0; i < kolona; i++)
		{
			for (int j = 0; j < red ; j++)
			{
				System.out.print(niz[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
