package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova : ");
				int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
				int kolona = sc.nextInt();
				
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice.");
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j]= sc.nextInt();
			}
		}
		// Ispisivanje matrice
		System.out.println("Matrica");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		// Ispisivanje elemenata prvog reda
		System.out.println("\nElementi prvog reda : ");
		for (int j = 0; j < kolona ; j++)
		{
			System.out.print(a[0][j]+" ");
		}
		
		// Ispisivanje elemenata druge kolone
		
		System.out.println("\nElementi druge kolone : ");
		for (int i = 0; i < red ; i++)
		{
			System.out.println(a[i][1]);
		}
		sc.close();
	}

}
