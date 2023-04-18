package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		
		// Mnozenje 2 matrice
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice A : ");
		int redA = sc.nextInt();
		System.out.print("Unesite broj kolona matrice A : ");
		int kolonaA = sc.nextInt();
		System.out.print("Unesite broj redova matrice B : ");
		int redB = sc.nextInt();
		System.out.print("Unesite broj kolona matrice B : ");
		int kolonaB = sc.nextInt();
		
		if (kolonaA != redB)
		{
			System.out.println("Pogresan unos. Da bi mnozili matrice broj kolona "
					+ "matrice A\n mora biti jednak broju redova matrice B.");
		}
		else
		{
		
		int a[][] = new int [redA][kolonaA];
		int b[][] = new int [redB][kolonaB];
		int c[][] = new int [redA][kolonaB];
		
		System.out.println("Unesite elemente matrice A : ");
		
		for (int i = 0; i < redA; i++)
		{
			for (int j =0; j < kolonaA; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Unesite elemente matrice B : ");
		
		for (int i = 0; i < redB; i++)
		{
			for (int j =0; j < kolonaB; j++)
			{
				System.out.print("b["+i+","+j+"] = ");
				b[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Matrica A");
		for (int i = 0; i < redA; i++)
		{
			for(int j = 0; j < kolonaA; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrica B");
		for (int i = 0; i < redB; i++)
		{
			for(int j = 0; j < kolonaB; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	
		for (int i = 0 ; i< redA; i++)
		{
			for (int j = 0; j < kolonaB; j++)
			{
				c[i][j] = 0;
				for (int t = 0; t < kolonaA; t++)
				{
					c[i][j]= c[i][j] + a[i][t]*b[t][j];
				}
			}
		}
		
		System.out.println("Rezultujuca matrica dobijena mnozenjem C : ");
		
		
		for (int i = 0; i < redA; i++)
		{
			for(int j = 0; j < kolonaB; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		}
	}	
}
