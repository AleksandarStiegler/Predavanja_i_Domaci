package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_07 {

	public static void main(String[] args) {
		
		/* Ucitati matricu i ispisati elemente sa
		 * a) parnim indeksima redova
		 * b) neparnim indeksima kolona
		 * c) parnim indeksima redova i kolona
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova matrice");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice");
		int kolona = sc.nextInt();
		
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice");
		for(int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elementi sa parnim indeksima redova");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				if ( (i+1) % 2 == 0)
					System.out.print(a[i][j]+ " ");
			}
		}
		System.out.println("\nElementi sa neparnim indeksima kolona");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				if ( j % 2 == 0)
					System.out.print(a[i][j]+ " ");
			}
		}
		
		System.out.println("\nElementi sa parnim indeksima redova i kolona");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				if ( (i+1) % 2 == 0 && (j+1) % 2 == 0)
					System.out.print(a[i][j]+ " ");
			}
		}
		sc.close();
	}

}
