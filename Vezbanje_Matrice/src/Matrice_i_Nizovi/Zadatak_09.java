package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_09 {

	public static void main(String[] args) {
		
		// Naci najveci i najmanji element matrice
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int x[][] = new int [10][10];
		
		System.out.println("Unesite elemente matrice.");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("x["+i+","+j+"] = ");
				x[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		// Resavanje problema postavicu prvi clan matrice kao najmanji i najveci
		
		int max = x[0][0], min = x[0][0];
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if ( max < x[i][j])
					max = x[i][j];
				if (min > x[i][j])
					min = x[i][j];
			}
		}
		sc.close();
		System.out.println("Najveci element matrice je "+max+" a najmanji "+min);

	}

}
