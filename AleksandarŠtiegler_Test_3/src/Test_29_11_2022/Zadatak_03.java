package Test_29_11_2022;

import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		// Unos podataka
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		sc.close();
		
		int x[][] = new int [red][kolona];
		
		// Resavanje problema
		if ( red != kolona)
		{
			System.out.println("Unesite ponovo matrica mora biti kvadratna.");
			
		}
		else
		{
			for (int i = 0; i < red; i++)
			{
				for (int j = 0; j < kolona; j++)
				{
					if (i == j || i+j == red -1)
					{
						x[i][j] = 1;
					}
					else
						x[i][j] = 0;
				}
			}
			
			// Stampanje rezultujuce matrice
			System.out.println("Matrica");
			for (int i = 0; i < red; i++)
			{
				for (int j = 0; j < kolona; j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
